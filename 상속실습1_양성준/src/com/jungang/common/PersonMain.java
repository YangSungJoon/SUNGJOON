package com.jungang.common;

public class PersonMain {

	public static void main(String[] args) {
		
		// F3 누르면 생성자의 위치 확인
		Person person = new Person();
		Person hong = new Person("홍길동", 20 , 175.7, 70.7);
		
		System.out.println(person.information());
		System.out.println(hong.information());
		
		Person[] personArr = new Person[5];
		
		personArr[0] = new Person("김지민", 20, 0 , 0);
		personArr[1] = new Person("김민지", 30, 0 , 0);
		personArr[2] = new Person("김민자", 10, 0 , 0);
		personArr[3] = new Person("김민정", 50, 0 , 0);
		personArr[4] = new Person("김민주", 60, 0 , 0);
		
		// 타입 변수명 : 배열
		for(Person p : personArr) {
		
		System.out.println(p.information());
		System.out.println("=======================");

	}
	}
}
