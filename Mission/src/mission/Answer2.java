package mission;

import java.util.Scanner;

public class Answer2 {

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

		// 5.
		// aaa* 4 3 1
		// aa*** 5 2 3
		// a***** 6 1 5
		// ******* 7 7
		int sub = 3;
		for (int i = 4; i <= 7; i++) {
			for (int j = 0; j < i; j++) {
				if (j < sub) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			sub--;
			System.out.println();
		}
		System.out.println("---------------");

		// 6.
		// ******* 7 7
		// a***** 6 1
		// aa*** 5 2 3
		// aaa* 4 3 1
		sub = 0;
		for (int i = 7; i >= 4; i--) {// i가 4가 될때까지 실행 >> 4번실행 7 6 5 4
			for (int j = 0; j < i; j++) {
				if (j < sub) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			sub++;
			System.out.println();
		}
		//7.
		//7
				sub = 3;
				for(int i=4; i<=6; i++) {
					for(int j=0; j<i; j++) {
						if(j<sub) {
							System.out.print(" ");
						}else {
							System.out.print("*");
						}
					}
					sub--;
					System.out.println();
				}
				sub = 0;
				for(int i=7; i>=4; i--) {
					for(int j=0; j<i; j++) {
						if(j<sub) {
							System.out.print(" ");
						}else {
							System.out.print("*");
						}
					}
					sub++;
					System.out.println();
				}
		
		//8.
		Scanner sc = new Scanner(System.in);
		int win = 0;
		int lose = 0;
		while(true) {
			System.out.println("가위(1), 바위(2), 보(3) 중에 선택해주세요>>");
			int player = sc.nextInt();
			int computer = (int)(Math.random()*3)+1;
			int result = player - computer;
			String a1 = "";
			
			if(result == 0) {
				a1 = "비김";
			}else if(result ==-2 || result == 1) {
				a1 = "승리";
				win++;
			}else {
				a1 = "패배";
				lose++;
			}
			System.out.println("플레이어" + rockPaper(player)
			+ " vs " + rockPaper(computer)+ "컴퓨터 : " + a1 );
			System.out.println("승리 : " + win +"/5, 패배 : " + lose);
			if(win>=5) {
				System.out.println("종료");
				break;
			}
		}
	}
	public static String rockPaper(int num) {
		String str = "";
		if(num==1) {
			str ="가위";
		}else if (num==2) {
			str = "바위";
		}else {
			str = "보";
		}
		return str;
	}
}
