package com.examples.JoinProject.Controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.examples.JoinProject.Model.Department;
import com.examples.JoinProject.Repository.DepartmentRepo;
import com.examples.JoinProject.Request.DeptRequest;


@Path("/dept")
@RequestScoped
public class DepartmentController {
	
@Inject
DepartmentRepo repo;

@Path("/get/{id}")
@GET
@Produces(MediaType.APPLICATION_JSON)
public Department get(@PathParam("id") int id) {
	return this.repo.getDepartment(id);
}


@Path("/getBy/{id}")
@GET
@Produces(MediaType.APPLICATION_JSON)
public DeptRequest getAll(@PathParam("id") int id) {
	return this.repo.getdetail(id);
} 
}
