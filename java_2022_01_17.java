import java.util.Scanner;

public class java_2022_01_17 {

	public static void main(String[] args) {
		
	//	scan.nextLine(); // ������ ������ü��ִ�
	//	scan.next(); // �ܾ ������´�
		
		int dan1 = 3;
		int dan2 = 3;
		
		System.out.println("3 x 1 = \n" + (dan1 * 1)); 
		System.out.println("3 x 1 = \n" + (dan1 * 2)); 
		System.out.println("3 x 1 = \n" + (dan1 * 3)); 
		System.out.println("3 x 1 = \n" + (dan1 * 4)); 
		
		System.out.printf("%d x %d = %d=n\n", dan2, 1, dan2 * 1); 
		System.out.printf("%d x %d = %d=n\n", dan2, 2, dan2 * 2); 
		System.out.printf("%d x %d = %d=n\n", dan2, 3, dan2 * 3); 
		System.out.printf("%d x %d = %d=n\n", dan2, 4, dan2 * 4); 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���ϴ� ���� �Է����ּ��� : ");
		int dan3 = Integer.parseInt(scan.nextLine());
		
		
		System.out.printf("%d x %d = %d\n", dan3, 1, dan3 * 1); 
		System.out.printf("%d x %d = %d\n", dan3, 2, dan3 * 2); 
		System.out.printf("%d x %d = %d\n", dan3, 3, dan3 * 3); 
		System.out.printf("%d x %d = %d\n", dan3, 4, dan3 * 4); 
		System.out.printf("%d x %d = %d\n", dan3, 5, dan3 * 5); 
		System.out.printf("%d x %d = %d\n", dan3, 6, dan3 * 6); 
		System.out.printf("%d x %d = %d\n", dan3, 7, dan3 * 7); 
		System.out.printf("%d x %d = %d\n", dan3, 8, dan3 * 8); 
		System.out.printf("%d x %d = %d\n", dan3, 9, dan3 * 9); 
		
		
		int num_a = 10;
		boolean num_b = true;
		
		// �ڵ� ����
		// ���ǹ�

		if(num_b = true) {
			System.out.println(true);
		}
		
		int money = 10000;
		
		// if ���� ��ø
				
		//if(����) {
		//	if(����) {
		//		�ΰ��� ������ �����ϸ� ����
		//	}
		//}
		
		//else Ȱ��
		
		if(money > 20000) {
			System.out.println("ġŲ");	
		}
		else if(money > 10000) {
			System.out.println("¥���");
		}
		else if(money > 1400) {
			System.out.println("���");
		}
		else {
			System.out.println("������.");
		}
		
		
		
		
		

		// ===========================================================================================================
		// ���� : ���� �ΰ��� �Է¹ް� �� ū������ �� ���� ���� �� ����� ���
		// ===========================================================================================================
		
			
		
		System.out.println("ù��° ���ڸ� �Է����ּ��� : ");
		int num_1 = Integer.parseInt(scan.nextLine());
		System.out.println("�ι�° ���ڸ� �Է����ּ��� : ");
		int num_2 = Integer.parseInt(scan.nextLine());
		
		// ===========================================================================================================
		// ��� 1
		// ===========================================================================================================
		
		if(num_1 < num_2) {
			System.out.printf("%d" + "-" + "%d" + "=" + "%d\n", num_2, num_1, num_2 - num_1);
		}
		
		if(num_2 < num_1) {
			System.out.printf("%d" + "-" + "%d" + "=" + "%d\n", num_1, num_2, num_1 - num_2);
		}
				
		if(num_2 == num_1) {
			System.out.println("�Է¹��� �� ���ڰ� ���� .");
		}
		
		// ===========================================================================================================
		// ��� 2
		// ===========================================================================================================
		
		if(num_1 < num_2) {
			System.out.printf("%d" + "-" + "%d" + "=" + "%d\n", num_2, num_1, num_2 - num_1);
		}
		else {
			System.out.printf("%d" + "-" + "%d" + "=" + "%d\n", num_1, num_2, num_1 - num_2);
		}
		
		// ===========================================================================================================
		// ��� 3
		// ===========================================================================================================

		if(num_1 < num_2) {
			int tmp = num_2 ;
			num_2 = num_1;
			num_1 = tmp;
		}
		
		System.out.println(num_1 - num_2);
		
		
		// ===========================================================================================================
		// ���� : ���̸� �Է��ؼ� ������ ���� ������ ���� ������ּ���.
		// ===========================================================================================================
		
		System.out.println("���̸� �Է����ּ��� : ");
		int age = Integer.parseInt(scan.nextLine());
		if (age >= 20) {
			System.out.println("���л�");
		}
		else if(age >= 17) {
			System.out.println("����л�");
		}
		else if(age >= 14) {
			System.out.println("���л�");
		}
		else if(age >= 8) {
			System.out.println("�ʵ��л�");
		}
		else {
			System.out.println("��ġ���� or �Ʊ�");
		}
	
	}
	

}
