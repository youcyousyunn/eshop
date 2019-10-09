package com.ycs.coobo.service;

import com.ycs.base.exception.HiBusinessReturnException;
import com.ycs.base.exception.HiException;
import com.ycs.coobo.domain.dto.BrandRequestDto;
import com.ycs.coobo.domain.dto.BrandResponseDto;
import com.ycs.coobo.domain.dto.CategoryRequestDto;
import com.ycs.coobo.domain.dto.CategoryResponseDto;
import com.ycs.coobo.domain.dto.QryCategoryResponseDto;
import com.ycs.coobo.domain.dto.GoodsRequestDto;
import com.ycs.coobo.domain.dto.GoodsResponseDto;
import com.ycs.coobo.domain.dto.ProductRequestDto;
import com.ycs.coobo.domain.dto.ProductResponseDto;
import com.ycs.coobo.domain.dto.QryBrandRequestDto;
import com.ycs.coobo.domain.dto.QryBrandResponseDto;
import com.ycs.coobo.domain.dto.QryGoodsRequestDto;
import com.ycs.coobo.domain.dto.QryGoodsResponseDto;
import com.ycs.coobo.domain.dto.QryTopicRequestDto;
import com.ycs.coobo.domain.dto.QryTopicResponseDto;

public interface IProductInfoService {

	/**
	 * 查询所有产品信息
	 * @param request
	 * @return BrandResponseDto
	 * @throws HiBusinessReturnException
	 */
	ProductResponseDto index(ProductRequestDto request) throws HiBusinessReturnException;

	/**
	 * 分页查询产品品牌信息
	 * @param request
	 * @return QryBrandResponseDto
	 * @throws HiBusinessReturnException
	 */
	QryBrandResponseDto queryBrandPage(QryBrandRequestDto request) throws HiBusinessReturnException;

	/**
	 * 查询产品品牌详细信息
	 * @param request
	 * @return BrandResponseDto
	 * @throws HiException
	 */
	BrandResponseDto queryBrandDetail(BrandRequestDto request) throws HiBusinessReturnException;

	/**
	 * 分页查询商品信息
	 * @param request
	 * @return QryBrandResponseDto
	 * @throws HiException
	 */
	QryGoodsResponseDto queryGoodsPage(QryGoodsRequestDto request) throws HiBusinessReturnException;

	/**
	 * 查询商品详细信息
	 * @param request
	 * @return GoodsResponseDto
	 * @throws HiException
	 */
	GoodsResponseDto queryGoodsDetail(GoodsRequestDto request) throws HiBusinessReturnException;

	/**
	 * 查询商品分类目录列表信息
	 * @param request
	 * @return CategoryResponseDto
	 * @throws HiException
	 */
	QryCategoryResponseDto queryCategoryLst(CategoryRequestDto request) throws HiBusinessReturnException;

	/**
	 * 查询商品分类目录详细信息
	 * @param request
	 * @return CategoryResponseDto
	 * @throws HiException
	 */
	CategoryResponseDto queryCategoryDetail(CategoryRequestDto request) throws HiBusinessReturnException;

	/**
	 * 分页查询专题信息
	 * @param request
	 * @return QryTopicRequestDto
	 * @throws HiException
	 */
	QryTopicResponseDto queryTopicPage(QryTopicRequestDto request) throws HiBusinessReturnException;
	
	
	
}
