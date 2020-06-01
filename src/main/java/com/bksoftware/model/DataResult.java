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

    public static DataResult badRequest(Object data) {
        return new DataResult("bad request", data);
    }

    public static DataResult serverError(Object data) {
        return new DataResult("server error", data);
    }
}
