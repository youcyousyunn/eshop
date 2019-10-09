package com.ycs.sys.domain.po;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ycs.base.domain.po.BasePo;

public class CouponInfoPo extends BasePo {
	private int id; //优惠券ID
	private String name;  //名称
	private String money; //金额
	private int type;  //类型
	private String tag;  //标签
	private String content;  //内容
    private int minAmount;  //最小数量
    private int maxAmount; //最大数量
    @JsonFormat(pattern="yyyy-MM-dd", timezone="GMT+8")
    private Date sendStartDate; //发送开始时间
    @JsonFormat(pattern="yyyy-MM-dd", timezone="GMT+8")
    private Date sendEndDate; //发送结束时间
    @JsonFormat(pattern="yyyy-MM-dd", timezone="GMT+8")
    private Date useStartDate; //使用开始时间
    @JsonFormat(pattern="yyyy-MM-dd", timezone="GMT+8")
    private Date useEndDate; //使用结束时间
    private String minGoodsAmount;  //最小商品金额
    
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
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getMinAmount() {
		return minAmount;
	}
	public void setMinAmount(int minAmount) {
		this.minAmount = minAmount;
	}
	public int getMaxAmount() {
		return maxAmount;
	}
	public void setMaxAmount(int maxAmount) {
		this.maxAmount = maxAmount;
	}
	public Date getSendStartDate() {
		return sendStartDate;
	}
	public void setSendStartDate(Date sendStartDate) {
		this.sendStartDate = sendStartDate;
	}
	public Date getSendEndDate() {
		return sendEndDate;
	}
	public void setSendEndDate(Date sendEndDate) {
		this.sendEndDate = sendEndDate;
	}
	public Date getUseStartDate() {
		return useStartDate;
	}
	public void setUseStartDate(Date useStartDate) {
		this.useStartDate = useStartDate;
	}
	public Date getUseEndDate() {
		return useEndDate;
	}
	public void setUseEndDate(Date useEndDate) {
		this.useEndDate = useEndDate;
	}
	public String getMinGoodsAmount() {
		return minGoodsAmount;
	}
	public void setMinGoodsAmount(String minGoodsAmount) {
		this.minGoodsAmount = minGoodsAmount;
	}
    
    
}
