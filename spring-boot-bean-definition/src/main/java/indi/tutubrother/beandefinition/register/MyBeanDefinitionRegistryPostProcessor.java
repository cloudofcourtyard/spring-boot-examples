package indi.tutubrother.beandefinition.register;

import indi.tutubrother.beandefinition.beans.MyBean;
import indi.tutubrother.beandefinition.beans.NormalBean1;
import indi.tutubrother.beandefinition.beans.NormalBean2;
import indi.tutubrother.beandefinition.beans.NormalBean3;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.Configuration;

/**
 * @author tutubrother
 * @description
 * @date 2020/5/17 21:13
 */
@Configuration
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        registerBean("normalBean1", NormalBean1.class, beanDefinitionRegistry);
        registerBean("normalBean2", NormalBean2.class, beanDefinitionRegistry);
        registerBean("normalBean3", NormalBean3.class, beanDefinitionRegistry);
        registerBean("myBean1", MyBean.class, beanDefinitionRegistry, "MyBean1");
        registerBean("myBean2", MyBean.class, beanDefinitionRegistry, "MyBean2");
    }

    private void registerBean(String name, Class<?> clz, BeanDefinitionRegistry beanDefinitionRegistry, Object... args) {
        if (beanDefinitionRegistry.isBeanNameInUse(name)) {
            throw new RuntimeException("exist beanName");
        }
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(clz);
        for (Object arg : args) {
            beanDefinitionBuilder.addConstructorArgValue(arg);
        }
        AbstractBeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();
        beanDefinitionRegistry.registerBeanDefinition(name, beanDefinition);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        //??????????????????????????????????????????????????????????????????????????????????????????????????????
    }
}