
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
		
		Person.introduce();
		Person.addAge();
		
		Person2.introduce();
		Person2.addAge();
		
		// ����� ��� -> �ڱ�Ұ�
		// introduce( age, home, name);
		// introduce( age2, home2, name2);
		
		// addAge(age2, name2);
		
		
				
				

	}

}

// ��� Ŭ���� -> �����ͱ��� + �Լ�
class Person{
	static int age = 20;
	static String name = "ȫ�浿";
	static String home = "����";
	
	public static void introduce() {
		System.out.printf("%s�� ��� %d�� %s �Դϴ�.\n", home, age, name );		
	}
	
	public static void addAge() {
		int addedAge = age + 1;
		System.out.printf("%s�� ���̰� %d���� %d�� �ѻ� �Ծ����ϴ�.\n", name, age, addedAge);
	}
		
	
}
class Person2{
	static int age = 30;
	static String name = "�̼���";
	static String home = "����";
	
	public static void introduce() {
		System.out.printf("%s�� ��� %d�� %s �Դϴ�.\n", home, age, name );		
	}
	
	public static void addAge() {
		int addedAge = age + 1;
		System.out.printf("%s�� ���̰� %d���� %d�� �ѻ� �Ծ����ϴ�.\n", name, age, addedAge);
	}
		
	
}
