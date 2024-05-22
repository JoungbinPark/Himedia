package com.himedia.shop.controller.action.mypage;

import java.io.IOException;
import java.util.ArrayList;

import com.himedia.shop.controller.action.Action;
import com.himedia.shop.dao.OrderDao;
import com.himedia.shop.dto.MemberVO;
import com.himedia.shop.dto.OrderVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class MypageAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 진행중인 주문 내역
		// 스니커즈 외 1건	25000원 ...	상세보기
		// 부츠 포함 2건 		30000원 ...	상세보기
		
		HttpSession session = request.getSession();
		MemberVO mvo = (MemberVO) session.getAttribute("loginUser");
		if(mvo==null) {
			response.sendRedirect("shop.do?command=loginForm");
		} else{
			//현재 로그인 한 사용자의 배송전 주문내역을 표시
			//한번에 2~3개의 상품을 3회에 걸쳐 주문했다면
			//진행중인 주문 내역은 3행이 표시됩니다.(주문번호별(oseq) 표시)
			
			//그리고 그들에게는 상세보기 메뉴가 있어서 그 주문에 어떤 상품이 주문된건지 상세하게 조회할 수 있음
			
			//1. mypage.jsp에 최종 전달되서 화면에 보여질 리스트를 생성
			ArrayList<OrderVO> finalList = new ArrayList<OrderVO>();
			// finalList.get(0).getName() -> "XXXX 외 2건"과 같이 구성됩니다. 
			
			//order_view에서 로그인유저의 아이디로 아직 발송전 result가 1인 것만 검색하면
			// 4 4 4 5 5 6 <- 조회된 주문번호(oseq)들
			// 나에게 지금 필요한건 4 5 6
			// 위와 같은 결과를 얻으려면 sql문에 distinct 키워드를 써서 조회해옵니다. 
			// select distinct oseq from order_view where userid=? and result='1';
			
			//scott이 주문하고 진행중(result="1")인 주문의 oseq을 중복되지 않게 조회
			OrderDao odao = OrderDao.getInstance();
			ArrayList<Integer> oseqList = odao.selectOseqOrderIng(mvo.getUserid());
			
			//주문번호들로 반복실행하면 주문 상세내역을 조회 -> 조회된 내역을 하나로 합쳐서 finalList에 담습니다.
			for( Integer oseq : oseqList) {
				// 과정 : 주문번호로 주문목록을 조회(order_view)에서 조회
				// 4번의 주문의 2개의 상품에서 첫번째 상품의 상품이름을 "상품이름 포함 1건"으로 변경
				// 금액은 2개의 가격을 합산한 금액을 4번의 상품의 price2에 저장
				// 그 변경된 첫번째 상품을 finalList에 저장
				
				// 주문 번호로 상품들 검색
				ArrayList<OrderVO> orderListByOseq = odao.selectOrderByOseq(oseq);
				
				// 주문상품 상세 리스트의 첫번째 상품을 별도의 변수에 저장
				OrderVO temp = (OrderVO)orderListByOseq.get(0);
				
				// temp의 상품명과 가격을 수정
				temp.setPname( temp.getPname() + "포함" + orderListByOseq.size() + "건");
				
				// 리스트를 이용해서 총금액을 계산
				int totalPrice = 0;
				for( OrderVO ovo : orderListByOseq) {
					totalPrice += ovo.getPrice2() * ovo.getQuantity();
				}
				temp.setPrice2(totalPrice);
				
				//temp를 finalList에 추가
				finalList.add(temp);
				
			}
			request.setAttribute("finalList", finalList);
			request.setAttribute("title", "진행중인 주문내역");
			request.getRequestDispatcher("mypage/mypage.jsp").forward(request, response);

		}

	}

}
