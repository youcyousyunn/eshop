package com.ycs.coobo.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import com.ycs.basbo.constants.HiMsgCdConstants;
import com.ycs.base.exception.HiBusinessReturnException;
import com.ycs.base.utils.PageUtil;
import com.ycs.coobo.bo.IAdInfoBo;
import com.ycs.coobo.bo.IProductInfoBo;
import com.ycs.coobo.domain.dto.BrandRequestDto;
import com.ycs.coobo.domain.dto.BrandResponseDto;
import com.ycs.coobo.domain.dto.CategoryRequestDto;
import com.ycs.coobo.domain.dto.CategoryResponseDto;
import com.ycs.coobo.domain.dto.GoodsRequestDto;
import com.ycs.coobo.domain.dto.GoodsResponseDto;
import com.ycs.coobo.domain.dto.ProductRequestDto;
import com.ycs.coobo.domain.dto.ProductResponseDto;
import com.ycs.coobo.domain.dto.QryBrandRequestDto;
import com.ycs.coobo.domain.dto.QryBrandResponseDto;
import com.ycs.coobo.domain.dto.QryCategoryResponseDto;
import com.ycs.coobo.domain.dto.QryCommentResponseDto;
import com.ycs.coobo.domain.dto.QryGoodsRequestDto;
import com.ycs.coobo.domain.dto.QryGoodsResponseDto;
import com.ycs.coobo.domain.dto.QryTopicRequestDto;
import com.ycs.coobo.domain.dto.QryTopicResponseDto;
import com.ycs.coobo.domain.po.AdInfoPo;
import com.ycs.coobo.domain.po.AttributeInfoPo;
import com.ycs.coobo.domain.po.BrandInfoPo;
import com.ycs.coobo.domain.po.CategoryInfoPo;
import com.ycs.coobo.domain.po.ChannelInfoPo;
import com.ycs.coobo.domain.po.CollectInfoPo;
import com.ycs.coobo.domain.po.CommentInfoPo;
import com.ycs.coobo.domain.po.GalleryInfoPo;
import com.ycs.coobo.domain.po.GoodsInfoPo;
import com.ycs.coobo.domain.po.IssueInfoPo;
import com.ycs.coobo.domain.po.ProductInfoPo;
import com.ycs.coobo.domain.po.SpecInfoPo;
import com.ycs.coobo.domain.po.TopicInfoPo;
import com.ycs.coobo.service.IProductInfoService;
import com.ycs.sys.bo.IUserInfoBo;
import com.ycs.sys.domain.po.UserInfoPo;

@Service
public class ProductInfoServiceImpl implements IProductInfoService {
	@Autowired
	private IProductInfoBo productInfoBo;
	@Autowired
	private IAdInfoBo adInfoBo;
	@Autowired
	private IUserInfoBo userInfoBo;

	@Override
	@Transactional(readOnly=true)
	public ProductResponseDto index(ProductRequestDto request) throws HiBusinessReturnException {
		ProductResponseDto response = new ProductResponseDto();
		// 查询产品品牌列表
		List<BrandInfoPo> brandInfoPoLst = productInfoBo.queryBrandLst();
		if (brandInfoPoLst.size() >= 0) {
			response.setBrandList(brandInfoPoLst);
		} else {
			throw new HiBusinessReturnException(HiMsgCdConstants.QUERY_BRANDLST_FAIL, "查询产品品牌列表失败");
		}
		
		// 查询产品频道列表
		List<ChannelInfoPo> channelInfoPoLst = productInfoBo.queryChannelLst();
		if (channelInfoPoLst.size() >= 0) {
			response.setChannelList(channelInfoPoLst);
		} else {
			throw new HiBusinessReturnException(HiMsgCdConstants.QUERY_CHANNELLST_FAIL, "查询产品频道列表失败");
		}
		
		// 查询产品种类列表
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("parentId", 0);
		List<CategoryInfoPo> categoryInfoPoLst = productInfoBo.queryCategoryLst(paramMap);
		if (categoryInfoPoLst.size() >= 0) {
			response.setCategoryList(categoryInfoPoLst);
		} else {
			throw new HiBusinessReturnException(HiMsgCdConstants.QUERY_CATEGORYLST_FAIL, "查询产品种类列表失败");
		}
		
		// 查询主题列表
		List<TopicInfoPo> topicInfoPoLst = productInfoBo.queryTopicLst();
		if (topicInfoPoLst.size() >= 0) {
			response.setTopicList(topicInfoPoLst);
		} else {
			throw new HiBusinessReturnException(HiMsgCdConstants.QUERY_TOPICLST_FAIL, "查询主题列表失败");
		}
		
		// 查询热销商品列表
		List<GoodsInfoPo> hotGoodsInfoPoLst = productInfoBo.queryHotGoodsLst();
		if (hotGoodsInfoPoLst.size() >= 0) {
			response.setHotGoodList(hotGoodsInfoPoLst);
		} else {
			throw new HiBusinessReturnException(HiMsgCdConstants.QUERY_HOT_GOODLST_FAIL, "查询热销商品列表失败");
		}
		
		// 查询新品商品列表
		List<GoodsInfoPo> newGoodsInfoPoLst = productInfoBo.queryNewGoodsLst();
		if (newGoodsInfoPoLst.size() >= 0) {
			response.setNewGoodList(newGoodsInfoPoLst);
		} else {
			throw new HiBusinessReturnException(HiMsgCdConstants.QUERY_HOT_GOODLST_FAIL, "查询热销商品列表失败");
		}
		
		// 查询广告列表
		List<AdInfoPo> adInfoPoLst = adInfoBo.queryAdLst();
		if (adInfoPoLst.size() >= 0) {
			response.setAdList(adInfoPoLst);
		} else {
			throw new HiBusinessReturnException(HiMsgCdConstants.QUERY_ADLST_FAIL, "查询广告列表失败");
		}
		return response;
	}

