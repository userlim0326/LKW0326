package classtest;

public class PersonTest {
	int devide(int x, int y) {
		return x/y; //main 안에 만들면 오류가 생김. class안에 만들어야함.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 선언
		// 클래스명 변수명 = new 클래스();
		// 자료형 변수명 = new 생성자();
		Person kim = new Person();
		kim.name = "김유신";
		kim.height = 180;
		kim.weight = 80;
		kim.gender = 'm';
		kim.married = true;
		// 변수명.메서드명() : 메서드 실행 방법	ex) ft.divide(200, 50);	
		kim.showPersonInfo();
		// 변수명.멤버변수명 : 멤버 변수 사용방법
		System.out.println(kim.name);
		System.out.println(kim.add(10, 20));//add에 int형식을 들고오는데 String값을 넣으면 add에 오류가 생김
		
		PersonTest pt = new PersonTest();
		System.out.println(pt.devide(10, 2));// == System.out.println(5);
		
		Person person1 = new Person();
		person1.name = "이순신";
		person1.height = 180;
		person1.weight = 70;
		person1.gender = 'M';
		person1.married = true;
		
		person1.showPersonInfo();
		
		Person person2 = new Person("김부각", 170 , 65 , 'W' , true);
		person2.showPersonInfo();
		
		
	}
	
}//main은 class안에 존재하는게 아님
