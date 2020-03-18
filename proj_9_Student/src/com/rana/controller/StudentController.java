package com.rana.controller;

import com.rana.javabean.StudentDTO;
import com.rana.javabean.StudentVO;
import com.rana.service.StudentService;

public class StudentController {
	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}
public String process(String sno, String sname, String m1, String m2, String m3 ) {
	//prepare VO object..........
	StudentVO vo = new StudentVO();
	vo.setM1(m1);
	vo.setM2(m2);
	vo.setM3(m3);
	vo.setSname(sname);
	vo.setSno(sno);
	
	// convert this VO object to DTO object
	StudentDTO dto = new StudentDTO();
	dto.setSname(vo.getSname());
	dto.setSno(Integer.parseInt(vo.getSno()));
	dto.setM1(Integer.parseInt(vo.getM1()));
	dto.setM2(Integer.parseInt(vo.getM2()));
	dto.setM3(Integer.parseInt(vo.getM3()));
	
	//use service class......
	String result = service.generateResult(dto);
	return result;
}
}
