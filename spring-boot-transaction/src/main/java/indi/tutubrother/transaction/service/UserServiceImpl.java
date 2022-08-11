package indi.tutubrother.transaction.service;

import indi.tutubrother.transaction.dao.UserMapper;
import indi.tutubrother.transaction.po.UserPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tutubrother
 * @description
 * @date 2020/5/19 21:48
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserPo> list() {
        return userMapper.selectList(null);
    }
}
