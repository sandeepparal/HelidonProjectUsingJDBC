package com.examples.JoinProject.Model;

public class Salary {
	
    private int s_id;
    
	private long LPA;
	
	private int m_salary;
	
	private int pf;

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

	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Salary(int s_id, long lPA, int m_salary, int pf) {
		super();
		this.s_id = s_id;
		LPA = lPA;
		this.m_salary = m_salary;
		this.pf = pf;
	}

	@Override
	public String toString() {
		return "Salary [s_id=" + s_id + ", LPA=" + LPA + ", m_salary=" + m_salary + ", pf=" + pf + "]";
	}

	
	
	
}
