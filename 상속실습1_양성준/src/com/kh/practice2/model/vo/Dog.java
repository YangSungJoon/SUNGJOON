package com.kh.practice2.model.vo;

public class Dog extends Animal{
	
	// static final : 상수로 정의
	public static final String PLACE = "애견카페";
	private int weight;
	
	public Dog() {
		
	}
	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		setWeight(weight);
		
	}
	
	@Override
	public void speak() {
		// 부모의 메서드를 호출
		System.out.println(super.toString()+ "몸무게는 "+weight +"kg 입니다.");
	}
	
	public String getPLACE() {
		return PLACE;
	}
	public void setPLACE(String pLACE) {
		
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	

		
	
}
