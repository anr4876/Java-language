
public class JAVA_2022_02_03 {
	
//
//	public static void introduce(int age, String home, String name) {
//		System.out.printf("%s에 사는 %d살 %s 입니다.\n", home, age, name );
//		
//		
//	}
//	
//	public static void addAge(int age, String name) {
//		int addedAge = age + 1;
//		System.out.printf("%s의 나이가 %d에서 %d로 한살 먹었습니다.\n", name, age, addedAge);
//	}
//		
	
	public static void main(String[] args) {
		
		// 사람 - 나이, 이름, 고향
		// 한 사람을 표현하기 위해 세개의 데이터.
//		int age = 20;
//		String name = "홍길동";
//	   	String home = "대전";
		
//		Person.introduce();
//		Person.addAge();
		
		// Person 복사본 만들기
		Person p1 = new Person(); // new 를 이용해서 객체를 만들면 객체를 조종할 수 있는 리모콘이 나온다.
		Person p2 = new Person();
		
		p1.age = 20;
		p1.home = "대전";
		p1.name = "홍길동";
		
		p2.age = 30;
		p2.home = "서울";
		p2.name = "이순신";
		
		p1.introduce();
		p1.addAge();
		
		

		p2.introduce();
		p2.addAge();
	
		
//		Person2.introduce();
//		Person2.addAge();
		
		// 사람의 기능 -> 자기소개
		// introduce( age, home, name);
		// introduce( age2, home2, name2);
		
		// addAge(age2, name2);
		
		
				
		
		
	}

}

// 사람 클래스 -> 데이터구조 + 함수
class Person{
	int age;
	String name;
	String home;
	
	public void introduce() {
		System.out.printf("%s에 사는 %d살 %s 입니다.\n", home, age, name );		
	}
	
	public void addAge() {
		int addedAge = age + 1;
		System.out.printf("%s의 나이가 %d에서 %d로 한살 먹었습니다.\n", name, age, addedAge);
		age = addedAge;
	}
		
	
}
//class Person2{
//	static int age = 30;
//	static String name = "이순신";
//	static String home = "서울";
//	
//	public static void introduce() {
//		System.out.printf("%s에 사는 %d살 %s 입니다.\n", home, age, name );		
//	}
//	
//	public static void addAge() {
//		int addedAge = age + 1;
//		System.out.printf("%s의 나이가 %d에서 %d로 한살 먹었습니다.\n", name, age, addedAge);
//	}
//		
//	
//}
