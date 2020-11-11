package com.github.binarywang.wxpay.service;

import com.github.binarywang.wxpay.bean.businesscircle.BusinessCircleNotifyData;
import com.github.binarywang.wxpay.bean.businesscircle.BusinessCircleNotifyResource;
import com.github.binarywang.wxpay.bean.businesscircle.BusinessCircleRequest;
import com.github.binarywang.wxpay.bean.businesscircle.BusinessCircleResult;
import com.github.binarywang.wxpay.exception.WxPayException;

/**
 *
 * @description: 智慧商圈
 * @author: zhangmk
 * @create: 2020-09-03 15:14
 */
public interface BusinessCircleService {

    /**
     * <pre>
     * 商圈支付结果/退款成功通知 解密resource
     * 文档详见: https://pay.weixin.qq.com/wiki/doc/apiv3/wxpay/businesscircle/chapter3_1.shtml
     * </pre>
     *
     * @param data the data
     * @return the wx pay business circle result
     * @throws WxPayException the wx pay exception
     */
    BusinessCircleNotifyResource decryptNotifyDataResource(BusinessCircleNotifyData data) throws WxPayException;

    /**
     * <pre>
     * 商圈积分同步API.
     * 文档详见: https://pay.weixin.qq.com/wiki/doc/apiv3/wxpay/businesscircle/chapter3_2.shtml
     * 请求URL： https://api.mch.weixin.qq.com/v3/businesscircle/points/notify
     * </pre>
     *
     * @param request the request
     * @throws WxPayException the wx pay exception
     */
    BusinessCircleResult syncPoints(BusinessCircleRequest request) throws WxPayException;
}
