package com.ycs.coobo.service;

import com.ycs.base.exception.HiBusinessReturnException;
import com.ycs.base.exception.HiException;
import com.ycs.coobo.domain.dto.QryCartRequestDto;
import com.ycs.coobo.domain.dto.QryCartResponseDto;

public interface IWeixinOrderInfoService {

	/**
	 * 查询购物车信息
	 * @param request
	 * @return QryCartResponseDto
	 * @throws HiException
	 */
	QryCartResponseDto queryCartInfo(QryCartRequestDto request) throws HiBusinessReturnException;

	
	
}
