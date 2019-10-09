package com.ycs.sys.domain.dto;

import com.ycs.base.domain.dto.BaseRequestDto;

/**
 * 删除收货地址请求DTO
 * @author youcyousyunn
 * @date 2018年3月14日
 */
public class DeleteAddressInfoRequestDto extends BaseRequestDto {
	private int id; //地址Id
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
