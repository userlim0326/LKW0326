package fortest;

public class ForTest3 {

	public static void main(String[] args) { //이중 for문
		//continue문
		//반복문 안에서continue만나면 나머지 코드를 실행하지 않고 다음 반복을 실행
		//2의 배수를 제외한 숫자를 출력하는 반복문
		for(int i=1; i<=100; i++) {
			if(i%2 == 0) {
				continue; //continue를 만나면 증감식으로 넘어가게 된다 > i%2 == 0이면 i++로 돌아가고 i%2 == 0이 아닌 값들만 밑의 syso에 나타남			
			}
			System.out.println(i);
		}
		
		//break 문
		//반복문 안에서 break; 를 만나면 반복문을 종료
		int sum = 0;
		int i = 0;
		for(i=0; i<=100; i++) {
			if(sum > 100) {
				break;
			}
			sum += i;
		}
		System.out.println(sum + "이 될때까지 더한 횟수 = " + i);
		System.out.println(sum);
	}

}
