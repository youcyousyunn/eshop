package com.ycs.sys.domain.dto;

import com.ycs.base.domain.dto.BaseResponseDto;

/**
 * 删除收货地址信息响应DTO
 * @author youcyousyunn
 * @date 2018年3月14日
 */
public class DeleteAddressInfoResponseDto extends BaseResponseDto {

    public DeleteAddressInfoResponseDto() {
    }
    
    public DeleteAddressInfoResponseDto(String responseCode, String responseInfo) {
        super(responseCode, responseInfo);
    }
    

}
