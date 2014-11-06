package com.h13.slg.core.exception;


public class RequestException extends Exception {

    private int code;
    private String desc;


    public RequestException(int code, String desc) {
        super(desc);
        this.code = code;
        this.desc = desc;

    }

    public RequestException(String desc) {
        super(desc);
        this.desc = desc;

    }

    public RequestException(int code, String desc, Throwable t) {
        super(desc, t);
        this.code = code;
        this.desc = desc;

    }

    public RequestException(String desc, Throwable t) {
        super(desc, t);
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
