package com.wjh.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.wjh.log.Logger;

public class ProxyTest implements InvocationHandler{

	
	private Object target;
	
	public Object bind(Object object) {
		this.target = object;
		return Proxy.newProxyInstance(this.target.getClass().getClassLoader(), this.target.getClass().getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		Logger.loggerBefore("¿ªÊ¼");
		result = method.invoke(this.target, args);
		Logger.loggerAfter("½áÊø");
		return result;
	}

}
