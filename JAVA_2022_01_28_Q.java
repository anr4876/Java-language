
public class JAVA_2022_01_28_Q {

	
	public static void showAllNumbersInArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		//int[] arr2 = { 11,22,33,44,55,66,77,88,99,100 };

		
		showAllNumbersInArray(arr);
		// 1 2 3 4 5 6 7 8 9 10
	}

}
