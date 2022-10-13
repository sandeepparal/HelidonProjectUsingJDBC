package com.examples.JoinProject.Repository;

import com.examples.JoinProject.Model.Department;
import com.examples.JoinProject.Request.DeptRequest;

public interface DepartmentRepo {

	Department getDepartment(int id);
	
	DeptRequest getdetail(int id);
}
