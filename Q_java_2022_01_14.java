import java.util.Scanner;

public class Q {

	public static void main(String[] args) {
		
		// =========================================================================================
		// 1
		// =========================================================================================
		
		
		//Scanner�� �̿��ؼ� �Ʒ��� ���� ����� �Ͽ� ��Ģ������ �������ּ���.
		//����� ����
		//ù��° ���ڸ� �Է����ּ���: 12
		//�ι�° ���ڸ� �Է����ּ���: 33
		//12 + 33 = 45
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=== ���ϱ� ���α׷� v1===");
		
		System.out.println("ù��° ���ڸ� �Է����ּ��� : ");
		String num1 = scan.nextLine();
		
		System.out.println("�ι�° ���ڸ� �Է����ּ��� : ");
		String num2 = scan.nextLine();
		
		//���� => ����
		int number1 = Integer.parseInt(num1); // Integer.parseInt ������ ���ڸ� int�� ����ȯ����
		int number2 = Integer.parseInt(num2); // ��ȯ �Ŀ� int�� ������ �־������.
		
		System.out.println(number1 + "+" + number2 +"=" + (number1 + number2));
		
		// =========================================================================================
		// 2
		// =========================================================================================
		// �̸��� ���̸� �Է°����� �޾� �ڱ�Ұ��� ���ּ���.
		
		System.out.println("�̸��� �Է��Ͻÿ� :");
		String name = scan.nextLine();
		
		System.out.println("���̸� �Է��Ͻÿ� :");
		String age = scan.nextLine();
		
		System.out.println("�ȳ��ϼ���. " + age + "�� " + name + "�Դϴ�.");
		
		
	}

}
