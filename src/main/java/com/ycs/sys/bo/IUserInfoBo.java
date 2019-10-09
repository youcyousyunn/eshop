package com.ycs.sys.bo;

import com.ycs.base.annotation.HiBoMethod;
import com.ycs.sys.domain.po.UserInfoPo;

/**
 * 用户信息BO接口
 * @author youcyousyunn
 * @date 2018年1月28日
 */
public interface IUserInfoBo {

	/**
	 * 根据登录名查询用户信息
	 * @param loginName 请求
	 * @return UserInfoPo 返回结果
	 */
	@HiBoMethod
	UserInfoPo queryByLoginName(String loginNm);

	/**
	 * 注册用户信息
	 * @param userInfoPo
	 * @return boolean
	 */
	@HiBoMethod
	boolean register(UserInfoPo userInfoPo);

	@HiBoMethod
	UserInfoPo queryUserInfo(UserInfoPo userInfoPo);

	@HiBoMethod
	UserInfoPo queryUserInfoByUsrNo(String usrNo);

	
}
