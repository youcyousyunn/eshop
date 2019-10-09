package com.ycs.sys.domain.dto;

import com.ycs.base.domain.dto.BaseRequestDto;

/**
 * 修改收货地址请求DTO
 * @author youcyousyunn
 * @date 2018年3月14日
 */
public class UpdateAddressInfoRequestDto extends BaseRequestDto {
	private int id; //地址Id
	private String name;  //名称
	private int countryId;  //国家ID
	private int provinceId;  //省份ID
	private int cityId;  //城市ID
    private int districtId;  //地区ID
    private String provinceNm; //省份名称
    private String cityNm; //城市名称
    private String districtNm; //地区名称
    private String address;  //详细地址
    private String mobile;  //手机号码
    private int isDefault;  //是否默认
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public int getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public int getDistrictId() {
		return districtId;
	}
	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}
	public String getProvinceNm() {
		return provinceNm;
	}
	public void setProvinceNm(String provinceNm) {
		this.provinceNm = provinceNm;
	}
	public String getCityNm() {
		return cityNm;
	}
	public void setCityNm(String cityNm) {
		this.cityNm = cityNm;
	}
	public String getDistrictNm() {
		return districtNm;
	}
	public void setDistrictNm(String districtNm) {
		this.districtNm = districtNm;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(int isDefault) {
		this.isDefault = isDefault;
	}
    
	
}
