package day1;
//���� : ���� ��µǰ� ���ּ���.

class JAVA_2022_02_09_Q2 {
	public static void main(String[] args) {
		Person3 p1 = new Person3();
		p1.id = 20;
		
		System.out.println("�� ��ȣ�� " + p1.id + " �Դϴ�.");
		// ��� : �� ��ȣ�� 20 �Դϴ�.
	}
}

class Person3 {
	// private => �ܺη� �������� �ʴ´�., �����ܿ� ������� �ʴ´�.
	int id;
}