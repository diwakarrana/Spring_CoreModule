package com.rana.dao;

import com.rana.javabean.StudentBO;

//this interface for providing loose coupling so if required we can add 
// More DAO implemented in other technologies like Hibernet, Spring Data etc

public interface StudentDAO {
	int insert(StudentBO bo) throws Exception;
}
