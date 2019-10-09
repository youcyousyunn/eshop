package com.ycs.coobo.dao;

import java.util.List;
import java.util.Map;

import com.ycs.coobo.domain.po.AdInfoPo;

/**
 * 广告信息DAO接口
 * @author youcyousyunn
 * @date 2018年1月28日
 */
public interface IAdInfoDao {
	List<AdInfoPo> queryAdLst(Map<String, Object> paramMap);
	
	
}
