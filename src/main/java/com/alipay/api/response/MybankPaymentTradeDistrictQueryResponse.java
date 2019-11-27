package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.District;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.payment.trade.district.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-26 11:58:08
 */
public class MybankPaymentTradeDistrictQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5283655852872867836L;

	/** 
	 * District列表
	 */
	@ApiListField("district_details")
	@ApiField("district")
	private List<District> districtDetails;

	public void setDistrictDetails(List<District> districtDetails) {
		this.districtDetails = districtDetails;
	}
	public List<District> getDistrictDetails( ) {
		return this.districtDetails;
	}

}