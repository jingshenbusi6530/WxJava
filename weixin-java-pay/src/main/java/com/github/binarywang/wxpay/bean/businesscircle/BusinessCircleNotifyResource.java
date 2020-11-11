package com.github.binarywang.wxpay.bean.businesscircle;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 商圈支付/退款通知
 * @description: 解密resource对象, 得到的实例
 * @author: zhmk
 * @create: 2020-09-03 14:41
 */
@Data
@NoArgsConstructor
public class BusinessCircleNotifyResource {
    /*
        共同参数
      {
       "mchid": "1230000109",
        "merchant_name": "腾讯广场",
        "shop_name": "微信支付",
        "shop_number": "123456",
        "appid": "wxd678efh567hg6787",
        "openid": "oUpF8uMuAJ2pxb1Q9zNjWUHsd",
        "transaction_id" : "1234567890"
    }*/
    @SerializedName("mchid")
    private String mchid;
    @SerializedName("merchant_name")
    private String merchantName;
    @SerializedName("shop_name")
    private String shopName;
    @SerializedName("shop_number")
    private String shopNumber;
    @SerializedName("appid")
    private String appid;
    @SerializedName("openid")
    private String openid;
    @SerializedName("transaction_id")
    private String transactionId;
    /*
       支付结果通知
       "amount": 200,
       "time_end": "2020-05-20T13:29:35.120+08:00"
    */
    @SerializedName("time_end")
    private String timeEnd;
    @SerializedName("amount")
    private int amount;
    @SerializedName("commit_tag")
    private String commitTag;
    /*
       退款结果通知
       "refund_time": "2018-05-23T12:13:50+08:00",
       "pay_amount": 100,
       "refund_amount":100,
       "refund_id": "1217752501201407033233368999"
     */
    @SerializedName("refund_time")
    private String refundTime;
    @SerializedName("pay_amount")
    private int payAmount;
    @SerializedName("refund_amount")
    private int refundAmount;
    @SerializedName("refund_id")
    private String refundId;
}