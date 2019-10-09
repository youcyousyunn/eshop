package com.ycs.coobo.domain.dto;

import com.ycs.base.domain.dto.BaseResponseDto;
import com.ycs.coobo.domain.po.CategoryInfoPo;

/**
 * 查询商品分类信息响应DTO
 * @author youcyousyunn
 * @date 2018年2月9日
 */
public class CategoryResponseDto extends BaseResponseDto {
	//分类目录信息
	private CategoryInfoPo data;
	
	/**
	 * 构造函数
	 */
	public CategoryResponseDto(){
	}
	
	/**
	 * 构造函数
	 * @param code
	 * @param info
	 */
	public CategoryResponseDto(String code, String info) {
		this.rspCd = code;
		this.rspInf = info;
	}

	public CategoryInfoPo getData() {
		return data;
	}

	public void setData(CategoryInfoPo data) {
		this.data = data;
	}

	
}
