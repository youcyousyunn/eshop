package com.ycs.sys.domain.dto;

import java.util.List;

import com.ycs.base.domain.dto.BaseResponseDto;
import com.ycs.sys.domain.po.CouponInfoPo;

/**
 * 查询用户所有优惠券信息响应DTO
 * @author youcyousyunn
 * @date 2018年3月14日
 */
public class QueryCouponInfoResponseDto extends BaseResponseDto {

	/**
     * 优惠券信息
     */
    private List<CouponInfoPo> data;

    public QueryCouponInfoResponseDto() {
    }
    
    public QueryCouponInfoResponseDto(String responseCode, String responseInfo) {
        super(responseCode, responseInfo);
    }

	public List<CouponInfoPo> getData() {
		return data;
	}

	public void setData(List<CouponInfoPo> data) {
		this.data = data;
	}
    

}
