package com.examples.MdmSanctionApi.Response;

import java.math.BigDecimal;
import java.sql.Timestamp;

import lombok.Data;
@Data
public class EmployeeTypeResponse {
    
	private String emp_name_en;
	
	private BigDecimal emp_code;
	
    private String father_name;
	
	private String mother_name;
	
	private Timestamp date_of_birth;
	
//from status table	
	private BigDecimal status_id;
}
