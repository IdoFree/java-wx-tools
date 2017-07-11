package com.github.binarywang.wxpay.bean.result;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * <pre>
 * 关闭订单结果对象类
 * Created by Binary Wang on 2016-10-27.
 * @author <a href="https://github.com/binarywang">binarywang(Binary Wang)</a>
 * </pre>
 */
@XStreamAlias("xml")
public class WxPayOrderCloseResult extends WxPayBaseResult {

  public WxPayOrderCloseResult() {
		super();
		// TODO Auto-generated constructor stub
	}

/**
   * 业务结果描述
   */
  @XStreamAlias("result_msg")
  private String resultMsg;

  public String getResultMsg() {
    return this.resultMsg;
  }

  public void setResultMsg(String resultMsg) {
    this.resultMsg = resultMsg;
  }
}
