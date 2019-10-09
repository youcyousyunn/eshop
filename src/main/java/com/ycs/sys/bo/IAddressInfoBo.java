package com.ycs.sys.bo;

import java.util.List;
import java.util.Map;

import com.ycs.base.annotation.HiBoMethod;
import com.ycs.sys.domain.po.AddressInfoPo;
import com.ycs.sys.domain.po.RegionInfoPo;

/**
 * 收货地址信息BO接口
 * @author youcyousyunn
 * @date 2018年1月28日
 */
public interface IAddressInfoBo {

	@HiBoMethod
	List<AddressInfoPo> queryAddressLst(String usrNo);

	@HiBoMethod
	List<RegionInfoPo> queryRegionLst(Map<String, Object> paramMap);

	@HiBoMethod
	AddressInfoPo getAddressDetail(int id);

	@HiBoMethod
	boolean saveAddress(AddressInfoPo addressInfoPo);

	@HiBoMethod
	boolean updateAddress(AddressInfoPo addressInfoPo);

	@HiBoMethod
	boolean deleteAddress(int id);

	
}
