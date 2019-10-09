package com.ycs.coobo.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycs.base.exception.HiBusinessReturnException;
import com.ycs.coobo.bo.IWeixinOrderBo;
import com.ycs.coobo.domain.dto.QryCartRequestDto;
import com.ycs.coobo.domain.dto.QryCartResponseDto;
import com.ycs.coobo.domain.po.CartInfoPo;
import com.ycs.coobo.service.IWeixinOrderInfoService;

@Service
public class WeixinOrderInfoServiceImpl implements IWeixinOrderInfoService {

	@Autowired
	private IWeixinOrderBo weixinOrderBo;
	
	@Override
	public QryCartResponseDto queryCartInfo(QryCartRequestDto request) throws HiBusinessReturnException {
		// 查询共有多少记录
		Map<String, Object> paramMap = new HashMap<>();
		int total = weixinOrderBo.qryCartCount(paramMap);

		// 查询列表
		List<CartInfoPo> cartInfoPoLst = weixinOrderBo.qryCartLst(paramMap);
		// 组装响应信息
		QryCartResponseDto response = new QryCartResponseDto();
		response.setCartList(cartInfoPoLst);
		response.setTotal(total);
		return response;
	}
	
	
	
	
}