package com.ycs.sys.dao;

import java.util.List;

import com.ycs.sys.domain.po.CouponInfoPo;

/**
 * 优惠券信息DAO接口
 * @author youcyousyunn
 * @date 2018年1月28日
 */
public interface ICouponInfoDao {
	List<CouponInfoPo> queryCouponLst(String usrNo);

	
}
