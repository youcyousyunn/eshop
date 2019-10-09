package com.ycs.coobo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ycs.basbo.constants.HiMsgCdConstants;
import com.ycs.base.annotation.HiOperLog;
import com.ycs.base.controller.IBaseController;
import com.ycs.base.exception.HiBusinessReturnException;
import com.ycs.base.exception.HiException;
import com.ycs.coobo.domain.dto.QryCartRequestDto;
import com.ycs.coobo.domain.dto.QryCartResponseDto;
import com.ycs.coobo.service.IWeixinOrderInfoService;

@Controller
@RequestMapping("/order/weixin")
public class WeixinOrderInfoController extends IBaseController {
	
	@Autowired
	private IWeixinOrderInfoService weixinOrderInfoService;
	
	
	/**
	 * 查询购物车信息
	 * @param request
	 * @return QryCartResponseDto
	 * @throws HiException
	 */
	@ResponseBody
    @RequestMapping("/cart/query.do")
	@HiOperLog(title = "查询购物车请求", action = "查询操作", isSaveData = true, channel = "WEB")
    public QryCartResponseDto queryCartInfo(@RequestBody QryCartRequestDto request) throws HiException {
		QryCartResponseDto response = new QryCartResponseDto();
        try {
        	response = weixinOrderInfoService.queryCartInfo(request);
        } catch (HiBusinessReturnException e) {
            return new QryCartResponseDto(HiMsgCdConstants.QUERY_CARTINFO_FAIL, "查询购物车信息失败");
        }
        response.setRspCd(HiMsgCdConstants.SUCCESS);
        return response;
    }
	
	
	
	
	

}
