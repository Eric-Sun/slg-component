package com.h13.slg.core.exception;


/**
 * 用来表现不应该存在的请求错误，按理说程序中是不应该有异常的，如果有异常的话，前端会不允许通过
 * 这种异常需要记录，并且追查原因的，需要跟程序集的异常区分开
 */
public class RequestUnexpectedException extends Exception {

    private int code;     // 1001 默认请求失败错误码
    private String desc;


    public RequestUnexpectedException(int code, String desc) {
        super(code + ":" + desc);
        this.code = code;
        this.desc = desc;

    }

    public RequestUnexpectedException(int code) {
        this(code, "");
    }

    public RequestUnexpectedException(int code, String desc, Throwable t) {
        super(code + ":" + desc, t);
        this.code = code;
        this.desc = desc;

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
