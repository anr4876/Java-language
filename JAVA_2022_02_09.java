package day1;

public class JAVA_2022_02_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person(20, "ȫ��", "����");
		//p1.setData(20, "ȫ�浿", "����");
		p1.introduce();
		
		// ��ü�� ���̽�
		// ��ü�� ������ �۵����� ����
		// ��ü -> ������ ������ ������ �� �����͸� ó���ϱ� ���� �Լ��� ���°�
		// ��ü ���� ���� ��, ��ü ����Ǵ� ������ �ܿ��� �ǵ��� ���ϰ� �ϴ°�.
		// ������ -> ����
		// ��ü�� �ڿ��� ���� ������ �Ͱ� �Ұ����� ���� ���� -> ���������� ���
		// private - ��ü �ڽŸ� ���� �� ���
		// protected - ��Ӱ��� + ���� ��Ű��
		// default - ���� ��Ű�� �ȿ����� ���
		// public - ��ΰ� ���� �� ���
		
		
	}

}

class Person{
	
	int age;
	String name;
	String home;
	
	public void introduce() {
		System.out.printf("�ȳ��ϼ��� %s ��� %d�� %s�Դϴ�.",home,age,name);
		
	}
	

	// this Ű����� �ش� �Լ��� �����ϴ� ��ü(�ν��Ͻ�) �ڽ��� ����Ų��
	Person(int age, String name, String home) {
		
		if(age < 0) {
			System.out.println("���̴� ������ �� �������ϴ�.");
			return;
		}
		this.age = age;
		this.name = name;
		this.home = home;
	}
	
	
	
	
}