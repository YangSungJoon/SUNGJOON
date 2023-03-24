package com.jungang.common;

public class Person {
	
	// 생성자의 역할 : 내가 가지고 있는 필드를 초기화
	// # 접근제한자 : protected
	// +, - 접근제한자 : public
	protected String name;
	public int age;
	public double height;
	public double weight;
	
	// 기본생성자 : 초기화를 담당
	// 클래스 명과 같은 이름, 반환 타입이 없다.
	public Person() {
		// 다른 생성자를 호출
		// 초기화 값을 직접 입력
		// 매개변수의 타입과 갯수가 일치해야지만 호출 할 수 있다.
		this("정우성", 30, 170, 60);
		
	}
	
	public Person(String name, int age, double height, double weight) {
		// 초기화 
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// 접근제한자 반환타입 메서드명(매개변수타입 매개변수명){ }
	/**
	 * 이름과 나이를 반환
	 * @return 이름, 나이
	 */
	public String information() {
		return name + "," + age;
	}
	
}
