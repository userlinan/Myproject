package com.mslife.order.bizservice;

import com.mslife.app.dto.base.ResultBeanDTO;
import com.mslife.order.dto.request.ElectronicInsuranceInfoSaveReqBoxDTO;

public interface ElectronicInsuranceService {
	public ResultBeanDTO saveInsuranceInfo(ElectronicInsuranceInfoSaveReqBoxDTO request);
	
}
