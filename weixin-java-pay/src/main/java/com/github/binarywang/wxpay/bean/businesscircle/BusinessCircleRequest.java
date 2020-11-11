package com.github.binarywang.wxpay.bean.businesscircle;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 *
 * @description: 商圈积分同步
 * @author: zhangmk
 * @create: 2020-09-03 16:25
 */
@Data
@Builder(builderMethodName = "newBuilder")
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class BusinessCircleRequest implements Serializable {
    private static final long serialVersionUID = 8551048810140074870L;
    /**
     "sub_mchid": "1234567890",
     "transaction_id": "4200000533202000000000000000",
     "appid": "wx8828b70xxxxxxx8",
     "openid": "otPAN5xxxxxxxxrOEG6lUv_pzacc",
     "earn_points": true,
     "increased_points": 100,
     "points_update_time": "2020-05-20T13:29:35.120+08:00",
     "total_points": 888888
     */
    @SerializedName("sub_mchid")
    private String subMchid;
    @SerializedName("transaction_id")
    private String transactionId;
    @SerializedName("appid")
    private String appid;
    @SerializedName("openid")
    private String openid;
    @SerializedName("earn_points")
    private boolean earnPoints;
    @SerializedName("increased_points")
    private int increasedPoints;
    @SerializedName("points_update_time")
    private String pointsUpdateTime;
    @SerializedName("no_points_remarks")
    private String noPointsRemarks;
    @SerializedName("total_points")
    private int totalPoints;
}