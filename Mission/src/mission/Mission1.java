package mission;

import java.util.Scanner;

public class Mission1 {
	public static void main(String[] agrs) {
		// 1.
		System.out.println("두 정수를 입력하세요 >>");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		System.out.println(i + "+" + j + "은 " + (i + j));
		// 2.
		System.out.println("몇 층인지 입력하세요 >>");
		int floor = sc.nextInt();
		System.out.println(floor * 5 + "m 입니다.");
		// 3.
		System.out.println("x 값을 입력하세요 >>");
		int x = sc.nextInt();
		int y = (x * x - 3 * x + 7);
		System.out.println("x=" + x + "," + "y=" + y);
		// 5.
		System.out.println("논리 연산을 입력하세요 >>");
		boolean a = sc.nextBoolean();
		String op = sc.next();
		boolean b = sc.nextBoolean();
		switch (op) {
		case "AND":
			System.out.println(a && b);
			break;
		case "OR":
			System.out.println(a || b);
			break;
		}
		// 6.
		System.out.println("돈의 액수를 입력하세요>>");
		int money = sc.nextInt();
		int rest = money;

		money /= 50000;
		System.out.print("오만원" + money + "개" + ", ");
		money = rest % 50000;

		money /= 10000;
		System.out.print("만원" + money + "개" + ", ");
		money = rest % 10000;

		money /= 1000;
		System.out.print("천원" + money + "개" + ", ");
		money = rest % 1000;

		money /= 500;
		System.out.print("500원" + money + "개" + ", ");
		money = rest % 500;

		money /= 100;
		System.out.print("100원" + money + "개" + ", ");
		money = rest % 100;

		money /= 10;
		System.out.print("10원" + money + "개" + ", ");
		money = rest % 10;

		money /= 1;
		System.out.println("만원" + money + "개");

		// 7.
		System.out.println("학점을 입력하세요>>");
		String score = sc.next();
		switch(score) {
		case "A": case "B":
			System.out.println("Excellent");
			break;
		case "C": case "D":
			System.out.println("Good");
			break;
		case "F":
			System.out.println("Bye");
			break;
		
		}	
		//8.
		System.out.println("커피 주문하세요>>");
		String drink = sc.next();
		int count = sc.nextInt();
		//(1)
		if(drink.equals("에스프레소")) {
			System.out.println(2000*count + "원입니다.");
		}else if(drink.equals("아메리카노")) {
			System.out.println(2500*count + "원입니다.");
		}else if(drink.equals("카푸치노")) {
			System.out.println(3000*count + "원입니다.");
		}else if(drink.equals("카페라떼")) {
			System.out.println(3500*count + "원입니다.");
		}	
		//(2)
		switch(drink) {
		case "에스프레소":
			System.out.println(2000*count + "원입니다.");
			break;
		case "아메리카노":
			System.out.println(2500*count + "원입니다.");
			break;
		case "카푸치노":
			System.out.println(3000*count + "원입니다.");
			break;
		case "카페라떼":
			System.out.println(3500*count + "원입니다.");
			
		}
		
	}

}
