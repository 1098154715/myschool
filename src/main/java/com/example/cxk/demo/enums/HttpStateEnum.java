package com.example.cxk.demo.enums;

/**
 * http自定义状态类
 * @author cxk
 * @date 2020/8/7 10:52
 */
public enum HttpStateEnum {
    /**
     * 请求错误
     */
    FAILED(0, "请求失败"),
    /**
     * 接口调用成功
     */
    SUCCESS(1, "请求成功"),
    /**
     * 登录超时
     */
    LOGIN_TIMEOUT(1000, "登录超时"),
    /**
     * 请求参数有误
     */
    PARAMETER_ERROR(1001, "请求参数有误"),
    /**
     * 未知异常
     */
    UNKNOWN_ERROR(1100, "未知异常");

    /**
     * 状态
     */
    private final Integer status;
    /**
     * 响应说明
     */
    private final String message;

    HttpStateEnum(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
