package example;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
				
		
		//String str2 = scan.next(); // 스캐너에 들어온 문자를 공백이 나오기 전까지 읽어들인다.
		//String str3 = scan.next();// 직전까지 읽어들인 곳부터 스캐너에 들어온 문자를 공백이 나오기 전까지 읽어들인다.
		//String str4 = scan.nextLine();// 다음 줄이 나올 때까지 읽어들인다.
		
		// 읽으라고 했는데 읽을게 없다??? 입력이 들어올 때까지 대기..
		// 입력이 완료되면 입력값을 읽어간다. 입력의 완료는 엔터
		
		
		// 출력
		//System.out.println(str2);
		//System.out.println(str3);
		//System.out.println(str4);
		
		// 입력
		// System.in.read();
		
		
//		System.out.println("당신의 이름을 입력해주세요 : ");
//		String name = scan.nextLine();
//		
//		System.out.println("안녕하세요, " + name + "님! 반갑습니다. 오늘 하루도 힘내세요!");
//		
		
		// 스캐너 하나 만들기
		Scanner scan = new Scanner(System.in); // System.in 은 console쪽으로 데이터가 들어오는 것을 의미 
		
	
		//Scanner를 이용해서 아래와 같이 입출력 하여 사칙연산을 수행해주세요.
		//입출력 예시
		//첫번째 숫자를 입력해주세요: 12
		//두번째 숫자를 입력해주세요: 33
		//12 + 33 = 45
		
  //문자 -> 숫자 변환 방법 : Integer.parseInt()
		
  //		System.out.println("100" + "200");
  //		// int num5 = (int)"200"; 이렇게 하는거 아님
  //		int num3 = Integer.parseInt("100");
  //		int num4 = Integer.parseInt("200");
  //		System.out.println(num3 + num4);
	

		System.out.println("=== 더하기 프로그램 v1 ===");
		System.out.println("첫번째 숫자를 입력해주세요 : ");
		String num1 = scan.nextLine();
		System.out.println("두번째 숫자를 입력해주세요 : ");
		String num2 = scan.nextLine();
		
		int num3 = Integer.parseInt(num1);
		int num4 = Integer.parseInt(num2); 
		
		System.out.println(num3 + " + " + num4 + " = " + (num3 + num4));

    
	}

}