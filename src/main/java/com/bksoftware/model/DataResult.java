package com.bksoftware.model;

public class DataResult {

    private String message;
    private Object data;

    public DataResult(String message, Object data) {
        this.message = message;
        this.data = data;
    }

    public DataResult() {
    }

    public static DataResult success(Object data) {
        return new DataResult("success", data);
    }

    public static DataResult badRequest(String mess) {
        return new DataResult("bad request", mess);
    }

    public static DataResult serverError(String mess) {
        return new DataResult("server error", mess);
    }

    public String getMessage() {
        return message;
    }

    public DataResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getData() {
        return data;
    }

    public DataResult setData(Object data) {
        this.data = data;
        return this;
    }
}
