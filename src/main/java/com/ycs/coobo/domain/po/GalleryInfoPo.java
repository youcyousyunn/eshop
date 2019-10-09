package com.ycs.coobo.domain.po;

import com.ycs.base.domain.po.BasePo;

public class GalleryInfoPo extends BasePo {
	private int id; //展览Id
	private String goodsId;  //商品Id
	private String imgUrl; //图片路径
	private String imgDesc;  //图片简介
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
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getImgDesc() {
		return imgDesc;
	}
	public void setImgDesc(String imgDesc) {
		this.imgDesc = imgDesc;
	}
	public int getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}
	
    
}
