package indi.tutubrother.logaop.service;

import indi.tutubrother.logaop.annotation.LogService;
import org.springframework.stereotype.Service;

/**
 * @author tutubrother
 * @description
 * @date 2020/5/16 10:34
 */
@Service
public class TestServiceImpl implements TestService {

    @Override
    @LogService("在service方法上拦截打印")
    public void log() {

    }
}
