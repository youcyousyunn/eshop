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
import com.ycs.base.log4j.logger.HiBizLogger;
import com.ycs.coobo.domain.dto.BrandRequestDto;
import com.ycs.coobo.domain.dto.BrandResponseDto;
import com.ycs.coobo.domain.dto.CategoryRequestDto;
import com.ycs.coobo.domain.dto.CategoryResponseDto;
import com.ycs.coobo.domain.dto.GoodsRequestDto;
import com.ycs.coobo.domain.dto.GoodsResponseDto;
import com.ycs.coobo.domain.dto.ProductRequestDto;
import com.ycs.coobo.domain.dto.ProductResponseDto;
import com.ycs.coobo.domain.dto.QryBrandRequestDto;
import com.ycs.coobo.domain.dto.QryBrandResponseDto;
import com.ycs.coobo.domain.dto.QryCategoryResponseDto;
import com.ycs.coobo.domain.dto.QryGoodsRequestDto;
import com.ycs.coobo.domain.dto.QryGoodsResponseDto;
import com.ycs.coobo.domain.dto.QryTopicRequestDto;
import com.ycs.coobo.domain.dto.QryTopicResponseDto;
import com.ycs.coobo.service.IProductInfoService;


@Controller
@RequestMapping("/product/v1")
public class ProductInfoController extends IBaseController {
	@Autowired
	private IProductInfoService productInfoService;
	
	/**
	 * 查询商城首页信息
	 * @param request
	 * @return LoginResponseDto
	 * @throws HiException
	 */
	@ResponseBody
    @RequestMapping("/index.do")
	@HiOperLog(title = "查询商城首页信息请求", action = "查询操作", isSaveData = true, channel = "WEB")
    public ProductResponseDto index(@RequestBody ProductRequestDto request) throws HiException {
		ProductResponseDto response = new ProductResponseDto();
        try {
        	response = productInfoService.index(request);
        } catch (HiBusinessReturnException e) {
            return new ProductResponseDto(HiMsgCdConstants.QUERY_ALL_PRODUCT_FAIL, "查询所有产品信息失败");
        }
        response.setRspCd(HiMsgCdConstants.SUCCESS);
        return response;
    }
	
	/**
	 * 分页查询产品品牌信息
	 * @param request
	 * @return QryBrandResponseDto
	 * @throws HiException
	 */
	@ResponseBody
    @RequestMapping("/brand/queryPage.do")
	@HiOperLog(title = "分页查询产品品牌请求", action = "查询操作", isSaveData = true, channel = "WEB")
    public QryBrandResponseDto queryBrandPage(@RequestBody QryBrandRequestDto request) throws HiException {
		QryBrandResponseDto response = new QryBrandResponseDto();
        try {
        	response = productInfoService.queryBrandPage(request);
        } catch (HiBusinessReturnException e) {
            return new QryBrandResponseDto(HiMsgCdConstants.QUERY_BRAND_PAGE_FAIL, "分页查询产品品牌信息失败");
        }
        response.setRspCd(HiMsgCdConstants.SUCCESS);
        return response;
    }
	
	/**
	 * 查询产品品牌详细信息
	 * @param request
	 * @return BrandResponseDto
	 * @throws HiException
	 */
	@ResponseBody
    @RequestMapping("/brand/get.do")
	@HiOperLog(title = "查询产品品牌详细请求", action = "查询操作", isSaveData = true, channel = "WEB")
    public BrandResponseDto queryBrandDetail(@RequestBody BrandRequestDto request) throws HiException {
		BrandResponseDto response = new BrandResponseDto();
        try {
        	response = productInfoService.queryBrandDetail(request);
        } catch (HiBusinessReturnException e) {
            return new BrandResponseDto(HiMsgCdConstants.QUERY_BRAND_DETAIL_FAIL, "查询产品品牌详细信息失败");
        }
        response.setRspCd(HiMsgCdConstants.SUCCESS);
        return response;
    }
	
