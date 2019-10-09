package com.ycs.coobo.domain.po;

import com.ycs.base.domain.po.BasePo;

public class TopicInfoPo extends BasePo {
	private int id; //主题ID
	private String title;  //标题
	private String content; //内容
	private String avatar;  //头像
	private String picUrl;  //图片路径
	private String subTitle;  //副标题
	private String price;  //价格
    private int readCount; //阅读数
    private String scenePicUrl; // 场景图片路径
    private int isShow; //是否显示
    private int sortOrder; //排序
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	public String getScenePicUrl() {
		return scenePicUrl;
	}
	public void setScenePicUrl(String scenePicUrl) {
		this.scenePicUrl = scenePicUrl;
	}
	public int getIsShow() {
		return isShow;
	}
	public void setIsShow(int isShow) {
		this.isShow = isShow;
	}
	public int getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}
    
    
}
