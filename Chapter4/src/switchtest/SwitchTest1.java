package switchtest;

public class SwitchTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		switch(변수) {
//			case 변수와 비교하고 싶은 값:
//				실행문;
//				break;
//			case 변수와 비교하고 싶은 값:
//				실행문;
//				break;
//			default :
//				실행문;
//				break;
//		}
		int ranking = 1;
		char medalColor;
		switch(ranking) {
			case 1 :
				medalColor = 'G';
				break;
			case 2 :
				medalColor = 'S';
				break;
			case 3 :
				medalColor = 'B';
				break;
			default :
				medalColor = 'A';
				break;		
		}
		System.out.println(ranking + "등의 메달 색은 " + medalColor + "입니다.");
		//출력하고 싶은 값이 있으면 반드시 break를 사용하자 없으면 다른값도 실행되어서 원하지 않는 값이 나옴
	}

}
