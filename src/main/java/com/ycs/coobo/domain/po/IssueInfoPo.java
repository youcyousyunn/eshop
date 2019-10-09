package com.ycs.coobo.domain.po;

import com.ycs.base.domain.po.BasePo;

public class IssueInfoPo extends BasePo {
	private int id; //属性Id
	private String goodsId;  //商品Id
	private String question; //问题
	private String answer;  //解答
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
}
