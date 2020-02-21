SpringBoot2 启动流程

框架初始化
    配置资源加载器
    配置primarySources
    应用环境检测
    系统初始化器
        （上下文刷新即refresh方法调用前，
        用来编码设置一些属性变量通常用在web环境中，
        可以通过order接口排序）
    配置监听器
    配置main方法所在类

框架启动
    计时器开始计时
    Headless模式赋值
    发送ApplicationStartingEvent
    配置环境模块
    发送ApplicationEnvironmentPreparedEvent
    打印banner
    创建应用上下文对象
    初始化失败分析器
    关联springboot组件与应用上下文对象
    发送ApplicationContextInitializedEvent
    加载sources到context
    发送ApplicationPreparedEvent
    刷新上下文
    计时器停止计时
    发送ApplicationStartedEvent
    调用框架启动扩展类
    发送ApplicationReadyEvent

自动化装配
    收集配置文件中的配置工厂类
    加载组件工厂
    注册组件内定义Bean
    
    
    
    
    
    
    
    
    
    
    
    
    xml配置bean的常用方式： 无参构造、有参构造、静态工厂方法、实例工厂方法
    优点：低耦合、对象关系清晰、集中管理
    缺点：配置繁琐、开发效率稍低、文件解析耗时
    
    
    注解配置bean的方式： @Component声明、
                        配置类中使用@Bean、
                        实现FactoryBean、
                        实现BeanDefinitionRegistryPostProcessor
                        实现ImportBeanDefinitonRegistrar