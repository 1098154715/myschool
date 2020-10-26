package com.example.cxk.demo.error;

/**
 * @author cxk
 * @date 2020/8/7 10:20
 */
public class ParamErrorException extends RuntimeException {
    public ParamErrorException(String message) {
        super(message);
    }

    public ParamErrorException(String message, Throwable cause) {
        super(message, cause);
    }

}
