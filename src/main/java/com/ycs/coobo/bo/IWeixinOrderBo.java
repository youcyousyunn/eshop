package com.ycs.coobo.bo;

import java.util.List;
import java.util.Map;

import com.ycs.base.annotation.HiBoMethod;
import com.ycs.coobo.domain.po.CartInfoPo;

public interface IWeixinOrderBo {

	@HiBoMethod
	int qryCartCount(Map<String, Object> paramMap);

	@HiBoMethod
	List<CartInfoPo> qryCartLst(Map<String, Object> paramMap);

	
	
}
