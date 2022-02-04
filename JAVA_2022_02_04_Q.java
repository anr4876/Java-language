// 문제 : 자동차가 3번 달리게 해주세요.
// 출력 : 자동차가 달립니다.

class JAVA_2022_02_04_Q {
  public static void main(String[] args) {
	  Car run1 = new Car();
	  Car run2 = new Car();  
	 
	  
	//v1. 1개의 자동차가 3번 달리게 해주세요.
	run1.num = 1;
	run1.run_number = 3;
	run1.car_run();
    
	//v2. 3개의 자동차가 1번씩 달리게 해주세요.
	run2.num = 3;
	run2.run_number = 1;
	run2.car_run();
    
    //자동차가 달립니다.
    //자동차가 달립니다.
    //자동차가 달립니다.
    //자동차가 달립니다.
    //자동차가 달립니다.
    //자동차가 달립니다.
  }
}

class Car{
	int num;
	int run_number;
	public void car_run() {
	
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < run_number; j++) {
				System.out.println("자동차가 달립니다.");
				
			}
		}

	}
}