package day3_example;

class JAVA_2022_02_11_Q {
  public static void main(String[] args) {
    // 각 학생들에게 담임 선생님 정보를 저장하고 출력해주세요.

    학생 s1 = new 학생(1, "홍길동", 20, 45, "역사과목", "이순신");
    학생 s2 = new 학생(2, "홍길순", 21, 52, "체육과목", "임꺽정");

    // 출력 : 안녕하세요 저는 1번 20살 홍길동이고요, 저의 담임선생님은 45살 역사과목의 이순신 선생님이십니다.
//System.out.printf("안녕하세요 저는 %d번 %d살 %s이고요, 저의 담임선생님은 45살 역사과목의 이순신 선생님이십니다.",s1.getNumber(), s1.getAge(),s1.getName());
    // 출력 : 안녕하세요 저는 2번 21살 홍길순이고요, 저의 담임선생님은 52살 체육과목의 임꺽정 선생님이십니다.
    s1.자기소개();
    s2.자기소개();
    
    // 두 사람의 담임선생임이 바뀌었습니다. 아래와 같이 출력해주세요. 
    s1.set쌤나이(52);
    s1.set쌤과목(52);
    s1.set쌤이름(52);
    s1.set쌤나이(52);
    s1.set쌤과목(52);
    s1.set쌤이름(52);
    

    // 출력 : 안녕하세요 저는 1번 20살 홍길동이고요, 저의 담임선생님은 52살 체육과목의 임꺽정 선생님이십니다.
    
    // 출력 : 안녕하세요 저는 2번 21살 홍길순이고요, 저의 담임선생님은 45살 역사과목의 이순신 선생님이십니다.
  }
}

class 학생 {
	
	private int age;
	private String name;
	private int number;
	
	private int 쌤나이;
	private String 쌤과목;
	private String 쌤이름;
	
	
	학생(int number,String name,int age, int 쌤나이, String 쌤과목, String 쌤이름 ) {
		this.age = age;
		this.name= name;
		this.number = number;
		this.쌤나이 = 쌤나이;
		this.쌤과목= 쌤과목;
		this.쌤이름 = 쌤이름;
	
	}
	
	void 자기소개() {
		System.out.printf("안녕하세요 저는 %d번 %d살 %s이고요, 저의 담임선생님은 %d살 %s의 %s 선생님이십니다.\n",this.getNumber(), this.getAge(),this.getName()
				,this.쌤나이,this.쌤과목,this.쌤이름);
	}
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public int getNumber() {
		return number;
	}
	public int set쌤나이(int 쌤나이) {
		this.쌤나이 = 쌤나이;
	}
	public String set쌤이름() {
		this.쌤이름 = 쌤이름;
	}
	public int set쌤과목() {
		this.쌤과목 = 쌤과목;
	}
	
}