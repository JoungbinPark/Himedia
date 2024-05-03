package JDBC03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Member_Update {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 회원의 번호를 입력하세요 : ");
		int membernum = Integer.parseInt(sc.nextLine());
		MemberDao mdao = new MemberDao();
		MemberDto mdto = mdao.getMember(membernum);
		
		if(mdto==null) {
			System.out.println("입력한 회원번호의 회원이 존재하지 않습니다.\n프로그램을 종료합니다.");
			return;
		}
		System.out.printf("회원명 : %s \n수정할 회원명을 입력하세요(수정하지 않으려면 Enter입력) : ", mdto.getName());
		String name = sc.nextLine();
		if(!name.equals("")) mdto.setName(name);
		System.out.printf("전화번호 : %s \n수정할 회원 전화번호를 입력하세요(수정하지 않으려면 Enter입력) : ", mdto.getPhone());
		String phone = sc.nextLine();
		if(!phone.equals("")) mdto.setPhone(phone);
		System.out.printf("생년월일 : %s \n수정할 회원 생년월일을 입력하세요(YYYY-MM-DD)(수정하지 않으려면 Enter입력) : ", mdto.getBirth());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");	//simpledateformat 생성
		String input = sc.nextLine();					//수정할 생년월일 String으로 입력
		if(!input.equals("")) {							//입력한 내용이 있다면
			java.util.Date d = sdf.parse(input);		//java.util.Date 형태로 변환
			java.sql.Date birth = new java.sql.Date(d.getTime());	//java.sql.Date형태로 변환
			mdto.setBirth(birth);						//mdto에 생년월일 저장
			
			Calendar c = Calendar.getInstance();		//나이 계산을 위한 캘린더 생성
			Calendar today = Calendar.getInstance();	//오늘 날짜 
			c.setTime(d);								// 입력받은 날짜 (util.date 타입으로 받는다)를 생성한 캘린더에 넣는다
			int age = today.get(Calendar.YEAR) - c.get(Calendar.YEAR);	//오늘날짜의 년 - 입력받은 날짜의 년
			mdto.setAge(age);							//mdto에 나이 저장
			
		}
		
		
		System.out.printf("성별 : %s \n수정할 회원 성별을 입력하세요(수정하지 않으려면 Enter입력) : ", mdto.getGender());
		String gender = sc.nextLine();
		if(!gender.equals("")) mdto.setGender(gender);
		System.out.printf("보너스포인트 : %s \n수정할 회원 보너스포인트를 입력하세요(수정하지 않으려면 Enter입력) : ", mdto.getBpoint());
		String bpoint = sc.nextLine();
		if(!bpoint.equals("")) mdto.setBpoint(Integer.parseInt(bpoint));

		int result = mdao.updateMember(mdto);
		
		if(result ==1) System.out.println("레코드 수정 성공");
		else System.out.println("레코드 수정 실패");

	}

}
