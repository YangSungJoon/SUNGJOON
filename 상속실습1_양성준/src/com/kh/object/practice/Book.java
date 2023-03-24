package com.kh.object.practice;

public class Book {
	
	// 필드
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	// 생성자
	public Book() {}

	public Book(String title, int price, double discountRate, String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	public String information() {
		System.out.println("수정된 결과 확인");
		return getTitle()+" "+getPrice()+" "+getDiscountRate()+" "+getAuthor();
	}
	
	
	public void calc() {
		int res = (int)(getPrice()-(getPrice()*getDiscountRate()));
		System.out.println("도서명 = "+getTitle());
		System.out.println("할인된 가격 = "+res+"원");
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
