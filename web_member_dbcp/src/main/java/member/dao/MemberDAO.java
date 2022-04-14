package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import lombok.AllArgsConstructor;
import member.dto.MemberDTO;

import static member.dao.JdbcUtil.*;


@AllArgsConstructor
public class MemberDAO {
	private Connection con;
	
	//C(회원가입)R(로그인)U(비밀번호변경)D(회원탈퇴)
	
	//로그인 - 사용자가 입력한 아이디, 비밀번호가 존재하는지 확인 여부
	//sql 구문 : select userid,name from membertbl where userid='hong123' and password='hong123@'
	//userid='hong123' and password='hong123@' 사용자 입력값이 중요. 하나라도 안맞으면 사용자가 아님=> 실패. 일치하면 로그인 성공
	public MemberDTO isLogin(String userid, String password) {
		MemberDTO loginDto = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select userid,name from membertbl where userid=? and password=? ";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, password);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				loginDto = new MemberDTO();
				loginDto.setUserid(rs.getString(1)); //rs.getString("userid") 컬럼 명 
				loginDto.setName(rs.getString(2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}		
		return loginDto;			
	}
	
	//비밀번호 변경
	//update membertbl set password = '변경비밀번호' where userid = 'hong123';
	//update membertbl set password = '변경비밀번호' where userid = 'hong123'and password = '현재비밀번호';
	public boolean changePassword(String userid, String confirmPassword){
		boolean flag = false;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "update membertbl set password =? where userid =?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, confirmPassword);
			pstmt.setString(2, userid);
			
			int result = pstmt.executeUpdate();
			
			if(result>0) flag=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return flag;
	}
	
	//회원탈퇴
	//sql구문 : delete from membertbl where userid = "hong123' and password='hong123@';
	public boolean leave(String userid, String password ) {
		boolean flag = false;
		PreparedStatement pstmt =null;
		String sql = "delete from membertbl where userid =? and password=? ";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, password);
			
			int result = pstmt.executeUpdate();
			
			if(result>0) flag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}	
		
		return flag;
	}
	
	//회원가입
	//insert into membertbl values(
	public boolean register(MemberDTO registerDto) {
		boolean flag = false;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "insert into membertbl values(?,?,?,?,?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, registerDto.getUserid());
			pstmt.setString(2, registerDto.getPassword());
			pstmt.setString(3, registerDto.getName());
			pstmt.setString(4, registerDto.getGender());
			pstmt.setString(5, registerDto.getEmail());
			
			int result = pstmt.executeUpdate();		
			
			
			if(result>0) flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}		
		return flag;			
	}
	
	//중복 아이디 검사
	//select userid from membertbl where userid='hong124';
	public boolean checkId(String userid) {
		boolean flag = true;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "select userid from membertbl where userid=?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				flag = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		
		return flag;
	}
	
	
	

}
