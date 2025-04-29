package day4Prac.reflect;

public class Member {
	 
	String id;
	String pw;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public Member(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	
	public Member() {
		this("기본아이디" , "기본비번"); //생성자끼리는 호출가능, 맨 첫줄에 작성해야함
//		this.id="기본아이디";
//		this.pw="기본비번";
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + "]";
	}  
	
	//public void printInfo( Member this ) {
	public void printInfo() {
		System.out.println( "id=" +  id);
		System.out.println( "pw=" + pw);
	}
	
	
	public void  printSquare( int su) {		
		System.out.println( su*su);
	}
}
