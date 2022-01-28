import java.util.Scanner;

public class JAVA_2022_01_27 {

	
	public static void gugu(int dan) {     // 함수 선언!
		
		for(int i = 1; i <= 9; i++) {

			System.out.printf("%d X %d = %d\n",dan ,i, dan * i);
		
		}
	}
		
	public static int gop(int num) {
		return num*num;
	}
	
	public static void main(String[] args) {

		// 프로그래밍은 구조화하는 과목
		// 구조화 -> 덩어리로 보는 것.
		
		// 함수, 메서드
		// 함수 => 여러줄의 코드(절차)를 한줄로 만드는 것.
		
		System.out.println("1~9까지의 곱을 알고싶은 숫자를 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		String dan1 = scan.nextLine();
		int dan2 = Integer.parseInt(dan1);
		gugu(dan2);
		
		
		int number = gop(3);
		int number2 = gop(4);
		
		System.out.printf("%d + %d = %d", number, number2, number + number2);
		


	}

}