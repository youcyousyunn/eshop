package com.ycs.sys.domain.dto;

import com.ycs.base.domain.dto.BaseResponseDto;
import com.ycs.sys.domain.po.UserInfoPo;

/**
 * 用户登录返回信息DTO
 * @author youcyousyunn
 * @date 2018年2月9日
 */
public class LoginResponseDto extends BaseResponseDto {
	private UserInfoPo data;
	private String sessionId;
    
	/**
	 * 构造函数
	 */
	public LoginResponseDto(){
	}
	
	/**
	 * 构造函数
	 * @param code
	 * @param info
	 */
	public LoginResponseDto(String code, String info) {
		this.rspCd = code;
		this.rspInf = info;
	}

	public UserInfoPo getData() {
		return data;
	}

	public void setData(UserInfoPo data) {
		this.data = data;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
    

}
