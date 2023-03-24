package korea.opect;

public class KoreaMain {

	public static void main(String[] args) {
		
		Korean korean = new Korean ();
		korean.name = "전지현";
		korean.ssn = "222222-2222222";
		
		System.out.println(" korean =============== ");
		System.out.println(korean.name);
		System.out.println(korean.ssn);
		System.out.println(korean.nation);
		
		// 객체 초기화
		Korean hong = new Korean("홍길동", "123456-1234567");
		
		System.out.println(" hong =============== ");
		System.out.println(hong.name);
		System.out.println(hong.ssn);
		System.out.println(hong.nation);
		
		Korean ha = new Korean("이하늬", "111111-222222");
		
		System.out.println(" ha =============== ");
		System.out.println(ha.name);
		System.out.println(ha.ssn);
		System.out.println(ha.nation);
	}

}
