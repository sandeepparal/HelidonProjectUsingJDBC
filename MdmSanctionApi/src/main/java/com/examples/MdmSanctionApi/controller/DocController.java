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
import com.examples.MdmSanctionApi.Repository.DocRepo;
import com.examples.MdmSanctionApi.Request.DocRequest;
import com.examples.MdmSanctionApi.Response.DocResponse;

@Path("/")
public class DocController {

	@Inject
	private DocRepo repo;
	
	@Path("/sear")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response getSearchData(@RequestBody DocRequest request) throws IFMSException {
		List<DocResponse> resp=repo.search(request);
		return Response.ok(ApiResponse.success(resp)).build();
		
		
	}
}
