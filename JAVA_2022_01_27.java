import java.util.Scanner;

public class JAVA_2022_01_27 {

	
	public static void gugu(int dan) {     // �Լ� ����!
		
		for(int i = 1; i <= 9; i++) {

			System.out.printf("%d X %d = %d\n",dan ,i, dan * i);
		
		}
	}
		
	public static int gop(int num) {
		return num*num;
	}
	
	public static void main(String[] args) {

		// ���α׷����� ����ȭ�ϴ� ����
		// ����ȭ -> ����� ���� ��.
		
		// �Լ�, �޼���
		// �Լ� => �������� �ڵ�(����)�� ���ٷ� ����� ��.
		
		System.out.println("1~9������ ���� �˰���� ���ڸ� �Է��Ͻÿ� : ");
		Scanner scan = new Scanner(System.in);
		String dan1 = scan.nextLine();
		int dan2 = Integer.parseInt(dan1);
		gugu(dan2);
		
		
		int number = gop(3);
		int number2 = gop(4);
		
		System.out.printf("%d + %d = %d", number, number2, number + number2);
		


	}

}