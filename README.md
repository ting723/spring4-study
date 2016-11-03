# Spring In Action Fourth Editon Study

> 以下内容从《Spring in Action》第四版 摘抄或总结

## 第一部分 Spring的核心

### 1 Spring 之旅

#### 1.1 Spring简化Java开发的发方式 

+ DI(Dependecy Injection) 依赖注入
+ AOP (aspect-oriented programming, AOP)
+ 使用模板消除样板代码
+ DI和面向接口编程
+ 切面和惯例
+ 切面和模板
+ 基于POJO轻量级和减小侵入性

#### 1.2 DI 

* 对象间依赖关系有系统中第三方组件在创建对象时设定
* DI实现方式之以构造器注入
* DI让相互协作的软件组件保持松耦合

#### 1.3 AOP 实现方式

* 把遍布各处的功能分离
* 切面(要插入的功能点如安全等)和切点(需要插入功能点(安全等)的业务功能模块)
* AspectJ的切点表达式语言

#### 1.4 使用模板

* 对模板代码进行抽象
* 最常见实例:JDBC连接数据库

#### 1.5 Spring 容器

##### 1.5.0 基本

* spring容器使用DI管理构成应用的组件
* 两种类型:</br>
 bean工厂(org.springframework.beans.factory.BeanFactory)</br>
 应用上下文(org.springframework.context.ApplicationContext)</br>
* 应用上下文最常用

##### 1.5.1 应用上下文

* AnnotationConfigApplicationContext 基于Java配置类加载Spring上下文
* AnnotationConfigWebApplicationContext 基于Java配置类加载Spring Web应用上下文
* ClassPathXmlApplicationContext 从类路径(包括Jar文件)下的一个或多个xml配置文件中加载上下文
* FileSystemXmlApplicationContext 从文件系统下的一个或多个xml配置文件中加载上下文定义
* XmlWebApplicationContext 从Web应用下的一个或多个xml配置文件中加载上下文定义

##### 1.5.2 bean的生命周期

* 实例化->填充属性->调用BeanNameAware的setBeanName()方法->调用BeanFactoryAware的setBeanFactory()方法</br>
->调用ApplicationContextAware的setApplicationContext()方法->调用BeanPostProcessor的预初始化方法</br>
->调用InitializingBean的afterPropertiesSet()方法->调用自定义方法的初始化方法->调用BeanPostProcessor的初始化后方法</br>
->bean可以使用了
--- 容器关闭
调用DisposableBean的destory()方法->调用自定义的销毁方法

#### 1.6 Spring模块

* Spring4中有20个不同模块,每个模块3个JAR文件(二进制,源码Jar,JavaDoc)
* Spring 框架模块</br>
Spring核心容器 
>Beans  Core Context Expression [Context Support]

面向切面编程

> AOP Aspects

数据访问与集成

> JDBC Transaction ORM OXM Messaging JMS

Web与远程调用

>Web [Web servlet] [Web portlet] [WebSocket]

Instrumentation

>Instrument  [Instrument Tomcat]

测试

>Test

#### 其他点

* 装配 -> 创建应用组件之间协作的行为
* Spring Portfolio
>Spring Web Flow  
Spring Web Service   
Spring Security   
Spring Integration    
Spring Batch     
Spring Data   
Spring Social   
Spring Mobile   
Spring for Android
Spring Boot

#### 非中心知识点

* mock框架Mockito
* SpEl

#### 难点

* aop中proxy-target-class理解和原理
