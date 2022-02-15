package day4;

public class JAVA_2022_02_14 {

	public static void main(String[] args) {

		강아지 aa = new 강아지();
		고양이 bb = new 고양이();
		집오리 cc = new 집오리();
		
		//동물 dd = new 고양이();
		
		aa.멍멍();
		bb.야옹();
		cc.꽥꽥();
		
		// 동물들아 숨쉬어
		aa.숨쉬다();
		bb.숨쉬다();
		cc.숨쉬다();
		
		//bb.멍멍();
		
		//int[] arr= {1,2,3,4, "aa"};
		
		// 객체지향 -> 코드가 많아지면서
		// 다형성 -> 객체가 모습을 바꿈.
		동물[] 동물들 = {aa, bb, cc};
		
		for(int i = 0; i < 동물들.length; i++) {
			동물들[i].숨쉬다();
		}		
		
		// 고양이 바라보고 고양이가 야옹한다. 맞는 말.
		// 강아지 바라보고 강아지가 멍멍한다. 맞는 말.
		// 고양이 바라보고 고양이가 숨을 쉰다. 맞는 말.
		// 강아지 바라보고 강아지가 숨을 쉰다. 맞는 말.
		// 고양이가 바라보고 고양이가 멍멍한다. 틀린 말.
		
		// 고양이를 바라보고 동물이 숨쉰다. 맞는 말.
		// 동물을 바라보고 동물이 숨쉰다. 맞는 말.
		// 동물을 바라보고 동물이 야옹한다. 틀린 말.
		
		
	}

}

class 동물 {
	void 숨쉬다() {
		System.out.println("숨쉽니다.");
	}
}

class 강아지 extends 동물 {
	void 멍멍() {
		System.out.println("멍멍");
	}
	
	void 숨쉬다() {
		System.out.println("헥헥");
	}
}

class 고양이 extends 동물 {
	void 야옹() {
		System.out.println("야옹");
	}
	void 숨쉬다() {
		System.out.println("고로롱");
	}
}

class 집오리 extends 동물 {
	void 꽥꽥() {
		System.out.println("꽥꽥");
	}
	void 숨쉬다() {
		System.out.println("푸드득");
	}
}

