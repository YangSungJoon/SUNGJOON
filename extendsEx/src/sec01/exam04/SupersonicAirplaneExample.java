package sec01.exam04;

public class SupersonicAirplaneExample {

	
	public static void main(String[] args) {
		SupersonicAirplane supersonic 
		= new SupersonicAirplane(SupersonicAirplane.NORMAL);
		
		//이륙합니다.
		supersonic.takeOff();
		
		supersonic.fly();
		
		// **가독성을 높여주기 위해 상수를 사용
		supersonic.flyMode = SupersonicAirplane.SUPERSONIC;
		supersonic.fly();
		
		supersonic.flyMode = SupersonicAirplane.NORMAL;
		supersonic.fly();
		
		// 착륙
		supersonic.land();
		
	
	

		
	}

}
