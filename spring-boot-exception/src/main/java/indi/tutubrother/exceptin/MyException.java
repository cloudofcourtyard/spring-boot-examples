package indi.tutubrother.exceptin;

import lombok.Getter;

/**
 * @author tutubrother
 * @description
 * @date 2020/5/18 22:00
 */
@Getter
public class MyException extends RuntimeException {

    private String code;

    MyException(String code, String msg) {
        super(msg);
        this.code = code;
    }

    MyException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMsg());
        this.code = errorCodeEnum.getCode();
    }
}
