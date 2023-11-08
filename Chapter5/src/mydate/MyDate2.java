package mydate;


public class MyDate2 {
//MyDate 클래스 완성하기
	
// 1.year, month, day 변수를 private으로 선언
// 2.각 변수의 get, set 메서드를 public으로 작성
// 3.MyDate(int year, int month, int day) 생성자를 작성
// 4.isValid()메서드를 만들어 날짜가 정상인지 판단하는 메서드작성
	
	//1.
	//멤버 변수
	private int mydateYear;
	private int mydateMonth;
	private int mydateDay;
	private final String TRUE_MESSAGE = "유효한 날짜입니다.";		//이 두개 제거하고 true false메세지를 각각 
	private final String FALSE_MESSAGE = "유효하지 않은 날짜입니다."; 	//	오른쪽의 String문자열을 넣어도 같다.


	//3. MyDate(년,월,일)
	public MyDate2(int mydateYear, int mydateMonth, int mydateDay) {
		this.mydateYear = mydateYear;
		this.mydateMonth = mydateMonth;
		this.mydateDay = mydateDay;
	}
	
	//2.getter&setter 난 Source로 날먹
	public int getMydateYear() {
		return mydateYear;
	}

	public void setMydateYear(int mydateYear) {
		this.mydateYear = mydateYear;
	}

	public int getMydateMonth() {
		return mydateMonth;
	}

	public void setMydateMonth(int mydateMonth) {
		this.mydateMonth = mydateMonth;
	}

	public int getMydateDay() {
		return mydateDay;
	}

	public void setMydateDay(int mydateDay) {
		this.mydateDay = mydateDay;
	}
	
	//4.
	//teacher's answer
	
	public String isValid() { //맨 처음 디폴트를 유효하지 않은 날짜로 하고 조건 충족되면 유효한 날짜라고 나오게 설정
		String str = FALSE_MESSAGE;
		if(mydateYear >=1 ) {
			if(mydateMonth>=1 && mydateMonth<=12) {
				switch(mydateMonth) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					if(mydateDay>=1 && mydateDay<=31) {
						str = TRUE_MESSAGE;
					}
					break;
				case 4: case 6: case 9: case 11:
					if(mydateDay>=1 && mydateDay<=30) {
						str = TRUE_MESSAGE;
					}
					break;
				case 2:
					if(mydateYear%400==0 || (mydateYear%4==0 && mydateYear%100!=0)) {
						if(mydateDay>=1 && mydateDay<=28) {
							str = TRUE_MESSAGE;
						}
					}else {
						if(mydateDay>=1 && mydateDay<=29) {
							str = TRUE_MESSAGE;
						}
					}
					break;
				}
			}
		}
		return str;
	}

	//////////////////
	
	
//	public void isValid(int mydateYear, int mydateMonth, int mydateDay) {
//
//		if (mydateMonth < 1 || mydateMonth > 12) {
//			System.out.println("유효하지 않은 날짜입니다.");
//		} else if ((mydateMonth == 2) && (mydateDay <= 28)) {	//2월
//			System.out.println("유효한 날짜입니다.");
//		}else if((mydateYear%4 == 0 && mydateYear%100 != 0) || (mydateYear%400 == 0)) {		//윤년 2월
//			mydateDay = 29;
//			System.out.println("유효한 날짜입니다.");
//		}else if ((mydateMonth == 4) || (mydateMonth == 6) || (mydateMonth == 9) || (mydateMonth == 11)) {	//30일
//			mydateDay = 30;
//			System.out.println("유효한 날짜입니다.");
//		} else if ((mydateMonth == 1) || (mydateMonth == 3) || (mydateMonth == 5) || (mydateMonth == 7)
//				|| (mydateMonth == 8) || (mydateMonth == 10) || (mydateMonth == 12) ) {				//31일
//			mydateDay = 31;
//			System.out.println("유효한 날짜입니다.");
//		} else {
//			System.out.println("유효하지 않은 날짜입니다.");
//		}
//	}
	
	///////////////////////////////
//	public void isValid(int mydateYear, int mydateMonth, int mydateDay) {
//		switch(mydateMonth) {
//		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//			mydateDay = 31;
//			System.out.println("유효한 날짜입니다.");
//			break;
//		case 4: case 6: case 9: case 11:
//			mydateDay = 30;
//			System.out.println("유효한 날짜입니다.");
//			break;
//		case 2:
//			mydateDay = 28;
//			System.out.println("유효한 날짜입니다.");
//			if((mydateYear%4 == 0 && mydateYear%100 != 0) || (mydateYear%400 == 0)) {
//				mydateDay = 29;
//				System.out.println("유효한 날짜입니다.");
//			}
//			break;
//		default:
//			System.out.println("유효하지 않은 날짜입니다.");
//		}
		
	}
// 31 = 1 3 5 7 8 10 12
// 30 = 4 6 9 11
//	MyDate date1 = new MyDate(2000,2,30);
//	System.out.println(date1.isValid());

