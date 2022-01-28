import java.util.Scanner;

public class java_2022_01_17 {

	public static void main(String[] args) {
		
	//	scan.nextLine(); // 문자을 가지고올수있다
	//	scan.next(); // 단어를 가지고온다
		
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
		
		System.out.println("원하는 단을 입력해주세요 : ");
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
		
		// 코드 제어
		// 조건문

		if(num_b = true) {
			System.out.println(true);
		}
		
		int money = 10000;
		
		// if 문의 중첩
				
		//if(조건) {
		//	if(조건) {
		//		두개의 조건을 만족하면 실행
		//	}
		//}
		
		//else 활용
		
		if(money > 20000) {
			System.out.println("치킨");	
		}
		else if(money > 10000) {
			System.out.println("짜장면");
		}
		else if(money > 1400) {
			System.out.println("라면");
		}
		else {
			System.out.println("먹지마.");
		}
		
		
		
		
		

		// ===========================================================================================================
		// 문제 : 숫자 두개를 입력받고 더 큰수에서 더 작은 수를 뺀 결과를 출력
		// ===========================================================================================================
		
			
		
		System.out.println("첫번째 숫자를 입력해주세요 : ");
		int num_1 = Integer.parseInt(scan.nextLine());
		System.out.println("두번째 숫자를 입력해주세요 : ");
		int num_2 = Integer.parseInt(scan.nextLine());
		
		// ===========================================================================================================
		// 방법 1
		// ===========================================================================================================
		
		if(num_1 < num_2) {
			System.out.printf("%d" + "-" + "%d" + "=" + "%d\n", num_2, num_1, num_2 - num_1);
		}
		
		if(num_2 < num_1) {
			System.out.printf("%d" + "-" + "%d" + "=" + "%d\n", num_1, num_2, num_1 - num_2);
		}
				
		if(num_2 == num_1) {
			System.out.println("입력받은 두 숫자가 같다 .");
		}
		
		// ===========================================================================================================
		// 방법 2
		// ===========================================================================================================
		
		if(num_1 < num_2) {
			System.out.printf("%d" + "-" + "%d" + "=" + "%d\n", num_2, num_1, num_2 - num_1);
		}
		else {
			System.out.printf("%d" + "-" + "%d" + "=" + "%d\n", num_1, num_2, num_1 - num_2);
		}
		
		// ===========================================================================================================
		// 방법 3
		// ===========================================================================================================

		if(num_1 < num_2) {
			int tmp = num_2 ;
			num_2 = num_1;
			num_1 = tmp;
		}
		
		System.out.println(num_1 - num_2);
		
		
		// ===========================================================================================================
		// 문제 : 나이를 입력해서 학적이 뭔지 예상한 값을 출력해주세요.
		// ===========================================================================================================
		
		System.out.println("나이를 입력해주세요 : ");
		int age = Integer.parseInt(scan.nextLine());
		if (age >= 20) {
			System.out.println("대학생");
		}
		else if(age >= 17) {
			System.out.println("고등학생");
		}
		else if(age >= 14) {
			System.out.println("중학생");
		}
		else if(age >= 8) {
			System.out.println("초등학생");
		}
		else {
			System.out.println("유치원생 or 아기");
		}
	
	}
	

}
