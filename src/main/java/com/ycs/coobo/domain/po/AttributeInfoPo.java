package com.ycs.coobo.domain.po;

import com.ycs.base.domain.po.BasePo;

public class AttributeInfoPo extends BasePo {
	private int id; //属性Id
	private String goodsId;  //商品Id
	private String name; //名称
	private String value;  //值
	private int sortOrder;  //排序
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public int getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}
	
    
}
