package com.ycs.sys.domain.po;

import com.ycs.base.domain.po.BasePo;

public class RegionInfoPo extends BasePo {
	private int id; //节点
	private int parentId;  //父节点
	private String name; //名称
	private int type;  //类型
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
    
    
}
