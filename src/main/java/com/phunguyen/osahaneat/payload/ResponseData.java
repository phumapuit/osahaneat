package com.phunguyen.osahaneat.payload;

/**
 * status code (200, 404,...)
 * desc (mô tả)
 * data
 */
public class ResponseData {
    private int status = 200;
    private String desc;
    private Object data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}