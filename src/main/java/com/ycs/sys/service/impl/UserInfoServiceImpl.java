package com.ycs.sys.service.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.ycs.basbo.constants.Constants;
import com.ycs.basbo.constants.HiMsgCdConstants;
import com.ycs.basbo.utils.JrnGenerator;
import com.ycs.base.domain.dto.BaseDto;
import com.ycs.base.domain.dto.BaseResponseDto;
import com.ycs.base.exception.HiBusinessReturnException;
import com.ycs.base.exception.HiException;
import com.ycs.sys.bo.IAddressInfoBo;
import com.ycs.sys.bo.ICouponInfoBo;
import com.ycs.sys.bo.IUserInfoBo;
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
import com.ycs.sys.domain.po.AddressInfoPo;
import com.ycs.sys.domain.po.CouponInfoPo;
import com.ycs.sys.domain.po.RegionInfoPo;
import com.ycs.sys.domain.po.UserInfoPo;
import com.ycs.sys.service.IUserInfoService;

@Service
public class UserInfoServiceImpl implements IUserInfoService {
	@Autowired
	private IUserInfoBo userInfoBo;
	@Autowired
	private IAddressInfoBo addressInfoBo;
	@Autowired
	private ICouponInfoBo couponInfoBo;

	@Override
	public LoginResponseDto loginByWeixin(LoginRequestDto loginRequest) throws HiBusinessReturnException {
		LoginResponseDto response =  new LoginResponseDto();
		try {
			UserInfoPo userInfoPo = BaseResponseDto.trans2Entity(loginRequest, UserInfoPo.class);
			if (null != userInfoPo) {
				String nickName = userInfoPo.getNickName().replaceAll("\\s*", "");
				// 1, 目前暂且根据用户昵称查询数据库中有无该昵称的用户
				userInfoPo.setNickName(nickName);
				UserInfoPo userInfo = userInfoBo.queryUserInfo(userInfoPo);
				if(!StringUtils.isEmpty(userInfo)) {
					response.setData(userInfo);
					return response;
				} else {
					userInfoPo.setUsrNo(Constants.USER + JrnGenerator.genUsrNo());
					userInfoPo.setUsrNm(nickName);
					boolean result = userInfoBo.register(userInfoPo);
					if (result) {
						response.setData(userInfoPo);
						return response;
					}
				}
	        }
		} catch (HiException e) {
			e.printStackTrace();
		}
        throw new HiBusinessReturnException(HiMsgCdConstants.LOGIN_BY_WEIXIN_FAIL, "使用微信登录失败");
	}

	@Override
	public QueryUserInfoResponseDto queryUserInfo(QueryUserInfoRequestDto request) throws HiBusinessReturnException {
		QueryUserInfoResponseDto response = new QueryUserInfoResponseDto();
		UserInfoPo userInfo = userInfoBo.queryUserInfoByUsrNo(request.getUsrNo());
		if(!StringUtils.isEmpty(userInfo)) {
			response.setData(userInfo);
			return response;
		}
		throw new HiBusinessReturnException(HiMsgCdConstants.QUERY_USERINFO_FAIL, "查询用户信息失败");
	}

	@Override
	@Transactional(readOnly = true)
	public QueryAddressInfoResponseDto queryAddressLst(QueryAddressInfoRequestDto request)
			throws HiBusinessReturnException {
		QueryAddressInfoResponseDto response = new QueryAddressInfoResponseDto();
		List<AddressInfoPo> addressInfoPoLst = addressInfoBo.queryAddressLst(request.getUsrNo());
		if (addressInfoPoLst.size() > 0) {
			response.setData(addressInfoPoLst);
			return response;
		}
		throw new HiBusinessReturnException(HiMsgCdConstants.QUERY_ADDRESSLST_FAIL, "查询用户收货地址列表失败");
	}