	@Override
	public QryBrandResponseDto queryBrandPage(QryBrandRequestDto request) throws HiBusinessReturnException {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("name", request.getName());
		paramMap.put("currentPage", request.getCurrentPage());
		paramMap.put("pageSize", request.getPageSize());
		// 首先查询共有多少记录
		int total = productInfoBo.qryBrandCount(paramMap);
		// 计算分页信息
		PageUtil.calculatePageInfo(total, request.getPageSize(), request.getCurrentPage());

		// 分页查询
		List<BrandInfoPo> brandInfoPoLst = productInfoBo.qryBrandLst(paramMap, PageUtil.getStartRow(),
				PageUtil.getOffset());
		// 组装响应信息
		QryBrandResponseDto response = new QryBrandResponseDto();
		response.setBrandList(brandInfoPoLst);
		response.setTotal(total);
		return response;
	}

	@Override
	public BrandResponseDto queryBrandDetail(BrandRequestDto request) throws HiBusinessReturnException {
		BrandResponseDto response = new BrandResponseDto();
		BrandInfoPo brandInfoPo = productInfoBo.queryBrandDetail(request.getId());
		if (!StringUtils.isEmpty(brandInfoPo)){
			response.setData(brandInfoPo);
			return response;
		}
		throw new HiBusinessReturnException(HiMsgCdConstants.QUERY_BRAND_DETAIL_FAIL, "查询产品品牌详细信息失败");
	}

	@Override
	public QryGoodsResponseDto queryGoodsPage(QryGoodsRequestDto request) throws HiBusinessReturnException {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("brandId", request.getBrandId());
		paramMap.put("name", request.getName());
		paramMap.put("currentPage", request.getCurrentPage());
		paramMap.put("pageSize", request.getPageSize());
		// 首先查询共有多少记录
		int total = productInfoBo.qryGoodsCount(paramMap);
		// 计算分页信息
		PageUtil.calculatePageInfo(total, request.getPageSize(), request.getCurrentPage());

		// 分页查询
		List<GoodsInfoPo> goodsInfoPoLst = productInfoBo.qryGoodsLst(paramMap, PageUtil.getStartRow(),
				PageUtil.getOffset());
		// 组装响应信息
		QryGoodsResponseDto response = new QryGoodsResponseDto();
		response.setGoodsList(goodsInfoPoLst);
		response.setTotal(total);
		return response;
	}

