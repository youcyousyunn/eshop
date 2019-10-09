package com.ycs.sys.dao;

import java.util.List;
import java.util.Map;

import com.ycs.sys.domain.po.AddressInfoPo;
import com.ycs.sys.domain.po.RegionInfoPo;

/**
 * 收货地址信息DAO接口
 * @author youcyousyunn
 * @date 2018年1月28日
 */
public interface IAddressInfoDao {
	List<AddressInfoPo> queryAddressLst(String usrNo);
	List<RegionInfoPo> queryRegionLst(Map<String, Object> paramMap);
	AddressInfoPo getAddressDetail(int id);
	int saveAddress(AddressInfoPo addressInfoPo);
	int updateAddress(AddressInfoPo addressInfoPo);
	int deleteAddress(int id);

	
	
	
}
