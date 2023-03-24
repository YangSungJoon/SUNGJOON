package com.jungang;

public class Calculator {
	
	// 필드
	// 접근제한자를 붙이지 않으면 default
	// private 캡슐화 : 외부에서 나를 접근하지 못하게 한다.
	private String name;
	
	// 생성자의 특징 2가지
	// 1. 클래스의 이름과 동일한 이름을 가지고 있다.
	// 2. 반환타입이 없다.
	// 생성자 : new 연산자를 만나서 객체가 생성될 때 실행됩니다.
	public Calculator() {
		name = "정수계산기";
		// 초기화를 한다.
		System.out.println(name);
	}
	
	// 접근제한자 반환타입 메서드명 (매개변수타입 변수명) {}
	// 정수의 합계를 구하는 메서드 두수를 입력받아 두수의 합을 반환 
	
	/**
	 * 두개의 정수를 입력받아 두수의 합을 반환합니다. 
	 * @param num1
	 * @param num2
	 * @return num1+num2
	 */
	public int add(int num1, int num2){
		
		return num1 + num2;
		
	}
}
