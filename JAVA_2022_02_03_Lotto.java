

import java.util.Scanner;
import java.util.Random;

// ����Ʈ => ��Ʈ�� + ����Ʈ(��) + O
// �ڵ� �ڵ� ���� => ��Ʈ�� + ����Ʈ(��) + F 

class JAVA_2022_02_03_Lotto{
	
	static int[] lottoNums = new int[7];
	static int[] myChooseNums = new int[6]; // ���� ������ ��ȣ
	
	// =============================================================================================
	public static void getLottoNums() {

		//int[] lottoNums = new int[7];
		Random random = new Random();

		int count = 0;
		while (true) {
			int no = random.nextInt(44) + 1; // 1 ~ 45
			if (isDuplicateNoInArr(lottoNums, no) == true) {
				continue;
			}

			lottoNums[count] = no;
			count++;

			// ���� ��ȣ�� �� ������ 7�� �Ǹ� ���� �ݺ� ����.
			if (count == 7) {
				break;
			}
		}
	}

	// =============================================================================================
	public static boolean isDuplicateNoInArr(int[] targetNums, int no) {
		// ���� ������� ������ ��ȣ�߿� ���� ���� ��ȣ�� �����Ѱ� �ִ°�?
		// ������?? continue;
		for (int j = 0; j < targetNums.length; j++) {
			int myNo = targetNums[j];
			if (no == myNo) {
				no = -1;
				break;
			}
		}

		// �ߺ��� ��ȣ�� ������
		if (no == -1) {
			System.out.println("��ȣ�� �ߺ��˴ϴ�. �ٽ� �Է����ּ���.");
			return true;
		}

		return false;
	}

	// ============================================================================================
	public static void getMyNums() {

		Scanner sc = new Scanner(System.in);
		//int[] myChooseNums = new int[6]; // ���� ������ ��ȣ
		int count2 = 0;

		while (true) {
			System.out.println((count2 + 1) + "��° ��ȣ�� �Է����ּ��� :");
			int no = Integer.parseInt(sc.nextLine()); // 1 ~ 45

			if (isDuplicateNoInArr(myChooseNums, no) == true) {
				continue;
			}

			// ���� ��ȣ ����.
			myChooseNums[count2] = no;
			count2++;

			// ���� ��ȣ�� �� ������ 6�� �Ǹ� ����.
			if (count2 == 6) {
				break;
			}
		}

//		return myChooseNums;
	}

	public static void printNums(int[] targetNums) {
		for (int i = 0; i < targetNums.length; i++) {
			System.out.print(targetNums[i] + " ");
		}
		System.out.println();
	}

	public static int getCountOfMatchNums() {

		int matchCount = 0;
		boolean isExistBonus = false;
		
		for (int i = 0; i < lottoNums.length; i++) {
			int no = lottoNums[i];

			for (int j = 0; j < myChooseNums.length; j++) {
				int myNo = myChooseNums[j];

				if (no == myNo) {
					matchCount++;
					break;
				} else if (myNo == lottoNums[lottoNums.length - 1]) {
					isExistBonus = true;
				}

			}
		}

		System.out.printf("���� ���� : %d\n", matchCount);
		return matchCount;

	}

	public static void printResult(int matchCount) {
		if (matchCount == 6) {
			System.out.println("1��");
		} else if (matchCount == 5) { // ���ʽ� ��ȣ ��ġ ���� O
			System.out.println("2��");
		} else if (matchCount == 4) {
			System.out.println("3��");
		} else if (matchCount == 3) {
			System.out.println("4��");
		} else {
			System.out.println("��");
		}
	}
	
	public static void main(String[] args) {

		// �Լ� -> 
		
		getLottoNums(); // ��÷ ��ȣ �ּ���
		getMyNums(); // ���� ������ ��ȣ �ּ���.

		System.out.print("����� ������ ��ȣ�� : ");
		printNums(myChooseNums); // ����ȣ ������ּ���.

		System.out.print("��÷��ȣ : "); 
		printNums(lottoNums);// ��÷��ȣ ������ּ���
		
		int matchCount = getCountOfMatchNums(); // � �¾Ҵ��� �˷��ּ���.
		
		printResult(matchCount); // ��� �����ּ���.
		
	}
}