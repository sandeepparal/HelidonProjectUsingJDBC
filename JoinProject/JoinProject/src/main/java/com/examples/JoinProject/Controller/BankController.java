package com.examples.JoinProject.Controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.examples.JoinProject.Repository.BankRepo;
import com.examples.JoinProject.Request.BankRequest;
import com.examples.JoinProject.Request.EmpRequest;

@Path("/bank")
@RequestScoped
public class BankController {
	
	@Inject
	BankRepo repo;
	
	@Path("/get/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
	
	public BankRequest get(@PathParam("id")int id) {
		return this.repo.getDetail(id);
	}
}
