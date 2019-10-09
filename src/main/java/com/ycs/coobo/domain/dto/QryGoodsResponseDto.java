package com.ycs.coobo.domain.dto;

import java.util.List;

import com.ycs.base.domain.dto.BaseResponseDto;
import com.ycs.coobo.domain.po.GoodsInfoPo;

/**
 * 分页查询商品返回信息DTO
 * @author youcyousyunn
 * @date 2018年2月9日
 */
public class QryGoodsResponseDto extends BaseResponseDto {
	//总数
	private Integer total;
	//列表数据
	private List<GoodsInfoPo> goodsList;
    
	/**
	 * 构造函数
	 */
	public QryGoodsResponseDto(){
	}
	
	/**
	 * 构造函数
	 * @param code
	 * @param info
	 */
	public QryGoodsResponseDto(String code, String info) {
		this.rspCd = code;
		this.rspInf = info;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<GoodsInfoPo> getGoodsList() {
		return goodsList;
	}

	public void setGoodsList(List<GoodsInfoPo> goodsList) {
		this.goodsList = goodsList;
	}


}
