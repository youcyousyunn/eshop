package com.ycs.base.spring.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.ycs.base.context.HiRequestInfo;

public class HiChannelSetInterceptor implements HandlerInterceptor {

	private String sysCnl;

	public void setSysCnl(String sysCnl) {
		this.sysCnl = sysCnl;
	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HiRequestInfo.getCurInstance().setSysCnl(this.sysCnl);
		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}

}
