package com.github.binarywang.wxpay.bean.businesscircle;

import com.github.binarywang.wxpay.bean.payscore.TimeRange;
import com.github.binarywang.wxpay.bean.payscore.WxPayScoreRequest;
import org.testng.annotations.Test;

/**
 * @program: wx-java
 * @description:
 * @author: zhmk
 * @create: 2020-11-10 16:29
 */
public class BusinessCircleNotifyDataTest {
  @Test
  public void testToJson() {
    String jsonData = "{\n" +
      "    \"id\":\"c7d5b540-95d9-5bff-8494-be7984ad08e6\",\n" +
      "    \"create_time\":\"2020-09-16T13:56:33+08:00\",\n" +
      "    \"resource_type\":\"encrypt-resource\",\n" +
      "    \"event_type\":\"MALL_TRANSACTION.SUCCESS\",\n" +
      "    \"summary\":\"支付成功\",\n" +
      "    \"resource\":{\n" +
      "        \"original_type\":\"mall_transaction\",\n" +
      "        \"algorithm\":\"AEAD_AES_256_GCM\",\n" +
      "        \"ciphertext\":\"pTDEJVqi79UISh1TmmNQe/St06UTvNrdXCWdZwVOROTlPz1f12pd7BR0XQLW5YX0c3LlIHRXSjQIUgfGdNLFxZv3HHJKGeczk9pmtwXP3vRMiosAXxaB/F1cpnppasppTyesNDK/LHwtxw6NRUghRfIXm325UvGTtI0JE7P+sJt8YiZuJdNqOFmWx/Mjrpyh4q4ydwhGlU+x2a6QIm6HoP3QF9u2j9XVnUJOiguFBDYTBBfCAotCl96AIGK4z1JGRsTGzaPEgZaEr7t2ICQqCUgPEYrZcTE1Ojc952yAFyOgiu2zjDhxg3bWn0bIKsNSZ0+CeakKxf+kiSW7792wAPHyij8sijYaHdnvNohTrMLo4xWQZbKZmCQc8YxDDyKkYtBMLQaas/K9M4AhuTQzS1d53qEno2m3S10=\",\n" +
      "        \"associated_data\":\"mall_transaction\",\n" +
      "        \"nonce\":\"GiCVO6LB04WZ\"\n" +
      "    }\n" +
      "}";
    BusinessCircleNotifyData notifyData = BusinessCircleNotifyData.fromJson(jsonData);
    System.out.println(notifyData.toString());
  }
}
