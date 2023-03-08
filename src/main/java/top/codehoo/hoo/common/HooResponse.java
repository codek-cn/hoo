package top.codehoo.hoo.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.codehoo.hoo.common.hooEnum.ResponseStatus;
import top.codehoo.hoo.common.hooEnum.impl.HooResponseStatus;

import java.io.Serializable;

/**
 * @author : 殷绪凯
 * @description : 统一响应
 * @since : 2023年 03月 08日 10:25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HooResponse implements Serializable {
    private static final long serialVersionUID = 7503408399628602902L;

    private int code;
    private String message;
    private Object data;

    /**
     * 成功响应
     *
     * @param data 数据
     * @return HooResponse
     */
    public static HooResponse success(Object data) {
        return of(HooResponseStatus.SUCCESS, data);
    }

    /**
     * 失败响应
     *
     * @return HooResponse
     */
    public static HooResponse error() {
        return of(HooResponseStatus.ERROR, null);
    }

    /**
     * 使用枚举类型填充响应状态
     *
     * @param responseStatus 枚举状态
     * @param data           数据
     * @return HooResponse
     */
    public static HooResponse of(ResponseStatus responseStatus, Object data) {
        return new HooResponse(responseStatus.getCode(), responseStatus.getMessage(), data);
    }
}
