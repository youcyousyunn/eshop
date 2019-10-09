package com.ycs.coobo.domain.dto;

import java.util.List;

import com.ycs.base.domain.dto.BaseResponseDto;
import com.ycs.coobo.domain.po.CategoryInfoPo;

/**
 * 查询商品分类信息响应DTO
 * @author youcyousyunn
 * @date 2018年2月9日
 */
public class QryCategoryResponseDto extends BaseResponseDto {
	//分类列表
	private List<CategoryInfoPo> categoryList;
	
	/**
	 * 构造函数
	 */
	public QryCategoryResponseDto(){
	}
	
	/**
	 * 构造函数
	 * @param code
	 * @param info
	 */
	public QryCategoryResponseDto(String code, String info) {
		this.rspCd = code;
		this.rspInf = info;
	}

	public List<CategoryInfoPo> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<CategoryInfoPo> categoryList) {
		this.categoryList = categoryList;
	} 

	
	
}
