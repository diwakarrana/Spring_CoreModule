package com.rana.beans;

public class Student {
	private int sno;
	private String sname;
	private float avg;
	private int m1;
	public Student(int sno, float avg, String sname, int m1) {
		super();
		this.sno = sno;
		this.m1 = m1;
		this.sname = sname;
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", avg=" + avg + ", m1=" + m1 + "]";
	}
}
