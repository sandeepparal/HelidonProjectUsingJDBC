package com.examples.MDMProject.Model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EMPLOYEE_TYPE {

	private int emp_type_id;
	
	private int emp_code;
	
	private String emp_name_en;
	
	private String emp_name_hi;
	
	private String father_name;
	
	private String mother_name;
	
	private Date date_of_birth;
	
	private int status_id;
	
	private int srvc_subcat_id;
	
	private int doc_type_id;



	
}
