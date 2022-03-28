package exam;

public class Won2Dollar extends Converter {

	
	protected double convert(double src) {
		
		return 20.0;
	}

	@Override
	protected String getSrcString() {
		
		return "원";
	}

	@Override
	protected String getDestString() {
		
		return "달러";
	}

}
