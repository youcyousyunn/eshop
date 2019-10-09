package com.ycs.sys.service;

import com.ycs.base.exception.HiBusinessReturnException;
import com.ycs.base.exception.HiException;
import com.ycs.sys.domain.dto.AddAddressInfoRequestDto;
import com.ycs.sys.domain.dto.AddAddressInfoResponseDto;
import com.ycs.sys.domain.dto.AddressInfoResponseDto;
import com.ycs.sys.domain.dto.DeleteAddressInfoRequestDto;
import com.ycs.sys.domain.dto.DeleteAddressInfoResponseDto;
import com.ycs.sys.domain.dto.LoginRequestDto;
import com.ycs.sys.domain.dto.LoginResponseDto;
import com.ycs.sys.domain.dto.QueryAddressInfoRequestDto;
import com.ycs.sys.domain.dto.QueryAddressInfoResponseDto;
import com.ycs.sys.domain.dto.QueryCouponInfoRequestDto;
import com.ycs.sys.domain.dto.QueryCouponInfoResponseDto;
import com.ycs.sys.domain.dto.QueryRegionInfoRequestDto;
import com.ycs.sys.domain.dto.QueryRegionInfoResponseDto;
import com.ycs.sys.domain.dto.QueryUserInfoRequestDto;
import com.ycs.sys.domain.dto.QueryUserInfoResponseDto;
import com.ycs.sys.domain.dto.UpdateAddressInfoRequestDto;
import com.ycs.sys.domain.dto.UpdateAddressInfoResponseDto;

public interface IUserInfoService {
	
	/**
	 * 登录
	 * @param loginRequest
	 * @return LoginResponseDto
	 * @throws HiBusinessReturnException
	 */
	LoginResponseDto loginByWeixin(LoginRequestDto loginRequest) throws HiBusinessReturnException;

	/**
     * 查询用户资料
     * @param request
     * @return QueryUserInfoResponseDto
     */
	QueryUserInfoResponseDto queryUserInfo(QueryUserInfoRequestDto request) throws HiBusinessReturnException;

	/** 
     * 查询用户所有收货地址
     * @param request
     * @return QueryAddressInfoResponseDto
     */
	QueryAddressInfoResponseDto queryAddressLst(QueryAddressInfoRequestDto request) throws HiBusinessReturnException;

	/**
     * 查询用户所有优惠券
     * @param request
     * @return QueryCouponInfoResponseDto
     */
	QueryCouponInfoResponseDto queryCouponLst(QueryCouponInfoRequestDto request) throws HiBusinessReturnException;

	/**
     * 查询区域列表
     * @param request
     * @return QueryRegionInfoResponseDto
     */
	QueryRegionInfoResponseDto queryRegionLst(QueryRegionInfoRequestDto request) throws HiBusinessReturnException;

	/**
     * 查询收货地址详情
     * @param request
     * @return AddressInfoResponseDto
     * @throws HiException
     */
	AddressInfoResponseDto getAddressDetail(QueryAddressInfoRequestDto request) throws HiBusinessReturnException;

	/**
     * 新增收货地址
     * @param request
     * @return AddAddressInfoResponseDto
     * @throws HiException
     */
	AddAddressInfoResponseDto saveAddress(AddAddressInfoRequestDto request) throws HiBusinessReturnException;

	/**
     * 修改收货地址
     * @param request
     * @return UpdateAddressInfoResponseDto
     * @throws HiException
     */
	UpdateAddressInfoResponseDto updateAddress(UpdateAddressInfoRequestDto request) throws HiBusinessReturnException;

	/**
     * 删除收货地址
     * @param request
     * @return DeleteAddressInfoResponseDto
     * @throws HiException
     */
	DeleteAddressInfoResponseDto deleteAddress(DeleteAddressInfoRequestDto request) throws HiBusinessReturnException;

	
	
	
}
