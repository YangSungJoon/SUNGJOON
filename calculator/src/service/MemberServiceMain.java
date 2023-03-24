package service;

public class MemberServiceMain {
  public static void main(String[] args) {
	

	MemberService service = new MemberService();
	boolean res = service.login("홍길동", "12345");
	if (res) {
		System.out.println("홍길동님 환영합니다.");
	} else {
		System.out.println("아이디와 비밀번호가 일치하지 않습니다.");
	}
	service.logout("홍길동");
		
	
  }
}
