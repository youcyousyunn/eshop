package com.ycs.coobo.dao;

import java.util.List;
import java.util.Map;

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
import com.ycs.sys.domain.po.UserInfoPo;

/**
 * 产品信息DAO接口
 * @author youcyousyunn
 * @date 2018年1月28日
 */
public interface IProductInfoDao {
	List<BrandInfoPo> queryBrandLst(Map<String, Object> paramMap);
	List<ChannelInfoPo> queryChannelLst();
	List<CategoryInfoPo> queryCategoryLst(Map<String, Object> paramMap);
	List<TopicInfoPo> queryTopicLst();
	List<GoodsInfoPo> queryHotGoodsLst(Map<String, Object> paramMap);
	List<GoodsInfoPo> queryNewGoodsLst(Map<String, Object> paramMap);
	int qryBrandCount(Map<String, Object> paramMap);
	List<BrandInfoPo> qryBrandLst(Map<String, Object> paramMap);
	BrandInfoPo queryBrandDetail(int id);
	BrandInfoPo queryBrandDetailByGoodsId(int goodsId);
	int qryGoodsCount(Map<String, Object> paramMap);
	List<GoodsInfoPo> qryGoodsLst(Map<String, Object> paramMap);
	GoodsInfoPo queryGoodsDetail(int id);
	List<GalleryInfoPo> queryGalleryLstByGoodsId(int goodsId);
	List<AttributeInfoPo> queryAttributeLstByGoodsId(int goodsId);
	List<IssueInfoPo> queryIssueLstByGoodsId(int goodsId);
	List<ProductInfoPo> queryProductLstByGoodsId(int goodsId);
	CollectInfoPo queryCollectInfoByGoodsId(int goodsId);
	List<SpecInfoPo> querySpecLstByGoodsId(int goodsId);
	CommentInfoPo queryCommentByGoodsId(Map<String, Object> paramMap);
	List<String> queryCommentPicLst(int id);
	CategoryInfoPo queryCategoryDetail(int id);
	int qryTopicCount(Map<String, Object> paramMap);
	List<TopicInfoPo> qryTopicLst(Map<String, Object> paramMap);

	
	
	
}
