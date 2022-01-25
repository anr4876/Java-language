import java.util.Random;
import java.util.Scanner;

class JAVA_Q_2022_01_25 {
	
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int[] lottoNums = new int[7]; // 1등 당첨 번호
        int length = lottoNums.length;

        // 아래와 같이 결과가 출력되도록 로또 당첨 번호 7개(보너스 번호 포함)를 선택해주세요.
        // 1. 여기에 당첨 번호 추출 코드 작성해주세요.
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


        // 1 출력 코드
        // ======================================================================================
        

        for(int i = 0; i < length - 1; i++) {
        	System.out.printf("%d ", lottoNums[i]);
        }
        System.out.printf("\n보너스 번호 : %d\n", lottoNums[length - 1]);
        System.out.println("끝");


        // ======================================================================================

        // 출력결과
        // 당첨 번호 : 43, 32, 25, 19, 15, 7, 보너스 번호 : 36
    }
}