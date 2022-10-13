package com.examples.JoinProject.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.sql.DataSource;

import com.examples.JoinProject.Request.EmpRequest;

@ApplicationScoped
public class EmployeeRepoImpl implements EmployeeRepo {

	
	@Inject
	DataSource ds;
	
	@Override
	public EmpRequest getAllInfo(int id) {
		EmpRequest request=null;
		String sql="select e.emp_id, b.b_id,e.emp_name,d.dept_name,b.acc_no ,s.s_id,s.LPA ,s.m_salary,s.pf from employee e"
				+ " left join salary s on s.s_id=e.s_id "
				+ "left join department d on d.dept_id=e.dept_id "
				+ " left join bankDetails b on b.emp_id=e.emp_id where e.emp_id=?";
		Connection conn=null;
		try {
			conn=ds.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int emp_id=rs.getInt(1);
				int b_id=rs.getInt(2);
				String emp_name=rs.getString(3);
				String dept_name=rs.getString(4);
				long acc_no=rs.getLong(5);
				int s_id=rs.getInt(6);
				long LPA=rs.getLong(7);
				int m_salary=rs.getInt(8);
				int pf=rs.getInt(9);
				request =new EmpRequest (emp_id,b_id,emp_name,dept_name,acc_no,s_id,LPA,m_salary,pf);
				System.out.println(request);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return request;

}
}