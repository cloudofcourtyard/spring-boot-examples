package indi.tutubrother.transaction.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 * @author tutubrother
 * @description
 * @date 2020/5/19 21:43
 */
@Setter
@Getter
@TableName("tb_user")
public class UserPo {

    private Long id;

    private String name;
}