	@Override
	public GoodsResponseDto queryGoodsDetail(GoodsRequestDto request) throws HiBusinessReturnException {
		GoodsResponseDto response = new GoodsResponseDto();
		// 查询商品信息
		GoodsInfoPo goodsInfoPo = productInfoBo.queryGoodsDetail(request.getId());
		if (!StringUtils.isEmpty(goodsInfoPo)){
			response.setGoodsInfoPo(goodsInfoPo);
		} else {
			throw new HiBusinessReturnException(HiMsgCdConstants.QUERY_GOODS_DETAIL_FAIL, "查询商品详细信息失败");
		}
		
		// 查询商品品牌信息
		BrandInfoPo brandInfoPo = productInfoBo.queryBrandDetailByGoodsId(request.getId());
		if (!StringUtils.isEmpty(brandInfoPo)){
			response.setBrandInfoPo(brandInfoPo);
		} else {
			throw new HiBusinessReturnException(HiMsgCdConstants.QUERY_BRAND_DETAIL_FAIL, "查询商品品牌详细信息失败");
		}
		
		// 查询商品展览列表
		List<GalleryInfoPo> galleryInfoPoLst = productInfoBo.queryGalleryLstByGoodsId(request.getId());
		if (!CollectionUtils.isEmpty(galleryInfoPoLst)){
			response.setGalleryList(galleryInfoPoLst);
		} else {
			throw new HiBusinessReturnException(HiMsgCdConstants.QUERY_GALLERYLST_FAIL, "查询展览列表信息失败");
		}
		
		// 查询商品属性列表
		List<AttributeInfoPo> attributeInfoPoLst = productInfoBo.queryAttributeLstByGoodsId(request.getId());
		if (!CollectionUtils.isEmpty(attributeInfoPoLst)){
			response.setAttributeList(attributeInfoPoLst);
		} else {
			throw new HiBusinessReturnException(HiMsgCdConstants.QUERY_ATTRIBUTELST_FAIL, "查询商品属性列表信息失败");
		}
		
		// 查询商品问题列表
		List<IssueInfoPo> issueInfoPoLst = productInfoBo.queryIssueLstByGoodsId(request.getId());
		if (issueInfoPoLst.size() >= 0){
			response.setIssueList(issueInfoPoLst);
		} else {
			throw new HiBusinessReturnException(HiMsgCdConstants.QUERY_ISSUELST_FAIL, "查询商品问题列表信息失败");
		}
		
		// 查询商品规格列表
		List<SpecInfoPo> specInfoPoLst = productInfoBo.querySpecLstByGoodsId(request.getId());
		if (specInfoPoLst.size() >= 0){
			response.setSpecList(specInfoPoLst);
		} else {
			throw new HiBusinessReturnException(HiMsgCdConstants.QUERY_GOODS_SPECLST_FAIL, "查询商品规格列表信息失败");
		}
		
		// 查询产品列表
		List<ProductInfoPo> productInfoPoLst = productInfoBo.queryProductLstByGoodsId(request.getId());
		if (!CollectionUtils.isEmpty(productInfoPoLst)){
			response.setProductList(productInfoPoLst);
		} else {
			throw new HiBusinessReturnException(HiMsgCdConstants.QUERY_PRODUCTLST_FAIL, "查询产品列表信息失败");
		}
		
		// 查询商品收藏信息
		CollectInfoPo collectInfoPo = productInfoBo.queryCollectInfoByGoodsId(request.getId());
		if (!StringUtils.isEmpty(goodsInfoPo)){
			response.setCollectInfoPo(collectInfoPo);
		}
		
		// 查询商品评论信息
		CommentInfoPo commentInfoPo = productInfoBo.queryCommentByGoodsId(request.getId());
		if (!StringUtils.isEmpty(commentInfoPo)){
			QryCommentResponseDto comment = new QryCommentResponseDto();
			List<String> picUrlList = productInfoBo.queryCommentPicLst(commentInfoPo.getId());
			UserInfoPo userInfoPo = userInfoBo.queryUserInfoByUsrNo(commentInfoPo.getUsrNo());
			commentInfoPo.setPicUrlList(picUrlList);
			comment.setCommentInfo(commentInfoPo);
			comment.setUserInfo(userInfoPo);
			response.setComment(comment);
		} 
		
		return response;
	}

	@Override
	public QryCategoryResponseDto queryCategoryLst(CategoryRequestDto request) throws HiBusinessReturnException {
		// 查询商品分类目录列表
		QryCategoryResponseDto response = new QryCategoryResponseDto();
		Map<String, Object> paramMap = new HashMap<>();
		int id = request.getId();
		if (0 == id) {
			paramMap.put("parentId", 0);
		} else {
			paramMap.put("parentId", id);
		}
		List<CategoryInfoPo> categoryInfoPoLst = productInfoBo.queryCategoryLst(paramMap);
		if (!CollectionUtils.isEmpty(categoryInfoPoLst)){
			response.setCategoryList(categoryInfoPoLst);
		} else {
			throw new HiBusinessReturnException(HiMsgCdConstants.QUERY_GOODS_CATEGORYLST_FAIL, "查询商品目录列表信息失败");
		}
		return response;
	}

	@Override
	public CategoryResponseDto queryCategoryDetail(CategoryRequestDto request) throws HiBusinessReturnException {
		CategoryResponseDto response = new CategoryResponseDto();
		// 查询商品分类目录详细信息
		CategoryInfoPo categoryInfoPo = productInfoBo.queryCategoryDetail(request.getId());
		if (!StringUtils.isEmpty(categoryInfoPo)){
			response.setData(categoryInfoPo);
		} else {
			throw new HiBusinessReturnException(HiMsgCdConstants.QUERY_GOODS_CATEGORYDETAIL_FAIL, "查询商品目录详细信息失败");
		}
		return response;
	}

	@Override
	public QryTopicResponseDto queryTopicPage(QryTopicRequestDto request) throws HiBusinessReturnException {
		// 查询专题信息列表
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("name", request.getName());
		paramMap.put("currentPage", request.getCurrentPage());
		paramMap.put("pageSize", request.getPageSize());
		// 首先查询共有多少记录
		int total = productInfoBo.qryTopicCount(paramMap);
		// 计算分页信息
		PageUtil.calculatePageInfo(total, request.getPageSize(), request.getCurrentPage());

		// 分页查询
		List<TopicInfoPo> topicInfoPoLst = productInfoBo.qryTopicLst(paramMap, PageUtil.getStartRow(),
				PageUtil.getOffset());
		// 组装响应信息
		QryTopicResponseDto response = new QryTopicResponseDto();
		response.setTopicList(topicInfoPoLst);
		response.setTotal(total);
		return response;
	}

	
	
	
}
