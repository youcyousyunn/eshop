package com.ycs.coobo.domain.dto;

import java.util.List;

import com.ycs.base.domain.dto.BaseResponseDto;
import com.ycs.coobo.domain.po.CartInfoPo;

/**
 * 查询购物车返回信息DTO
 * @author youcyousyunn
 * @date 2018年2月9日
 */
public class QryCartResponseDto extends BaseResponseDto {
	//总数
	private Integer total;
	//列表数据
	private List<CartInfoPo> cartList;
    
	/**
	 * 构造函数
	 */
	public QryCartResponseDto(){
	}
	
	/**
	 * 构造函数
	 * @param code
	 * @param info
	 */
	public QryCartResponseDto(String code, String info) {
		this.rspCd = code;
		this.rspInf = info;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<CartInfoPo> getCartList() {
		return cartList;
	}

	public void setCartList(List<CartInfoPo> cartList) {
		this.cartList = cartList;
	}


}
