package com.ycs.coobo.bo;

import java.util.List;
import java.util.Map;

import com.ycs.base.annotation.HiBoMethod;
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
 * 产品信息BO接口
 * @author youcyousyunn
 * @date 2018年1月28日
 */
public interface IProductInfoBo {

	@HiBoMethod
	List<BrandInfoPo> queryBrandLst();
	
	@HiBoMethod
	List<ChannelInfoPo> queryChannelLst();
	
	@HiBoMethod
	List<CategoryInfoPo> queryCategoryLst(Map<String, Object> paramMap);
	
	@HiBoMethod
	List<TopicInfoPo> queryTopicLst();
	
	@HiBoMethod
	List<GoodsInfoPo> queryHotGoodsLst();
	
	@HiBoMethod
	List<GoodsInfoPo> queryNewGoodsLst();
	
	@HiBoMethod
	int qryBrandCount(Map<String, Object> paramMap);
	
	@HiBoMethod
	List<BrandInfoPo> qryBrandLst(Map<String, Object> paramMap, Integer startRow, Integer offset);

	@HiBoMethod
	BrandInfoPo queryBrandDetail(int id);
	
	@HiBoMethod
	BrandInfoPo queryBrandDetailByGoodsId(int goodsId);

	@HiBoMethod
	int qryGoodsCount(Map<String, Object> paramMap);

	@HiBoMethod
	List<GoodsInfoPo> qryGoodsLst(Map<String, Object> paramMap, Integer startRow, Integer offset);
	
	@HiBoMethod
	GoodsInfoPo queryGoodsDetail(int id);

	@HiBoMethod
	List<GalleryInfoPo> queryGalleryLstByGoodsId(int goodsId);

	@HiBoMethod
	List<AttributeInfoPo> queryAttributeLstByGoodsId(int goodsId);

	@HiBoMethod
	List<IssueInfoPo> queryIssueLstByGoodsId(int goodsId);

	@HiBoMethod
	List<ProductInfoPo> queryProductLstByGoodsId(int goodsId);

	@HiBoMethod
	CollectInfoPo queryCollectInfoByGoodsId(int goodsId);

	@HiBoMethod
	List<SpecInfoPo> querySpecLstByGoodsId(int goodsId);

	@HiBoMethod
	CommentInfoPo queryCommentByGoodsId(int goodsId);

	@HiBoMethod
	List<String> queryCommentPicLst(int id);

	@HiBoMethod
	CategoryInfoPo queryCategoryDetail(int id);

	@HiBoMethod
	int qryTopicCount(Map<String, Object> paramMap);

	@HiBoMethod
	List<TopicInfoPo> qryTopicLst(Map<String, Object> paramMap, Integer startRow, Integer offset);


	
	
	
}
