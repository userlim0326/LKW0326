package mission;

import java.util.Scanner;

public class Mission2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 구구단을 짝수단만 출력하도록 프로그램을 만들어 보세요.
		// (continue 사용)

		for (int i = 2; i <= 9; i += 2) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
				if (i >= j) { // i%2 != 0
					continue;
				}
			}
		}
		System.out.println("---------------");
		// 2. 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는
		// 프로그램을 만들어 보세요. (break)사용
		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				if (i < j) {
					break;
				}
				System.out.println(i + "*" + j + "=" + i * j);
			}
			
		}
		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				if (i < j) {
					break;
				}
				System.out.println(i + "*" + j + "=" + i * j);
			}
			
		}
		// 3. 반복문을 사용하여 다음 모양을 출력하는 프로그램을
		// 만들어보세요.
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------");
		// 4. 반복문을 사용하여 다음 모양을 출력하는 프로그램을
		// 만들어보세요.
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------");
		// 5. 반복문을 사용하여 다음 모양을 출력하는 프로그램을
		// 만들어보세요.
		for (int i = 1; i < 10; i+=2) {
			for(int j = 9; j > i; j-=2) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++){
				System.out.print("*");
			}
			System.out.println();
			
		}
		System.out.println("---------------");
		// 6.
		for (int i =1; i<10; i+=2) {
			for(int j = 1; j<i; j+=2) {
				System.out.print(" ");
			}
			for (int j =10; j >i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------");
		//7.
		for (int i = 1; i < 10; i+=2) {
			for(int j = 9; j > i; j-=2) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++){
				System.out.print("*");
			}
			System.out.println();
			
		}
		for (int i =1; i<10; i+=2) {
			for(int j = 0; j<i; j+=2) {
				System.out.print(" ");
			}
			for (int j =8; j >i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//8.
		
		System.out.println("-----실행결과------");
		System.out.println("가위(1), 바위(2), 보(3) 중에서 선택해주세요.>>");
		Scanner sc = new Scanner(System.in);
		int com = (int)(Math.random()*3);
		int user = sc.nextInt();
		int result = user - com;
		// 0 : 비겼을 때
		// -2, 1 : 이겼을 때
		// 그외(2, -1) : 졌을 때
		switch(user) {
		case 1:
			System.out.print("플레이어 가위");
			break;
		case 2:
			System.out.print("플레이어 바위");
			break;
		case 3:
			System.out.print("플레이어 보");
			break;
		}
		System.out.print(" vs ");
		
		switch(com) {
		case 1:
			System.out.print("가위 컴퓨터");
			break;
		case 2:
			System.out.print("바위 컴퓨터");
			break;
		case 3:
			System.out.print("보 컴퓨터");
			break;
		}
		switch(result) {
		case 0:
			System.out.println(" : 무승부");
			break;
		case -2: case 1:
			System.out.println(" : 승리");
			break;
		case -1: case 2:
			System.out.println(" : 패배");
			break;
		}
		
	}
}
