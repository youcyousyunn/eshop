package com.ycs.coobo.domain.po;

import com.ycs.base.domain.po.BasePo;

public class CartInfoPo extends BasePo {
	private int id; //Id
	private String usrNo;  //用户号
	private String sessionId; 
	private String goodsId; //商品Id
	private String goodsSn;  //关联商品
	private String productId;  //产品Id
	private String goodsName;  //商品名称
	private String marketPrice;  //市场价
    private String retailPrice; //零售价
    private int num; //数量
    private String goodsSpecIds; //商品对应规格Ids
    private String goodsSpecValue; //商品对应规格值
    private int checked; //是否选中
    private String listPicUrl;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsrNo() {
		return usrNo;
	}
	public void setUsrNo(String usrNo) {
		this.usrNo = usrNo;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsSn() {
		return goodsSn;
	}
	public void setGoodsSn(String goodsSn) {
		this.goodsSn = goodsSn;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getMarketPrice() {
		return marketPrice;
	}
	public void setMarketPrice(String marketPrice) {
		this.marketPrice = marketPrice;
	}
	public String getRetailPrice() {
		return retailPrice;
	}
	public void setRetailPrice(String retailPrice) {
		this.retailPrice = retailPrice;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getGoodsSpecIds() {
		return goodsSpecIds;
	}
	public void setGoodsSpecIds(String goodsSpecIds) {
		this.goodsSpecIds = goodsSpecIds;
	}
	public String getGoodsSpecValue() {
		return goodsSpecValue;
	}
	public void setGoodsSpecValue(String goodsSpecValue) {
		this.goodsSpecValue = goodsSpecValue;
	}
	public int getChecked() {
		return checked;
	}
	public void setChecked(int checked) {
		this.checked = checked;
	}
	public String getListPicUrl() {
		return listPicUrl;
	}
	public void setListPicUrl(String listPicUrl) {
		this.listPicUrl = listPicUrl;
	} 
    
    
}
