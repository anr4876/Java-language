import java.util.Scanner;

public class JAVA_2022_01_24 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열 선언
		
		int[] list_number = {1,2,3,4,5};
		
		int num_a;
		num_a = 10;
		list_number[2] = num_a; // 배열의 원소를 인덱스(순번)로 콕 집어서 선택해주시면 그건 하나의 변수 역할을 한다.
		System.out.println(num_a);
		System.out.println(list_number[2]);
		num_a++;
		list_number[2]++;
		
		// 배열은 길이가 있다.
		// 배열의 범위를 넘으면 에러가 난다.
		System.out.println(list_number[4]);
		
		// 데이터를 많이 넣어야 하는 경우
		// 길이를 알려주고 컴퓨터한테 배열을 만들라고 할 수 있다.
		int[] arr5 = new int[100]; // 0으 값을 세팅
		int[] arr6 = new int[5];
		
		// 사용자 입력이나 파일 읽어옴.
		// 배열은 무조건 같은 자료형만 취급
		
		// int[] arr7 = {1,2,3,1.5,"abc"}; 코드 오류 예시
		
		
		// 배열=> 자료형, 길이
		String[] arr8 = {"abc", "bbc", "ccc"};
		String[] arr9 = new String[6];
				
		double[] arr10 = {1.1, 2.2, 3.3};
		double[] arr11 = new double[10];
		
		
		// 배열의 길이를 모를때
		
		// 배열의 길이는 배열이 제공.
		System.out.println(arr8.length);
		
		// 배열을 전체 탐색
		for(int i = 0; i < arr8.length; i++) {
			System.out.println(arr8[i]);
		}
		
		// 자바 API -> 불러와야함. import
		// 컨트롤 + 쉬프트(좌) + o
		Scanner scan = new Scanner(System.in);
		
		String[] strArr = new String[5]; // null로 세팅
		
		for(int i = 0; i < strArr.length; i++) {
			strArr[i] = scan.nextLine();
		}
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}			
			
			
// =========================================================================================================================
// 문제 - 배열 사용
// =========================================================================================================================			
		// arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.
		int[] arr = new int[10];	  	
		int num = 1;
		int number;
		for(int j = 0; j < 10; j++) {
			number = num * 10;
			arr[j] = number ; 
			num++;		
			
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}	
			
			
		// 배열을 두번 출력해주세요.		
		for(int j = 0; j < 2; j++) {
			for(int i = 0; i < arr.length; i++) {
				System.out.printf("%d", arr[i]);
			}
			System.out.println("");
		}		
			
			
		// 배열을 이용해 5개의 숫자를 입력받고 출력해주세요	
		int[] arr2 = new int[5];
		
		for(int j = 0; j < arr2.length; j++) {
			arr2[j] = Integer.parseInt(scan.nextLine());
		}
		for(int j = 0; j < arr2.length; j++) {
			System.out.printf("%d", arr2[j]);
		}
		System.out.println("");
			
		// 배열에 5개의 값을 입력하고 거꾸로 출력해주세요.
		
		for(int i = 4; i >= 0; i--) {
			System.out.printf("%d", arr2[i]);
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
		
}


