package com.ycs.sys.domain.dto;

import org.apache.commons.lang.StringUtils;

import com.ycs.base.domain.dto.BaseRequestDto;

/**
 * 查询收货地址请求DTO
 * @author youcyousyunn
 * @date 2018年3月14日
 */
public class QueryAddressInfoRequestDto extends BaseRequestDto {
	private int id; // 收货地址Id

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
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
