import java.util.Random;

public class JAVA_2022_01_26 {
	public static void main(String[] args) {
		
		
		
		
		int num1 = 0;
		
	
		
		int[] number = {1,30,700,13,31,55,300};
		
		
		
		
	
		while(num1 != 6){
			num1 = 0;						// while �ڵ带 ��� �������ִ� �ڵ�
			for(int i = 0; i < 6; i++) {
				if(number[i] > number[i+1] ) {
					int a = number[i];  				// �ڸ� ��ȯ �ڵ�
					number[i] =number[i+1];  
					number[i+1] = a;
				}
				else {
					num1++;					// �ڸ� ������ �������� 6�� ����Ǿ� num1 �� 6���� ����� while ���� ����
				}
			}
		}
		for(int i = 0; i < number.length; i++) {
			System.out.printf("%d ",number[i]);
		}
		
	}
}
