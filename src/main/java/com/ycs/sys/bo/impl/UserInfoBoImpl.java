package com.ycs.sys.bo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ycs.sys.bo.IUserInfoBo;
import com.ycs.sys.dao.IUserInfoDao;
import com.ycs.sys.domain.po.UserInfoPo;

/**
 * 用户信息BO实现类
 * @author youcyousyunn
 * @date 2018年1月28日
 */
@Component
public class UserInfoBoImpl implements IUserInfoBo {

	@Autowired 
	IUserInfoDao userInfoDao;

	@Override
	public UserInfoPo queryByLoginName(String loginNm) {
		return userInfoDao.queryByLoginName(loginNm);
	}

	@Override
	public boolean register(UserInfoPo userInfoPo) {
		int result = userInfoDao.register(userInfoPo);
		if (1 == result){
			return true;
		}
		return false;
	}

	@Override
	public UserInfoPo queryUserInfo(UserInfoPo userInfoPo) {
		return userInfoDao.queryUserInfo(userInfoPo);
	}

	@Override
	public UserInfoPo queryUserInfoByUsrNo(String usrNo) {
		return userInfoDao.queryUserInfoByUsrNo(usrNo);
	}
	
	

	
}
