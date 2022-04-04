package api;

public class SystemEx1 {
	public static void main(String[] args) {
		
		
//		for(int i=0;i<10;i++) {
//			System.out.println(i+"\t");
//			
//			if(i==5) 
//				System.exit(0);// 프로그램 종료			
//		    }
		
		
		long sum = 0;
		
//		System.nanoTime() 시간 잴때 
		
		long start = System.currentTimeMillis();
		for(int i=1;i<1000000;i++) {
			sum+=i;
		}
		long end = System.currentTimeMillis();
		System.out.println("1~10,000,000 합 : "+sum);
		System.out.println("1~10,000,000 합 구하는데 걸리는 시간 : "+(end-start) + "ms");

	}

}
