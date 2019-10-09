package com.ycs.coobo.bo.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ycs.coobo.bo.IAdInfoBo;
import com.ycs.coobo.dao.IAdInfoDao;
import com.ycs.coobo.domain.po.AdInfoPo;

/**
 * 广告信息BO接口实现类
 * @author youcyousyunn
 * @date 2018年1月28日
 */
@Component
public class AdInfoBoImpl implements IAdInfoBo {

	@Autowired 
	IAdInfoDao adInfoDao;

	@Override
	public List<AdInfoPo> queryAdLst() {
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("adPositionId", 1);
		return adInfoDao.queryAdLst(paramMap);
	}



	
}
