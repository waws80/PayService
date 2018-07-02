package com.thanatos.pay.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import request
import java.net.URL

@RestController
@RequestMapping("pay")
class PayController {

    @RequestMapping("wx")
    fun getWXParams(): String? {
        return URL("https://api.mch.weixin.qq.com/pay/unifiedorder")
                .request("POST","<xml>\n" +
                        "   <appid>wx2421b1c4370ec43b</appid>\n" +
                        "   <attach>支付测试</attach>\n" +
                        "   <body>APP支付测试</body>\n" +
                        "   <mch_id>10000100</mch_id>\n" +
                        "   <nonce_str>1add1a30ac87aa2db72f57a2375d8fec</nonce_str>\n" +
                        "   <notify_url>http://wxpay.wxutil.com/pub_v2/pay/notify.v2.php</notify_url>\n" +
                        "   <out_trade_no>1415659990</out_trade_no>\n" +
                        "   <spbill_create_ip>14.23.150.211</spbill_create_ip>\n" +
                        "   <total_fee>1</total_fee>\n" +
                        "   <trade_type>APP</trade_type>\n" +
                        "   <sign>0CB01533B8C1EF103065174F50BCA001</sign>\n" +
                        "</xml>")
    }
}