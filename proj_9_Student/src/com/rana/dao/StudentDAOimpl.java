package com.rana.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.sql.DataSource;

import com.rana.javabean.StudentBO;

public class StudentDAOimpl implements StudentDAO {
  public final String STUDENT_INSERT_QUERY = "INSERT INTO STUDENT VALUES(?,?,?,?,?)";
  
  private DataSource ds;
  
	public StudentDAOimpl(DataSource ds) {
	this.ds = ds;
}

	@Override
	public int insert(StudentBO bo) {
		//write jdbc code to insert records...
		try {
			//get jdbc connection....
			//..................................................que 1...why typecasting......
			Connection con = ds.getConnection();
			//create prepared statement object
			PreparedStatement ps = con.prepareStatement(STUDENT_INSERT_QUERY);
			//set query param values....
			ps.setInt(1, bo.getSno());
			ps.setString(2, bo.getSname());
			ps.setInt(3, bo.getTotal());
			ps.setFloat(4, bo.getAvg());
			ps.setString(5, bo.getResult());
			
			//execute the query
			int result = ps.executeUpdate();
			return result;
		}
		catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
}
