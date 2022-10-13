package com.examples.MDMProject.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.sql.DataSource;

import com.examples.MDMProject.Request.EmpRequest;


@ApplicationScoped
public class EmployeeRepoImpl implements EmployeeRepo {
	
	@Inject
	DataSource ds;

	@Override
	public EmpRequest getdetails(int id) {
		EmpRequest request=null;
		Connection conn=null;
		String Sql="select e.emp_type_id,e.emp_code,e.emp_name_en,e.father_name,e.mother_name,st.status_name,cat.srvc_cat_name_hi,sub.sub_srvc_cat_name_en,p.process_name,d.type_name from employee_type e "
				+ "left join mst_emp_status st on st.status_id=e.status_id "
				+ "left join mst_srvc_subcat sub on sub.srvc_subcat_id=e.srvc_subcat_id "
				+ "left join mst_doc_type d on d.doc_type_id=e.doc_type_id "
				+ "left join mst_srvc_cat cat on cat.srvc_cat_id=sub.srvc_cat_id "
				+ "left join mst_proc_type p on p.process_id=d.process_id where e.emp_type_id=?";
		
		try {
			conn=ds.getConnection();
			PreparedStatement ps=conn.prepareStatement(Sql);
			ps.setInt(1, id);
					
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int emp_id=rs.getInt(1);
				int emp_code=rs.getInt(2);
				String emp_name_en=rs.getString(3);
				String father_name=rs.getString(4);
				String mother_name=rs.getString(5);
				String status_name=rs.getString(6);
				String srvc_cat_name_hi=rs.getString(7);
				String sub_srvc_cat_name_en=rs.getString(8);
				String process_name=rs.getString(9);
				String type_name=rs.getString(10);
				request=new EmpRequest(emp_id,emp_code,emp_name_en,father_name,mother_name,status_name,srvc_cat_name_hi,sub_srvc_cat_name_en,process_name,type_name);
				System.out.println(request);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return request;
	}

	
}
