package com.wjh.inte.impl;

import java.lang.reflect.Method;
import java.util.Date;

import com.wjh.inte.ILogger;

public class Logger implements ILogger{

	@Override
	public void begin(Method method) {
		System.out.println(new Date() + method.getName() + "sysHello begin");
	}

	@Override
	public void end(Method method) {
		System.out.println(new Date() + method.getName()  +  "sysHello end");
	}


}
