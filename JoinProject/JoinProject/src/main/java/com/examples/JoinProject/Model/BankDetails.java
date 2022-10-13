package com.examples.JoinProject.Model;

public class BankDetails {
	
	private int b_id;
	
	private String b_name;
	
	private String b_branch;
	
	private long acc_no;
	
	private int emp_id;

	public int getB_id() {
		return b_id;
	}

	public void setB_id(int b_id) {
		this.b_id = b_id;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public String getB_branch() {
		return b_branch;
	}

	public void setB_branch(String b_branch) {
		this.b_branch = b_branch;
	}

	public long getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public BankDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankDetails(int b_id, String b_name, String b_branch, long acc_no, int emp_id) {
		super();
		this.b_id = b_id;
		this.b_name = b_name;
		this.b_branch = b_branch;
		this.acc_no = acc_no;
		this.emp_id = emp_id;
	}

	@Override
	public String toString() {
		return "BankDetails [b_id=" + b_id + ", b_name=" + b_name + ", b_branch=" + b_branch + ", acc_no=" + acc_no
				+ ", emp_id=" + emp_id + "]";
	}

}
