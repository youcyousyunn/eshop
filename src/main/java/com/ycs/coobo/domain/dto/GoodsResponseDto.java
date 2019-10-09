package com.ycs.coobo.domain.dto;

import java.util.List;

import com.ycs.base.domain.dto.BaseResponseDto;
import com.ycs.coobo.domain.po.AttributeInfoPo;
import com.ycs.coobo.domain.po.BrandInfoPo;
import com.ycs.coobo.domain.po.CollectInfoPo;
import com.ycs.coobo.domain.po.GalleryInfoPo;
import com.ycs.coobo.domain.po.GoodsInfoPo;
import com.ycs.coobo.domain.po.IssueInfoPo;
import com.ycs.coobo.domain.po.ProductInfoPo;
import com.ycs.coobo.domain.po.SpecInfoPo;

/**
 * 查询商品详细信息返回DTO
 * @author youcyousyunn
 * @date 2018年2月9日
 */
public class GoodsResponseDto extends BaseResponseDto {
	private GoodsInfoPo goodsInfoPo; // 商品信息
	private BrandInfoPo brandInfoPo; // 商品品牌信息
	private List<GalleryInfoPo> galleryList; // 商品展览列表
	private List<AttributeInfoPo> attributeList; // 商品属性列表
	private List<IssueInfoPo> issueList; // 商品问题列表
	private List<ProductInfoPo> productList; // 产品列表
	private CollectInfoPo collectInfoPo; // 收藏信息
	private List<SpecInfoPo> specList; // 规格列表
	private QryCommentResponseDto comment; // 评论信息
	
	/**
	 * 构造函数
	 */
	public GoodsResponseDto(){
	}
	
	/**
	 * 构造函数
	 * @param code
	 * @param info
	 */
	public GoodsResponseDto(String code, String info) {
		this.rspCd = code;
		this.rspInf = info;
	}
	
	public GoodsInfoPo getGoodsInfoPo() {
		return goodsInfoPo;
	}
	
	public void setGoodsInfoPo(GoodsInfoPo goodsInfoPo) {
		this.goodsInfoPo = goodsInfoPo;
	}

	public BrandInfoPo getBrandInfoPo() {
		return brandInfoPo;
	}

	public void setBrandInfoPo(BrandInfoPo brandInfoPo) {
		this.brandInfoPo = brandInfoPo;
	}

	public List<GalleryInfoPo> getGalleryList() {
		return galleryList;
	}

	public void setGalleryList(List<GalleryInfoPo> galleryList) {
		this.galleryList = galleryList;
	}

	public List<AttributeInfoPo> getAttributeList() {
		return attributeList;
	}

	public void setAttributeList(List<AttributeInfoPo> attributeList) {
		this.attributeList = attributeList;
	}

	public List<IssueInfoPo> getIssueList() {
		return issueList;
	}

	public void setIssueList(List<IssueInfoPo> issueList) {
		this.issueList = issueList;
	}

	public List<ProductInfoPo> getProductList() {
		return productList;
	}

	public void setProductList(List<ProductInfoPo> productList) {
		this.productList = productList;
	}

	public CollectInfoPo getCollectInfoPo() {
		return collectInfoPo;
	}

	public void setCollectInfoPo(CollectInfoPo collectInfoPo) {
		this.collectInfoPo = collectInfoPo;
	}

	public List<SpecInfoPo> getSpecList() {
		return specList;
	}

	public void setSpecList(List<SpecInfoPo> specList) {
		this.specList = specList;
	}

	public QryCommentResponseDto getComment() {
		return comment;
	}

	public void setComment(QryCommentResponseDto comment) {
		this.comment = comment;
	}


	
}
