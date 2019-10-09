package com.ycs.coobo.domain.po;

import com.ycs.base.domain.po.BasePo;

public class BrandInfoPo extends BasePo {
	private int id; //品牌ID
	private String name;  //名称
	private String listPicUrl; //列表图片路径
	private String simpleDesc;  //简介
	private String picUrl;  //图片路径
	private int sortOrder;  //排序
    private int isShow;  //是否显示
    private String floorPrice; //最低价
    private String appListPicUrl; 
    private int isNew; //是否新品
    private String newPicUrl;  //新品图片路径
    private int newSortOrder; //新品排序
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getListPicUrl() {
		return listPicUrl;
	}
	public void setListPicUrl(String listPicUrl) {
		this.listPicUrl = listPicUrl;
	}
	public String getSimpleDesc() {
		return simpleDesc;
	}
	public void setSimpleDesc(String simpleDesc) {
		this.simpleDesc = simpleDesc;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public int getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}
	public int getIsShow() {
		return isShow;
	}
	public void setIsShow(int isShow) {
		this.isShow = isShow;
	}
	public String getFloorPrice() {
		return floorPrice;
	}
	public void setFloorPrice(String floorPrice) {
		this.floorPrice = floorPrice;
	}
	public String getAppListPicUrl() {
		return appListPicUrl;
	}
	public void setAppListPicUrl(String appListPicUrl) {
		this.appListPicUrl = appListPicUrl;
	}
	public int getIsNew() {
		return isNew;
	}
	public void setIsNew(int isNew) {
		this.isNew = isNew;
	}
	public String getNewPicUrl() {
		return newPicUrl;
	}
	public void setNewPicUrl(String newPicUrl) {
		this.newPicUrl = newPicUrl;
	}
	public int getNewSortOrder() {
		return newSortOrder;
	}
	public void setNewSortOrder(int newSortOrder) {
		this.newSortOrder = newSortOrder;
	}
    
    
}
