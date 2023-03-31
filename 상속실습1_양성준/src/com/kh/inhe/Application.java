package com.kh.inhe;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Student[] sArr = new Student[3];
		
		sArr[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		sArr[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		sArr[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		for(Student s : sArr) {
		System.out.println(s.information());
		
	}
		Employee[] empArr = new Employee[10];
		Scanner scan = new Scanner (System.in);
		
		int i = 0;
		while(true) {
		
		
		System.out.println("이름 : ");
		String name = scan.next();
		System.out.println("나이 : ");
		int age = scan.nextInt();
		System.out.println("신장 : ");
		double height = scan.nextDouble();
		System.out.println("몸무게 : ");
		double weight = scan.nextDouble();
		System.out.println("급여 : ");
		int salary = scan.nextInt();
		System.out.println("부서 : ");
		String dept = scan.next();
		
		Employee emp = new Employee(name, age, height, weight, salary, dept);
		
		empArr[i] = emp;
		i++;
		
		System.out.println("종료를 하시려면 n을 누르세요");
		String next = scan.next();
		if (next.equals("n")|| i == 10) {
			break;
			
		}
		}
		
		for(Employee e : empArr) {
			if(e == null) {
				break;
			}
		
			System.out.println(e.information());
		}
		
		
		
	}
}
