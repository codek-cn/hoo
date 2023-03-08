package top.codehoo.hoo.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;

/**
 * @author : 殷绪凯
 * @description : 异常基类
 * @since : 2023年 03月 08日 11:08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = -5868908984238937392L;

    private Integer code;
    private String message;

    @Override
    public String getMessage() {
        String message = super.getMessage();
        return message == null ? this.message : message;
    }
}
