package com.yuemaz.wiki.resp;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author yuemaz
 * @Date 2022/6/25 8:19
 */
@Data
@Accessors(chain = true)
@SuppressWarnings("all")
public class Result<T> {

    private Integer code;

    private boolean success;

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    public static Result ok() {
        Result result = new Result();
        result.setCode(200)
                .setSuccess(true)
                .setMessage("成功");
        return result;
    }

    public static Result fail() {
        Result result = new Result();
        result.setCode(201)
                .setSuccess(false)
                .setMessage("失败");
        return result;
    }
}
