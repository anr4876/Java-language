// ���� : �ڵ��� ��ü�� ���� ������ ������ּ���.
// �ڵ��� ��ü�� ������ ��� �� ������ �̿��� �ְ�ӷ��� ���� �ٸ��� ������ּ���.
// �� �ڵ����� �ڽ��� �ְ�ӷ����� �޸��� ���ּ���.


class JAVA_2022_02_04_Q2 {
  public static void main(String[] args) {
	  
	  Car_speed c1 = new Car_speed();
	  Car_speed c2 = new Car_speed();
	  c1.speed = 220;
	  c2.speed = 250;
    
	  c1.car_run();
	  c2.car_run();
	  
	  // ��� : �ڵ����� �ִ�ӷ� 220km�� �޸��ϴ�.
    // ��� : �ڵ����� �ִ�ӷ� 250km�� �޸��ϴ�.
  }
}


class Car_speed{
	int speed;
	
	public void car_run() {
		System.out.printf("�ڵ����� �ִ�ӷ� %dkm�� �޸��ϴ�.\n", speed);

	}
}