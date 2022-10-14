package com.examples.MdmSanctionApi.controller;

import java.util.List;


import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

import com.examples.MdmSanctionApi.Entity.ApiResponse;
import com.examples.MdmSanctionApi.Exception.IFMSException;
import com.examples.MdmSanctionApi.Repository.EmpRepo;
import com.examples.MdmSanctionApi.Request.EmployeeTypeRequest;
import com.examples.MdmSanctionApi.Response.EmployeeTypeResponse;


@Path("/")
public class EmpController {
	
	@Inject
	private EmpRepo repo;

	@Path("/emp")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response employee(@RequestBody EmployeeTypeRequest request) throws IFMSException{
		List<EmployeeTypeResponse> resp=repo.getEmp(request);
		return Response.ok(ApiResponse.success(resp)).build();

	}
	
	
//	
//	@Path("/emp")
//	@POST
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response employee(@RequestBody EmployeeTypeRequest request) throws IFMSException{
//		List<EmployeeTypeResponse> resp=repo.getEmp(request);
//		return Response.ok(ApiResponse.success(resp)).build();
//
//	}
}
