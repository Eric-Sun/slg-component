package com.h13.slg.core.exception;


/**
 * 用来表现正常情况下的程序级错误，需要特殊处理的异常类型，比如空指针等
 */
public class RequestFatalException extends Exception {
    private int code;     // 1001 默认请求失败错误码
    private String desc;


    public RequestFatalException(int code, String desc) {
        this.code = code;
        this.desc = desc;

    }

    public RequestFatalException(String desc) {
        this.desc = desc;

    }

    public RequestFatalException(int code, String desc, Throwable t) {
        this.code = code;
        this.desc = desc;

    }

    public RequestFatalException( String desc, Throwable t) {
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
