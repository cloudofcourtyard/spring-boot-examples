package indi.tutubrother.transaction.service;

import indi.tutubrother.transaction.po.UserPo;

import java.util.List;

/**
 * @author tutubrother
 * @description
 * @date 2020/5/19 21:47
 */
public interface UserService {

    List<UserPo> list();
}
