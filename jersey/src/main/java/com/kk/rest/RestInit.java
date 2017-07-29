package com.kk.rest;

import com.alibaba.fastjson.support.jaxrs.FastJsonProvider;
import org.codehaus.jackson.jaxrs.JacksonJsonProvider;
import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by kk on 2017/7/25.
 */
public class RestInit  extends ResourceConfig {

    public RestInit() {

        packages("com.kk.rest");//包路径下符合要求的类将被发布成webservice
        register(LoggingFilter.class);//注册logger
        register(FastJsonProvider.class);
        //register(JacksonJsonProvider.class);//注册json支持
    }

}