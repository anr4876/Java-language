package day1;

public class JAVA_2022_02_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person(20, "홍길", "대전");
		//p1.setData(20, "홍길동", "대전");
		p1.introduce();
		
		// 객체가 베이스
		// 객체가 온전히 작동함을 보장
		// 객체 -> 복잡한 데이터 구조와 그 데이터를 처리하기 위한 함수의 생태계
		// 객체 설계 만들 때, 객체 설계또는 생성자 외에는 건들지 못하게 하는것.
		// 아이폰 -> 루팅
		// 객체의 자원을 접근 가능한 것과 불가능한 것을 구분 -> 접근제어자 사용
		// private - 객체 자신만 접근 및 사용
		// protected - 상속관계 + 같은 패키지
		// default - 같은 패키지 안에서만 사용
		// public - 모두가 접근 및 사용
		
		
	}

}

class Person{
	
	int age;
	String name;
	String home;
	
	public void introduce() {
		System.out.printf("안녕하세요 %s 사는 %d살 %s입니다.",home,age,name);
		
	}
	

	// this 키워드는 해당 함수를 수행하는 객체(인스턴스) 자신을 가리킨다
	Person(int age, String name, String home) {
		
		if(age < 0) {
			System.out.println("나이는 음수가 될 수없습니다.");
			return;
		}
		this.age = age;
		this.name = name;
		this.home = home;
	}
	
	
	
	
}