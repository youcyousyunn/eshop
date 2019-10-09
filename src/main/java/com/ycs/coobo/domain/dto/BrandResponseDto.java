package com.ycs.coobo.domain.dto;

import com.ycs.base.domain.dto.BaseResponseDto;
import com.ycs.coobo.domain.po.BrandInfoPo;

/**
 * 查询产品品牌返回信息DTO
 * @author youcyousyunn
 * @date 2018年2月9日
 */
public class BrandResponseDto extends BaseResponseDto {
	private BrandInfoPo data;
	
	/**
	 * 构造函数
	 */
	public BrandResponseDto(){
	}
	
	/**
	 * 构造函数
	 * @param code
	 * @param info
	 */
	public BrandResponseDto(String code, String info) {
		this.rspCd = code;
		this.rspInf = info;
	}
	
	public BrandInfoPo getData() {
		return data;
	}
	public void setData(BrandInfoPo data) {
		this.data = data;
	}
    
    
}
