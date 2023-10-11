package com.lucky.hjycommunity.web.test;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author spikeCong
 * @date 2023/3/1
 **/
@Data
@AllArgsConstructor
public class User {

    @NotNull(message = "userId 不能为空")
    private String userId;

    private String username;

}
