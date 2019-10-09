package com.ycs.coobo.domain.dto;

import java.util.List;

import com.ycs.base.domain.dto.BaseResponseDto;
import com.ycs.coobo.domain.po.TopicInfoPo;

/**
 * 分页查询专题返回信息DTO
 * @author youcyousyunn
 * @date 2018年2月9日
 */
public class QryTopicResponseDto extends BaseResponseDto {
	//总数
	private Integer total;
	//列表数据
	private List<TopicInfoPo> topicList;
    
	/**
	 * 构造函数
	 */
	public QryTopicResponseDto(){
	}
	
	/**
	 * 构造函数
	 * @param code
	 * @param info
	 */
	public QryTopicResponseDto(String code, String info) {
		this.rspCd = code;
		this.rspInf = info;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<TopicInfoPo> getTopicList() {
		return topicList;
	}

	public void setTopicList(List<TopicInfoPo> topicList) {
		this.topicList = topicList;
	}


}
