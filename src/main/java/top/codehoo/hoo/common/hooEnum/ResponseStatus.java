package top.codehoo.hoo.common.hooEnum;

/**
 * @author : 殷绪凯
 * @description : 响应枚举类
 * @since : 2023年 03月 08日 10:29
 */
public interface ResponseStatus {

    /**
     * 状态码
     * @return 状态码
     */
    Integer getCode();

    /**
     * 返回信息
     * @return 返回信息
     */
    String getMessage();

}
