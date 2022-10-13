package com.examples.MdmSanctionApi.Response;

import java.math.BigDecimal;
import java.sql.Date;

import lombok.Data;
@Data
public class EmployeeTypeResponse {

	private BigDecimal emp_code;
	
    private String father_name;
	
	private String mother_name;
	
	private String date_of_birth;
	
	private BigDecimal status_id;
}
