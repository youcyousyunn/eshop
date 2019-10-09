package com.ycs.coobo.domain.dto;

import org.apache.commons.lang.StringUtils;

import com.ycs.base.domain.dto.BaseResponseDto;

/**
 * 查询商品详细信息请求DTO
 * @author youcyousyunn
 * @date 2018年2月9日
 */
public class GoodsRequestDto extends BaseResponseDto {
	//商品主键
	private int id;

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
		String ids = String.valueOf(id);
        if (null == ids || StringUtils.isBlank(ids)) {
            return false;
        }
        return true;
    }
	
}
