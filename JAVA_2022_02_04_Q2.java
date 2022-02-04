// 문제 : 자동차 객체를 담을 변수를 만들어주세요.
// 자동차 객체를 변수에 담고 그 변수를 이용해 최고속력이 서로 다르게 만들어주세요.
// 각 자동차가 자신의 최고속력으로 달리게 해주세요.


class JAVA_2022_02_04_Q2 {
  public static void main(String[] args) {
	  
	  Car_speed c1 = new Car_speed();
	  Car_speed c2 = new Car_speed();
	  c1.speed = 220;
	  c2.speed = 250;
    
	  c1.car_run();
	  c2.car_run();
	  
	  // 출력 : 자동차가 최대속력 220km로 달립니다.
    // 출력 : 자동차가 최대속력 250km로 달립니다.
  }
}


class Car_speed{
	int speed;
	
	public void car_run() {
		System.out.printf("자동차가 최대속력 %dkm로 달립니다.\n", speed);

	}
}