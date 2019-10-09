package com.ycs.coobo.dao;

import java.util.List;
import java.util.Map;

import com.ycs.coobo.domain.po.CartInfoPo;

public interface IWeixinOrderInfoDao {
	int qryCartCount(Map<String, Object> paramMap);
	List<CartInfoPo> qryCartLst(Map<String, Object> paramMap);
	
	

}
