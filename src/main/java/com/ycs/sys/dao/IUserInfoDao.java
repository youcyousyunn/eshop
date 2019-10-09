package com.ycs.sys.dao;

import com.ycs.sys.domain.po.UserInfoPo;

/**
 * 用户信息DAO接口
 * @author youcyousyunn
 * @date 2018年1月28日
 */
public interface IUserInfoDao {
	UserInfoPo queryByLoginName(String loginNm);
	int register(UserInfoPo userInfoPo);
	UserInfoPo queryUserInfo(UserInfoPo userInfoPo);
	UserInfoPo queryUserInfoByUsrNo(String usrNo);

	
	
}
