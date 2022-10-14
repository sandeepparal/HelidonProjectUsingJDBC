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
import com.examples.MdmSanctionApi.Repository.SubCatRepo;
import com.examples.MdmSanctionApi.Request.SubCatRequest;
import com.examples.MdmSanctionApi.Response.SubCatResponse;



@Path("/")
public class SubCatController {

	@Inject
	SubCatRepo repo;
	
	@Path("/subcat")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response getDetails(@RequestBody SubCatRequest request) throws IFMSException {
		List<SubCatResponse> resp=repo.getData(request);
		return Response.ok(ApiResponse.success(resp)).build();
	}
	
}
