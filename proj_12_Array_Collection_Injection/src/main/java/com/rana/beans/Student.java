package com.rana.beans;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
public class Student {
	private int[] marks ;
	private Date[] impDate;
	List<String> names;
	
	
	public Student() {
		System.out.println("Student::0 param constructor");
	}

	public List<String> getList() {
		return names;
	}

	public void setList(List<String> names) {
		this.names = names;
	}

	public int[] getMarks() {
		return marks;
	}

	public Date[] getImpDate() {
		return impDate;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public void setImpDate(Date[] impDate) {
		this.impDate = impDate;
	}

	@Override
	public String toString() {
		return "Student [marks=" + Arrays.toString(marks) + ", impDate=" + Arrays.toString(impDate) + ", names=" + names 
				+ "]";
	}
}
