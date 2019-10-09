package com.ycs.sys.domain.dto;

import org.apache.commons.lang.StringUtils;

import com.ycs.base.domain.dto.BaseRequestDto;

/**
 * 查询用户所有优惠券信息请求DTO
 * @author youcyousyunn
 * @date 2018年3月14日
 */
public class QueryCouponInfoRequestDto extends BaseRequestDto {
	
	/**
	 * 接口报文请求检查
	 * @param
	 * @return boolean
	 */
	public boolean checkRequestDto() {
        if (null == usrNo || StringUtils.isBlank(usrNo)) {
            return false;
        }
        return true;
    }

	
}
