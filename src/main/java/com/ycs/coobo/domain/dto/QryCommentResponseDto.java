package com.ycs.coobo.domain.dto;

import com.ycs.base.domain.dto.BaseResponseDto;
import com.ycs.coobo.domain.po.CommentInfoPo;
import com.ycs.sys.domain.po.UserInfoPo;

/**
 * 查询商品评论综合信息返回DTO
 * @author youcyousyunn
 * @date 2018年2月9日
 */
public class QryCommentResponseDto extends BaseResponseDto {
	//总评论数
	private Integer count;
	//评论数据
	private CommentInfoPo commentInfo;
	//用户数据
	private UserInfoPo userInfo;
    
	/**
	 * 构造函数
	 */
	public QryCommentResponseDto(){
	}
	
	/**
	 * 构造函数
	 * @param code
	 * @param info
	 */
	public QryCommentResponseDto(String code, String info) {
		this.rspCd = code;
		this.rspInf = info;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public CommentInfoPo getCommentInfo() {
		return commentInfo;
	}

	public void setCommentInfo(CommentInfoPo commentInfo) {
		this.commentInfo = commentInfo;
	}

	public UserInfoPo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfoPo userInfo) {
		this.userInfo = userInfo;
	}


}
