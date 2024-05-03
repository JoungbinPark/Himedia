package JDBC;

import java.util.ArrayList;

public class RentList_Select {

	public static void main(String[] args) {
		
		RentDao rdao = RentDao.getInstance();
		ArrayList<RentDto> list = rdao.selectRent();
		
		System.out.println("대여번호\t날짜\t\t회원번호\t성명\t대여가격\t할인가격\t매출액\t도서번호\t제목");
		System.out.println("----------------------------------------------------------------------------------");
		for(RentDto rdto : list) {
			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				rdto.getNumseq(),
				rdto.getRentdate(),
				rdto.getMnum(),
				rdto.getName(),
				rdto.getRentprice(),
				rdto.getDiscount(),
				rdto.getAmount(),
				rdto.getBnum(),
				rdto.getSubject());
		}

	}
}
