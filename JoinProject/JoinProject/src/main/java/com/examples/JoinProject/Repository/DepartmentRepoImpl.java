package com.examples.JoinProject.Repository;

import com.examples.JoinProject.Model.Department;
import com.examples.JoinProject.Request.DeptRequest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

@ApplicationScoped
public class DepartmentRepoImpl implements DepartmentRepo {
	
	@Inject
	@Named("studentDataSource")
	DataSource ds;

	@Override
	public Department getDepartment(int id) {
		Department department=null;
		String sql="select d.dept_id,d.dept_name from employee e LEFT JOIN  department d on d.dept_id=e.dept_id where d.dept_id= ?";
		Connection conn=null;
		try {
			conn=ds.getConnection();
		    PreparedStatement ps=conn.prepareStatement(sql);
		    ps.setInt(1, id);
		    
		    ResultSet rs=ps.executeQuery();
		   while(rs.next()) {
			   int dept_id=rs.getInt(1);
			   String dept_name=rs.getString(2);
			   department=new Department(dept_id,dept_name);
			   System.out.println(dept_id);
			   System.out.println(dept_name);
		   } 		
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return department;
	}

	@Override
	public DeptRequest getdetail(int id) {
		DeptRequest dRequest=null;
		String sql="select d.dept_id,e.emp_name,e.emp_city,b.b_name,b.acc_no from employee e "
				+ "left join department d on d.dept_id=e.dept_id "
				+ "left join bankDetails b on b.emp_id=e.emp_id where d.dept_id=?";
		Connection conn=null;
		try {
			conn =ds.getConnection();
			PreparedStatement ps =conn.prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int dept_id=rs.getInt(1);
				String emp_name=rs.getString(2);
				String emp_city=rs.getString(3);
				String b_name=rs.getString(4);
				long acc_no=rs.getLong(5);
				dRequest=new DeptRequest(dept_id,emp_name,emp_city,b_name,acc_no);
				System.out.println(dRequest);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return dRequest;
	}

}
