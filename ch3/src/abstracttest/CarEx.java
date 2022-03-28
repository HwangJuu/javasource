package abstracttest;

public class CarEx {
	public static void main(String[] args) {
//		Cannot instantiate the type Car =>추상 클래스는 객체 생성을 할 수 없음.
//		Car car = new Car();
		
		Car car = new SportsCar();
		car.startCar();
		car.drive();
		car.stop();
		car.turnoff();
		System.out.println();
		
		car = new Truck();
		car.startCar();
		car.drive();
		car.stop();
		car.turnoff();  

	}

}
