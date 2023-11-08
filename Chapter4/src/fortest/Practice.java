package fortest;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 윤년 확인 프로그램
		// 윤년의 조건
		// 4로 나누어 떨어지는 연도는 윤년입니다.
		// 100으로 나누어 떨어지는 연도는 윤년이 아닙니다.
		// 400으로 나누어 떨어지는 연도는 윤년입니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("연도를 입력해주세요. >>");
		int year = sc.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year + "년은 윤년이 아닙니다.");
		}
		
	}
}
