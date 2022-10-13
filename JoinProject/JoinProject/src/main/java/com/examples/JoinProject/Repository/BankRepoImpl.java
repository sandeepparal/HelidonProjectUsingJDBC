package com.examples.JoinProject.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.sql.DataSource;

import com.examples.JoinProject.Request.BankRequest;


@ApplicationScoped
public class BankRepoImpl  implements BankRepo{
	
	
	@Inject
	DataSource ds;

	@Override
	public BankRequest getDetail(int id) {
		BankRequest request=null;
		String sql="select b.b_id,e.emp_name,d.dept_name,b.acc_no from employee e "
				+ "left join department d on d.dept_id=e.dept_id "
				+ " left join bankDetails b on b.emp_id=e.emp_id where b.b_id=?";
		Connection conn=null;
		try {
			conn=ds.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int b_id=rs.getInt(1);
				String emp_name=rs.getString(2);
				String dept_name=rs.getString(3);
				long acc_no=rs.getLong(4);
				request =new BankRequest (b_id,emp_name,dept_name,acc_no);
				System.out.println(request);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return request;
	}




	}
