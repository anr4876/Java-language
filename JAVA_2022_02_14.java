package day4;

public class JAVA_2022_02_14 {

	public static void main(String[] args) {

		������ aa = new ������();
		������ bb = new ������();
		������ cc = new ������();
		
		//���� dd = new ������();
		
		aa.�۸�();
		bb.�߿�();
		cc.�в�();
		
		// ������� ������
		aa.������();
		bb.������();
		cc.������();
		
		//bb.�۸�();
		
		//int[] arr= {1,2,3,4, "aa"};
		
		// ��ü���� -> �ڵ尡 �������鼭
		// ������ -> ��ü�� ����� �ٲ�.
		����[] ������ = {aa, bb, cc};
		
		for(int i = 0; i < ������.length; i++) {
			������[i].������();
		}		
		
		// ������ �ٶ󺸰� �����̰� �߿��Ѵ�. �´� ��.
		// ������ �ٶ󺸰� �������� �۸��Ѵ�. �´� ��.
		// ������ �ٶ󺸰� �����̰� ���� ����. �´� ��.
		// ������ �ٶ󺸰� �������� ���� ����. �´� ��.
		// �����̰� �ٶ󺸰� �����̰� �۸��Ѵ�. Ʋ�� ��.
		
		// �����̸� �ٶ󺸰� ������ ������. �´� ��.
		// ������ �ٶ󺸰� ������ ������. �´� ��.
		// ������ �ٶ󺸰� ������ �߿��Ѵ�. Ʋ�� ��.
		
		
	}

}

class ���� {
	void ������() {
		System.out.println("�����ϴ�.");
	}
}

class ������ extends ���� {
	void �۸�() {
		System.out.println("�۸�");
	}
	
	void ������() {
		System.out.println("����");
	}
}

class ������ extends ���� {
	void �߿�() {
		System.out.println("�߿�");
	}
	void ������() {
		System.out.println("���η�");
	}
}

class ������ extends ���� {
	void �в�() {
		System.out.println("�в�");
	}
	void ������() {
		System.out.println("Ǫ���");
	}
}
