package switchtest;

import java.util.Scanner;

public class SwitchTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5층 건물의 층수를 받아 어떤층인지 알려주는 프로그램
		// 1층 : 약국, 2층 : 정형외과, 3층 : 피부과, 4층 : 치과, 5층 : 헬스 클럽
		//
		Scanner sc = new Scanner(System.in);
		System.out.print("층수 입력 >>");
		int floor = sc.nextInt();
		String place = "없는 층";
		switch (floor) {
		case 1:
			place = "약국";
			break;
		case 2:
			place = "정형외과";
			break;
		case 3:
			place = "피부과";
			break;
		case 4:
			place = "치과";
			break;
		case 5:
			place = "헬스 클럽";
			break;
//		default :
//			place = "없는 층";
		}

		System.out.println(floor + "층은 " + place + " 입니다.");

//		System.out.println(floor + "은 약국 입니다.");
//		System.out.println(floor + "은 정형외과 입니다.");
//		System.out.println(floor + "은 피부과 입니다.");
//		System.out.println(floor + "은 치과 입니다.");
//		System.out.println(floor + "은 헬스 클럽 입니다.");
	}

}
