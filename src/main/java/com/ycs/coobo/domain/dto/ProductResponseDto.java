package com.ycs.coobo.domain.dto;

import java.util.List;

import com.ycs.base.domain.dto.BaseResponseDto;
import com.ycs.coobo.domain.po.AdInfoPo;
import com.ycs.coobo.domain.po.BrandInfoPo;
import com.ycs.coobo.domain.po.CategoryInfoPo;
import com.ycs.coobo.domain.po.ChannelInfoPo;
import com.ycs.coobo.domain.po.GoodsInfoPo;
import com.ycs.coobo.domain.po.TopicInfoPo;

/**
 * 查询所有产品返回信息DTO
 * @author youcyousyunn
 * @date 2018年2月9日
 */
public class ProductResponseDto extends BaseResponseDto {
	private List<BrandInfoPo> brandList; // 产品品牌列表
	private List<ChannelInfoPo> channelList; //　产品频道列表
	private List<CategoryInfoPo> categoryList; // 产品种类列表
	private List<AdInfoPo> adList; // 广告列表
	private List<TopicInfoPo> topicList; // 主题列表
	private List<GoodsInfoPo> hotGoodList; // 热销商品列表
	private List<GoodsInfoPo> newGoodList; // 新品商品列表
    
	/**
	 * 构造函数
	 */
	public ProductResponseDto(){
	}
	
	/**
	 * 构造函数
	 * @param code
	 * @param info
	 */
	public ProductResponseDto(String code, String info) {
		this.rspCd = code;
		this.rspInf = info;
	}

	public List<BrandInfoPo> getBrandList() {
		return brandList;
	}

	public void setBrandList(List<BrandInfoPo> brandList) {
		this.brandList = brandList;
	}

	public List<ChannelInfoPo> getChannelList() {
		return channelList;
	}

	public void setChannelList(List<ChannelInfoPo> channelList) {
		this.channelList = channelList;
	}

	public List<CategoryInfoPo> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<CategoryInfoPo> categoryList) {
		this.categoryList = categoryList;
	}

	public List<AdInfoPo> getAdList() {
		return adList;
	}

	public void setAdList(List<AdInfoPo> adList) {
		this.adList = adList;
	}

	public List<TopicInfoPo> getTopicList() {
		return topicList;
	}

	public void setTopicList(List<TopicInfoPo> topicList) {
		this.topicList = topicList;
	}

	public List<GoodsInfoPo> getHotGoodList() {
		return hotGoodList;
	}

	public void setHotGoodList(List<GoodsInfoPo> hotGoodList) {
		this.hotGoodList = hotGoodList;
	}

	public List<GoodsInfoPo> getNewGoodList() {
		return newGoodList;
	}

	public void setNewGoodList(List<GoodsInfoPo> newGoodList) {
		this.newGoodList = newGoodList;
	}


}