	@Override
	@Transactional(readOnly = true)
	public QueryCouponInfoResponseDto queryCouponLst(QueryCouponInfoRequestDto request)
			throws HiBusinessReturnException {
		QueryCouponInfoResponseDto response = new QueryCouponInfoResponseDto();
		List<CouponInfoPo> couponInfoPoLst = couponInfoBo.queryCouponLst(request.getUsrNo());
		if (couponInfoPoLst.size() > 0) {
			response.setData(couponInfoPoLst);
			return response;
		}
		throw new HiBusinessReturnException(HiMsgCdConstants.QUERY_COUPONLST_FAIL, "查询用户优惠券列表失败");
	}

	@Override
	public QueryRegionInfoResponseDto queryRegionLst(QueryRegionInfoRequestDto request)
			throws HiBusinessReturnException {
		QueryRegionInfoResponseDto response = new QueryRegionInfoResponseDto();
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("parentId", request.getParentId());
		Iterator<Entry<String, Object>> iter = paramMap.entrySet().iterator();
		if (iter.hasNext()) {
			Map.Entry<String, Object> entry = iter.next();
			String key = entry.getKey();
			if (null == paramMap.get(key) || "".equals(paramMap.get(key))) {
				iter.remove();
			}
		}
		List<RegionInfoPo> regionInfoPoLst = addressInfoBo.queryRegionLst(paramMap);
		if (regionInfoPoLst.size() > 0) {
			response.setData(regionInfoPoLst);
			return response;
		}
		throw new HiBusinessReturnException(HiMsgCdConstants.QUERY_REGIONLST_FAIL, "查询区域列表失败");
	}

	@Override
	public AddressInfoResponseDto getAddressDetail(QueryAddressInfoRequestDto request)
			throws HiBusinessReturnException {
		AddressInfoResponseDto response = new AddressInfoResponseDto();
		// 查询收货地址详情
		AddressInfoPo addressInfoPo = addressInfoBo.getAddressDetail(request.getId());
		if (!StringUtils.isEmpty(addressInfoPo)){
			response.setData(addressInfoPo);
		} else {
			throw new HiBusinessReturnException(HiMsgCdConstants.QUERY_ADDRESSDETAIL_FAIL, "查询收货地址详细信息失败");
		}
		return response;
	}

	@Override
	public AddAddressInfoResponseDto saveAddress(AddAddressInfoRequestDto request) throws HiBusinessReturnException {
		AddAddressInfoResponseDto response = new AddAddressInfoResponseDto();
		try {
			AddressInfoPo addressInfoPo = BaseDto.trans2Entity(request, AddressInfoPo.class);
			addressInfoPo.setUsrNo("USR201905081501280001");
			// 保存收货地址
			boolean result = addressInfoBo.saveAddress(addressInfoPo);
			if (!result){
				throw new HiBusinessReturnException(HiMsgCdConstants.SAVE_ADDRESS_FAIL, "保存收货地址信息失败");
			}
		} catch (HiException e) {
			e.printStackTrace();
		}
		return response;
	}
	
	@Override
	public DeleteAddressInfoResponseDto deleteAddress(DeleteAddressInfoRequestDto request)
			throws HiBusinessReturnException {
		DeleteAddressInfoResponseDto response = new DeleteAddressInfoResponseDto();
		// 删除收货地址
		boolean result = addressInfoBo.deleteAddress(request.getId());
		if (!result){
			throw new HiBusinessReturnException(HiMsgCdConstants.DELETE_ADDRESS_FAIL, "删除收货地址信息失败");
		}
		return response;
	}

	@Override
	public UpdateAddressInfoResponseDto updateAddress(UpdateAddressInfoRequestDto request)
			throws HiBusinessReturnException {
		UpdateAddressInfoResponseDto response = new UpdateAddressInfoResponseDto();
		try {
			AddressInfoPo addressInfoPo = BaseDto.trans2Entity(request, AddressInfoPo.class);
			// 修改收货地址
			boolean result = addressInfoBo.updateAddress(addressInfoPo);
			if (!result){
				throw new HiBusinessReturnException(HiMsgCdConstants.UPDATE_ADDRESS_FAIL, "修改收货地址信息失败");
			}
		} catch (HiException e) {
			e.printStackTrace();
		}
		return response;
	}

	
	

}
