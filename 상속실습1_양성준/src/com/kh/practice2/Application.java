package com.kh.practice2;

import com.kh.practice2.model.vo.Animal;
import com.kh.practice2.model.vo.Cat;
import com.kh.practice2.model.vo.Dog;

public class Application {

	public static void main(String[] args) {

		// Animal 타입의 객체배열 크기 5로 생성
		Animal[] animalArry = new Animal[5];
		// 각 인덱스에 무작위로 Dog객체 또는 Cat객체로 생성
		// (이때, 매개변수 생성자를 이용하여 생성)
		Dog dog = new Dog("멍뭉이", "말라뮤트", 25);
		Cat cat = new Cat("야옹이","러시안블루","러시아","검정");
		
		for(int i=0; i<animalArry.length;i++) {
		
		// 0,1
		int index = (int)(Math.random()*2);
		if(index == 1) {
			// 배열이름[방번호]
			animalArry[i] = dog;
		}else {
			animalArry[i] = cat;
		}
	}
		// 반복문을 통해서 해당 배열의 0번 인덱스부터 마지막 인덱스까지의
		// 객체의 speak() 메소드 호출
		for(Animal a : animalArry) {
			// 자식 객체에서 재정의(오버라이딩) 되어진 메서드가 호출
			a.speak();
		}
		
		
	








		Animal[] animal = new Animal[5];
		
		for(int i=0; i<animal.length;i++) {
			int a = (int)(Math.random()*2+1);
			
			switch (a) {
			case 1 : 
				animal[i] = new Dog("멍뭉이", "말라뮤트", 25);
				break;
			case 2 : 
				animal[i] = new Cat("야옹이","러시안블루","러시아","검정");
				break;
				
			}
			animal[i].speak();
		}
		}	
}
		
		
		
		
		
