package com.ycs.coobo.bo.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ycs.coobo.bo.IWeixinOrderBo;
import com.ycs.coobo.dao.IWeixinOrderInfoDao;
import com.ycs.coobo.domain.po.CartInfoPo;

@Component
public class WeixinOrderBoImpl implements IWeixinOrderBo {

	@Autowired
	private IWeixinOrderInfoDao weixinOrderInfoDao;
	

	@Override
	public int qryCartCount(Map<String, Object> paramMap) {
		return weixinOrderInfoDao.qryCartCount(paramMap);
	}


	@Override
	public List<CartInfoPo> qryCartLst(Map<String, Object> paramMap) {
		return weixinOrderInfoDao.qryCartLst(paramMap);
	}
	
	
	

}
