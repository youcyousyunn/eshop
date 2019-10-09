package com.ycs.coobo.bo.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ycs.coobo.bo.IProductInfoBo;
import com.ycs.coobo.dao.IProductInfoDao;
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

/**
 * 产品信息BO接口实现类
 * @author youcyousyunn
 * @date 2018年1月28日
 */
@Component
public class ProductInfoBoImpl implements IProductInfoBo {

	@Autowired 
	IProductInfoDao productInfoDao;

	@Override
	public List<BrandInfoPo> queryBrandLst() {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("isNew", 1);
		return productInfoDao.queryBrandLst(paramMap);
	}

	@Override
	public List<ChannelInfoPo> queryChannelLst() {
		return productInfoDao.queryChannelLst();
	}

	@Override
	public List<CategoryInfoPo> queryCategoryLst(Map<String, Object> paramMap) {
		return productInfoDao.queryCategoryLst(paramMap);
	}

	@Override
	public List<TopicInfoPo> queryTopicLst() {
		return productInfoDao.queryTopicLst();
	}

	@Override
	public List<GoodsInfoPo> queryHotGoodsLst() {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("isHot", 1);
		return productInfoDao.queryHotGoodsLst(paramMap);
	}

	@Override
	public List<GoodsInfoPo> queryNewGoodsLst() {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("isNew", 1);
		return productInfoDao.queryNewGoodsLst(paramMap);
	}

	@Override
	public int qryBrandCount(Map<String, Object> paramMap) {
		return productInfoDao.qryBrandCount(paramMap);
	}

	@Override
	public List<BrandInfoPo> qryBrandLst(Map<String, Object> paramMap, Integer startRow, Integer offset) {
		paramMap.put("startRow", startRow);
		paramMap.put("offset", offset);
		return productInfoDao.qryBrandLst(paramMap);
	}
	
	@Override
	public BrandInfoPo queryBrandDetail(int id) {
		return productInfoDao.queryBrandDetail(id);
	}

	@Override
	public BrandInfoPo queryBrandDetailByGoodsId(int goodsId) {
		return productInfoDao.queryBrandDetailByGoodsId(goodsId);
	}

	@Override
	public int qryGoodsCount(Map<String, Object> paramMap) {
		return productInfoDao.qryGoodsCount(paramMap);
	}

	@Override
	public List<GoodsInfoPo> qryGoodsLst(Map<String, Object> paramMap, Integer startRow, Integer offset) {
		paramMap.put("startRow", startRow);
		paramMap.put("offset", offset);
		return productInfoDao.qryGoodsLst(paramMap);
	}

	@Override
	public GoodsInfoPo queryGoodsDetail(int id) {
		return productInfoDao.queryGoodsDetail(id);
	}

	@Override
	public List<GalleryInfoPo> queryGalleryLstByGoodsId(int goodsId) {
		return productInfoDao.queryGalleryLstByGoodsId(goodsId);
	}

	@Override
	public List<AttributeInfoPo> queryAttributeLstByGoodsId(int goodsId) {
		return productInfoDao.queryAttributeLstByGoodsId(goodsId);
	}

	@Override
	public List<IssueInfoPo> queryIssueLstByGoodsId(int goodsId) {
		return productInfoDao.queryIssueLstByGoodsId(goodsId);
	}

	@Override
	public List<ProductInfoPo> queryProductLstByGoodsId(int goodsId) {
		return productInfoDao.queryProductLstByGoodsId(goodsId);
	}

	@Override
	public CollectInfoPo queryCollectInfoByGoodsId(int goodsId) {
		return productInfoDao.queryCollectInfoByGoodsId(goodsId);
	}

	@Override
	public List<SpecInfoPo> querySpecLstByGoodsId(int goodsId) {
		return productInfoDao.querySpecLstByGoodsId(goodsId);
	}

	@Override
	public CommentInfoPo queryCommentByGoodsId(int goodsId) {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("goodsId", goodsId);
		paramMap.put("type", 0);
		return productInfoDao.queryCommentByGoodsId(paramMap);
	}

	@Override
	public List<String> queryCommentPicLst(int id) {
		return productInfoDao.queryCommentPicLst(id);
	}

	@Override
	public CategoryInfoPo queryCategoryDetail(int id) {
		return productInfoDao.queryCategoryDetail(id);
	}

	@Override
	public int qryTopicCount(Map<String, Object> paramMap) {
		return productInfoDao.qryTopicCount(paramMap);
	}

	@Override
	public List<TopicInfoPo> qryTopicLst(Map<String, Object> paramMap, Integer startRow, Integer offset) {
		paramMap.put("startRow", startRow);
		paramMap.put("offset", offset);
		return productInfoDao.qryTopicLst(paramMap);
	}




	
}
