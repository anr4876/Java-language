import java.util.Random;
import java.util.Scanner;

public class JAVA_2022_01_25 {

	public static void main(String[] args) {
		
		
		// 1. API -> 자바에서 미리 만들어 놓고 제공하는 기능.
		// Scanner. print
		Scanner scan = new Scanner(System.in);
		
		// 난수 생성 API
		
		// Random rd = new Random(); // 랜덤 객체 생성
		
		// int no = rd.nextInt(45); // 0 ~ 45 사이의 랜덤한 수 생성
		
		// 2. continue, berak -> 반복문 제어
		
		// 무한 반복 구조
		
		int cnt = 0;
		while(true) {
			
			if(cnt == 10) {
				break;
			}
			cnt++;
		}
		
		
		
		// 범위 기반 구조
		for(int i = 1; i <= 10; i++) {

			if(i == 5) {
				
				//break; // 반복문 강제 종료. 남은 회차가 몇이든간에 바로 종료
				continue;
			}
			System.out.println(i);
			
		}
		
		// 이중 반복문 구조
		// break, contine 는 자신이 속한 반복문한테만 적용
		for(int dan = 2; dan <= 9; dan++) {
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, dan*i);
				break;
			}
		}
		
		
		
		
	}

}
