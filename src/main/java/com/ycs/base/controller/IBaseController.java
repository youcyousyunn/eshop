package com.ycs.base.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

import com.ycs.basbo.constants.Constants;
import com.ycs.sys.domain.dto.LoginResponseDto;

/**
 * 自定义基类Controller
 * @author youcyousyunn
 * @date 2018年2月9日
 */
public class IBaseController {
	
	@Autowired
	private HttpServletRequest request;
	
	/**
	 * 设置登录session
	 * @param loginResponse 登录请求
	 * @return Object
	 */
	public Map<String, Object> setLoginSession(LoginResponseDto loginResponse) {
		Map<String, Object> sessionMap = new HashMap<String, Object>();
		sessionMap.put(Constants.USER_SESSION_USRNO, loginResponse.getData().getUsrNo());
        sessionMap.put(Constants.USER_SESSION_USERNAME, loginResponse.getData().getUsrNm());
        return sessionMap;
	}
	
	
}
