package service.impl;

import service.DemoProviderService;

/**
 * Created by dmchrl on 2018/8/4.
 */
public class DemoProviderServiceImpl implements DemoProviderService{
    public String sayHello(String name) {
        return "服务1："+name;
    }
}
