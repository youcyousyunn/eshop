package com.ycs.sys.domain.dto;

import com.ycs.base.domain.dto.BaseRequestDto;

/**
 * 查询区域列表请求DTO
 * @author youcyousyunn
 * @date 2018年3月14日
 */
public class QueryRegionInfoRequestDto extends BaseRequestDto {
	// 区域节点Id
	private int id;
	// 父节点Id
	private int parentId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	
}
