package java_x;

public class java_x {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 9;
		int num = 2;
		int count = x/2;
		
		for ( int i = 1; i <= x; i++) {
			if (i <=(int)x/2) {
				for(int k = 1; k <= x/2 - i; k++) {
					num *= num;
				}
				
			}
			
			else if (i > x/2 + 1 ) {
				
				for(int k = 0; k < x/2 - count ; k++) {
					num *= num;
				}
				count--;
			}
			else {
				num = 1;
			}
			for ( int j = 1; j <= x; j++) {
				if (i == j || (i + j) == (x + 1)) {
					System.out.printf("%d",num);
				}
				else {
					
					System.out.printf("  ");
				}
					
			}
			num = 2;
			System.out.println();
		}
	}

}
