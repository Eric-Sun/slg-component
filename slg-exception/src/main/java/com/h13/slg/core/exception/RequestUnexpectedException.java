package com.h13.slg.core.exception;


/**
 * 用来表现不应该存在的请求错误，按理说程序中是不应该有异常的，如果有异常的话，前端会不允许通过
 * 这种异常需要记录，并且追查原因的，需要跟程序集的异常区分开
 */
public class RequestUnexpectedException extends RequestException {


    public RequestUnexpectedException(int code, String desc) {
        super(code, desc);
    }

    public RequestUnexpectedException(String desc) {
        super(desc);
    }

    public RequestUnexpectedException(int code, String desc, Throwable t) {
        super(code, desc, t);
    }

    public RequestUnexpectedException(String desc, Throwable t) {
        super(desc, t);
    }

    public RequestUnexpectedException(int code) {
        super(code, "");
    }
}
