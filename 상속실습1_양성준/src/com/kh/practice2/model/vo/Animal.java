package com.kh.practice2.model.vo;

public abstract class Animal {
	
	private String name;
	private String kinds;
	
	protected Animal() {
		
	}
	
	protected Animal(String name, String kinds) {
		// 내가 가진 필드를 초기화한다.
		this.name = name;
		this.kinds = kinds;
	}
	
	public String toString() {
		return "저의 이름은 "+ name +"이고, 종류는 "+kinds+"입니다.";
		
	}
	
	// 클래스가 추상메서드를 포함할경우 추상클래스가 되어야 함.
	public abstract void speak();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKinds() {
		return kinds;
	}

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	
	
}
