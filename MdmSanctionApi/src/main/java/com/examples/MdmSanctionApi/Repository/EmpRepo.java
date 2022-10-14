package com.examples.MdmSanctionApi.Repository;

import java.util.List;

import com.examples.MdmSanctionApi.Exception.IFMSException;
import com.examples.MdmSanctionApi.Request.EmployeeTypeRequest;
import com.examples.MdmSanctionApi.Response.EmployeeTypeResponse;

public interface EmpRepo {

	 List<EmployeeTypeResponse> getEmp(EmployeeTypeRequest request) throws IFMSException;
	
	

	 List<EmployeeTypeResponse> getEmpBy(EmployeeTypeRequest request) throws IFMSException;
	
	
	 List<EmployeeTypeResponse> getEmpMult(EmployeeTypeRequest request) throws IFMSException;
	
	
	 List<EmployeeTypeResponse> getEmpMultNa(EmployeeTypeRequest request)throws IFMSException;
}
