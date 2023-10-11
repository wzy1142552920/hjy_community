package com.lucky.hjycommunity.common.core.exception;

import com.lucky.hjycommunity.common.core.domain.BaseResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author ：LuckyDog
 * @description：TODO
 * @date ：2023/10/11 22:36
 */

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BaseException.class)
    @ResponseBody
    public BaseResponse baseExceptionHandler(BaseException e){

        return BaseResponse.fail(e.getDefaultMessage());
    }

    /**
     * 业务异常处理
     */
    @ExceptionHandler(CustomException.class)
    public BaseResponse businessException(CustomException e){

        return BaseResponse.fail(e.getCode()+"",e.getMsg(),e.isSuccess());
    }
}
