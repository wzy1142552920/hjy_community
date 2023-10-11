package com.lucky.hjycommunity.common.core.exception;

import lombok.Getter;

/**
 * @author ：LuckyDog
 * @date ：2023/10/11 22:27
 */

@Getter
public class BaseException extends RuntimeException{

    /* 错误码 */
    private String code;

    /* 错误消息 */
    private String defaultMessage;

    public BaseException(String defaultMessage) {
        this.defaultMessage = defaultMessage;
    }

    public BaseException() {
    }

    public BaseException(String code, String defaultMessage) {
        super(defaultMessage);
        this.code = code;
        this.defaultMessage = defaultMessage;
    }
}
