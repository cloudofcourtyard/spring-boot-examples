package indi.tutubrother.logaop.annotation;

import java.lang.annotation.*;

/**
 * @author tutubrother
 * @description
 * @date 2020/5/16 10:32
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogService {

    String value();
}
