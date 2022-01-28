import java.util.Random;

public class JAVA_2022_01_26 {
	public static void main(String[] args) {
		
		
		
		
		int num1 = 0;
		
	
		
		int[] number = {1,30,700,13,31,55,300};
		
		
		
		
	
		while(num1 != 6){
			num1 = 0;						// while 코드를 계속 실행해주는 코드
			for(int i = 0; i < 6; i++) {
				if(number[i] > number[i+1] ) {
					int a = number[i];  				// 자리 변환 코드
					number[i] =number[i+1];  
					number[i+1] = a;
				}
				else {
					num1++;					// 자리 순서가 맞춰지면 6번 실행되어 num1 을 6으로 만들어 while 실행 종료
				}
			}
		}
		for(int i = 0; i < number.length; i++) {
			System.out.printf("%d ",number[i]);
		}
		
	}
}
