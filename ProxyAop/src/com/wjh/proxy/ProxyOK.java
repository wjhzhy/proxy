package com.wjh.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyOK implements InvocationHandler{

	
	private Object object;
	private Object target;
	
	public Object bind(Object object,Object target) {
		this.object = object;
		this.target = target;
		return Proxy.newProxyInstance(this.target.getClass().getClassLoader(), this.target.getClass().getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;
		Class clazz = this.object.getClass();
	
		Method begin = clazz.getDeclaredMethod("begin", new Class[] {Method.class});
		begin.invoke(this.object, new Object[] {method});

		method.invoke(this.target, args);
		
		Method end = clazz.getDeclaredMethod("end", new Class[] {Method.class});
		end.invoke(this.object, new Object[] {method});
		
		return result;
	}

}
