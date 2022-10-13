package com.examples.JoinProject.Request;

public class EmpRequest {
	private int emp_id;
	private int b_id;
	private String emp_name;
	private String dept_name;
	private long acc_no;
	private int s_id;
	private long LPA;
	private int m_salary;
	private int pf;
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
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
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public long getLPA() {
		return LPA;
	}
	public void setLPA(long lPA) {
		LPA = lPA;
	}
	public int getM_salary() {
		return m_salary;
	}
	public void setM_salary(int m_salary) {
		this.m_salary = m_salary;
	}
	public int getPf() {
		return pf;
	}
	public void setPf(int pf) {
		this.pf = pf;
	}
	public EmpRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpRequest(int emp_id, int b_id, String emp_name, String dept_name, long acc_no, int s_id, long lPA,
			int m_salary, int pf) {
		super();
		this.emp_id = emp_id;
		this.b_id = b_id;
		this.emp_name = emp_name;
		this.dept_name = dept_name;
		this.acc_no = acc_no;
		this.s_id = s_id;
		LPA = lPA;
		this.m_salary = m_salary;
		this.pf = pf;
	}
	@Override
	public String toString() {
		return "EmpRequest [emp_id=" + emp_id + ", b_id=" + b_id + ", emp_name=" + emp_name + ", dept_name=" + dept_name
				+ ", acc_no=" + acc_no + ", s_id=" + s_id + ", LPA=" + LPA + ", m_salary=" + m_salary + ", pf=" + pf
				+ "]";
	}
	
	
	
}
