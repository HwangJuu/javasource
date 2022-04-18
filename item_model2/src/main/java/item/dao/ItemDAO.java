package item.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import static item.dao.JdbcUtil.*;


import item.dto.ItemDTO;

public class ItemDAO {
	private Connection con;

	public ItemDAO(Connection con) {
		super();
		this.con = con;
	}
	
	//CRUD
	//제품 목록
	public List<ItemDTO> getList(){
		List<ItemDTO> list = new ArrayList<ItemDTO>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select num,category,name, psize,price,register_at from item";
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ItemDTO itemDto = new ItemDTO();
				itemDto.setNum(rs.getInt("num"));
				itemDto.setCategory(rs.getString("category"));
				itemDto.setName(rs.getString("name"));
				itemDto.setPsize(rs.getString("psize"));
				itemDto.setPrice(rs.getInt("price"));
				itemDto.setRegister_at(rs.getDate("register_at"));				
				
				list.add(itemDto);				
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		return list;		
		
	}
	//제품 추가
	public boolean insert(ItemDTO insertDto) {
		boolean flag = false;
		
		PreparedStatement pstmt = null;
		String sql = "insert into item(num, category, name, content, psize, price)"
				+ "values(item_seq.nextval,?,?,?,?,?)";
		
		try {
			pstmt = con.prepareStatement(sql);			
			pstmt.setString(1, insertDto.getCategory());
			pstmt.setString(2, insertDto.getName());
			pstmt.setString(3, insertDto.getContent());
			pstmt.setString(4, insertDto.getPsize());
			pstmt.setInt(5, insertDto.getPrice());
			
			int result = pstmt.executeUpdate();
			
			if(result>0) flag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}	
				
		return flag;
		
	}
	
	//제품 삭제
	//sql을 먼저 결정하고 어떤 걸 받아와야하는지 결정
	public boolean delete(int num) {
		boolean flag = false;		
		PreparedStatement pstmt =null;
		String sql = "delete from item where num=?";
		
		try {		
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);			
			
			int result = pstmt.executeUpdate();
			
			if(result>0) flag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}	
		
		return flag;
	}
	
	//제품 수정
	public boolean change(int num, String psize, int price){
		boolean flag = false;
		PreparedStatement pstmt = null;
		
		String sql = "update item set psize = ?,price = ? where num= ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, psize);
			pstmt.setInt(2, price);
			pstmt.setInt(3, num);			
			
			int result = pstmt.executeUpdate();
			
			if(result>0) flag=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return flag;
	}
	
	
	//제품 검색
	public List<ItemDTO> searchList(String category, String name){
		List<ItemDTO> list = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select num, category, name, psize, price,register_at from item where category=? and name=? ";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, category);
			pstmt.setString(2, name);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ItemDTO itemDto = new ItemDTO();
				itemDto.setNum(rs.getInt("num"));
				itemDto.setCategory(rs.getString("category"));
				itemDto.setName(rs.getString("name"));
				itemDto.setPsize(rs.getString("psize"));
				itemDto.setPrice(rs.getInt("price"));
				itemDto.setRegister_at(rs.getDate("register_at"));
				
				
				list.add(itemDto);				
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
