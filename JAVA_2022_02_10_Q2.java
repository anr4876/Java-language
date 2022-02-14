
⌄
⌄
⌄
⌄
⌄
⌄
⌄
⌄
⌄
⌄
package day2_example;

public class JAVA_2022_02_10_Q2 {

	public static void main(String[] args) {

    // 날개를 아이템처럼 사용하는 방법
		날개 a날개 = new 날개();		
		오리 a오리 = new 오리(4, a날개);
		a오리.날다();
		
		
		날개 b날개 = new 날개();
		청둥오리 b오리 = new 청둥오리(3, b날개);
		b오리.날다();
		
		
		고무날개 c날개 = new 고무날개();
		고무오리 c오리 = new 고무오리(2, c날개);
		c오리.날다();
	}

}

class 날개 {	
	
	public void 날개사용() {
		System.out.println("오리가 날개로 날아갑니다.");
	}
	
}

class 고무날개 {	
	
	public void 날개사용() {
		System.out.println("날 수 없어요..");
	}
	
}

class 오리 {
	
	int age;
	날개 a날개;
	
	public 오리(int age, 날개 a날개) {
		
		this.age = age;
		this.a날개 = a날개;
		
	}
	
	public void 날다() {
		a날개.날개사용();
	}
}

class 청둥오리 {
	int age;
	날개 a날개;
	
	public 청둥오리(int age, 날개 a날개) {
		
		this.age = age;
		this.a날개 = a날개;
		
	}
	
	public void 날다() {
		a날개.날개사용();
	}
}

class 고무오리 {
	int age;
	고무날개 a날개;
	
	public 고무오리(int age, 고무날개 a날개) {
		
		this.age = age;
		this.a날개 = a날개;
		
	}
	
	public void 날다() {
		a날개.날개사용();
	}
}