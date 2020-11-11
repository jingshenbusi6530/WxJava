package com.github.binarywang.wxpay.bean.businesscircle;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @description: 商圈支付结果/退款成功通知
 * @author: zhangmk
 * @create: 2020-09-03 13:50
 */
@Data
@NoArgsConstructor
public class BusinessCircleNotifyData  implements Serializable {
    private static final long serialVersionUID = -8258671503619768295L;
    private static final Gson GSON = new GsonBuilder().create();

    public static BusinessCircleNotifyData fromJson(String jsonString) {
        return GSON.fromJson(jsonString, BusinessCircleNotifyData.class);
    }

  /**
   * id : EV-2018022511223320873
   * create_time : 20180225112233
   * resource_type : encrypt-resource
   * event_type : PAYSCORE.USER_CONFIRM
   * resource : {"algorithm":"AEAD_AES_256_GCM","ciphertext":"...","nonce":"...","associated_data":""}
   * summary : "确认订单"
   */

  /**
   * 通知ID
   */
  @SerializedName("id")
  protected String id;

  /**
   * 通知创建时间
   */
  @SerializedName("create_time")
  protected String createTime;

  /**
   * 通知数据类型
   */
  @SerializedName("resource_type")
  protected String resourceType;

  /**
   * 通知类型
   */
  @SerializedName("event_type")
  protected String eventType;

  /**
   * 通知数据
   */
  @SerializedName("resource")
  protected Resource resource;

  /**
   * 回调摘要
   * summary
   */
  @SerializedName("summary")
  protected String summary;

  @Data
  public static class Resource implements Serializable {
    private static final long serialVersionUID = 8530711804335261449L;
    /**
     * algorithm : AEAD_AES_256_GCM
     * ciphertext : ...
     * 原始回调类型 original_type: "discount_card",智慧商圈有这个字段
     * nonce : ...
     * associated_data :
     */

    /**
     * 加密算法类型
     */
    @SerializedName("algorithm")
    protected String algorithm;

    /**
     * 数据密文
     */
    @SerializedName("ciphertext")
    protected String cipherText;

    /**
     * 原始回调类型
     */
    @SerializedName("original_type")
    protected String originalType;

    /**
     * 随机串
     */
    @SerializedName("nonce")
    protected String nonce;

    /**
     * 附加数据
     */
    @SerializedName("associated_data")
    protected String associatedData;
  }
}
