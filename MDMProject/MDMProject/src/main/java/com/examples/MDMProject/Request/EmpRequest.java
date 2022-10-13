package com.examples.MDMProject.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class EmpRequest {
	
 
	private int emp_type_id;

	private int emp_code;
	
	private String emp_name_en;
	
	private String father_name;
	
	private String mother_name;
	
	private String status_name;
	
	private String srvc_cat_name_hi;
	
	private String sub_srvc_cat_name_en;
	
	private String process_name;
	
	private String type_name;

	
	
}
