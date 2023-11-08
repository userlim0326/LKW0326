package classtest;

class Order {
	// 주문번호, 주문자 아이디, 주문 날짜, 주문자 이름, 주문 상품 번호, 배송 주소
	// 201803120001, abc123, 2018년3월12일, 홍길동, PD0345-12, 서울시 영등포구 여의도동 20
	// 기능 : 모든 내용을 출력하는 기능 (showOrderInfo)
	long nb;
	String id;
	String dt;
	String nm;
	String pnb;
	String ad;

	public Order() {} //기본생성자 : 작성하지 않더라도 실행 가능(프로그램이 생성될 때 컴퓨터가 생성해주어서)
	// 생성자 : 인스턴스를 생성할 때 사용되는 메서드
	// 반드시 클래스 이름으로 만들어야하며 생성자를 작성하면 기본생성자는 없어지게됨
	
	public Order(long nb, String id, String dt, String nm, String pnb, String ad) {
		this.nb = nb;
		this.id = id;
		this.dt = dt;
		this.nm = nm;
		this.pnb = pnb;
		this.ad = ad;
	}

	
	void showOrderInfo() {
		System.out.println("주문번호 : " + nb);
		System.out.println("주문자 아이디 : " + id);
		System.out.println("주문자 날짜 : " + dt);
		System.out.println("주문자 이름 : " + nm);
		System.out.println("주문 상품 번호 : " + pnb);
		System.out.println("배송 주소 : " + ad);

	}
	// 여러 개의 생성자 작성 방법 (생성자 오버로드)
	// 생성자의 매개변수의 갯수를 다르게 한다.
	// 생성자의 매개변수 자료형을 다르게 한다. (같은 자료형에 매개변수의 이름만 다른 것을 만드는 것은 불가능)
	int add(int x) {
		return x+x;
	}
	long add(long x) {
		return x+x;
	}
	int add(int x, int y) {
		return x+y;
	}
	long add(long x, int y) {
		return x+y;
	}
	int add(int x, int y, int z) {
		return x+y+z;
	}
}

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order Order1 = new Order(); //public Order(){} 위에 있던 기본생성자가 없어져서 에러가 생김
		Order1.nb = 201803120001L;
		Order1.id = "abc123";
		Order1.dt = "2018년3월12일";
		Order1.nm = "홍길동";
		Order1.pnb = "PD0345-12";
		Order1.ad = "서울시 영등포구 여의도동 20";
		// ctrl + 메서드 이름 클릭 : 메서드가 선언되있는 코드로 이동
		Order1.showOrderInfo();
		
		Order order2 = new Order(201803120001L, "def123", "2023년11월 03일"
								, "이순신", "PD7890-54", "부산시 부산진구");
		order2.showOrderInfo();
		
		Order order3 = new Order(202311030002L, "eva556", "2023년11월 03일"
								, "임경욱", "PD8809-54", "부산시 부산남구");
		order3.showOrderInfo();

	}

}
