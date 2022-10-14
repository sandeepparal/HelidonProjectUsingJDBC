package com.examples.MdmSanctionApi.Request;

import java.util.List;

import lombok.Data;

@Data
public class EmployeeTypeRequest {

//	private int emp_type_id;
	
	private List<Integer> emp_type_id;
	
//	private String emp_name_en;
	
	private List<String> emp_name_en;
}
