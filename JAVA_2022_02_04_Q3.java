

class JAVA_2022_02_04_Q3 {
  public static void main(String[] args) {
    pp_1 p1 = new pp_1();
    p1.name = "ȫ�浿";
    p1.age = 27;

    pp_1 p2 = new pp_1();
    p2.name = "ȫ���";
    p2.age = 25;

    p1.introduce(); // �ȳ��ϼ��� 27�� ȫ�浿�Դϴ�.
    p2.introduce(); // �ȳ��ϼ��� 25�� ȫ����Դϴ�.

    cc_1 c1 = new cc_1();
    c1.model = "�ҳ�Ÿ";
    c1.color = "�Ͼ��";
    c1.speed = 100;

    cc_1 c2 = new cc_1();
    c2.model = "���";
    c2.color = "������";
    c2.speed = 70;
    
    c1.drive(); // �Ͼ�� �ҳ�Ÿ��/�� 100km�� �޸��ϴ�.
    c2.drive(); // ������ �����/�� 70km�� �޸��ϴ�.
    
    Cat cat1 = new Cat();
    cat1.name = "�Ƹ�";
    cat1.age = 4;
    cat1.kind = "���þȺ��";
    Cat cat2 = new Cat();
    cat2.name = "����";
    cat2.age = 6;
    cat2.kind = "��";

    cat1.meow(); // 4�� ���þȺ�� ����� �Ƹ��� �߿��ϰ� ��ϴ�.
    cat2.meow(); // 6�� �� ����� ���� �߿��ϰ� ��ϴ�.

    Warrior w1 = new Warrior();
    w1.name = "�̼���";
    w1.attack = 20;
    w1.defense = 10;
    
    Warrior w2 = new Warrior();
    w2.name = "������";
    w2.attack = 15;
    w2.defense = 15;
   
    w1.status(); // �̸� : �̼���, ���ݷ� : 20, ���� : 10 
    w2.status(); // �̸� : ������, ���ݷ� : 15, ���� : 15 

    w1.attack(); // �̼����� 20�� �������� �����δ�.
    w2.attack(); // �������� 15�� �������� �����δ�. 

    w1.defense(); // �̼����� 10 �������� ����մϴ�.
    w2.defense(); // �������� 15 �������� ����մϴ�.

  }
}

class pp_1{
	String name;
	int age;
	public void introduce() {
		System.out.printf("�ȳ��ϼ��� %d�� %s�Դϴ�.\n", age, name);
	}
}

class cc_1{
	  String model;
	  String color;
	  int speed;
	  public void drive() {
		System.out.printf("%s %s��/�� %dkm�� �޸��ϴ�.\n", color, model, speed);

	}
}

class Cat{
	 String name;
	 int age;
	 String kind;
	 
	 public void meow() {
		System.out.printf("%d�� %s ����� %s�� �߿��ϰ� ��ϴ�.\n", age, kind, name);

	}

}

class Warrior{
	String name;
    int attack;
    int defense;
    public void status() {
		System.out.printf("�̸� : %s, ���ݷ� : %d, ���� : %d\n", name, attack, defense);

	}
    public void attack() {
		System.out.printf("%s %d�� �������� �����ϴ�.\n", name, attack);

	}
    public void defense() {
		System.out.printf("%s�� %d �������� ����մϴ�.\n", name, defense);

	}
}