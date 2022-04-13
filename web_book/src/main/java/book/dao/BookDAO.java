package book.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import book.dto.BookDTO;
import static book.dao.JdbcUtil.*;


public class BookDAO {	
	private Connection con;
	public BookDAO(Connection con) {
		super();
		this.con = con;
	}
	
	//CRUD
	public boolean insert(BookDTO dto) {
		boolean flag = false;
		PreparedStatement pstmt = null;
		String sql = "insert into bookTBL values(?,?,?,?)";		
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getCode());
			pstmt.setString(2, dto.getTitle());
			pstmt.setString(3, dto.getWriter());
			pstmt.setInt(4, dto.getPrice());
			
			int result = pstmt.executeUpdate();
			
			if(result>0) flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return flag;
	}
	
	//전체 조회
	public List<BookDTO> getList(){
		List<BookDTO> list = new ArrayList<BookDTO>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql="select * from booktbl";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BookDTO dto = new BookDTO();
				dto.setCode(rs.getInt("code"));
				dto.setTitle(rs.getString("title"));
				dto.setWriter(rs.getString("writer"));
				dto.setPrice(rs.getInt("price"));
				
				list.add(dto);				
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		return list;		
	}
	
	//Delete
	public boolean delete(int code) {
		boolean flag = false;
		PreparedStatement pstmt =null;
		String sql = "delete from bookTBL where code =? ";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, code);
			int result = pstmt.executeUpdate();
			
			if(result>0) flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}	
		
		return flag;
	}
	
	//update
	//code가 일치하면 가격 업데이트
	public boolean update(int code, int price) {
		boolean result = false;
		PreparedStatement pstmt = null;
		String sql = "update booktbl set price = ? where code =?";
		
		try {
			pstmt = con.prepareStatement(sql);
			//?순서로
			pstmt.setInt(1, price);
			pstmt.setInt(2, code);
			
			int cnt = pstmt.executeUpdate();
			
			if(cnt>0) result = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
		
	}
	//검색(select)
	//select * from bootbl where code=1001
	//select * from bootbl where writer=홍길동 : 정확히 이름을 알 때
	//select * from bootbl where writer like '%길동%' 일부분 일치하면 
	
	public List<BookDTO> searchList(String criteria, String keyword){
		List<BookDTO> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = " ";
		
		try {
			if(criteria.equals("code")) {
				sql="select * from booktbl  where code=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, Integer.parseInt(keyword));
			}else {
				sql="select * from booktbl  where writer like ?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, "%"+ keyword + "%"); //%길동%' 일부분 일치
			}
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BookDTO dto = new BookDTO();
				dto.setCode(rs.getInt("code"));
				dto.setTitle(rs.getString("title"));
				dto.setWriter(rs.getString("writer"));
				dto.setPrice(rs.getInt("price"));
				
				list.add(dto);				
			}						
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}		
		
		return list;
	}
	
	
	
	
	
	
	
	
	
	
}
