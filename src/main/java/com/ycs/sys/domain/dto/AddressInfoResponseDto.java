package com.ycs.sys.domain.dto;

import com.ycs.base.domain.dto.BaseResponseDto;
import com.ycs.sys.domain.po.AddressInfoPo;

/**
 * 查询收货地址详细信息响应DTO
 * @author youcyousyunn
 * @date 2018年3月14日
 */
public class AddressInfoResponseDto extends BaseResponseDto {

	/**
     * 收货地址信息
     */
    private AddressInfoPo data;

    public AddressInfoResponseDto() {
    }
    
    public AddressInfoResponseDto(String responseCode, String responseInfo) {
        super(responseCode, responseInfo);
    }

	public AddressInfoPo getData() {
		return data;
	}

	public void setData(AddressInfoPo data) {
		this.data = data;
	}
    

}
