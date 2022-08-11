package indi.tutubrother.transaction.service;

import indi.tutubrother.transaction.dao.UserInfoMapper;
import indi.tutubrother.transaction.po.UserInfoPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tutubrother
 * @description
 * @date 2020/5/19 21:48
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfoPo> list() {
        return userInfoMapper.selectList(null);
    }
}
