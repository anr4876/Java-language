package day3_example;

class JAVA_2022_02_11_Q {
  public static void main(String[] args) {
    // �� �л��鿡�� ���� ������ ������ �����ϰ� ������ּ���.

    �л� s1 = new �л�(1, "ȫ�浿", 20, 45, "�������", "�̼���");
    �л� s2 = new �л�(2, "ȫ���", 21, 52, "ü������", "�Ӳ���");

    // ��� : �ȳ��ϼ��� ���� 1�� 20�� ȫ�浿�̰��, ���� ���Ӽ������� 45�� ��������� �̼��� �������̽ʴϴ�.
//System.out.printf("�ȳ��ϼ��� ���� %d�� %d�� %s�̰��, ���� ���Ӽ������� 45�� ��������� �̼��� �������̽ʴϴ�.",s1.getNumber(), s1.getAge(),s1.getName());
    // ��� : �ȳ��ϼ��� ���� 2�� 21�� ȫ����̰��, ���� ���Ӽ������� 52�� ü�������� �Ӳ��� �������̽ʴϴ�.
    s1.�ڱ�Ұ�();
    s2.�ڱ�Ұ�();
    
    // �� ����� ���Ӽ������� �ٲ�����ϴ�. �Ʒ��� ���� ������ּ���. 
    s1.set�ܳ���(52);
    s1.set�ܰ���(52);
    s1.set���̸�(52);
    s1.set�ܳ���(52);
    s1.set�ܰ���(52);
    s1.set���̸�(52);
    

    // ��� : �ȳ��ϼ��� ���� 1�� 20�� ȫ�浿�̰��, ���� ���Ӽ������� 52�� ü�������� �Ӳ��� �������̽ʴϴ�.
    
    // ��� : �ȳ��ϼ��� ���� 2�� 21�� ȫ����̰��, ���� ���Ӽ������� 45�� ��������� �̼��� �������̽ʴϴ�.
  }
}

class �л� {
	
	private int age;
	private String name;
	private int number;
	
	private int �ܳ���;
	private String �ܰ���;
	private String ���̸�;
	
	
	�л�(int number,String name,int age, int �ܳ���, String �ܰ���, String ���̸� ) {
		this.age = age;
		this.name= name;
		this.number = number;
		this.�ܳ��� = �ܳ���;
		this.�ܰ���= �ܰ���;
		this.���̸� = ���̸�;
	
	}
	
	void �ڱ�Ұ�() {
		System.out.printf("�ȳ��ϼ��� ���� %d�� %d�� %s�̰��, ���� ���Ӽ������� %d�� %s�� %s �������̽ʴϴ�.\n",this.getNumber(), this.getAge(),this.getName()
				,this.�ܳ���,this.�ܰ���,this.���̸�);
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
	public int set�ܳ���(int �ܳ���) {
		this.�ܳ��� = �ܳ���;
	}
	public String set���̸�() {
		this.���̸� = ���̸�;
	}
	public int set�ܰ���() {
		this.�ܰ��� = �ܰ���;
	}
	
}