package com.examples.MdmSanctionApi.Entity;

import lombok.Data;

@Data
public class ApiResponse<D> {

	private RequestStatus status;
	
	private D data;
	
	private Error error;
	
	
	public static <D> ApiResponse<D> success(final D data){
		final ApiResponse<D> apiRespose= new ApiResponse<>();
		apiRespose.setStatus(RequestStatus.SUCCESS);
		apiRespose.setError(null);
		apiRespose.setData(data);
		return apiRespose;
	}
	public static <D> ApiResponse<D> error(final Error error){
		final ApiResponse<D> apiRespose= new ApiResponse<>();
		apiRespose.setStatus(RequestStatus.FAILURE);
		apiRespose.setError(error);
		apiRespose.setData(null);
		return apiRespose;
	}

}
