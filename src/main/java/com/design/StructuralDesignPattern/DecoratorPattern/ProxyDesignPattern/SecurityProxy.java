package com.design.StructuralDesignPattern.DecoratorPattern.ProxyDesignPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by sahilk on 22/11/16.
 */
public class SecurityProxy implements InvocationHandler {

    Object obj;

    public SecurityProxy(Object obj) {
        this.obj = obj;
    }

    public static Object newInstance(Object object){
        return  Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), new
                SecurityProxy(object));
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        try {
            if (method.getName().contains("post")) {
                throw new IllegalAccessException("The post is not allowed");
            } else {
                result = method.invoke(obj, args);
                return result;
            }
        }catch (InvocationTargetException e){
            throw e.getTargetException();
        }

    }
}
