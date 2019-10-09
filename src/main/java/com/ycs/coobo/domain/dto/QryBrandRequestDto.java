package com.ycs.coobo.domain.dto;

import com.ycs.base.domain.dto.BaseResponseDto;

/**
 * 分页查询产品品牌信息请求DTO
 * @author youcyousyunn
 * @date 2018年2月9日
 */
public class QryBrandRequestDto extends BaseResponseDto {
	//品牌名称
	private String name;
	//当前页
	private Integer currentPage;
	//页大小
	private Integer pageSize;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	
}
