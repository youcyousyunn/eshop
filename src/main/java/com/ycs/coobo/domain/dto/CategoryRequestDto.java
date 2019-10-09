package com.ycs.coobo.domain.dto;

import com.ycs.base.domain.dto.BaseResponseDto;

/**
 * 查询商品分类信息请求DTO
 * @author youcyousyunn
 * @date 2018年2月9日
 */
public class CategoryRequestDto extends BaseResponseDto {
	//分类主键
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
}
