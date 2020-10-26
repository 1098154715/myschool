package com.example.cxk.demo.util;

import lombok.SneakyThrows;
import org.bouncycastle.util.encoders.UTF8;
import org.springframework.util.DigestUtils;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 加密工具类
 * @author cxk
 * @date 2020/8/7 11:47
 */
public class EncryptUtil {
     private static final String  salt="%%&&$$**";//加盐，保证无法可逆
    public static String md5eEncrypt(String str){
        String stringMD5;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update((str+salt).getBytes(StandardCharsets.UTF_8));
            byte[] bytes = md.digest();
            int i;
            StringBuilder buf = new StringBuilder("");
            for (byte aByte : bytes) {
                i = aByte;
                if (i < 0) {
                    i += 256;
                }
                if (i < 16) {
                    buf.append("0");
                }
                buf.append(Integer.toHexString(i));

            } // end for (int offset = 0...

            stringMD5 = buf.toString();
        } catch (Exception e) {
            e.printStackTrace();
            stringMD5 = "";
        }

        return stringMD5;
    }
    public static String md5ToHex(String text) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update((text+salt).getBytes(StandardCharsets.UTF_8));

            byte[] bytes = md.digest();

            StringBuilder buf = new StringBuilder(bytes.length * 2);

            for (byte b : bytes) {
                // 使用String的format方法进行转换
                System.out.println("原来的数字："+  b);
                buf.append(String.format("%02x", b & 0xff));
                System.out.println("后来的数字："+(b & 0xff));
            }

            return buf.toString().toUpperCase();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String md5Spring(String text) throws UnsupportedEncodingException {
            String md5= DigestUtils.md5DigestAsHex((text+salt).getBytes("UTF-8"));
            return md5;

    }

}
