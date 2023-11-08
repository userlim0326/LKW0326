package access;

public class Student {
	// 접근 제어자 : public, private, protected, default
	public int studentID; // public : 외부 클래스 어디서나 다른 패키지에서 사용가능
	private String studentName; // private : 선언된 클래스 안에서만 사용가능 ex) 지금 이 글이 포함된 class{} 안
	int score; // default : 같은 패키지 안에서만 새용가능
	protected String majorCode; // protected : 상속을 받거나 같은 패키지에 있을 경우 사용가능
	
	// getter AND setter : private 변수를 설정하고 받아오기 위한 메서드
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}