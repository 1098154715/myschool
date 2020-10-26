package com.example.cxk.demo.util;

import lombok.Data;

/**
 * @author cxk
 * @date 2020/8/7 10:45
 */
@Data
public class RespMassage<T> {
    /**
     * 标识接口状态
     */
    private Integer status;
    /**
     * 接口返回消息
     */
    private String message;
    /**
     * 接口返回对象
     */
    private T data;

    public RespMassage() {
    }

    public RespMassage(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public RespMassage(Integer status, T data) {
        this.status = status;
        this.data = data;
    }

    public RespMassage(Integer status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }
}
