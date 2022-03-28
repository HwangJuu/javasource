package api;

public class Value {
	int value;
	
	public Value(int value) {
		super();
		this.value = value;
		
		
	}
		@Override
		public boolean equals(Object obj){
			//Object obj = value2;
			//obj instanceof Value : obj가 Value 객체로 변환 할 수 있는지 확인
			// 주소비교가 아닌 값 비교 재정의
			
			if(obj instanceof Value) {
				//원래 타입으로 강제 형변환
				Value v = (Value) obj;
				
				if(this.value == v.value) {
					return true;
				}
			}
			return false;
		}
		
		
		@Override
		public String toString() {
			return "Value [value=" + value + "]";
		}
		
	

}
