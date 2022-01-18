import java.util.Scanner;

public class java_2022_01_18 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		 
		System.out.println("당신의 나이를 입력해주세요 : ");
		int age = Integer.parseInt(scan.nextLine());
		
		System.out.println("당신의 나이는 " + age + "살 입니다.");
		
		// 구현 시작
		
		if(age < 20 || age > 59) {
			System.out.println("할인대상");
		}
		else {
			System.out.println("할인대상 X");
		}
	
		System.out.println("원하는 단을입력해주세요 : ");
		int dan = Integer.parseInt(scan.nextLine());
		System.out.printf("%d X %d = %d\n", dan, 1, dan * 1);
		
		
		// 반복문
		
		// ==========================================================================
		// 문제-1
		// ==========================================================================		
		// 출력
	    // 1
	    // 2
	    // 3
	    // 4
	    // 5
	    // ...
	    // 100
	
		
		for(int count =1 ; count < 101 ;count++) {
			System.out.printf("%d\n" , count);
		}
	

		// ==========================================================================
		// 문제-2
		// ==========================================================================	
		
		
		// 문제1. 1 ~ 100까지 수중 짝수만 출력
	    //2
	    //4
	    //6
	    //8
	    //...
	    //100
		
		for(int count =1 ; count < 101 ;count++) {
			if (count % 2 == 0) {
			System.out.printf("%d\n" , count);
		
			}
		}


	    // 문제1. 1 ~ 100까지 수를 출력하는데 숫자 뒤에 짝수는 even, 홀수는 odd를 붙여서 출력
	    //1:odd
	    //2:even
	    //3:odd
	    //4:even
	    //5:odd
	    //6:even
	    //7:odd
	    //8:even
	    //...
	    //100:even

		for(int count =1 ; count < 101 ;count++) {
			if (count % 2 == 0) {
			System.out.printf("%deven \n" , count);
			
		
			}
			else {
			System.out.printf("%dodd \n" , count);
					
			}
		}
		System.out.println("\n"); 
		
		// ==========================================================================
		// 문제-3
		// ==========================================================================	
		
		// 1부터 100까지의 합을 구해주세요.
		
		int num = 0;
		
		for(int count =1 ; count < 101 ;count++) {
			num += count;
		}
		System.out.println(num);
		
		// ==========================================================================
		// 문제-4
		// ==========================================================================	
		
		// n부터 m까지의 수중 k의 배수인 수들의 합 구하기
		   
	    // 시작 수 : [3]
	    // 끝 수 : [20]
	    // 배수 : [4]
		num =0;
		for(int count =3 ; count < 21 ;count++) {
			if(count % 4 == 0) {
				num += count;
			}
		}	
		System.out.println(num);
	    // 결과 : 60


	    // 시작 수 : [5]
	    // 끝 수 : [30]
	    // 배수 : [6]

		
		num =0;
		for(int count =5 ; count < 31 ;count++) {
			if(count % 6 == 0 && count >= 6) {
				num += count;
			}
		}	
		System.out.println(num);
	    // 결과 : 84

		// ==========================================================================
		// 문제-5
		// ==========================================================================	
		
		
		// 문제 : 구구단 작성
		// 조건 : 짝수번째만 곱하기
		/* 출력예시 :

		  2 * 2 = 4
		  2 * 4 = 8
		  2 * 6 = 12
		  2 * 8 = 16
		  
		  ... 

		  9단까지 이런식으로 나오면 됩니다.

		*/
		
		for (int dan1 = 1; dan1 < 10; dan1++) {
			for (int gop = 2; gop < 10; gop += 2) {
				System.out.printf("%d X %d = %d\n", dan1, gop, dan1*gop);
			}
		}
		
		
		// ==========================================================================
		// 문제-6
		// ==========================================================================	
		
		// 구구단은 n단 ~ m단 중 홀수단만 1 ~ limit 까지 곱 중 짝수곱만 출력해주세요.
		
		  /*  입출력 예시
	    n은 4, m은 20, limit는 10

	    5 * 2 = 10
	    5 * 4 = 20
	    5 * 6 = 30
	    5 * 8 = 40
	    5 * 10 = 50

	    7 * 2 = 14
	    7 * 4 = 28
	    7 * 6 = 42
	    7 * 8 = 56
	    7 * 10 = 70
	    ...
	    ...
	    19 * 2 = 38
	    19 * 4 = 76
	    19 * 6 = 114
	    19 * 8 = 152
	    19 * 10 = 190
	    

	    */

		for (int dan1 = 4; dan1 < 21; dan1++) {
			for (int gop = 2; gop < 11; gop += 2) {
				if (dan1 % 2 != 0 && gop % 2 == 0) {
				System.out.printf("%d X %d = %d\n", dan1, gop, dan1*gop);
			
				}
			}
		}
		
		// ==========================================================================
		// 문제-7
		// ==========================================================================	
		
	    // 출력
	    /*
	    높이 : [3]

	    *
	    **
	    ***

		

	    */
		for(int count =1 ; count <= 3 ;count++) {
			for (int num1 = 1; num1 <= count ; num1++) {
				System.out.printf("*");
			}
			System.out.println();
			
			
		}
		

	    /*

	    높이 : [5]
	    
	    *
	    **
	    ***
	    ****
	    *****

	    */
		for(int count =1 ; count <= 5 ;count++) {
			for (int num1 = 1; num1 <= count ; num1++) {
			System.out.printf("*");
			}
			System.out.println();
			
			
		}

	    /*

	    높이 : [7]

	    *
	    **
	    ***
	    ****
	    *****
	    ******
	    *******
	    
	    */
		
		for(int count =1 ; count <= 7 ;count++) {
			for (int num1 = 1; num1 <= count ; num1++) {
			System.out.printf("*");
			}
			System.out.println();
			
			
		}
		
		
		 // 출력
	    /*

	    높이 : [3]

	      *
	     **
	    ***
	    
	    */
		
		for(int count = 1 ; count <= 3  ;count++) {
			for (int num1 = 1 ; num1 <= 3 - count ; num1++  ) {
			System.out.printf(" ");
			}
			for (int num2 = 1; num2 <= count ; num2++ ) {
			System.out.printf("*");
			}
			
			System.out.println();
			
			
		}
	    /*

	    높이 : [5]

	        *
	       **
	      ***
	     ****
	    *****

	    */

		for(int count = 1 ; count <= 5  ;count++) {
			for (int num1 = 1 ; num1 <= 5 - count ; num1++  ) {
			System.out.printf(" ");
			}
			for (int num2 = 1; num2 <= count ; num2++ ) {
			System.out.printf("*");
			}
			
			System.out.println();
			
			
		}
	    /*

	    높이 : [7]

	          *
	         **
	        ***
	       ****
	      *****
	     ******
	    *******

	    */
		
		for(int count = 1 ; count <= 7  ;count++) {
			for (int num1 = 1 ; num1 <= 7 - count ; num1++  ) {
			System.out.printf(" ");
			}
			for (int num2 = 1; num2 <= count ; num2++ ) {
			System.out.printf("*");
			}
			
			System.out.println();
			
			
		}
		
		
		int y = 3;
	    // 출력
		
		num = 0;
		for(int count = 1 ; count <= y  ;count++) {
			for (int num1 = 1 ; num1 <= y - count ; num1++  ) {
			System.out.printf(" ");
			}
			
			
			for (int num2 = 1; num2 <= count + num   ; num2++  ) {
				
			System.out.printf("*");
			}
			
			System.out.println();
			
			num++;
		}
	    /*


	      *
	     ***
	    *****

	    
	    */

	    y = 5;
	    // 출력
	    /*


	        *
	       ***
	      *****
	     *******
	    *********


	    */

	    num = 0;
		for(int count = 1 ; count <= y  ;count++) {
			for (int num1 = 1 ; num1 <= y - count ; num1++  ) {
			System.out.printf(" ");
			}
			
			
			for (int num2 = 1; num2 <= count + num   ; num2++  ) {
				
			System.out.printf("*");
			}
			
			System.out.println();
			
			num++;
		}
		
	    y = 7;
	    // 출력
	    /*


	          *
	         ***
	        *****
	       *******
	      *********
	     ***********
	    *************


	    */
		
	    num = 0;
		for(int count = 1 ; count <= y  ;count++) {
			for (int num1 = 1 ; num1 <= y - count ; num1++  ) {
			System.out.printf(" ");
			}
			
			
			for (int num2 = 1; num2 <= count + num   ; num2++  ) {
				
			System.out.printf("*");
			}
			
			System.out.println();
			
			num++;
		}
		
		
		
		
	}
	

}
