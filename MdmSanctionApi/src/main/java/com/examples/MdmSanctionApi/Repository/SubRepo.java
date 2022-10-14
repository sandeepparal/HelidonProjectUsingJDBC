package com.examples.MdmSanctionApi.Repository;

import java.util.List;

import com.examples.MdmSanctionApi.Exception.IFMSException;
import com.examples.MdmSanctionApi.Request.SubCatRequest;
import com.examples.MdmSanctionApi.Response.SubCatResponse;

public interface SubRepo {

	public List<SubCatResponse> getData(SubCatRequest request) throws IFMSException;
}
