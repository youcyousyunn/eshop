package com.ycs.coobo.domain.po;

import com.ycs.base.domain.po.BasePo;

public class ProductInfoPo extends BasePo {
	private int id; //评价Id
	private int goodsId; //商品Id
	private String goodsSpecIds; //商品规格Ids
	private String goodsSn;  //关联商品
	private int goodsNum; //商品数量
	private String retailPrice; //零售价格
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsSpecIds() {
		return goodsSpecIds;
	}
	public void setGoodsSpecIds(String goodsSpecIds) {
		this.goodsSpecIds = goodsSpecIds;
	}
	public String getGoodsSn() {
		return goodsSn;
	}
	public void setGoodsSn(String goodsSn) {
		this.goodsSn = goodsSn;
	}
	public int getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(int goodsNum) {
		this.goodsNum = goodsNum;
	}
	public String getRetailPrice() {
		return retailPrice;
	}
	public void setRetailPrice(String retailPrice) {
		this.retailPrice = retailPrice;
	}
	
	
}
