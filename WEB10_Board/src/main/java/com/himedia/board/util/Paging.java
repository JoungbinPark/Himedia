package com.himedia.board.util;

public class Paging {
	private int page = 1;			//현재 화면에 보여질 페이지 번호
	private int totalCount;		//전체 게시물 개수(레코드 개수)
	private int displayRow=10;	//한 화면에 보여질 게시물 개수
	private int displayPage=10; 	//한 화면에 보여질 페이지 개수
	private int beginPage;			//현재 화면에 표시된 페이지의 시작번호
	private int endPage;				//현재 화면에 표시될 페이지의 끝번호

	private boolean prev;			//prev 버튼이 보일건지 안보일건지
	private boolean next;			//next 버튼이 보일건지 안보일건지
	
	private int startNum;			//현재 페이지에 표시될 게시물(레코드)의 시작번호
	private int endNum;				//현재 페이지에 표시될 게시물(레코드)의 끝번호
	
	/* 페이지 표시 예
	[1] 2 3 4 5 6 7 8 9 10 [next]							//1페이지부터 표시,  prev 없음. 게시물 100개 이상인 경우
	[◀] 11 12 13 14 15 16 17 18 19 20 [▶]			//게시물 200개 이상인 경우
	[◀] 21 22 23 24 25 26 27 28 29 30 [▶]			//게시물 300개 이상인 경우
	[◀] 11 12 13 14 											//next 없음, 게시물 개수가 141~149개인 경우
	본 클래스는 하나의 게시판에 객체 하나를 할당해서 전체 게시물 수에 따라 계산된 페이지의 각 요소들을
	각 멤버 변수에 저장하고 화면에 표시할 내용을 사용하는 클래스입니다. 
	 */
	
	//각 멤버변수들의 값들을 계산하는 메서드. totalCount 변수가 결정되면 나머지 값들이 계산됩니다.
	//setTotalCount 메서드에서 호출됩니다.
	public void calPaging() {
		// 1. beginpage와 endpage 계산 : page(현재페이지)와 displayPage값을 이용해서 계산
		double temp = page/(double)displayPage;
		// 1/10 -> 0.1			15/10 -> 1.5
		
		// 위 계산에 소수점을 올림연산
		temp = Math.ceil( temp);
		//0.1 -> 1.0			1.5 -> 2.0
	
		// 위 계산결과에 displayPage를 곱하면 endpage가 계산
		endPage = (int)(temp*displayPage);
		//1.0 -> 10				2.0 -> 20
		
		beginPage = endPage - ( displayPage-1);
		// 10 -> 1				20 -> 11
		
		// 2. totalPage 계산
		// 총게시물수(totalCount)를 한개에 화면에 표시될 게시물수(displayRow)로 나누고, 소수점자리 올림해서 계산
		int totalPage = (int)Math.ceil(totalCount/(double)displayRow);
		// next/prev를 위해서 계산
		
		if( totalPage < endPage) {
			endPage=totalPage;
			next=false;										//끝페이지에 왔을 때만 표시안함
		}else {
			next=true;								
		}
		
		prev = (beginPage==1)? false : true;		//시작페이지가 1인 경우에만 표시안함
		
		// 4. startNum, endNum
		startNum = (page-1)*displayRow+1;
		// 현재 화면의 시작 게시물 번호 1page:1,	 2page:11,		3page:21,		4page:31
		endNum = page*displayRow;			//MySQL에서는 필요없는 항목. Oracle에서만 필요
		// 현재 화면의 끝 게시물 번호 10, 20, 30, 40
		
		System.out.println(beginPage + " " + endPage + " " + startNum + " " + endNum);
		
	}
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		calPaging();
	}
	public int getDisplayRow() {
		return displayRow;
	}
	public void setDisplayRow(int displayRow) {
		this.displayRow = displayRow;
	}
	public int getDisplayPage() {
		return displayPage;
	}
	public void setDisplayPage(int displayPage) {
		this.displayPage = displayPage;
	}
	public int getBeginPage() {
		return beginPage;
	}
	public void setBeginPage(int beginPage) {
		this.beginPage = beginPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public boolean isPrev() {
		return prev;
	}
	public void setPrev(boolean prev) {
		this.prev = prev;
	}
	public boolean isNext() {
		return next;
	}
	public void setNext(boolean next) {
		this.next = next;
	}
	public int getStartNum() {
		return startNum;
	}
	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}
	public int getEndNum() {
		return endNum;
	}
	public void setEndNum(int endNum) {
		this.endNum = endNum;
	}
}