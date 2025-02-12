package com.cyber.orange.creator.common.base;


import lombok.Data;

/**
 * @author huangchuanju
 * @date 2025/2/6 9:08
 * @description 基础响应
 */
@Data
public class Result<T> {

    private int code;
    private String msg;
    private T data;

    public static final int SUCCESS = 200;
    public static final int FAIL = -1;

    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<T>();
        result.setCode(SUCCESS);
        result.setData(data);
        result.setMsg("success");
        return result;
    }

    public static <T> Result<T> success() {
        return success(null);
    }

    public static <T> Result<T> fail() {
        Result<T> result = new Result<T>();
        result.setCode(-1);
        result.setMsg("failed");
        return result;
    }
}
