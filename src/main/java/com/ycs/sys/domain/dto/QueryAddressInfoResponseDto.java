package com.ycs.sys.domain.dto;

import java.util.List;

import com.ycs.base.domain.dto.BaseResponseDto;
import com.ycs.sys.domain.po.AddressInfoPo;

/**
 * 查询用户所有收货地址信息响应DTO
 * @author youcyousyunn
 * @date 2018年3月14日
 */
public class QueryAddressInfoResponseDto extends BaseResponseDto {

	/**
     * 收货地址信息
     */
    private List<AddressInfoPo> data;

    public QueryAddressInfoResponseDto() {
    }
    
    public QueryAddressInfoResponseDto(String responseCode, String responseInfo) {
        super(responseCode, responseInfo);
    }

	public List<AddressInfoPo> getData() {
		return data;
	}

	public void setData(List<AddressInfoPo> data) {
		this.data = data;
	}
    

}
