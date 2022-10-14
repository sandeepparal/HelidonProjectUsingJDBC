package com.examples.MdmSanctionApi.Repository;

import java.util.List;

import com.examples.MdmSanctionApi.Exception.IFMSException;
import com.examples.MdmSanctionApi.Request.DocRequest;
import com.examples.MdmSanctionApi.Response.DocResponse;

public interface DocRepo {

	public List<DocResponse> search(DocRequest request) throws IFMSException;
}
