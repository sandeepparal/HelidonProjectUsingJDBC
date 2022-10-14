package com.examples.MdmSanctionApi.Response;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class DocResponse {

	private BigDecimal doc_type_id;
	
	private BigDecimal emp_type_id;
	
	private String emp_name_en;
	
	private BigDecimal process_id;
	
}
