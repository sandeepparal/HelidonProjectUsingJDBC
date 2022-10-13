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
public class MST_DOC_TYPE {

	private int doc_type_id;
	
	private String type_name;
	
	private String desce;
	
	private int process_id;
	
	private char is_active;
	
	private String created_by;
	
	private Date created_dt;

	
}
