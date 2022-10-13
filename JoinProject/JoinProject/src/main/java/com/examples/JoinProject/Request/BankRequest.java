package com.examples.JoinProject.Request;

public class BankRequest {

	private int b_id;
	private String emp_name;
	private String dept_name;
	private long acc_no;
	
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	
	public BankRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankRequest(int b_id, String emp_name, String dept_name, long acc_no) {
		super();
		this.b_id = b_id;
		this.emp_name = emp_name;
		this.dept_name = dept_name;
		this.acc_no = acc_no;
	}
	@Override
	public String toString() {
		return "BankRequest [b_id=" + b_id + ", emp_name=" + emp_name + ", dept_name=" + dept_name + ", acc_no="
				+ acc_no + "]";
	}
	
}
