package com.ycs.coobo.bo;

import java.util.List;

import com.ycs.base.annotation.HiBoMethod;
import com.ycs.coobo.domain.po.AdInfoPo;

/**
 * 广告信息BO接口
 * @author youcyousyunn
 * @date 2018年1月28日
 */
public interface IAdInfoBo {

	@HiBoMethod
	List<AdInfoPo> queryAdLst();
	
	
	
}
