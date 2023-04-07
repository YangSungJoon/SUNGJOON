package bmi;

public class DaoExample {

	
	public static void main(String[] args) {
	String[] strArry = {"10","2a"};
	int value = 0;
	for (int i=0; i<=3; i++) {
		try {
			value = Integer.parseInt(strArry[i]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스를 초과했음");
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없음");
		} {
			System.out.println(value);
		}
	}
}
}