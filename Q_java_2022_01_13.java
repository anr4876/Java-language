import java.util.Random;

public class Q_java_2022_01_13 {

	public static void main(String[] args) {
		
		// 정수 : int, 실수(소수) : double, 문장 : String

		int num_i;
		byte num_b;
		String char_s;
		double num_d;
		num_i = 100;		
		System.out.println(num_i); // 출력 : 100
		num_d = 3.14;
	    System.out.println(num_d); // 출력 : 3.14
	    char_s = "안녕하세요";
	    System.out.println(char_s); // 출력 : 안녕하세요
	    num_i = 200;
	    System.out.println(num_i); // 출력 : 200
	    num_d = 10.5;
	    System.out.println(num_d); // 출력 : 10.5
	    char_s = "반갑습니다.";
	    System.out.println(char_s); // 출력 : 반갑습니다.

	    
//	    int a = 5;
//	    int b = 10;
//
//	    System.out.println("a : " + a);
//	    System.out.println("b : " + b);
//	   
//	    // 여기서 부터 
//	    a = 10;
//	    b = 5;
//	    // 여기까지 수정 가능
//	    
//	    System.out.println("a : " + a);
//	    // 출력 : a : 10
//	    System.out.println("b : " + b);
//	    // 출력 :  b : 5
	    
	    
	    
	    Random ran = new Random();

	    // `int a` => a라는 이름의 변수(즉 공간)을 만든다.
	    // `int` => a라는 공간에는 정수만 담을 수 있다.
	    // `;` => 문장이 끝남을 알린다.
	    int a;
	    a = ran.nextInt(100);
	    int b = ran.nextInt(100);
	    
	    // `+` => 문장과 문자을 합친다.
	    System.out.println("a : " + a);
	    System.out.println("b : " + b);
	    
	    // 여기서 부터 
	    int c;
	    c = a;
	    a = b;
	    b = c;
	    


	    // 여기까지 수정 가능
	    
	    System.out.println("a : " + a);
	    // 출력 : a : b의 값
	    System.out.println("b : " + b);
	    // 출력 :  b : a의 값
	    
	}

}
