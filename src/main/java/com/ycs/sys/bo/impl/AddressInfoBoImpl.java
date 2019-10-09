package com.ycs.sys.bo.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ycs.sys.bo.IAddressInfoBo;
import com.ycs.sys.dao.IAddressInfoDao;
import com.ycs.sys.domain.po.AddressInfoPo;
import com.ycs.sys.domain.po.RegionInfoPo;

/**
 * 收货地址BO实现类
 * @author youcyousyunn
 * @date 2018年1月28日
 */
@Component
public class AddressInfoBoImpl implements IAddressInfoBo {

	@Autowired 
	IAddressInfoDao addressInfoDao;

	@Override
	public List<AddressInfoPo> queryAddressLst(String usrNo) {
		return addressInfoDao.queryAddressLst(usrNo);
	}

	@Override
	public List<RegionInfoPo> queryRegionLst(Map<String, Object> paramMap) {
		return addressInfoDao.queryRegionLst(paramMap);
	}

	@Override
	public AddressInfoPo getAddressDetail(int id) {
		return addressInfoDao.getAddressDetail(id);
	}

	@Override
	public boolean saveAddress(AddressInfoPo addressInfoPo) {
		int result = -1;
		result = addressInfoDao.saveAddress(addressInfoPo);
		if (1 == result) {
			return true;
		} 
		return false; 
	}
	
	@Override
	public boolean deleteAddress(int id) {
		int result = -1;
		result = addressInfoDao.deleteAddress(id);
		if (1 == result) {
			return true;
		} 
		return false; 
	}

	@Override
	public boolean updateAddress(AddressInfoPo addressInfoPo) {
		int result = -1;
		result = addressInfoDao.updateAddress(addressInfoPo);
		if (1 == result) {
			return true;
		} 
		return false; 
	}

	

	
	
}
