package chapter2;

public class Variable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 자료형 byte, short, int, long 보통 int를 많이 사용함
		byte b = 1; //1바이트 : -128 ~ +127
		short s = -32768; //2바이트 : -32768 ~ +32767
		int i = 2147483647; //4바이트 (Integer) : -2147483648 ~ +2147483647
		long l = 9223372036854775807L;	//8바이트 : -9223372036854775808 ~ +9223372036854775807 대문자 L이나 소문자 l 사용
		// ctrl + space : 자동완성 ex) syso ctrl + space > System.out.println(); 만들 수 있음
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
		 //한글자만 표시하는 자료형 char(Character)
		char c = 65;
		System.out.println(c); //결과가 A로 나오는 이유 : 아스키 코드를 사용하면 알 수 있다.
		char k = '가'+1; //한글 변환
		System.out.println(k); //강제 형 변
		
		//여러 글자를 표시하는 자료형 String (기본 자료형 X > String의 색상이 변하지 않음)
		String str = "String 자료형은 문자열을 저장합니다.";
		System.out.println(str);
		
		// 실수 자료형 float, double 소문자 f 나 대문자 F 사용 아니면 오류남
		float f = 0.1F;// 4바이트 
		double d = 1; // 8바이트 실수 자료형이어도 정수도 대입 가능 단 결과가 소수점까지 나옴.
		System.out.println(f);
		System.out.println(d);
		for(int i2=0; i2<10000; i2++) {
			d = d + 0.1; // d + 0.1을 100번 반복
		}
		System.out.println(d); //딱 맞아 떨어져 나오지 않음(실수는 계산결과가 정확하지 않음)
		
		 // 논리 자료형 boolean : true(참), false(거짓)만 저장 가능
		boolean bo = true;
		System.out.println(bo);
		
		var v1 = 10; // int l이나L썼으면 long형
		var v2 = 10.2; // double, f나F썼으면 float형
		var v3 = 'a'; // char
		var v4 = true; // boolean
		var v5 = 1.12f; // float
		var v6 = 100012345634L; // long
		var v7 = "string 자료형"; // string
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
		System.out.println(v7);
	}

}
