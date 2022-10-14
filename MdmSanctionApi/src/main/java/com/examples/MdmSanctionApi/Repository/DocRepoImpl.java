package com.examples.MdmSanctionApi.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.examples.MdmSanctionApi.Exception.IFMSException;
import com.examples.MdmSanctionApi.Request.DocRequest;
import com.examples.MdmSanctionApi.Response.DocResponse;

@ApplicationScoped
public class DocRepoImpl implements DocRepo {

	@PersistenceContext
	EntityManager entityManager;
	
	public List<DocResponse> search(DocRequest request) throws IFMSException{
		List<DocResponse> responses =new ArrayList<>();
		String sql="select d.doc_type_id,e.emp_name_en,e.emp_type_id,p.process_id from employee_type e "
				+ "left join mst_doc_type d on d.doc_type_id=e.doc_type_id "
				+ "left join mst_proc_type p on p.process_id = d.process_id where d.doc_type_id=:doc_type_id ";
//		try {
			Query query=entityManager.createNativeQuery(sql);
			query.setParameter("doc_type_id", request.getDoc_type_id());
			
			List<Object[]> lists=query.getResultList();
		for(Object[] list : lists) {
			DocResponse response=new DocResponse();
			response.setDoc_type_id((BigDecimal) list[0]);
			response.setEmp_name_en((String) list[1]);
			response.setEmp_type_id((BigDecimal) list[2]);
			response.setProcess_id((BigDecimal) list[3]);
			responses.add(response);		
			
		}
//		} catch (Exception e) {
//			final String mes = "Something went Wrong";
//			throw new IFMSException(mes);
//		}
		return responses;
	}
}
