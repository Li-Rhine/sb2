package com.mooc.sb2.ioc.ann;

import com.mooc.sb2.ioc.xml.Bird;
import com.mooc.sb2.ioc.xml.Monkey;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

/**
 * @Description：
 * @Author： Rhine
 * @Date： 2020/2/20 16:22
 **/
public class MyBeanImport implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry registry) {
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();
        rootBeanDefinition.setBeanClass(Bird.class);
        registry.registerBeanDefinition("bird", rootBeanDefinition);
    }
}
