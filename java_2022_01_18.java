import java.util.Scanner;

public class java_2022_01_18 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		 
		System.out.println("����� ���̸� �Է����ּ��� : ");
		int age = Integer.parseInt(scan.nextLine());
		
		System.out.println("����� ���̴� " + age + "�� �Դϴ�.");
		
		// ���� ����
		
		if(age < 20 || age > 59) {
			System.out.println("���δ��");
		}
		else {
			System.out.println("���δ�� X");
		}
	
		System.out.println("���ϴ� �����Է����ּ��� : ");
		int dan = Integer.parseInt(scan.nextLine());
		System.out.printf("%d X %d = %d\n", dan, 1, dan * 1);
		
		
		// �ݺ���
		
		// ==========================================================================
		// ����-1
		// ==========================================================================		
		// ���
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
		// ����-2
		// ==========================================================================	
		
		
		// ����1. 1 ~ 100���� ���� ¦���� ���
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


	    // ����1. 1 ~ 100���� ���� ����ϴµ� ���� �ڿ� ¦���� even, Ȧ���� odd�� �ٿ��� ���
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
		// ����-3
		// ==========================================================================	
		
		// 1���� 100������ ���� �����ּ���.
		
		int num = 0;
		
		for(int count =1 ; count < 101 ;count++) {
			num += count;
		}
		System.out.println(num);
		
		// ==========================================================================
		// ����-4
		// ==========================================================================	
		
		// n���� m������ ���� k�� ����� ������ �� ���ϱ�
		   
	    // ���� �� : [3]
	    // �� �� : [20]
	    // ��� : [4]
		num =0;
		for(int count =3 ; count < 21 ;count++) {
			if(count % 4 == 0) {
				num += count;
			}
		}	
		System.out.println(num);
	    // ��� : 60


	    // ���� �� : [5]
	    // �� �� : [30]
	    // ��� : [6]

		
		num =0;
		for(int count =5 ; count < 31 ;count++) {
			if(count % 6 == 0 && count >= 6) {
				num += count;
			}
		}	
		System.out.println(num);
	    // ��� : 84

		// ==========================================================================
		// ����-5
		// ==========================================================================	
		
		
		// ���� : ������ �ۼ�
		// ���� : ¦����°�� ���ϱ�
		/* ��¿��� :

		  2 * 2 = 4
		  2 * 4 = 8
		  2 * 6 = 12
		  2 * 8 = 16
		  
		  ... 

		  9�ܱ��� �̷������� ������ �˴ϴ�.

		*/
		
		for (int dan1 = 1; dan1 < 10; dan1++) {
			for (int gop = 2; gop < 10; gop += 2) {
				System.out.printf("%d X %d = %d\n", dan1, gop, dan1*gop);
			}
		}
		
		
		// ==========================================================================
		// ����-6
		// ==========================================================================	
		
		// �������� n�� ~ m�� �� Ȧ���ܸ� 1 ~ limit ���� �� �� ¦������ ������ּ���.
		
		  /*  ����� ����
	    n�� 4, m�� 20, limit�� 10

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
		// ����-7
		// ==========================================================================	
		
	    // ���
	    /*
	    ���� : [3]

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

	    ���� : [5]
	    
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

	    ���� : [7]

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
		
		
		 // ���
	    /*

	    ���� : [3]

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

	    ���� : [5]

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

	    ���� : [7]

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
	    // ���
		
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
	    // ���
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
	    // ���
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
