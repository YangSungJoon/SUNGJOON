package arrayEx;

// 접근제어자 class 클래스명 {}

public class ArrayEx5 {
	// 접근제어자 반환타입 메서드명(매개변수){}
	// void : 반환 타입이 없다는 의미
	// int, String
	// 매개변수 : (타입 변수명)
	// 매개변수는 있을 수도 있고 없을 수도 있다.
	// 매개변수가 있다면 타입을 명시 해줘야 한다.
	// main : 메서드 이름

	public static void main(String[] args) {
		 System.out.println(args.length);
		// System.out.println(args[0]);
		
		//1: 로컬, 2: 테스트, 3:운영
		int mode = Integer.parseInt(args[0]); 
		if (mode == 1) {
			System.out.println("로컬환경 입니다");
			// 로컬 DB에 접속
		}else if(mode == 2) {
			System.out.println("테스트환경 입니다.");
			// 테스트 DB에 접속
		}else if(mode == 3) {
			System.out.println("운영환경 입니다.");
			
		}
		
		for(int i =0;i<args.length;i++) {
		
		 System.out.println(args[0]);
		
	 }
	}

}
