package day3;

public class JAVA_2022_02_11 {

	public static void main(String[] args) {
		
		홍길동 a홍길동 = new 홍길동();
		홍길순 b홍길순 = new 홍길순();
		
		a홍길동.c프로그래밍();
		a홍길동.자바프로그래밍();
		
		
		b홍길순.파이썬프로그래밍();
		b홍길순.c프로그래밍();
	}

}


class 홍길동 {
	
	void c프로그래밍() {
		System.out.println("c 표준1 프로그래밍을 합니다.");
	}
	void 자바프로그래밍() {
		System.out.println("java 18버전으로 프로그래밍 합니다.");
	}
	
}

class 홍길순 {
	홍길동 a홍길동 = new 홍길동();
	
	void 파이썬프로그래밍() {
		System.out.println("파이썬 3.10 프로그래밍");
	}
	void c프로그래밍() {
		a홍길동.c프로그래밍();
	}
	
}
