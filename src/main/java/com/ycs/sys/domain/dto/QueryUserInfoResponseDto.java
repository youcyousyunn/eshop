package com.ycs.sys.domain.dto;

import com.ycs.base.domain.dto.BaseResponseDto;
import com.ycs.sys.domain.po.UserInfoPo;

/**
 * 查询用户信息响应DTO
 * @author youcyousyunn
 * @date 2018年3月14日
 */
public class QueryUserInfoResponseDto extends BaseResponseDto {

	/**
     * 用户信息
     */
    private UserInfoPo data;


    /**
     * 构造函数
     */
    public QueryUserInfoResponseDto() {
    }
    
    /**
     * 构造函数
     * @param responseCode 响应代码
     * @param responseInfo 响应信息
     */
    public QueryUserInfoResponseDto(String responseCode, String responseInfo) {
        super(responseCode, responseInfo);
    }

	public UserInfoPo getData() {
		return data;
	}

	public void setData(UserInfoPo data) {
		this.data = data;
	}


}
