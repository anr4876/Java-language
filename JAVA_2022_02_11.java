package day3;

public class JAVA_2022_02_11 {

	public static void main(String[] args) {
		
		ȫ�浿 aȫ�浿 = new ȫ�浿();
		ȫ��� bȫ��� = new ȫ���();
		
		aȫ�浿.c���α׷���();
		aȫ�浿.�ڹ����α׷���();
		
		
		bȫ���.���̽����α׷���();
		bȫ���.c���α׷���();
	}

}


class ȫ�浿 {
	
	void c���α׷���() {
		System.out.println("c ǥ��1 ���α׷����� �մϴ�.");
	}
	void �ڹ����α׷���() {
		System.out.println("java 18�������� ���α׷��� �մϴ�.");
	}
	
}

class ȫ��� {
	ȫ�浿 aȫ�浿 = new ȫ�浿();
	
	void ���̽����α׷���() {
		System.out.println("���̽� 3.10 ���α׷���");
	}
	void c���α׷���() {
		aȫ�浿.c���α׷���();
	}
	
}
