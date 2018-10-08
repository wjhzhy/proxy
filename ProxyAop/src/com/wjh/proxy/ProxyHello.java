package com.wjh.proxy;

import com.wjh.inte.IHello;
import com.wjh.log.Logger;

public class ProxyHello implements IHello{

	private IHello hello;
	
	public ProxyHello(IHello hello) {
		this.hello = hello;
	}
	
	@Override
	public void sayHello(String str) {
		
		Logger.loggerAfter("¿ªÊ¼");

		hello.sayHello(str);

	    Logger.loggerAfter("½áÊø");
	}

}
