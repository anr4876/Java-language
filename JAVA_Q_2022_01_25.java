import java.util.Random;
import java.util.Scanner;

class JAVA_Q_2022_01_25 {
	
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int[] lottoNums = new int[7]; // 1�� ��÷ ��ȣ
        int length = lottoNums.length;

        // �Ʒ��� ���� ����� ��µǵ��� �ζ� ��÷ ��ȣ 7��(���ʽ� ��ȣ ����)�� �������ּ���.
        // 1. ���⿡ ��÷ ��ȣ ���� �ڵ� �ۼ����ּ���.
        // ======================================================================================           
	     
        for(int i = 0; i < length; i++) {
			int no = random.nextInt(44) + 1;
			
			lottoNums[i] = no;
		}
		int num = 0;	 
	    while(true) {
	    	
	    	for(int i = 0; i < length; i++) {
	    		for(int j = 0; j < length; j++) {
	    			if(i != j && lottoNums[i] == lottoNums[j]) {
	    			
	    				for(int k = 0; k < length; k++) {
		    				int no = random.nextInt(44) + 1;
					    		lottoNums[k] = no;
	    				}
				    }
	    			else {
	    				num = 10;
	    			}
				}
			}
		if(num == 10) {
			break;
		}
		}
		     
       // ======================================================================================


        // 1 ��� �ڵ�
        // ======================================================================================
        

        for(int i = 0; i < length - 1; i++) {
        	System.out.printf("%d ", lottoNums[i]);
        }
        System.out.printf("\n���ʽ� ��ȣ : %d\n", lottoNums[length - 1]);
        System.out.println("��");


        // ======================================================================================

        // ��°��
        // ��÷ ��ȣ : 43, 32, 25, 19, 15, 7, ���ʽ� ��ȣ : 36
    }
}