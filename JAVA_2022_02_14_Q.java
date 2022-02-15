
//문제 : 아래와 같이 출력되도록 해주세요.
//조건 : 조건문을 사용하지 않고 처리해주세요.
//조건 : `a무기` 멤버 변수를 이용해서 풀어주세요.
//조건 : 칼, 창, 지팡이 클래스를 만들어주세요.



package day4;


public class JAVA_2022_02_14_Q {
	public static void main(String[] args) {
		전사 a전사 = new 전사();
 
	 a전사.공격(); 
	 // 칼로 공격합니다.
	 
	 a전사.창_모드로_변경();
	 a전사.공격();
	 // 창으로 공격합니다.
	 
	 a전사.지팡이_모드로_변경();
	 a전사.공격();
	 // 지팡이로 공격합니다.
	}
}

class 전사 extends 무기 {
	
	무기 a무기;
	
	void 공격() {
		System.out.printf("%s로 공격합니다.",wp );
	}
}

class 무기 {
	String wp = "칼";
	void 창_모드로_변경(){
		this.wp = "창";
	}
	void 지팡이_모드로_변경() {
		this.wp = "지팡이";
	}
}
