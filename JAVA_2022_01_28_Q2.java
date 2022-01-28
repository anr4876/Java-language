public class JAVA_2022_01_28_Q2 {

	public static void showAllNumbersInArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}


	public static int getEvenCountInArr(int[] arr) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				count++;
			}
		}
		
		return count;
	}
	
	
	public static int[] getEvenNumbers(int[] arr) {
		
		int evenCount = getEvenCountInArr(arr);		
		int[] newArr = new int[evenCount];		
		int newArrIndex = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				newArr[newArrIndex] = arr[i];
				newArrIndex++;
			}
		}
		
		return newArr;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		int[] arr2 = { 1,2,5,6,78,6,3,345,6,876,12};
//		int[] arr3 = { 98,67,45,8,0,7,25,234,678};
//		showAllNumbersInArray(arr3);

//		int[] arr = { 2, 5, 7, 8, 12, 23, 26, 128, 177, 201 };
		int[] result = getEvenNumbers(arr);

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}

}