
public class JAVA_2022_02_03 {
	
//
//	public static void introduce(int age, String home, String name) {
//		System.out.printf("%s�� ��� %d�� %s �Դϴ�.\n", home, age, name );
//		
//		
//	}
//	
//	public static void addAge(int age, String name) {
//		int addedAge = age + 1;
//		System.out.printf("%s�� ���̰� %d���� %d�� �ѻ� �Ծ����ϴ�.\n", name, age, addedAge);
//	}
//		
	
	public static void main(String[] args) {
		
		// ��� - ����, �̸�, ����
		// �� ����� ǥ���ϱ� ���� ������ ������.
//		int age = 20;
//		String name = "ȫ�浿";
//	   	String home = "����";
		
//		Person.introduce();
//		Person.addAge();
		
		// Person ���纻 �����
		Person p1 = new Person(); // new �� �̿��ؼ� ��ü�� ����� ��ü�� ������ �� �ִ� �������� ���´�.
		Person p2 = new Person();
		
		p1.age = 20;
		p1.home = "����";
		p1.name = "ȫ�浿";
		
		p2.age = 30;
		p2.home = "����";
		p2.name = "�̼���";
		
		p1.introduce();
		p1.addAge();
		
		

		p2.introduce();
		p2.addAge();
	
		
//		Person2.introduce();
//		Person2.addAge();
		
		// ����� ��� -> �ڱ�Ұ�
		// introduce( age, home, name);
		// introduce( age2, home2, name2);
		
		// addAge(age2, name2);
		
		
				
		
		
	}

}

// ��� Ŭ���� -> �����ͱ��� + �Լ�
class Person{
	int age;
	String name;
	String home;
	
	public void introduce() {
		System.out.printf("%s�� ��� %d�� %s �Դϴ�.\n", home, age, name );		
	}
	
	public void addAge() {
		int addedAge = age + 1;
		System.out.printf("%s�� ���̰� %d���� %d�� �ѻ� �Ծ����ϴ�.\n", name, age, addedAge);
		age = addedAge;
	}
		
	
}
//class Person2{
//	static int age = 30;
//	static String name = "�̼���";
//	static String home = "����";
//	
//	public static void introduce() {
//		System.out.printf("%s�� ��� %d�� %s �Դϴ�.\n", home, age, name );		
//	}
//	
//	public static void addAge() {
//		int addedAge = age + 1;
//		System.out.printf("%s�� ���̰� %d���� %d�� �ѻ� �Ծ����ϴ�.\n", name, age, addedAge);
//	}
//		
//	
//}
