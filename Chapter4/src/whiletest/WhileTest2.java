package whiletest;

public class WhileTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 50 부터 100까지의 숫자를 더하는 프로그램
		int i = 50;
		int sum = 0;
		while(i<=100) {
			//sum  = sum + i; >
			sum += i;
			System.out.println(sum);
			i++; // 0 += 50 >> 50 += 51 >> 101 += 52...3725 += 100 = 3825
		}
		System.out.println(sum);
		
		//do - while 문
//		do {
//			실행문;
//			증감식;
//		}while(조건식);
		int number = 1;
		int sum2 = 0;
		do {
			sum2 += number; // 실행문
			number++; // 0 += 1 > 1 += 2> 3 += 3> 6 += 4... 45 += 10 = 55 증감식
		}while(number<=10); // 조건식
		System.out.println(sum2);		
	}	
}
