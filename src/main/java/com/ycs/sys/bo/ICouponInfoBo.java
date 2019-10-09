package com.ycs.sys.bo;

import java.util.List;

import com.ycs.base.annotation.HiBoMethod;
import com.ycs.sys.domain.po.CouponInfoPo;

/**
 * 优惠券信息BO接口
 * @author youcyousyunn
 * @date 2018年1月28日
 */
public interface ICouponInfoBo {

	/**
	 * 查询用户优惠券列表
	 * @param usrNo
	 * @return List<CouponInfoPo>
	 */
	@HiBoMethod
	List<CouponInfoPo> queryCouponLst(String usrNo);

	
}
