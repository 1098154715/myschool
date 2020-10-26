package com.example.cxk.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradePayModel;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.request.AlipayTradePayRequest;
import com.alipay.api.response.AlipayTradePayResponse;
import com.example.cxk.demo.config.ConfigProperty;
import com.example.cxk.demo.dto.submit.AliPaySubmit;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * 支付接口,
 */
@Api(value = "用户支付", tags = "用户支付")
@RestController
@RequestMapping(value = "/pay")
public class PayController extends BaseController {
    @Autowired
    ConfigProperty configProperty;
    @ApiOperation(value = "用户支付，用户通过扫码，支付给商户")
    @GetMapping("/aliPay")
    public void aliPay(AliPaySubmit paySubmit, BindingResult bindingResult) throws IOException {
        super.checkParameter(bindingResult);
        // 1 创建AlipayClient(String serverUrl, String appId, String privateKey, String format, String charset, String alipayPublicKey, String signType
        AlipayClient alipayClient =  new DefaultAlipayClient( ConfigProperty.gatewayUrl, ConfigProperty.APP_ID, ConfigProperty.APP_PRIVATE_KEY, "json", ConfigProperty.CHARSET,
                ConfigProperty.ALIPAY_PUBLIC_KEY,
                ConfigProperty.sign_type);
        AlipayTradePayRequest request = new AlipayTradePayRequest();
        AlipayTradePayModel model = new AlipayTradePayModel();
        request.setBizModel(model);

        model.setOutTradeNo(System.currentTimeMillis()+"");
        model.setSubject(paySubmit.getSubject());
        model.setTotalAmount(paySubmit.getTotal_amount().toString());
        model.setAuthCode(paySubmit.getPayCode());//沙箱钱包中的付款码
        model.setScene("bar_code");


        AlipayTradePayResponse response = null;
        try {
            response = alipayClient.execute(request);

            System.out.println(response.getBody());
            System.out.println(response.getTradeNo());
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }


    }




}
