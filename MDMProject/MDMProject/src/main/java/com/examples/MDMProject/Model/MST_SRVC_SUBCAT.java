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
public class MST_SRVC_SUBCAT {

	private int srvc_subcat_id;
	
	private int srvc_cat_id;
	
	private String sub_srvc_cat_name_en;
	
	private char is_active;
	
	private String created_by;
	
	private Date created_dt;

	
	
}
