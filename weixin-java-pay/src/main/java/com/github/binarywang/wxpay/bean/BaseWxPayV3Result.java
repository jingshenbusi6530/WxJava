package com.github.binarywang.wxpay.bean;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
/**
 * @description: 错误码和错误提示
 * https://wechatpay-api.gitbook.io/wechatpay-api-v3/wei-xin-zhi-fu-api-v3-jie-kou-gui-fan
 * @author: zhangmk
 * @create: 2020-09-03 16:52
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseWxPayV3Result {
    private static Gson GSON = new GsonBuilder().create();
    /**
     {
     "code": "PARAM_ERROR",
     "message": "参数错误",
     "detail": {
     "field": "/amount/currency",
     "value": "XYZ",
     "issue": "Currency code is invalid",
     "location" :"body"
     }
     }
     */

    /**
     * 详细错误码
     */
    @SerializedName("code")
    protected String code;

    /**
     * 错误描述，使用易理解的文字表示错误的原因。
     */
    @SerializedName("message")
    protected String message;

    /**
     * 详情
     */
    @SerializedName("resource")
    protected Detail detail;

    @Data
    public static class Detail implements Serializable {
        private static final long serialVersionUID = 8530711804335261449L;

        /**
         * 指示错误参数的位置
         */
        @SerializedName("field")
        protected String field;

        /**
         * 错误的值
         */
        @SerializedName("value")
        protected String value;

        /**
         * 具体错误原因
         */
        @SerializedName("issue")
        protected String issue;

        @SerializedName("location")
        protected String location;
    }
    /**
     * Fail string.
     *
     * @param msg the msg
     * @return the string
     */
    public static String fail(String msg) {
        BaseWxPayV3Result result = new BaseWxPayV3Result("FAIL", msg,null);
        return GSON.toJson(result);
    }

    /**
     * Success string.
     *
     * @param msg the msg
     * @return the string
     */
    public static String success(String msg) {
        BaseWxPayV3Result result = new BaseWxPayV3Result("SUCCESS", msg,null);
        return GSON.toJson(result);
    }

}
