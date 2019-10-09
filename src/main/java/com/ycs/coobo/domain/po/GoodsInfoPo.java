package com.ycs.coobo.domain.po;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ycs.base.domain.po.BasePo;

public class GoodsInfoPo extends BasePo {
	private int id; //商品ID
	private String name;  //商品名称
	private int goodSn;  //关联商品Id
	private int categoryId; //种类Id
	private int brandId;  //品牌Id
	private int goodsNum;  //数量
	private String keyword;  //关键字
    private String goodsBrief; //简要
    private String goodsDesc; //描述
    private int isOnSale;  //是否在售
    private int isDelete; //是否删除
    private int attributeCategoryId; //商品种类属性Id
    private String counterPrice; //专柜价
    private String extraPrice; //附加价
    private int isNew; //是否新品
    private String goodsUnit; //商品单位
    private String listPicUrl; //商品列表图路径
    private String unitPrice; // 单位价格
    private String retailPrice; //零售价格
    private int sellVolume; //销售量
    private int primaryProductId; //主产品Id
    private String promotionTag; //推销标签
    private String promotionDesc; //推销描述
    private int isAppExclusive; // 是否APP专属
    private String appExclusivePrice; //APP专享价
    private int isLimited; //是否限购
    private int isHot; //是否热销品
    private int sortOrder;  //排序
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date createTime; //创建时间
    
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
	public int getGoodSn() {
		return goodSn;
	}
	public void setGoodSn(int goodSn) {
		this.goodSn = goodSn;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public int getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(int goodsNum) {
		this.goodsNum = goodsNum;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getGoodsBrief() {
		return goodsBrief;
	}
	public void setGoodsBrief(String goodsBrief) {
		this.goodsBrief = goodsBrief;
	}
	public String getGoodsDesc() {
		return goodsDesc;
	}
	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}
	public int getIsOnSale() {
		return isOnSale;
	}
	public void setIsOnSale(int isOnSale) {
		this.isOnSale = isOnSale;
	}
	public int getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(int isDelete) {
		this.isDelete = isDelete;
	}
	public int getAttributeCategoryId() {
		return attributeCategoryId;
	}
	public void setAttributeCategoryId(int attributeCategoryId) {
		this.attributeCategoryId = attributeCategoryId;
	}
	public String getCounterPrice() {
		return counterPrice;
	}
	public void setCounterPrice(String counterPrice) {
		this.counterPrice = counterPrice;
	}
	public String getExtraPrice() {
		return extraPrice;
	}
	public void setExtraPrice(String extraPrice) {
		this.extraPrice = extraPrice;
	}
	public int getIsNew() {
		return isNew;
	}
	public void setIsNew(int isNew) {
		this.isNew = isNew;
	}
	public String getGoodsUnit() {
		return goodsUnit;
	}
	public void setGoodsUnit(String goodsUnit) {
		this.goodsUnit = goodsUnit;
	}
	public String getListPicUrl() {
		return listPicUrl;
	}
	public void setListPicUrl(String listPicUrl) {
		this.listPicUrl = listPicUrl;
	}
	public String getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getRetailPrice() {
		return retailPrice;
	}
	public void setRetailPrice(String retailPrice) {
		this.retailPrice = retailPrice;
	}
	public int getSellVolume() {
		return sellVolume;
	}
	public void setSellVolume(int sellVolume) {
		this.sellVolume = sellVolume;
	}
	public int getPrimaryProductId() {
		return primaryProductId;
	}
	public void setPrimaryProductId(int primaryProductId) {
		this.primaryProductId = primaryProductId;
	}
	public String getPromotionTag() {
		return promotionTag;
	}
	public void setPromotionTag(String promotionTag) {
		this.promotionTag = promotionTag;
	}
	public String getPromotionDesc() {
		return promotionDesc;
	}
	public void setPromotionDesc(String promotionDesc) {
		this.promotionDesc = promotionDesc;
	}
	public int getIsAppExclusive() {
		return isAppExclusive;
	}
	public void setIsAppExclusive(int isAppExclusive) {
		this.isAppExclusive = isAppExclusive;
	}
	public String getAppExclusivePrice() {
		return appExclusivePrice;
	}
	public void setAppExclusivePrice(String appExclusivePrice) {
		this.appExclusivePrice = appExclusivePrice;
	}
	public int getIsLimited() {
		return isLimited;
	}
	public void setIsLimited(int isLimited) {
		this.isLimited = isLimited;
	}
	public int getIsHot() {
		return isHot;
	}
	public void setIsHot(int isHot) {
		this.isHot = isHot;
	}
	public int getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
    
    
}
