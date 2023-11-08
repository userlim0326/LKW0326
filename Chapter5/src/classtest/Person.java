package classtest;

public class Person {
	String name; // 이름
	int height; // 키
	int weight; // 몸무게
	char gender; // 성별
	boolean married; // 결혼여부
	//person 생성자 작성하기
	//기본생성자
	public Person() {}
	//Person가지고 있는 보든 멤버변수의 데이터를 설정하는 생성자
	public Person(String Pname, int Pheight, int Pweight, char Pgender, boolean Pmarried) {
		this.name = Pname;
		this.height = Pheight;
		this.weight = Pweight;
		this.gender = Pgender;
		this.married = Pmarried;
	}
	
// = public void
// void는 return값을 사용하지 않을때 사용 가능; 밑의 void를 int로 바꾸면 return값이 없어서 오류가 생김
	void showPersonInfo() {
		System.out.println(add(10,20));
		System.out.println(name + "," + height + "," + weight + "," + gender + "," + married);
	}

	// 반환자료형 메서드명(매개변수) {
	//	실행문;
	//	return 반환값;
	//}
	int add(int x, int y) {
		int result = x+y;
		return result;
	}
}
// int == 반환자료형(ex String, char), add == 메서드명, (int x, int y) == 매개 변수==파라미터 {
// 		int result = x+y; == 실행문;
// 		return=리턴, result == 반환값;
// }