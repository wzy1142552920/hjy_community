package com.lucky.hjycommunity.common.core.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ：LuckyDog
 * @description：TODO
 * @date ：2023/10/10 23:32
 */
@Data
public class BaseResponse<T> implements Serializable {

    private static final long serialVersionUID = 1901152752394073986L;

    private int code;

    private String msg;

    private T data;

    private boolean success;

    /**
     * 成功返回
     *
     * @param data
     * @param <T>
     */

    public static <T> BaseResponse<T> success(T data) {
        BaseResponse<T> response = new BaseResponse<>();
        response.setCode(Integer.parseInt(ResultCode.SUCCESS.getCode()));
        response.setMsg(ResultCode.SUCCESS.getMessage());
        response.setSuccess(true);
        response.setData(data);
        return response;
    }

    public static <T> BaseResponse<T> fail(String message) {
        BaseResponse<T> response = new BaseResponse<>();
        response.setCode(Integer.parseInt(ResultCode.ERROR.getCode()));
        response.setMsg(ResultCode.ERROR.getMessage());
        return response;
    }

    public static <T> BaseResponse<T> fail(String code, String message) {
        BaseResponse<T> response = new BaseResponse<>();
        response.setCode(Integer.parseInt(code));
        response.setMsg(message);
        return response;
    }

    public static <T> BaseResponse<T> fail(String code, String message, boolean success) {
        BaseResponse<T> response = new BaseResponse<>();
        response.setCode(Integer.parseInt(code));
        response.setMsg(message);
        response.setSuccess(success);
        return response;
    }

}
