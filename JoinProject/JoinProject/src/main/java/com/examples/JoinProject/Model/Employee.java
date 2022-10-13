package com.examples.JoinProject.Model;

public class Employee {
	private int emp_id;
	private String emp_name;
	private String emp_city;
	
    private int dept_id;
    
    private long s_id;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
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

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public long getS_id() {
		return s_id;
	}

	public void setS_id(long s_id) {
		this.s_id = s_id;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int emp_id, String emp_name, String emp_city, int dept_id, long s_id) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_city = emp_city;
		this.dept_id = dept_id;
		this.s_id = s_id;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_city=" + emp_city + ", dept_id="
				+ dept_id + ", s_id=" + s_id + "]";
	}

	
}
