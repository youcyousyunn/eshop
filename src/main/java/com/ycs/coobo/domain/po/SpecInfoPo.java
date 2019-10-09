package com.ycs.coobo.domain.po;

import com.ycs.base.domain.po.BasePo;

public class SpecInfoPo extends BasePo {
	private int id; //Id
	private int specId; //商品规格Id
	private int goodsId; //商品Id
	private String name; //规格名称
	private String value; //规格值
	private String picUrl; //图片路径
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSpecId() {
		return specId;
	}
	public void setSpecId(int specId) {
		this.specId = specId;
	}
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
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
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	
	
}
