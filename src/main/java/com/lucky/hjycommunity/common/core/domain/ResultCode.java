package com.lucky.hjycommunity.common.core.domain;

/**
 * @author ：LuckyDog
 * 响应码枚举
 * @date ：2023/10/10 7:55
 */
public enum ResultCode {
    SUCCESS("200", "操作成功"),
    ERROR("500", "操作失败");

    private String code;

    private String message;

    ResultCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
