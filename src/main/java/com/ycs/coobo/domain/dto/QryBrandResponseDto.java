package com.ycs.coobo.domain.dto;

import java.util.List;

import com.ycs.base.domain.dto.BaseResponseDto;
import com.ycs.coobo.domain.po.BrandInfoPo;

/**
 * 分页查询产品品牌返回信息DTO
 * @author youcyousyunn
 * @date 2018年2月9日
 */
public class QryBrandResponseDto extends BaseResponseDto {
	//总数
	private Integer total;
	//列表数据
	private List<BrandInfoPo> brandList;
    
	/**
	 * 构造函数
	 */
	public QryBrandResponseDto(){
	}
	
	/**
	 * 构造函数
	 * @param code
	 * @param info
	 */
	public QryBrandResponseDto(String code, String info) {
		this.rspCd = code;
		this.rspInf = info;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<BrandInfoPo> getBrandList() {
		return brandList;
	}

	public void setBrandList(List<BrandInfoPo> brandList) {
		this.brandList = brandList;
	}
	

}
