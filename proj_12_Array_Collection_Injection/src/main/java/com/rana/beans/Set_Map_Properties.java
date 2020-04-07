package com.rana.beans;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Set_Map_Properties {
	
	private Set<Integer> phoneNumbers;
	private Map<String, String> facultyVScourse;
	private Properties emp_desg;
	
	public Set_Map_Properties() {
		System.out.println("Set_Map_Properties::0 param constructor");
	}

	public Set<Integer> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(Set<Integer> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public Map<String, String> getFacultyVScourse() {
		return facultyVScourse;
	}

	public void setFacultyVScourse(Map<String, String> facultyVScourse) {
		this.facultyVScourse = facultyVScourse;
	}

	public Properties getEmp_desg() {
		return emp_desg;
	}

	public void setEmp_desg(Properties emp_desg) {
		this.emp_desg = emp_desg;
	}

	@Override
	public String toString() {
		return "Set_Map_Properties [phoneNumbers=" + phoneNumbers + ", facultyVScourse=" + facultyVScourse
				+ ", emp_desg=" + emp_desg + "]";
	}
	
	
}
