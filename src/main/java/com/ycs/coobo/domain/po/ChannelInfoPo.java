package com.ycs.coobo.domain.po;

import com.ycs.base.domain.po.BasePo;

public class ChannelInfoPo extends BasePo {
	private int id; //频道ID
	private String name;  //名称
	private String url; //路径
	private String iconUrl;  //图标路径
	private int sortOrder;  //排序
	
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getIconUrl() {
		return iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	public int getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}
    
    
}
