package com.rana.service;

import com.rana.dao.StudentDAO;
import com.rana.javabean.StudentBO;
import com.rana.javabean.StudentDTO;

final public class StudentServiceimpl implements StudentService {
	
	private StudentDAO dao;
	
	public StudentServiceimpl(StudentDAO dao) {
		this.dao = dao;
	}

	@Override
	final public String generateResult(StudentDTO dto) throws Exception {
		// write business logic.....
		int total = dto.getM1()+dto.getM2()+dto.getM3();
		float avg = total/3.0f;
		String result = null;
		if(avg > 35)
			result = "pass";
		else
			result = "fail";
		
		//create bo class object.....................
		StudentBO bo = new StudentBO();
		bo.setAvg(avg);
		bo.setResult(result);
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setTotal(total);
		
		//use DAO
		int cnt = dao.insert(bo);
		if(cnt == 0)
			return "Result:"+ result +" "+ bo.getSno()+ " registration failed";
		else
			return "Result:"+ result +" "+ bo.getSno()+ " registration succedded";
	}
}
