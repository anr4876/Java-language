// ���� : ��� 3���� ������ �� �ִ� �迭�� ����� ������� ä���ּ���. 3���� ������� �ڱ�Ұ��� ���Ѻ�����.
// �ȳ��ϼ���~

class  JAVA_2022_02_08{
	public static void main(String[] args) {
   
	Person	p1 = new Person();
	p1.name = "ȫ�浿";
	p1.introduce();
	
	Person	p2 = new Person();
	p2.name = "�̼���";
	p2.introduce();
	
	Person	p3 = new Person();
	p3.name = "�Ӳ���";
	p3.introduce();

	int[] arr = new int[3];
	String[] strs = new String[3];
	
	// ��� 3�� ����?? => x
	Person[] people = new Person[3];  // ��� ������ 3�� ���� ������ 3��¥�� �迭
	
	people[0] = p1;
	people[1] = p2;
	people[2] = p3;
		
	for(int i = 0; i < 3; i++) {
		people[i].introduce();

	}

	
	
	//ȸ�� �𵨸� : �̸�, ����, �ּ�
	
	//1. ��ü ȸ�� ���̿� �̸� ���
	//2. ���̰� 30�� �̸��� ����� �̸� ���
	//3. ���� ��� ������� �̸��� ���� ���
	//4. �达 ���� ���� ��� �̸� ��� (��Ʈ : startsWith)
	
	 Customer c1 = new Customer();
	 c1.name = "��¯��";
	 c1.age = 35;
	 c1.address = "����";

	 Customer c2 = new Customer();
	 c2.name = "�����";
	 c2.age = 29;
	 c2.address = "����";

	 Customer c3 = new Customer();
	 c3.name = "ȫ�浿";
	 c3.age = 26;
	 c3.address = "����";

	 Customer c4 = new Customer();
	 c4.name = "�輭��";
	 c4.age = 44;
	 c4.address = "����";
	 
	 Customer[] pt_name = new Customer[4];
	 
	 pt_name[0]= c1;
	 pt_name[1]= c2;		
	 pt_name[2]= c3;
	 pt_name[3]= c4;
	 
	 for(int i = 0; i < pt_name.length; i++) {
		 pt_name[i].introduce();
	 }
	 System.out.println("================================\\n���̰� 30�� �̸��� ����� �̸�");
	 for(int i = 0; i < pt_name.length; i++) {
		if( pt_name[i].age < 30) {
			pt_name[i].name();
		}
	 }
	 System.out.println("================================\\n���� ��� ������� �̸��� ����");
	 for(int i = 0; i < pt_name.length; i++) {
			if( pt_name[i].address.equals("����")) {
				pt_name[i].name();
				pt_name[i].age();
			}
		 }
	 System.out.println("================================\n�达 ���� ���� ��� �̸�");
	 for(int i = 0; i < pt_name.length ; i++) {
			if( pt_name[i].name.startsWith("��")) {
				pt_name[i].name();
			
			}
		 }

  }
}

class Customer{
	String name;
	String address;
	int age;
	public void introduce() { // ��ü �̸� ���� ��°� ���
		System.out.printf("�̸� : %s, ���� : %d, ��°� : %s\n", name, age, address);
	}
	public void name() {
		System.out.printf("�̸� : %s\n", name);
	}
	public void age() {
		System.out.printf("���� : %d\n", age);
	}
}
class Person {
	  String name;
	  
	public void introduce() {
		System.out.printf("�ȳ��ϼ���. ���� %s�Դϴ�.\n",name);
	  }
}





