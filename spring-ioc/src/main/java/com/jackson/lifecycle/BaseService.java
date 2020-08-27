package com.jackson.lifecycle;

import org.springframework.beans.factory.*;

public interface BaseService extends BeanNameAware
        , BeanClassLoaderAware, BeanFactoryAware, InitializingBean, DisposableBean {

    void init();

    void close();

    void sayHello();

}