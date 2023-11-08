package access;

//class Student {
//	// 접근 제어자 : public, private, protected, default
//	public int studentID; // public : 외부 클래스 어디서나 다른 패키지에서 사용가능
//	private String studentName; // private : 선언된 클래스 안에서만 사용가능 ex) 지금 이 글이 포함된 class{} 안
//	int score; // default : 같은 패키지 안에서만 새용가능
//	protected String majorCode; // protected : 상속을 받거나 같은 패키지에 있을 경우 사용가능
//	
//	// getter AND setter : private 변수를 설정하고 받아오기 위한 메서드
//	
//	public String getStudentName() {
//		return studentName;
//	}
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//	}
	

//	public String getStudentName() {
//		return studentName; // private이 같은 클래스 안이어서 사용 가능
//	}
//
//	public void setStudentName(String studentName) {
//		if (studentName.length() > 50) {
//			this.studentName = studentName;
//		} else {
//			System.out.println("50글자 넘게 설정할 수 없습니다.");
//		}
//	}


public class AccessModifierTest {
	
	public static void main(String[] args) {
		Student kim = new Student();
		kim.studentID = 1001;
//		kim.studentName = "김유신";	// private이 같은 클래스가 아니기 때문에 사용 불가능 private이 아닌 public 이었으면 가능
		kim.setStudentName("김유신");
		System.out.println(kim.getStudentName());
		kim.score = 100;
		System.out.println(kim.score);
	}
}
