package com.ycs.coobo.domain.po;

import com.ycs.base.domain.po.BasePo;

public class CategoryInfoPo extends BasePo {
	private int id; //种类ID
	private String name;  //名称
	private String keyword; //关键字
	private String iconUrl; //图标路径
	private String imgUrl;  //图片路径
	private String bannerUrl;  //横幅路径
	private String wapBannerUrl;  //wap横幅路径
	private String level; //等级
	private int type;  //类型
    private int parentId;  //父节点Id
    private int showIndex;
    private int isShow; //是否显示
    private String frontName; //正面名称
    private String frontDesc; //正面描述
    private int sortOrder; //排序
    
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
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getIconUrl() {
		return iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getBannerUrl() {
		return bannerUrl;
	}
	public void setBannerUrl(String bannerUrl) {
		this.bannerUrl = bannerUrl;
	}
	public String getWapBannerUrl() {
		return wapBannerUrl;
	}
	public void setWapBannerUrl(String wapBannerUrl) {
		this.wapBannerUrl = wapBannerUrl;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getShowIndex() {
		return showIndex;
	}
	public void setShowIndex(int showIndex) {
		this.showIndex = showIndex;
	}
	public int getIsShow() {
		return isShow;
	}
	public void setIsShow(int isShow) {
		this.isShow = isShow;
	}
	public String getFrontName() {
		return frontName;
	}
	public void setFrontName(String frontName) {
		this.frontName = frontName;
	}
	public String getFrontDesc() {
		return frontDesc;
	}
	public void setFrontDesc(String frontDesc) {
		this.frontDesc = frontDesc;
	}
	public int getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}
    
    
}
