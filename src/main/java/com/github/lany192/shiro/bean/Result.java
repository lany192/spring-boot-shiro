package com.github.lany192.shiro.bean;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Result {

    // http 状态码
    private int code;

    // 返回信息
    private String msg;

    // 返回的数据
    private Object data;

    public Result(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
