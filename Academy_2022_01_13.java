public class Academy {
	public static void main(String[] args) {
	
	// 형변환 규칙 -> 안전하면 자바가 해줌. 위험하면 안해줌.
	// 위험과 안전의 구분-> 데이터 손실이 생기면 위험
	// 정수 > 실수 변환 => 안전
	// 실수 > 정수 변환 => 안전x 안해줌
	
	// 같은 정수, 같은 실수 끼리는
	// 작은 것을 큰것으로 => 안전 낮은 바이트에서 높은 바이트의 변환 가능
	// 큰것을 작은 것으로 => 위험 높은 바이트에서 낮은 바이트의 변환 불가능
	
	// 변수는 먼저 만들어야 된다. 변수 선언
	// 크기와 모양 결정 => 자료형
	// 이름
	int num ;  // 변수명 앞에 숫자가 오면 실행불가.
	
	num = 1 ; // 대입(초기화)
	
	System.out.println(num);
	
	byte num_b = 1;
	short num_s = 2000;
	int num_i = 1;
	long num_lo  = 1;
	 
	// num_b = num_S // 자바가 실행 안해줌.
	num_s = num_b ; // num_b가 short로 형변환해줌.
	System.out.println(num_s);
	System.out.println(num_i);
	System.out.println(num_lo);
	
	
	// 변수 사용 주의 사항
	//	1. 오른쪽 왼쪽 구분
	//	2. 중복 선언 하지 마세요.
	//	3. 명명시 주의점
	//		- 숫자로 시작x
	//		- 언더바 제외한 특수 문자x
	//		- 공백 x
	//		- 소문자로 작성, 단 변수명이 길어질경우 단어와 단어 사이를 대문자로 구별
	
	int age = 22;
	String name = "홍길동" ;
	

	System.out.printf("안녕하세요. %d살 %d입니다.\n", age, name); // 포맷 출력
	
	System.out.println("안녕하세요."+ age + "살" + name + "입니다.");
	System.out.println("안녕하세요."+ age + "살" + name + "입니다.");
	System.out.println("안녕하세요."+ age + "살" + name + "입니다.");
	System.out.println("안녕하세요."+ age + "살" + name + "입니다.");
	
		
	
	
	
	
	
	
	
	
	}

}
