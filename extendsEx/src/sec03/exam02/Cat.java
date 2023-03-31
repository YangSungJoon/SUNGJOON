package sec03.exam02;

public class Cat extends Animal{

	public Cat() {
		System.out.println("포유류");
	}

	@Override
	public void sound() {
		System.out.println("야옹");
	}
	
	
}
