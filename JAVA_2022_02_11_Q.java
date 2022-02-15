package day3_example;

class JAVA_2022_02_11_Q {
	public static void main(String[] args) {
		// 각 학생들에게 담임 선생님 정보를 저장하고 출력해주세요.

		선생님 t1 = new 선생님(45, "이순신", "역사");
		선생님 t2 = new 선생님( 52, "임꺽정", "체육");
		
	    학생 s1 = new 학생(1, "홍길동", 20);
	    s1.set담임선생님(t1);
	    
	    학생 s2 = new 학생(2, "홍길순", 21);
	    s2.set담임선생님(t2);

	    // 출력 : 안녕하세요 저는 1번 20살 홍길동이고요, 저의 담임선생님은 45살 역사과목의 이순신 선생님이십니다.
	    s1.자기소개();
	    // 출력 : 안녕하세요 저는 2번 21살 홍길순이고요, 저의 담임선생님은 52살 체육과목의 임꺽정 선생님이십니다.
	    s2.자기소개();
	    
	    // 두 사람의 담임선생임이 바뀌었습니다. 아래와 같이 출력해주세요. 
	    s1.set담임선생님(t2);
	    s2.set담임선생님(t1);
	    
	    
	    s1.자기소개();
	    // 출력 : 안녕하세요 저는 1번 20살 홍길동이고요, 저의 담임선생님은 52살 체육과목의 임꺽정 선생님이십니다.
	    s2.자기소개();
  
	    
	}
}	

class 선생님 {
	private int 나이;
	private String 과목;
	private String 이름;
	
	선생님(int 나이, String 이름, String 과목) {
		this.나이 = 나이;
		this.이름 = 이름;
		this.과목 = 과목;
	}
	
	public void set나이(int 나이) {
		this.나이 = 나이;
	}
	
	public void set이름(String 이름) {
		this.이름 = 이름;
	}
	
	public void set과목(String 과목) {
		this.과목 = 과목;
	}
	
	public int get나이() {
		return 나이;
	}
	
	public String get이름() {
		return 이름;
	}
	
	public String get과목() {
		return 과목;
	}
}

class 학생 {
	private int 나이;
	private String 이름;
	private int 번호;
	
	private 선생님 담임선생님;
	
	학생(int 번호, String 이름, int 나이) {
		this.나이 = 나이;
		this.이름 = 이름;
		this.번호 = 번호;
		
	}
	
	void 자기소개() {
		System.out.printf("안녕하세요 저는 %d번 %d살 %s이고요, 저의 담임선생님은 %d살 %s과목의 %s 선생님이십니다.\n",this.번호, this.나이, this.이름, this.담임선생님.get나이(), this.담임선생님.get과목(), this.담임선생님.get이름());
	}
		
	public int get나이() {
		return 나이;
	}
	
	public String get이름() {
		return 이름;
	}
	
	public int get번호() {
		return 번호;
	}
	
	public void set담임선생님(선생님 담임선생님) {
		this.담임선생님 = 담임선생님;
	}
	
}