package arrayEx;

public class ArrayEx2 {

	public static void main(String[] args) {
		// 배열의 생성
		
		String[] names = {"가","나","다","라","마","바","사"};
		
	
		// 반복문을 이용해서 배열에 입력된 값을 출력
		// 초기화;조건식;증감식
		// 변수명.length : 배결의 값의 개수
		for(int i=0; i < names.length; i++) {
			//배열의 값에 접근 : 변수이름[방번호]
			System.out.println(names[i]);
	
	}
	}
}
