package com.rana.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.sql.DataSource;

import com.rana.javabean.StudentBO;

final public class StudentDAOimpl implements StudentDAO {
	//query string
  public final String STUDENT_INSERT_QUERY = "INSERT INTO STUDENT(SNO,NAME,TOTAL,AVG,RESULT,M1,M2,M3) VALUES(?,?,?,?,?,?,?,?)";
  
  private DataSource ds;
  
	public StudentDAOimpl(final DataSource ds) {
	this.ds = ds;
}

	@Override
	public final int insert(final StudentBO bo) throws Exception {
		//write jdbc code to insert records...
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
			ps.setInt(6, bo.getM1());
			ps.setInt(7, bo.getM2());
			ps.setInt(8, bo.getM3());
			
			//execute the query
			int result = ps.executeUpdate();
			return result;
	}
}
