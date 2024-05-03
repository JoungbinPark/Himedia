package JDBC02;

	//DTO : Data Transfer Object
public class BookDto {
	
	// Booklist에 있는 속성값을 받아줄 필드 생성
	private int booknum;
	private String subject;
	private int makeyear;
	private int inprice;
	private int outprice;
	private String grade;
	
	
	// getter & setter 생성
	// 마우스 우클릭 -> source -> Generate Getters& Setters -> Select All -> Generate
	
	public int getBooknum() {
		return booknum;
	}
	public void setBooknum(int booknum) {
		this.booknum = booknum;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getMakeyear() {
		return makeyear;
	}
	public void setMakeyear(int makeyear) {
		this.makeyear = makeyear;
	}
	public int getInprice() {
		return inprice;
	}
	public void setInprice(int inprice) {
		this.inprice = inprice;
	}
	public int getOutprice() {
		return outprice;
	}
	public void setOutprice(int outprice) {
		this.outprice = outprice;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	

}
