package day3_example;

class JAVA_2022_02_11_Q {
	public static void main(String[] args) {
		// �� �л��鿡�� ���� ������ ������ �����ϰ� ������ּ���.

		������ t1 = new ������(45, "�̼���", "����");
		������ t2 = new ������( 52, "�Ӳ���", "ü��");
		
	    �л� s1 = new �л�(1, "ȫ�浿", 20);
	    s1.set���Ӽ�����(t1);
	    
	    �л� s2 = new �л�(2, "ȫ���", 21);
	    s2.set���Ӽ�����(t2);

	    // ��� : �ȳ��ϼ��� ���� 1�� 20�� ȫ�浿�̰��, ���� ���Ӽ������� 45�� ��������� �̼��� �������̽ʴϴ�.
	    s1.�ڱ�Ұ�();
	    // ��� : �ȳ��ϼ��� ���� 2�� 21�� ȫ����̰��, ���� ���Ӽ������� 52�� ü�������� �Ӳ��� �������̽ʴϴ�.
	    s2.�ڱ�Ұ�();
	    
	    // �� ����� ���Ӽ������� �ٲ�����ϴ�. �Ʒ��� ���� ������ּ���. 
	    s1.set���Ӽ�����(t2);
	    s2.set���Ӽ�����(t1);
	    
	    
	    s1.�ڱ�Ұ�();
	    // ��� : �ȳ��ϼ��� ���� 1�� 20�� ȫ�浿�̰��, ���� ���Ӽ������� 52�� ü�������� �Ӳ��� �������̽ʴϴ�.
	    s2.�ڱ�Ұ�();
  
	    
	}
}	

class ������ {
	private int ����;
	private String ����;
	private String �̸�;
	
	������(int ����, String �̸�, String ����) {
		this.���� = ����;
		this.�̸� = �̸�;
		this.���� = ����;
	}
	
	public void set����(int ����) {
		this.���� = ����;
	}
	
	public void set�̸�(String �̸�) {
		this.�̸� = �̸�;
	}
	
	public void set����(String ����) {
		this.���� = ����;
	}
	
	public int get����() {
		return ����;
	}
	
	public String get�̸�() {
		return �̸�;
	}
	
	public String get����() {
		return ����;
	}
}

class �л� {
	private int ����;
	private String �̸�;
	private int ��ȣ;
	
	private ������ ���Ӽ�����;
	
	�л�(int ��ȣ, String �̸�, int ����) {
		this.���� = ����;
		this.�̸� = �̸�;
		this.��ȣ = ��ȣ;
		
	}
	
	void �ڱ�Ұ�() {
		System.out.printf("�ȳ��ϼ��� ���� %d�� %d�� %s�̰��, ���� ���Ӽ������� %d�� %s������ %s �������̽ʴϴ�.\n",this.��ȣ, this.����, this.�̸�, this.���Ӽ�����.get����(), this.���Ӽ�����.get����(), this.���Ӽ�����.get�̸�());
	}
		
	public int get����() {
		return ����;
	}
	
	public String get�̸�() {
		return �̸�;
	}
	
	public int get��ȣ() {
		return ��ȣ;
	}
	
	public void set���Ӽ�����(������ ���Ӽ�����) {
		this.���Ӽ����� = ���Ӽ�����;
	}
	
}