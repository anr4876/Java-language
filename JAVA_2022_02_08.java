// 문제 : 사람 3명을 저장할 수 있는 배열을 만들고 사람으로 채워주세요. 3명의 사람에게 자기소개를 시켜보세요.
// 안녕하세요~

class  JAVA_2022_02_08{
	public static void main(String[] args) {
   
	Person	p1 = new Person();
	p1.name = "홍길동";
	p1.introduce();
	
	Person	p2 = new Person();
	p2.name = "이순신";
	p2.introduce();
	
	Person	p3 = new Person();
	p3.name = "임꺽정";
	p3.introduce();

	int[] arr = new int[3];
	String[] strs = new String[3];
	
	// 사람 3명 존재?? => x
	Person[] people = new Person[3];  // 사람 리모콘 3개 저장 가능한 3개짜리 배열
	
	people[0] = p1;
	people[1] = p2;
	people[2] = p3;
		
	for(int i = 0; i < 3; i++) {
		people[i].introduce();

	}

	
	
	//회원 모델링 : 이름, 나이, 주소
	
	//1. 전체 회원 나이와 이름 출력
	//2. 나이가 30세 미만인 사람의 이름 출력
	//3. 대전 사는 사람들의 이름과 나이 출력
	//4. 김씨 성을 가진 사람 이름 출력 (힌트 : startsWith)
	
	 Customer c1 = new Customer();
	 c1.name = "김짱구";
	 c1.age = 35;
	 c1.address = "대전";

	 Customer c2 = new Customer();
	 c2.name = "손흥민";
	 c2.age = 29;
	 c2.address = "런던";

	 Customer c3 = new Customer();
	 c3.name = "홍길동";
	 c3.age = 26;
	 c3.address = "서울";

	 Customer c4 = new Customer();
	 c4.name = "김서방";
	 c4.age = 44;
	 c4.address = "대전";
	 
	 Customer[] pt_name = new Customer[4];
	 
	 pt_name[0]= c1;
	 pt_name[1]= c2;		
	 pt_name[2]= c3;
	 pt_name[3]= c4;
	 
	 for(int i = 0; i < pt_name.length; i++) {
		 pt_name[i].introduce();
	 }
	 System.out.println("================================\\n나이가 30세 미만인 사람의 이름");
	 for(int i = 0; i < pt_name.length; i++) {
		if( pt_name[i].age < 30) {
			pt_name[i].name();
		}
	 }
	 System.out.println("================================\\n대전 사는 사람들의 이름과 나이");
	 for(int i = 0; i < pt_name.length; i++) {
			if( pt_name[i].address.equals("대전")) {
				pt_name[i].name();
				pt_name[i].age();
			}
		 }
	 System.out.println("================================\n김씨 성을 가진 사람 이름");
	 for(int i = 0; i < pt_name.length ; i++) {
			if( pt_name[i].name.startsWith("김")) {
				pt_name[i].name();
			
			}
		 }

  }
}

class Customer{
	String name;
	String address;
	int age;
	public void introduce() { // 전체 이름 나이 사는곳 출력
		System.out.printf("이름 : %s, 나이 : %d, 사는곳 : %s\n", name, age, address);
	}
	public void name() {
		System.out.printf("이름 : %s\n", name);
	}
	public void age() {
		System.out.printf("나이 : %d\n", age);
	}
}
class Person {
	  String name;
	  
	public void introduce() {
		System.out.printf("안녕하세요. 저는 %s입니다.\n",name);
	  }
}





