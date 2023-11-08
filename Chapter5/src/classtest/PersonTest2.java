package classtest;

import java.util.Scanner;

public class PersonTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체 여러 개 만들기 			//class Person == 설계도
		Person kim = new Person(); //new Person(); == 인스턴스 생성
		kim.name = "김유신";
		Person lee = new Person();
		lee.name = "이순신";
		Person ahn = new Person();
		ahn.name = "안연수";
		Person song = new Person();
		song.name = "송치원";
		kim.showPersonInfo();
		lee.showPersonInfo();
		ahn.showPersonInfo();
		song.showPersonInfo();
		
		Person lim = new Person("임주장", 170, 60, 'M', false);
		lim.showPersonInfo();
		Scanner sc = new Scanner(System.in);		
	}

}
