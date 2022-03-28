package poly;

public class Tv extends Product {

	public Tv() {
		super(100);
		//디폴트 생성자인데 디폴트 생성자안에서 부모의 인자를 받는 생성자를 호출
	}
	@Override
	public String toString() {
		return "Tv";
	}
	

}
