package com.examples.JoinProject.Request;

public class DeptRequest {
     private int dept_id;
     private String emp_name;
     private String emp_city;
     private String b_name;
     private long acc_no;
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_city() {
		return emp_city;
	}
	public void setEmp_city(String emp_city) {
		this.emp_city = emp_city;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	public DeptRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DeptRequest(int dept_id, String emp_name, String emp_city, String b_name, long acc_no) {
		super();
		this.dept_id = dept_id;
		this.emp_name = emp_name;
		this.emp_city = emp_city;
		this.b_name = b_name;
		this.acc_no = acc_no;
	}
	@Override
	public String toString() {
		return "DeptRequest [dept_id=" + dept_id + ", emp_name=" + emp_name + ", emp_city=" + emp_city + ", b_name="
				+ b_name + ", acc_no=" + acc_no + "]";
	}
	
	
}
