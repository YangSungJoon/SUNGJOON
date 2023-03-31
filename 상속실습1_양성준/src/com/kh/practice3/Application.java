package com.kh.practice3;

import com.kh.practice3.model.vo.Cat;
import com.kh.practice3.model.vo.Animal;
import com.kh.practice3.model.vo.Dog;

public class Application {

	public static void main(String[] args) {

	
	Animal[] aniArr = new Animal[5];
	for(int i = 0;i<aniArr.length;i++) {
	int ani = (int)(Math.random()*2);
	
	
		if(ani == 1) {
			
			aniArr[i] = new Dog("멍멍","진돗개",20);
		}else {

	
		aniArr[i] = new Cat("야옹","먼치킨","한국","검정");
		
		
	}
		
	for(Animal a : aniArr)
	a.speak();
	}
	

	
		}

}