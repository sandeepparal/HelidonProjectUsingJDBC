package com.examples.MdmSanctionApi.Repository;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.examples.MdmSanctionApi.Exception.IFMSException;
import com.examples.MdmSanctionApi.Request.EmployeeTypeRequest;
import com.examples.MdmSanctionApi.Response.EmployeeTypeResponse;


@ApplicationScoped
public class EmpRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<EmployeeTypeResponse> getEmp(EmployeeTypeRequest request) throws IFMSException{
		String sql="select e.emp_code,e.emp_name_en,e.father_name,e.mother_name,st.status_id from employee_type e "
				+ "left join mst_emp_status st on st.status_id=e.status_id  where e.emp_type_id=:emp_type_id";
		List<EmployeeTypeResponse>	responses = new ArrayList<>();
		
		try {
			Query query=entityManager.createNativeQuery(sql);
			query.setParameter("emp_type_id", request.getEmp_type_id());
			
			List<Object[]> lists=query.getResultList();
			System.out.println(lists);
			
			for(Object[] list :lists) {
			EmployeeTypeResponse response = new EmployeeTypeResponse();
			response.setEmp_code((BigDecimal) list[0]);
			response.setFather_name((String) list[1]);
			response.setMother_name((String) list[2]);
			response.setDate_of_birth((String) list[3]);
			response.setStatus_id((BigDecimal) list[4]);
			responses.add(response);
			
			}
		} catch (Exception e) {
			final String mes = "Something went Wrong";
			throw new IFMSException(mes);

		}
		return responses;
		
	}
}
