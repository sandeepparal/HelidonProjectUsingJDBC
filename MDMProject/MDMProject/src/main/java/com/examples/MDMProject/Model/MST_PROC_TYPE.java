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
public class MST_PROC_TYPE {

	private int process_id;
	
	private String process_name;
	
	private char is_active;
	
	private String created_by;
	
	private Date created_dt;

	
	
}
