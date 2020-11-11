package com.github.binarywang.wxpay.bean.businesscircle;

import com.github.binarywang.wxpay.bean.BaseWxPayV3Result;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: bhg-platform
 * @description: 商圈积分同步响应结果
 * @author: zhangmk
 * @create: 2020-09-09 14:17
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class BusinessCircleResult extends BaseWxPayV3Result implements Serializable {

}