	/**
	 * 分页查询商品信息
	 * @param request
	 * @return QryBrandResponseDto
	 * @throws HiException
	 */
	@ResponseBody
    @RequestMapping("/goods/queryPage.do")
	@HiOperLog(title = "分页查询商品请求", action = "查询操作", isSaveData = true, channel = "WEB")
    public QryGoodsResponseDto queryGoodsPage(@RequestBody QryGoodsRequestDto request) throws HiException {
		QryGoodsResponseDto response = new QryGoodsResponseDto();
        try {
        	response = productInfoService.queryGoodsPage(request);
        } catch (HiBusinessReturnException e) {
            return new QryGoodsResponseDto(HiMsgCdConstants.QUERY_GOODS_PAGE_FAIL, "分页查询商品信息失败");
        }
        response.setRspCd(HiMsgCdConstants.SUCCESS);
        return response;
    }
	
	/**
	 * 查询商品详细信息
	 * @param request
	 * @return GoodsResponseDto
	 * @throws HiException
	 */
	@ResponseBody
    @RequestMapping("/goods/get.do")
	@HiOperLog(title = "查询产品品牌详细请求", action = "查询操作", isSaveData = true, channel = "WEB")
    public GoodsResponseDto queryGoodsDetail(@RequestBody GoodsRequestDto request) throws HiException {
		if (!request.checkRequestDto()) {
    		HiBizLogger.info("接口请求报文异常" + request.toString());
            throw new HiBusinessReturnException(HiMsgCdConstants.TX_REQUESTBODY_FAIL, "接口请求报文异常 ");
    	}
		GoodsResponseDto response = new GoodsResponseDto();
        try {
        	response = productInfoService.queryGoodsDetail(request);
        } catch (HiBusinessReturnException e) {
            return new GoodsResponseDto(HiMsgCdConstants.QUERY_GOODS_DETAIL_FAIL, "查询商品详细信息失败");
        }
        response.setRspCd(HiMsgCdConstants.SUCCESS);
        return response;
    }
	
	/**
	 * 分页查询专题信息
	 * @param request
	 * @return QryTopicRequestDto
	 * @throws HiException
	 */
	@ResponseBody
    @RequestMapping("/topic/queryPage.do")
	@HiOperLog(title = "分页查询专题请求", action = "查询操作", isSaveData = true, channel = "WEB")
    public QryTopicResponseDto queryTopicPage(@RequestBody QryTopicRequestDto request) throws HiException {
		QryTopicResponseDto response = new QryTopicResponseDto();
        try {
        	response = productInfoService.queryTopicPage(request);
        } catch (HiBusinessReturnException e) {
            return new QryTopicResponseDto(HiMsgCdConstants.QUERY_GOODS_PAGE_FAIL, "分页查询专题信息失败");
        }
        response.setRspCd(HiMsgCdConstants.SUCCESS);
        return response;
    }
	
	/**
	 * 查询商品分类目录列表信息
	 * @param request
	 * @return CategoryResponseDto
	 * @throws HiException
	 */
	@ResponseBody
    @RequestMapping("/catalog/queryList.do")
	@HiOperLog(title = "分页查询产品品牌请求", action = "查询操作", isSaveData = true, channel = "WEB")
    public QryCategoryResponseDto queryCategoryLst(@RequestBody CategoryRequestDto request) throws HiException {
		QryCategoryResponseDto response = new QryCategoryResponseDto();
        try {
        	response = productInfoService.queryCategoryLst(request);
        } catch (HiBusinessReturnException e) {
            return new QryCategoryResponseDto(HiMsgCdConstants.QUERY_GOODS_CATEGORYLST_FAIL, "查询商品目录列表信息失败");
        }
        response.setRspCd(HiMsgCdConstants.SUCCESS);
        return response;
    }
	
	/**
	 * 查询商品分类目录详细信息
	 * @param request
	 * @return CategoryResponseDto
	 * @throws HiException
	 */
	@ResponseBody
    @RequestMapping("/catalog/get.do")
	@HiOperLog(title = "分页查询产品品牌请求", action = "查询操作", isSaveData = true, channel = "WEB")
    public CategoryResponseDto queryCategoryDetail(@RequestBody CategoryRequestDto request) throws HiException {
		CategoryResponseDto response = new CategoryResponseDto();
        try {
        	response = productInfoService.queryCategoryDetail(request);
        } catch (HiBusinessReturnException e) {
            return new CategoryResponseDto(HiMsgCdConstants.QUERY_GOODS_CATEGORYDETAIL_FAIL, "查询商品目录详细信息失败");
        }
        response.setRspCd(HiMsgCdConstants.SUCCESS);
        return response;
    }
	
	
	
}
