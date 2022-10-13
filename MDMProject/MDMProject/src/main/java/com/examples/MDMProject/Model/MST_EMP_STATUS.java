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
public class MST_EMP_STATUS {

	private int status_id;
	private String status_name;
	private char is_active;
	private String created_by;
	private Date created_dt;
	
	
	
}
