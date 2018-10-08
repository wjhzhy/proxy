package com.wjh.inte;

import java.lang.reflect.Method;

public interface ILogger {
	
	public void begin(Method method);
	public void end(Method method);

}
