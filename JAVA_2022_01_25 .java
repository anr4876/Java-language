import java.util.Random;
import java.util.Scanner;

public class JAVA_2022_01_25 {

	public static void main(String[] args) {
		
		
		// 1. API -> �ڹٿ��� �̸� ����� ���� �����ϴ� ���.
		// Scanner. print
		Scanner scan = new Scanner(System.in);
		
		// ���� ���� API
		
		// Random rd = new Random(); // ���� ��ü ����
		
		// int no = rd.nextInt(45); // 0 ~ 45 ������ ������ �� ����
		
		// 2. continue, berak -> �ݺ��� ����
		
		// ���� �ݺ� ����
		
		int cnt = 0;
		while(true) {
			
			if(cnt == 10) {
				break;
			}
			cnt++;
		}
		
		
		
		// ���� ��� ����
		for(int i = 1; i <= 10; i++) {

			if(i == 5) {
				
				//break; // �ݺ��� ���� ����. ���� ȸ���� ���̵簣�� �ٷ� ����
				continue;
			}
			System.out.println(i);
			
		}
		
		// ���� �ݺ��� ����
		// break, contine �� �ڽ��� ���� �ݺ������׸� ����
		for(int dan = 2; dan <= 9; dan++) {
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, dan*i);
				break;
			}
		}
		
		
		
		
	}

}
