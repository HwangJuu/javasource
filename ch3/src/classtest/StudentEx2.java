 package classtest;

public class StudentEx2 {
	public static void main(String[] args) {
		// Student2 객체 실행
		// default 생성자를 호출하면서 객체 생성
		Student2 student = new Student2();
		System.out.println("학번 : " + student.studenId);
		System.out.println("이름 : " + student.studentName);
		
		System.out.println();
		
		//new Student2();//반복하면 Studen2에 있는 객체가 실행.
		
		
		//인자를 받는 생성자를 호출하면서 객체 생성
		Student2 student2 = new Student2(20110202,"홍길동");//순서 중요
		System.out.println("학번 : " + student2.studenId);
		System.out.println("이름 : " + student2.studentName);
		System.out.println("주소 : " + student2.address);
		System.out.println("핸드폰 : " + student2.mobile);
		
		//Student2 student3 = new Student2(0, null, null) //new Stu(ctrl+스페이스) 기본값 출력
		//객체를 생성하면서 생성자를 초기화
	    Student2 student3 = new Student2(20112012, "성춘향", "강남");
		

	}

}
