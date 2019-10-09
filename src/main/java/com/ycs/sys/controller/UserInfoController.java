package com.ycs.sys.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycs.basbo.constants.Constants;
import com.ycs.basbo.constants.HiMsgCdConstants;
import com.ycs.base.annotation.HiOperLog;
import com.ycs.base.controller.IBaseController;
import com.ycs.base.exception.HiBusinessReturnException;
import com.ycs.base.exception.HiException;
import com.ycs.base.log4j.logger.HiBizLogger;
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
import com.ycs.sys.service.IUserInfoService;


@Controller
@RequestMapping("/user/v1")
public class UserInfoController extends IBaseController {
	@Autowired
	private IUserInfoService userInfoService;
	
	/**
	 * 微信认证登录
	 * @param
	 * @return LoginResponseDto
	 * @throws 
	 */
	@ResponseBody
    @RequestMapping("/loginByWeixin.do")
	@HiOperLog(title = "登录请求", action = "登录操作", isSaveData = false, channel = "WEB")
    public LoginResponseDto loginByWeixin(@RequestBody LoginRequestDto loginRequest, HttpSession session) throws HiException {
    	if (!loginRequest.checkRequestDto()) {
    		HiBizLogger.info("接口请求报文异常" + loginRequest.toString());
            throw new HiBusinessReturnException(HiMsgCdConstants.TX_REQUESTBODY_FAIL, "接口请求报文异常 ");
    	}
    	LoginResponseDto response = new LoginResponseDto();
        try {
            // 返回登录信息
            response = userInfoService.loginByWeixin(loginRequest);
            session.setAttribute(Constants.USER_SESSION_INFO, setLoginSession(response));
            response.setSessionId(session.getId());
        } catch (HiBusinessReturnException e) {
            return new LoginResponseDto(HiMsgCdConstants.LOGIN_BY_WEIXIN_FAIL, "使用微信登录失败");
        }
        response.setRspCd(HiMsgCdConstants.SUCCESS);
        return response;
    }
	
	/**
	 * 接口模拟登录
	 * @param
	 * @return LoginResponseDto
	 * @throws 
	 */
	@ResponseBody
    @RequestMapping("/login.do")
	@HiOperLog(title = "登录请求", action = "登录操作", isSaveData = false, channel = "WEB")
    public LoginResponseDto login(HttpServletRequest loginRequest, HttpSession session) throws HiException {
     	String usrNo = loginRequest.getParameter("usrNo");
		if (StringUtils.isEmpty(usrNo)){
    		HiBizLogger.info("接口请求报文异常" + loginRequest.toString());
            throw new HiBusinessReturnException(HiMsgCdConstants.TX_REQUESTBODY_FAIL, "接口请求报文异常 ");
    	}
    	LoginResponseDto loginResponse = new LoginResponseDto();
        try {
            // 获取登录信息
//            loginResponse = userInfoService.login(loginRequest);
//        	loginResponse.setUsrNo(usrNo);
        	session.setAttribute(Constants.USER_SESSION_INFO, setLoginSession(loginResponse));
        } catch (Exception e) {
        	e.printStackTrace();
        }
        loginResponse.setRspCd(HiMsgCdConstants.SUCCESS);
        return loginResponse;
    }
	
	/**
     * 查询用户资料
     * @param request 请求
     * @return 响应
     */
    @ResponseBody
    @RequestMapping(value = "/query.do")
    @HiOperLog(title = "查询用户资料", action = "查询操作", isSaveData = true, channel = "WEB")
    public QueryUserInfoResponseDto queryUserInfo(@RequestBody QueryUserInfoRequestDto request) throws HiException {
    	if (!request.checkRequestDto()){
    		HiBizLogger.info("接口请求报文异常" + request.toString());
            throw new HiBusinessReturnException(HiMsgCdConstants.TX_REQUESTBODY_FAIL, "接口请求报文异常 ");
    	}
        try {
            return userInfoService.queryUserInfo(request);
        } catch (HiBusinessReturnException e) {
            return new QueryUserInfoResponseDto(e.getCode(), e.getMessage());
        }
    }
    
    /**
     * 查询用户所有优惠券
     * @param request 请求
     * @return 响应
     */
    @ResponseBody
    @RequestMapping(value = "/coupon/queryList.do")
    @HiOperLog(title = "查询用户所有优惠券", action = "查询操作", isSaveData = true, channel = "WEB")
    public QueryCouponInfoResponseDto queryCouponLst(@RequestBody QueryCouponInfoRequestDto request) throws HiException {
		if (!request.checkRequestDto()){
    		HiBizLogger.info("接口请求报文异常" + request.toString());
            throw new HiBusinessReturnException(HiMsgCdConstants.TX_REQUESTBODY_FAIL, "接口请求报文异常 ");
    	}
    	QueryCouponInfoResponseDto response = new QueryCouponInfoResponseDto();
    	try {
    		response = userInfoService.queryCouponLst(request);
        } catch (HiBusinessReturnException e) {
            return new QueryCouponInfoResponseDto(e.getCode(), e.getMessage());
        }
    	response.setRspCd(HiMsgCdConstants.SUCCESS);
    	return response;
    }
    
