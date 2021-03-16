package com.yyqdemao.comment.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

    public static CommonResult success() {
        return new CommonResult(200, "操作成功", null);
    }

    public static CommonResult error() {
        return new CommonResult(500, "操作失败", null);
    }
}
