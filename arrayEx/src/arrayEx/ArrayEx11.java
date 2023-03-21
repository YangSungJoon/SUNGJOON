package arrayEx;

public class ArrayEx11 {

	public static void main(String[] args) {
		String[] oldStrArr = {"java", "array", "copy"};
		String[] newStrArr = new String[5];
		
		// (원본배열, 복사시작index, 새로운배열, 새배열에 복사를 시작할 인덱스, 복사할 개수)
		System.arraycopy(oldStrArr, 0, newStrArr, 1, oldStrArr.length);
		
		for(int i=0;i<newStrArr.length;i++) {
			// 배열의 값에 접근할때는 배열이름[인덱스]
			System.out.println(newStrArr[i]);
			
		}
			System.out.println();
			
		// 향상된 for문을 이용하는 방법
		// (타입 변수명 : 배열의 이름)
		// 배열의 요소를 모두 순회합니다. 0 < 배열명.length
		// 배열이름[인덱스]
		for(String str : newStrArr) {
			System.out.println(str);
		}
		
	}

}
