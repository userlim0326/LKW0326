package operator;

public class OperatorTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// >, >=, <, <=, ==, != : 관계 연산자, 비교 연산자
		int num1 = 2;
		int num2 = 2;
		System.out.println(num1>num2);// 작다	
		System.out.println(num1<num2);// 크다
		System.out.println(num1>=num2);// 크거나 같다	
		System.out.println(num1<=num2);// 작거나 같다
		System.out.println(num1==num2);// 같다
		System.out.println(num1!=num2);// 다르다
		System.out.println("@@@@@@@@@@");
		
		// && , || , ! : 논리 연산자
		System.out.println(true && true); //(1>2 && 10==10); >> true
		System.out.println(true && false);// &&는 두개의 항 모두 true여야 true가 나옴
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println(true || true); // ||는 두개의 항 중 하나라도 true가 있으면 true가 나옴
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println(!true); //!뒤의 결과를 반대로 출력 ex) !(10>20)) >> true
		System.out.println(!false);
	}

}
