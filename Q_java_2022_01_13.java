import java.util.Random;

public class Q_java_2022_01_13 {

	public static void main(String[] args) {
		
		// ���� : int, �Ǽ�(�Ҽ�) : double, ���� : String

		int num_i;
		byte num_b;
		String char_s;
		double num_d;
		num_i = 100;		
		System.out.println(num_i); // ��� : 100
		num_d = 3.14;
	    System.out.println(num_d); // ��� : 3.14
	    char_s = "�ȳ��ϼ���";
	    System.out.println(char_s); // ��� : �ȳ��ϼ���
	    num_i = 200;
	    System.out.println(num_i); // ��� : 200
	    num_d = 10.5;
	    System.out.println(num_d); // ��� : 10.5
	    char_s = "�ݰ����ϴ�.";
	    System.out.println(char_s); // ��� : �ݰ����ϴ�.

	    
//	    int a = 5;
//	    int b = 10;
//
//	    System.out.println("a : " + a);
//	    System.out.println("b : " + b);
//	   
//	    // ���⼭ ���� 
//	    a = 10;
//	    b = 5;
//	    // ������� ���� ����
//	    
//	    System.out.println("a : " + a);
//	    // ��� : a : 10
//	    System.out.println("b : " + b);
//	    // ��� :  b : 5
	    
	    
	    
	    Random ran = new Random();

	    // `int a` => a��� �̸��� ����(�� ����)�� �����.
	    // `int` => a��� �������� ������ ���� �� �ִ�.
	    // `;` => ������ ������ �˸���.
	    int a;
	    a = ran.nextInt(100);
	    int b = ran.nextInt(100);
	    
	    // `+` => ����� ������ ��ģ��.
	    System.out.println("a : " + a);
	    System.out.println("b : " + b);
	    
	    // ���⼭ ���� 
	    int c;
	    c = a;
	    a = b;
	    b = c;
	    


	    // ������� ���� ����
	    
	    System.out.println("a : " + a);
	    // ��� : a : b�� ��
	    System.out.println("b : " + b);
	    // ��� :  b : a�� ��
	    
	}

}
