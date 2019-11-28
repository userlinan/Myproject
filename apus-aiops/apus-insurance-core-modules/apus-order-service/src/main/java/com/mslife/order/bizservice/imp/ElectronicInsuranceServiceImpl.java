package com.mslife.order.bizservice.imp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mslife.app.dto.base.ResultBeanDTO;
import com.mslife.order.bizservice.ElectronicInsuranceService;
import com.mslife.order.dto.request.ElectronicInsuranceInfoSaveReqBoxDTO;
/**
 * 电子投保业务接口实现
 * @author linannan
 *
 */
@Service
public class ElectronicInsuranceServiceImpl implements ElectronicInsuranceService{

	private Logger logger=LoggerFactory.getLogger(ElectronicInsuranceServiceImpl.class);

	@Override
	public ResultBeanDTO saveInsuranceInfo(ElectronicInsuranceInfoSaveReqBoxDTO request) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
