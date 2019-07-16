package entity;

import lombok.*;

/**
 * @author lory.li
 * @description 通用返回值
 * @date 2019-07-16
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Result {
    private boolean flag;
    private Integer code;
    private String message;
    private Object data;

    public Result(boolean flag, Integer code, String message){
        this.flag = flag;
        this.code = code;
        this.message = message;
    }
}
