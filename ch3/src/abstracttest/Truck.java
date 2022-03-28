package abstracttest;

public class Truck extends Car {

	@Override
	public void drive() {
		System.out.println("트럭을 운전합니다.");

	}

	@Override
	public void stop() {
		
		//아무것도 안해도 되지만 {}부분은 꼭 있어야함.상속받는 클래스에선 필수 조건
		System.out.println("트럭을 멈춥니다.");
	}

}
