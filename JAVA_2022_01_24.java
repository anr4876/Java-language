import java.util.Scanner;

public class JAVA_2022_01_24 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �迭 ����
		
		int[] list_number = {1,2,3,4,5};
		
		int num_a;
		num_a = 10;
		list_number[2] = num_a; // �迭�� ���Ҹ� �ε���(����)�� �� ��� �������ֽø� �װ� �ϳ��� ���� ������ �Ѵ�.
		System.out.println(num_a);
		System.out.println(list_number[2]);
		num_a++;
		list_number[2]++;
		
		// �迭�� ���̰� �ִ�.
		// �迭�� ������ ������ ������ ����.
		System.out.println(list_number[4]);
		
		// �����͸� ���� �־�� �ϴ� ���
		// ���̸� �˷��ְ� ��ǻ������ �迭�� ������ �� �� �ִ�.
		int[] arr5 = new int[100]; // 0�� ���� ����
		int[] arr6 = new int[5];
		
		// ����� �Է��̳� ���� �о��.
		// �迭�� ������ ���� �ڷ����� ���
		
		// int[] arr7 = {1,2,3,1.5,"abc"}; �ڵ� ���� ����
		
		
		// �迭=> �ڷ���, ����
		String[] arr8 = {"abc", "bbc", "ccc"};
		String[] arr9 = new String[6];
				
		double[] arr10 = {1.1, 2.2, 3.3};
		double[] arr11 = new double[10];
		
		
		// �迭�� ���̸� �𸦶�
		
		// �迭�� ���̴� �迭�� ����.
		System.out.println(arr8.length);
		
		// �迭�� ��ü Ž��
		for(int i = 0; i < arr8.length; i++) {
			System.out.println(arr8[i]);
		}
		
		// �ڹ� API -> �ҷ��;���. import
		// ��Ʈ�� + ����Ʈ(��) + o
		Scanner scan = new Scanner(System.in);
		
		String[] strArr = new String[5]; // null�� ����
		
		for(int i = 0; i < strArr.length; i++) {
			strArr[i] = scan.nextLine();
		}
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}			
			
			
// =========================================================================================================================
// ���� - �迭 ���
// =========================================================================================================================			
		// arr �迭�� 10, 20, 30, 40, 50, 60, 70, 80, 90, 100�� �����ϰ� ������ּ���.
		int[] arr = new int[10];	  	
		int num = 1;
		int number;
		for(int j = 0; j < 10; j++) {
			number = num * 10;
			arr[j] = number ; 
			num++;		
			
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}	
			
			
		// �迭�� �ι� ������ּ���.		
		for(int j = 0; j < 2; j++) {
			for(int i = 0; i < arr.length; i++) {
				System.out.printf("%d", arr[i]);
			}
			System.out.println("");
		}		
			
			
		// �迭�� �̿��� 5���� ���ڸ� �Է¹ް� ������ּ���	
		int[] arr2 = new int[5];
		
		for(int j = 0; j < arr2.length; j++) {
			arr2[j] = Integer.parseInt(scan.nextLine());
		}
		for(int j = 0; j < arr2.length; j++) {
			System.out.printf("%d", arr2[j]);
		}
		System.out.println("");
			
		// �迭�� 5���� ���� �Է��ϰ� �Ųٷ� ������ּ���.
		
		for(int i = 4; i >= 0; i--) {
			System.out.printf("%d", arr2[i]);
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
		
}


