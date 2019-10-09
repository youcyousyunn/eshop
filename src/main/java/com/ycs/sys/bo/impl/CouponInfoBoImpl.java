package com.ycs.sys.bo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ycs.sys.bo.ICouponInfoBo;
import com.ycs.sys.dao.ICouponInfoDao;
import com.ycs.sys.domain.po.CouponInfoPo;

/**
 * 优惠券BO实现类
 * @author youcyousyunn
 * @date 2018年1月28日
 */
@Component
public class CouponInfoBoImpl implements ICouponInfoBo {

	/**
	 * 优惠券信息Dao
	 */
	@Autowired 
	ICouponInfoDao couponInfoDao;

	@Override
	public List<CouponInfoPo> queryCouponLst(String usrNo) {
		return couponInfoDao.queryCouponLst(usrNo);
	}

	
}
