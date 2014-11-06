package com.h13.slg.core.exception;


/**
 * 用来表现正常情况下的程序级错误，需要特殊处理的异常类型，比如空指针等
 */
public class RequestFatalException extends RequestException {

    public RequestFatalException(int code, String desc) {
        super(code, desc);
    }

    public RequestFatalException(String desc) {
        super(desc);
    }

    public RequestFatalException(int code, String desc, Throwable t) {
        super(code, desc, t);
    }

    public RequestFatalException(String desc, Throwable t) {
        super(desc, t);
    }
}
