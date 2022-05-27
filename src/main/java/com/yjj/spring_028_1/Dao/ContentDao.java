package com.yjj.spring_028_1.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.yjj.spring_028_1.Dto.ContentDto;

public class ContentDao implements IDao {

	JdbcTemplate template;
	
	
	
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public ContentDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<ContentDto> listDao() {
		// TODO Auto-generated method stub
		
		String query = "SELECT * FROM board ORDER BY mnum desc";
		ArrayList<ContentDto> dtos = (ArrayList<ContentDto>) template.query(query, new BeanPropertyRowMapper<ContentDto>(ContentDto.class));
		
		
		return dtos;
	}

	@Override
	public void writeDao(final String mwriter, final String mcontent) {
		// TODO Auto-generated method stub
		
		this.template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				// TODO Auto-generated method stub
				
				String query = "INSERT INTO board(mnum, mwriter, mcontent) VALUES (board_seq.nextval, ?, ?)";
				PreparedStatement pstmt = con.prepareStatement(query);
				pstmt.setString(1, mwriter);
				pstmt.setString(2, mcontent);
				
				return pstmt;
			}
		});
		
		
		
		
	}

	@Override
	public void deleteDao(final String mnum) {
		// TODO Auto-generated method stub
		
		String query = "DELETE FROM board WHERE mnum=?";
		
		this.template.update(query, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				// TODO Auto-generated method stub
				
				pstmt.setInt(1, Integer.parseInt(mnum));
				
			}
		});
		
	}
	
	
	
	
	
	
	
}
