import java.util.Scanner;

public class Q {

	public static void main(String[] args) {
		
		// =========================================================================================
		// 1
		// =========================================================================================
		
		
		//Scanner를 이용해서 아래와 같이 입출력 하여 사칙연산을 수행해주세요.
		//입출력 예시
		//첫번째 숫자를 입력해주세요: 12
		//두번째 숫자를 입력해주세요: 33
		//12 + 33 = 45
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=== 더하기 프로그램 v1===");
		
		System.out.println("첫번째 숫자를 입력해주세요 : ");
		String num1 = scan.nextLine();
		
		System.out.println("두번째 숫자를 입력해주세요 : ");
		String num2 = scan.nextLine();
		
		//문자 => 숫자
		int number1 = Integer.parseInt(num1); // Integer.parseInt 문자형 숫자를 int로 형변환해줌
		int number2 = Integer.parseInt(num2); // 변환 후에 int형 변수에 넣어줘야함.
		
		System.out.println(number1 + "+" + number2 +"=" + (number1 + number2));
		
		// =========================================================================================
		// 2
		// =========================================================================================
		// 이름과 나이를 입력값으로 받아 자기소개를 해주세요.
		
		System.out.println("이름을 입력하시오 :");
		String name = scan.nextLine();
		
		System.out.println("나이를 입력하시오 :");
		String age = scan.nextLine();
		
		System.out.println("안녕하세요. " + age + "세 " + name + "입니다.");
		
		
	}

}
