package day1;

//문제 : 사람의 id를 출력해주세요.
//조건 : 사람의 id를 20으로 설정해주세요.
//조건 : 사람 클래스의 id 필드의 private 속성은 수정할 수 없습니다.
//조건 : 사람 클래스에서 출력할 수 없습니다.
class JAVA_2022_02_09_Q3 {
	public static void main(String[] args) {
		Person4 ap = new Person4();
		
		// 구현시작
		
		// 구현끝

		// 출력 : 제 번호는 20 입니다.
	}
}

class Person4 {
	private int id;
	
	// 힌트 : 여기에 메소드 2개 추가해야 합니다.
	public void setId(int id) {
		this.id = id;
	}
	public void getId(int id) {
		return this.id = id;
	} 



}