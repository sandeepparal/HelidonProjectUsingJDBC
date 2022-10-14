package com.examples.MdmSanctionApi.Repository;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.examples.MdmSanctionApi.Exception.IFMSException;
import com.examples.MdmSanctionApi.Request.SubCatRequest;
import com.examples.MdmSanctionApi.Response.SubCatResponse;

@ApplicationScoped
public class SubCatRepo {

	@PersistenceContext
	EntityManager entityManager;
	
	public List<SubCatResponse> getData(SubCatRequest request) throws IFMSException{
		
		List<SubCatResponse> responses=new ArrayList<>();
		String sql="select cat.srvc_cat_name_hi,sub.is_active,e.father_name,e.mother_name,st.status_name,cat.created_by from mst_srvc_subcat sub "
				+ "left join employee_type e on e.srvc_subcat_id= sub.srvc_subcat_id "
				+ " left join mst_emp_status st on st.status_id=e.status_id "
				+ "left join mst_srvc_cat cat on cat.srvc_cat_id=sub.srvc_cat_id where sub.srvc_subcat_id=:srvc_subcat_id ";		
		
//		try {
			Query query=entityManager.createNativeQuery(sql);
			query.setParameter("srvc_subcat_id",request.getSrvc_subcat_id());
			
 			List<Object[]> lists =query.getResultList();
			for(Object[] list :lists) {
				SubCatResponse response = new SubCatResponse();
				response.setSrvc_cat_name_hi((String ) list[0]);
				response.setIs_active((String) list[1]);
				response.setFather_name((String) list[2]);
				response.setMother_name((String) list[3]);
				response.setStatus_name((String) list[4]);
				response.setCreated_by((String) list[5]);
				responses.add(response);
				 }
//		} catch (Exception e) {
//			final String mes = "Something went Wrong";
//			throw new IFMSException(mes);
//		}
//		
		return responses ;
	}
	
}
