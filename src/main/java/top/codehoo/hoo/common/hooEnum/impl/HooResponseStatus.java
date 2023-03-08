package top.codehoo.hoo.common.hooEnum.impl;

import lombok.Getter;
import top.codehoo.hoo.common.hooEnum.ResponseStatus;

/**
 * @author : 殷绪凯
 * @description : 响应枚举类
 * @since : 2023年 03月 08日 10:29
 */
@Getter
public enum HooResponseStatus implements ResponseStatus {
    /**
     * 操作成功！
     */
    SUCCESS(200, "操作成功！"),
    /**
     * 操作异常！
     */
    ERROR(500, "操作异常！"),
    /**
     * 权限不足！
     */
    ACCESS_DENIED(403, "权限不足！"),
    /**
     * 请求不存在！
     */
    REQUEST_NOT_FOUND(404, "请求不存在！"),
    /**
     * 请求方式不支持！
     */
    HTTP_BAD_METHOD(405, "请求方式不支持！"),
    /**
     * 请求异常！
     */
    BAD_REQUEST(400, "请求异常！"),
    /**
     * 参数不匹配！
     */
    PARAM_NOT_MATCH(400, "参数不匹配！"),
    /**
     * 参数不能为空！
     */
    PARAM_NOT_NULL(400, "参数不能为空！"),
    /**
     * 当前用户已被锁定，请联系管理员解锁！
     */
    USER_DISABLED(403, "当前用户已被锁定，请联系管理员解锁！"),
    /**
     * 用户不存在！
     */
    USER_NOT_FOUND(404, "用户不存在！"),
    /**
     * 用户名或密码错误！
     */
    USER_PASSWORD_ERROR(400, "用户名或密码错误！"),
    /**
     * 密码不能为空！
     */
    USER_PASSWORD_NOT_NULL(400, "密码不能为空！"),
    /**
     * 用户未登录！
     */
    USER_NOT_LOGIN(401, "用户未登录！"),
    /**
     * 登录成功
     */
    USER_LOGIN_SUCCESS(200, "登录成功！"),
    /**
     * 登录失败
     */
    USER_LOGIN_ERROR(400, "登录失败！"),
    /**
     * 登录超时
     */
    USER_LOGIN_TIMEOUT(401, "登录超时！");

    /**
     * 状态码
     */
    private final Integer code;
    /**
     * 返回信息
     */
    private final String message;

    HooResponseStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
