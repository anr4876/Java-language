package example;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
				
		
		//String str2 = scan.next(); // ��ĳ�ʿ� ���� ���ڸ� ������ ������ ������ �о���δ�.
		//String str3 = scan.next();// �������� �о���� ������ ��ĳ�ʿ� ���� ���ڸ� ������ ������ ������ �о���δ�.
		//String str4 = scan.nextLine();// ���� ���� ���� ������ �о���δ�.
		
		// ������� �ߴµ� ������ ����??? �Է��� ���� ������ ���..
		// �Է��� �Ϸ�Ǹ� �Է°��� �о��. �Է��� �Ϸ�� ����
		
		
		// ���
		//System.out.println(str2);
		//System.out.println(str3);
		//System.out.println(str4);
		
		// �Է�
		// System.in.read();
		
		
//		System.out.println("����� �̸��� �Է����ּ��� : ");
//		String name = scan.nextLine();
//		
//		System.out.println("�ȳ��ϼ���, " + name + "��! �ݰ����ϴ�. ���� �Ϸ絵 ��������!");
//		
		
		// ��ĳ�� �ϳ� �����
		Scanner scan = new Scanner(System.in); // System.in �� console������ �����Ͱ� ������ ���� �ǹ� 
		
	
		//Scanner�� �̿��ؼ� �Ʒ��� ���� ����� �Ͽ� ��Ģ������ �������ּ���.
		//����� ����
		//ù��° ���ڸ� �Է����ּ���: 12
		//�ι�° ���ڸ� �Է����ּ���: 33
		//12 + 33 = 45
		
  //���� -> ���� ��ȯ ��� : Integer.parseInt()
		
  //		System.out.println("100" + "200");
  //		// int num5 = (int)"200"; �̷��� �ϴ°� �ƴ�
  //		int num3 = Integer.parseInt("100");
  //		int num4 = Integer.parseInt("200");
  //		System.out.println(num3 + num4);
	

		System.out.println("=== ���ϱ� ���α׷� v1 ===");
		System.out.println("ù��° ���ڸ� �Է����ּ��� : ");
		String num1 = scan.nextLine();
		System.out.println("�ι�° ���ڸ� �Է����ּ��� : ");
		String num2 = scan.nextLine();
		
		int num3 = Integer.parseInt(num1);
		int num4 = Integer.parseInt(num2); 
		
		System.out.println(num3 + " + " + num4 + " = " + (num3 + num4));

    
	}

}