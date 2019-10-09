package com.ycs.sys.domain.dto;

import java.util.List;

import com.ycs.base.domain.dto.BaseResponseDto;
import com.ycs.sys.domain.po.RegionInfoPo;

/**
 * 查询区域列表信息响应DTO
 * @author youcyousyunn
 * @date 2018年3月14日
 */
public class QueryRegionInfoResponseDto extends BaseResponseDto {

	/**
     * 区域地址信息
     */
    private List<RegionInfoPo> data;

    public QueryRegionInfoResponseDto() {
    }
    
    public QueryRegionInfoResponseDto(String responseCode, String responseInfo) {
        super(responseCode, responseInfo);
    }

	public List<RegionInfoPo> getData() {
		return data;
	}

	public void setData(List<RegionInfoPo> data) {
		this.data = data;
	}
    

}