    /**
     * 查询用户所有收货地址
     * @param request 请求
     * @return 响应
     */
    @ResponseBody
    @RequestMapping(value = "/address/queryList.do")
    @HiOperLog(title = "查询用户所有收货地址", action = "查询操作", isSaveData = true, channel = "WEB")
    public QueryAddressInfoResponseDto queryAddressLst(@RequestBody QueryAddressInfoRequestDto request) throws HiException {
    	if (!request.checkRequestDto()){
    		HiBizLogger.info("接口请求报文异常" + request.toString());
            throw new HiBusinessReturnException(HiMsgCdConstants.TX_REQUESTBODY_FAIL, "接口请求报文异常 ");
    	}
    	QueryAddressInfoResponseDto response = new QueryAddressInfoResponseDto();
    	try {
    		response = userInfoService.queryAddressLst(request);
        } catch (HiBusinessReturnException e) {
            return new QueryAddressInfoResponseDto(e.getCode(), e.getMessage());
        }
    	response.setRspCd(HiMsgCdConstants.SUCCESS);
    	return response;
    }
    
    /**
     * 新增收货地址
     * @param request
     * @return AddAddressInfoResponseDto
     * @throws HiException
     */
    @ResponseBody
    @RequestMapping(value = "/address/save.do")
    @HiOperLog(title = "保存收货地址", action = "查询操作", isSaveData = true, channel = "WEB")
    public AddAddressInfoResponseDto saveAddress(@RequestBody AddAddressInfoRequestDto request) throws HiException {
    	AddAddressInfoResponseDto response = new AddAddressInfoResponseDto();
    	try {
    		response = userInfoService.saveAddress(request);
        } catch (HiBusinessReturnException e) {
            return new AddAddressInfoResponseDto(HiMsgCdConstants.SAVE_ADDRESS_FAIL, "保存收货地址信息失败");
        }
    	response.setRspCd(HiMsgCdConstants.SUCCESS);
    	return response;
    }
    
    /**
     * 删除收货地址
     * @param request
     * @return DeleteAddressInfoResponseDto
     * @throws HiException
     */
    @ResponseBody
    @RequestMapping(value = "/address/delete.do")
    @HiOperLog(title = "删除收货地址", action = "删除操作", isSaveData = true, channel = "WEB")
    public DeleteAddressInfoResponseDto deleteAddress(@RequestBody DeleteAddressInfoRequestDto request) throws HiException {
    	DeleteAddressInfoResponseDto response = new DeleteAddressInfoResponseDto();
    	String id = String.valueOf(request.getId());
		if (StringUtils.isEmpty(id)){
    		HiBizLogger.info("接口请求报文异常" + request.toString());
            throw new HiBusinessReturnException(HiMsgCdConstants.TX_REQUESTBODY_FAIL, "接口请求报文异常 ");
    	}
    	try {
    		response = userInfoService.deleteAddress(request);
        } catch (HiBusinessReturnException e) {
            return new DeleteAddressInfoResponseDto(HiMsgCdConstants.DELETE_ADDRESS_FAIL, "删除收货地址信息失败");
        }
    	response.setRspCd(HiMsgCdConstants.SUCCESS);
    	return response;
    }
    
    /**
     * 修改收货地址
     * @param request
     * @return UpdateAddressInfoResponseDto
     * @throws HiException
     */
    @ResponseBody
    @RequestMapping(value = "/address/update.do")
    @HiOperLog(title = "修改收货地址", action = "修改操作", isSaveData = true, channel = "WEB")
    public UpdateAddressInfoResponseDto saveAddress(@RequestBody UpdateAddressInfoRequestDto request) throws HiException {
    	UpdateAddressInfoResponseDto response = new UpdateAddressInfoResponseDto();
    	String id = String.valueOf(request.getId());
		if (StringUtils.isEmpty(id)){
    		HiBizLogger.info("接口请求报文异常" + request.toString());
            throw new HiBusinessReturnException(HiMsgCdConstants.TX_REQUESTBODY_FAIL, "接口请求报文异常 ");
    	}
    	try {
    		response = userInfoService.updateAddress(request);
        } catch (HiBusinessReturnException e) {
            return new UpdateAddressInfoResponseDto(HiMsgCdConstants.UPDATE_ADDRESS_FAIL, "修改收货地址信息失败");
        }
    	response.setRspCd(HiMsgCdConstants.SUCCESS);
    	return response;
    }
    
    /**
     * 查询收货地址详情
     * @param request
     * @return AddressInfoResponseDto
     * @throws HiException
     */
    @ResponseBody
    @RequestMapping(value = "/address/get.do")
    @HiOperLog(title = "查询用户所有收货地址", action = "查询操作", isSaveData = true, channel = "WEB")
    public AddressInfoResponseDto getAddressDetail(@RequestBody QueryAddressInfoRequestDto request) throws HiException {
    	AddressInfoResponseDto response = new AddressInfoResponseDto();
    	try {
    		response = userInfoService.getAddressDetail(request);
        } catch (HiBusinessReturnException e) {
            return new AddressInfoResponseDto(HiMsgCdConstants.QUERY_ADDRESSDETAIL_FAIL, "查询收货地址详细信息失败");
        }
    	response.setRspCd(HiMsgCdConstants.SUCCESS);
    	return response;
    }
    
    /**
     * 查询区域列表
     * @param request
     * @return QueryRegionInfoResponseDto
     * @throws HiException
     */
    @ResponseBody
    @RequestMapping(value = "/region/queryList.do")
    @HiOperLog(title = "查询区域列表请求", action = "查询操作", isSaveData = true, channel = "WEB")
    public QueryRegionInfoResponseDto queryRegionLst(@RequestBody QueryRegionInfoRequestDto request) throws HiException {
    	QueryRegionInfoResponseDto response = new QueryRegionInfoResponseDto();
    	try {
    		response = userInfoService.queryRegionLst(request);
        } catch (HiBusinessReturnException e) { 
            return new QueryRegionInfoResponseDto(HiMsgCdConstants.QUERY_REGIONLST_FAIL, "查询区域列表信息失败");
        }
    	response.setRspCd(HiMsgCdConstants.SUCCESS);
    	return response;
    }
	
	
	
}
