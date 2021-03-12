package com.jackson.business.base;

import java.util.Date;

public class ApiResponse {

    private int code;

    /**
     * api错误码描述
     */
    private String msg;

    /**
     * 错误详细备注
     */
    private String note;

    /**
     * 接口响应数据
     */
    private Object data;

    /**
     * 服务端响应时间戳
     */
    private long timestamp;

    /**
     * 服务端接口响应版本
     */
    private String version = "v1.0.0";

    private ApiResponse() {
    }

    public static ApiResponse response() {
        return getInstance();
    }

    public static ApiResponse response(Object data) {
        ApiResponse instance = getInstance();
        instance.setData(data);
        return instance;
    }

    public static ApiResponse responseFail() {
        ApiResponse instance = getInstance();
        instance.setCode(500);
        instance.setMsg("Fail");
        instance.setNote("失败");
        return instance;
    }

    private static ApiResponse getInstance() {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setCode(200);
        apiResponse.setMsg("Success");
        apiResponse.setNote("成功");
        apiResponse.setData(null);
        apiResponse.setTimestamp(new Date().getTime());
        apiResponse.setVersion("");
        return apiResponse;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

}
