package com.github.binarywang.wxpay.service.impl;

import com.github.binarywang.wxpay.bean.businesscircle.BusinessCircleNotifyData;
import com.github.binarywang.wxpay.bean.businesscircle.BusinessCircleNotifyResource;
import com.github.binarywang.wxpay.bean.businesscircle.BusinessCircleRequest;
import com.github.binarywang.wxpay.bean.businesscircle.BusinessCircleResult;
import com.github.binarywang.wxpay.config.WxPayConfig;
import com.github.binarywang.wxpay.exception.WxPayException;
import com.github.binarywang.wxpay.service.BusinessCircleService;
import com.github.binarywang.wxpay.service.WxPayService;
import com.github.binarywang.wxpay.v3.util.AesUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.RequiredArgsConstructor;

/**
 *
 * @description: 智慧商圈
 * @author: zhangmk
 * @create: 2020-09-03 15:21
 */
@RequiredArgsConstructor
public class BusinessCircleServiceImpl implements BusinessCircleService {
    private static final Gson GSON = new GsonBuilder().create();
    private final WxPayService payService;

    @Override
    public BusinessCircleNotifyResource decryptNotifyDataResource(BusinessCircleNotifyData data) throws WxPayException {
        BusinessCircleNotifyData.Resource resource = data.getResource();
        String cipherText = resource.getCipherText();
        String associatedData = resource.getAssociatedData();
        String nonce = resource.getNonce();
        String apiV3Key = this.payService.getConfig().getApiV3Key();
        try {
            String s = AesUtils.decryptToString(associatedData, nonce, cipherText, apiV3Key);
            return GSON.fromJson(s, BusinessCircleNotifyResource.class);
        } catch (Exception e) {
            throw new WxPayException("解析报文异常！", e);
        }
    }

    @Override
    public BusinessCircleResult syncPoints(BusinessCircleRequest request) throws WxPayException {
        WxPayConfig config = this.payService.getConfig();
        String url = config.getPayBaseUrl() + "/v3/businesscircle/points/notify";
        request.setSubMchid(config.getSubMchId());
        request.setAppid(config.getSubAppId());
        String result = this.payService.postV3(url, GSON.toJson(request));
        return GSON.fromJson(result, BusinessCircleResult.class);
    }
}