package emp.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//접근하고자 하는 테이블의 필드와 동일하게 생성
//exam_emp

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString

@NoArgsConstructor //de
@AllArgsConstructor //default 생성자가 사라짐
@Data
public class EmpDTO {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private int sal;
	private int comm;
	private int deptno;
	
	

}
