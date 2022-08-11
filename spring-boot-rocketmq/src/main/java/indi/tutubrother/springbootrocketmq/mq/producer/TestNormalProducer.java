package indi.tutubrother.springbootrocketmq.mq.producer;

import indi.tutubrother.rocktmq.producer.BaseNormalProducer;
import indi.tutubrother.springbootrocketmq.constants.MQConstant;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author tutubrother
 * @description
 * @date 2020/5/11 22:09
 */
@Component
public class TestNormalProducer extends BaseNormalProducer {

    @Value("${rocketmq.namesrvAddress}")
    private String namesrvAddress;

    protected TestNormalProducer() {
        super(MQConstant.Producer.NORMAL_TOPIC, MQConstant.Producer.NORMAL_GROUP);
    }

    @Override
    protected void init() {
        setNamesrvAddress(namesrvAddress);
    }
}
