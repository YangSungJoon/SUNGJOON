package com.kh.object.practice;

public class NonstaticSample {
	public void printLottoNumber() {
		// 1~45까지의 임의의 정수 6개가 중복되지 않게 발생시켜 출력하는 메소드
		// 응용 ---> 오름차순 정렬로 출력
		
		int i =0;
		while(true) {
		
		int num = (int)(Math.random()*45 +1 );
		System.out.print(num + " ");
		
		// 카운트
		
		i++;
		
		if(i == 5) {
			break;
		}
		}

	}
	
}
