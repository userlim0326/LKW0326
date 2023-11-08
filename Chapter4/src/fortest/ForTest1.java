package fortest;

public class ForTest1 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=0; i<=10; i++) {
		 //1초기화식; 2조건식; 4증감식을 모두 한 줄에 적는다. 단 순서대로 실행됨 1초기화식>2조건식>3실행문>4증감식
			sum += i; // 3실행문;
		}
		//return result;
		System.out.println(sum);
		//초기화식 생략 : 초기화식을 반드시 위의 다른 곳에 적어 두어야함
		int i = 0;
		for( ; i<=10;	i++) {
			sum += i;
		}
		//조건식 생략 : 반복문 안에서 break문을 이용하여 종료
		for(int j=0; ;	 j++) {
			if(j>10) {
				break;
			}
			sum += j;
		}
		//증감식 생략 : 중괄호 안의 실행문을 적는 공간에 증감식 적어 반복문을 완성해야함
		for(int k=0 ; k<=10;) {
			sum += k;
			k++;
		}
//		for(;;) {
//			System.out.println("모든 내용을 생략 : 무한 반복");
//		}
	}

}
