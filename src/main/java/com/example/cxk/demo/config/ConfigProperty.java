package com.example.cxk.demo.config;

import com.alipay.easysdk.kernel.Config;
import org.checkerframework.checker.units.qual.C;
import org.springframework.context.annotation.Configuration;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author cxk
 * @date 2020/7/15 13:38
 */
@Configuration
public class ConfigProperty{

    // 应用ID,您的APPID，2088102181057072收款账号既是您的APPID对应支付宝账号,开发时使用沙箱提供的APPID，生产环境改成自己的APPID
    public static String APP_ID = "2016102500760139";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String APP_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCakX+nMLMx4jLEXvElXFY1HWW1iRTYPJrknqgbQt1BVdTJYXtxZx9j9F8pe+biPFvoL2OcsFlwHRtULpeBkAc9XV+N5klm955i/hwyJp0Wo0lGbWthgDP/hiqQSzxeSUMcSyjsnRHkhfEqxVoIWXEveOGn996viEABJVTJE5Jfm+EBAncSGX4m+mCEAATnC84hjwOkUBfxPnlGMZ6dB1nPZ1xlCYmRRUAAH/bQF7f5ehZCNVcgk2sZdi3K9rl89pvJvfef42HSv6dMFrTT0TzUoLEdo6AzQ9gY5FU0kwWBvUA1iN6ijgTl45c4NHqvo1wvyhPlSkxes9/mRbIht29/AgMBAAECggEBAJdQ5SUpmeO1y3lOcMjgckyhMNbdEhj2i7RQVcYKWUwC2MMkuZI1IBfcPeUAtPC5okfVTLEyOvx0ojJxQkTGWTAL3uWtkiJJOzcyCSxXfOWSiMN3ju3ucfkuwTBtVvX+xsJGGhQ5WDDdp1D1zsPpu9J7hn3HPKueuPnmL/CBRoRtMM4WlAG9f2a6+y3Q8aBJneXM3qmbUFbADKfoU67BpINi3Bh//EFU/QF2/O4RdcAJDbwI0bkeNT8qf1pXAB8Rt2dFbbiCRtFaSwQtqviCIqMhIYHssAV75G91HfYzMPuHzchyPesHoY7t9Oc9Sa1/DQL9T14tmNKcFU/PiHYLxmECgYEA110Ly+/+/iPlrguGR4OMpb6pQUd0dZZWtdzessLeTOTcs/tfMjaITf91gn/L5FqOWL+9NMYmRu9OHIYmvsdfKsNaPVHDzefSQ63c6QRXJ/D41JLQQqRdzoeWv+DjC/pShOWRR2C6CnIEDsVc8z07hAqd3k4wlyaIRVRvZOnBB3cCgYEAt7vLkQdEiy78pyKptCBoy9VItozLsqBtmnDUVuVFiPlKro9lW0R76ZsDSA8GFmjwXJ3S0sIK9UyDQZok86N2Apj+B+XaT75UNrwoOhbpf3oiFdALxTrFR1BSPwG5oldhX6AvXRuMYHJTseS8aItG/tFMaI3xc4ZXetMQkJDm6jkCgYEAgm09WbLtEOiYjsE3/1Nx+GbxhjFKHHSB6v3qeQR/ML5h0zZnPre78NDHT9MpnhAhqSnl4nImeEsxWSD9kgiYYAOTQROlq6u7sXU4Fn6kcfIEIGkRa2qzzQJcj7QYjQZ6tzV4uGuh//Vw86kfU8g/pQXw+dMMpl2VpbcvB0RxvJ0CgYBxtSBbpgLOnIqyKSqbln8kvt+cUnByIQUT0oYnLQcmqRmGBKq2nCCPx2Z1fw7GabVvrCDgXESJ4QtOW0ZJHj2Xh/WXD7JXLbRSl4nRwYJKaVyU4UeXjTKwWs47viaTiL5zfuAxIC51NewEKUpM7P1IEGHYRxhJ5bdYBS24OmUeSQKBgFoSOw1nqlqJMHo/jQ5jQ64jJsTZtkD+fvlCC27T/kFgFRmegFj+bAXpHxoB0rZoqGz8kHX2yoGGqx6wMV8NWCb/aQJzZxtc9tKKnBJNJRsn1RCeTYRciUp9L1YOEagSFXgcD9UhoHgUtqFbJJ9lc7iVS3roGeOLVcNUuxaDJrJO";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。"你自己的支付宝公钥，注意是支付宝公钥，不是应用公钥"

    public static String ALIPAY_PUBLIC_KEY ="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtzEfZTFJofYx2a+RZOtUBHbad+ldSnqG6S2Kpqge01Z7+XebkfRN2YfrEftPeFmG+uk0er+MCt5bwUYDO6ELCdTZyaWtSGeWEAGMPitiW+QmMKT2eHMGGlb7R9VcQyyneTwMTzhoWhh0SAF3FY17e1slB+AGrouDwb0wyryAoT2wha4A8CC2Jop8x9pJ1z37PzISybnekQ2I47YrOW2DT3M58DtVvP1NL8w9Jy2oirsMvP3+RRh+Xt7eloEp0Z3/qjgpiboVm7m3AB8aOJy8NuX6QYsvKNUSbQjdN8cEYRAHeWInXidhPfS1xhGCmUBznwB2f9QYlifUqPMMz6AARQIDAQAB";
    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://127.:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问(其实就是支付成功后返回的页面)
    public static String return_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String CHARSET = "utf-8";

    // 支付宝网关，这是沙箱的网关
    //https://openapi.alipaydev.com/gateway.do
    //https://openapi.alipaydev.com/gateway.do
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "D:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    public Config getConfig() {
        Config config=new Config();
        config.protocol = "https:www.baidu.com";
        config.gatewayHost = "https://openapi.alipaydev.com/gateway.do";
        config.signType = "RSA2";
        // "<-- 请填写您的AppId，例如：2019091767145019 -->"
        config.appId =APP_ID;


        // 为避免私钥随源码泄露，推荐从文件中读取私钥字符串而不是写入源码中
        config.merchantPrivateKey = APP_PRIVATE_KEY;

      /*  //注：证书文件路径支持设置为文件系统中的路径或CLASS_PATH中的路径，优先从文件系统中加载，加载失败后会继续尝试从CLASS_PATH中加载
        config.merchantCertPath = "<-- 请填写您的应用公钥证书文件路径，例如：/foo/appCertPublicKey_2019051064521003.crt -->";
        config.alipayCertPath = "<-- 请填写您的支付宝公钥证书文件路径，例如：/foo/alipayCertPublicKey_RSA2.crt -->";
        config.alipayRootCertPath = "<-- 请填写您的支付宝根证书文件路径，例如：/foo/alipayRootCert.crt -->";*/

        //注：如果采用非证书模式，则无需赋值上面的三个证书路径，改为赋值如下的支付宝公钥字符串即可
         config.alipayPublicKey = ALIPAY_PUBLIC_KEY;

        //可设置异步通知接收服务地址（可选）
        config.notifyUrl=notify_url;
        return config;
    }

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */

    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}