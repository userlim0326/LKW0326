package classtest;

public class FunctionTest {
	// 1부터 파라미터로 받아온 값까지 더해주는 메서드를 작성해보세요.

	int fac(int value) {
		int result = 0;
		for (int i = 0; i <= value; i++) {
			result += i; // result = result + i;
		}
		return result;
	}

	// 메서드 어렵게 생각하지 마라
	// +-*/ 사칙연산을 실행하는 메서드 작성
	int add(int a1, int a2) {
		return a1 + a2;
	}

	int min(int b1, int b2) {
		return b1 - b2;
	}

	int time(int c1, int c3) {
		return c1 * c3;
	}

	int divide(int d1, int d2) {
		return d1 / d2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionTest ft = new FunctionTest();
		System.out.println(ft.fac(10));
		System.out.println(ft.add(10, 20));
		System.out.println(ft.min(100, 50));
		System.out.println(ft.time(5, 50));
		System.out.println(ft.divide(200, 50));
	}
}