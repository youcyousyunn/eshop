package com.ycs.sys.domain.dto;

import java.util.Date;

import org.apache.commons.lang.StringUtils;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ycs.base.domain.dto.BaseRequestDto;

/**
 * 登录请求DTO
 * @author youcyousyunn
 * @date 2018年2月11日
 */
public class LoginRequestDto extends BaseRequestDto {
	private String usrNm;  //用户名称
    private String usrPwd;  //密码
    private int sex;  //性别
    @JsonFormat(pattern="yyyy-MM-dd", timezone="GMT+8")
    private Date birthday;  //出生日期
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date registerTime;  //注册时间
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date lastLoginTime;  //最后一次登录时间
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date lastLoginIp;  //最后一次登录IP
    private int usrLevelId;  //用户等级ID
    private String nickName;  //昵称
    private String mobile;  //手机号码
    private String avatar;  //头像
    private String openId;  //用户标识
    
    /**
     * 构造函数
     */
	public LoginRequestDto() {
	}

	public String getUsrNm() {
		return usrNm;
	}

	public void setUsrNm(String usrNm) {
		this.usrNm = usrNm;
	}

	public String getUsrPwd() {
		return usrPwd;
	}

	public void setUsrPwd(String usrPwd) {
		this.usrPwd = usrPwd;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Date getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(Date lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public int getUsrLevelId() {
		return usrLevelId;
	}

	public void setUsrLevelId(int usrLevelId) {
		this.usrLevelId = usrLevelId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	/**
	 * 接口报文请求检查
	 * @param
	 * @return boolean
	 */
	public boolean checkRequestDto() {
        if (null == nickName || StringUtils.isBlank(nickName)) {
            return false;
        }
        return true;
    }
	

}
