package day4;

public class JAVA_2022_02_14_Q2 {
	전사2 a전사 = new 전사2(); 

    a전사.나이 = 20;
    a전사.이름 = "홍길동";

    a전사.a무기 = new 활();
    a전사.공격();    
    // 홍길동이 활로 공격합니다.
    
    a전사.a무기 = new 칼();
    a전사.공격();
    // 홍길동이 칼로 공격합니다.

  
}

class 전사2  {
  int 나이;
  String 이름;
  
  void 공격() {
	  
  }
}

class 활 extends 전사 {
	void 활() {
		
	}
}

class 칼 extends 전사 {
	void 칼() {
		
	}
}
