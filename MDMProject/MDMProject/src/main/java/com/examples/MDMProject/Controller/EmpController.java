package com.examples.MDMProject.Controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.examples.MDMProject.Repository.EmployeeRepo;
import com.examples.MDMProject.Request.EmpRequest;

@Path("/emp")
@RequestScoped
public class EmpController {

	@Inject
	EmployeeRepo repo;
	
	
@Path("/get/{id}")	
@GET
@Produces(MediaType.APPLICATION_JSON)
public EmpRequest getEmp(@PathParam("id") int id) {
	return this.repo.getdetails(id);
}
}
