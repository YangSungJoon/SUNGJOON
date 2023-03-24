package com.kh.object.practice;

public class Application2 {

	public static void main(String[] args) {
		
		// 기본생성자를 이용하여 첫번째 Book 객체 생성
		// 매개변수 생성자를 이용하여 두번째 Book 객체 생성 (사용 데이터 참고)
		// 객체가 가진 필드 값 출력 확인
		
		// 첫번째 객체가 가진 값을 setter를 이용하여 수정
		// 수정된 내용 출력 확인
		
		// 각 책체의 할인율을 적용한 책 가격을 계산해서 출력
		// 할인된 가격 = 가격-(가격*할인율)
		
		Book book1 = new Book();
		Book book2 = new Book("자바의 정석",20000,0.2,"윤상섭");
		
		System.out.println(book1.information());
		System.out.println(book2.information());
		System.out.println("=======================================");
		
		book1.setTitle("C언어");
		book1.setPrice(30000);
		book1.setDiscountRate(0.1);
		book1.setAuthor("홍길동");
		
		System.out.println(book1.information());
		System.out.println("=======================================");
		book1.calc();
		book2.calc();
		
	}

}
