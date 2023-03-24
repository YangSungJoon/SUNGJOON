package car.object;

public class MemberExample {

	public static void main(String[] args) {
		
		Member member = new Member();
		member.name = "최하얀";   // name 필드값 변경
		member.age = 23;		// age 필드값 변경
		
		System.out.println("이름 : " + member.name);
		System.out.println("나이 : " + member.age);
		
	}

}
