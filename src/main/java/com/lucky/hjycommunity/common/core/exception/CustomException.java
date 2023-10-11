package com.lucky.hjycommunity.common.core.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.poi.ss.formula.functions.T;

import javax.servlet.http.HttpServletResponse;

/**
 * @author ：LuckyDog
 * @description：TODO
 * @date ：2023/10/11 22:37
 */

@Data
@AllArgsConstructor
public class CustomException extends RuntimeException {
    /**
     * 状态码
     */
    private int code;

    /**
     * 返回消息
     */
    private String msg;

    /**
     * 数据部分
     */
    private T data;

    /**
     * 是否成功
     */
    private boolean success;

    public CustomException(int code, String msg) {
        this.code = code;
        this.msg = msg;
        this.success = HttpServletResponse.SC_OK == code;
    }

    public CustomException(int code, String msg, boolean success) {
        this.code = code;
        this.msg = msg;
        this.success = success;
    }

}
