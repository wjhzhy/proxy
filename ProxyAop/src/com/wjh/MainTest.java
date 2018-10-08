package com.wjh;

import com.wjh.inte.IHello;
import com.wjh.inte.impl.Hello;
import com.wjh.inte.impl.Logger;
import com.wjh.proxy.ProxyOK;

public class MainTest {
	
	
	public static void main(String[] args) {
	
		
/*		IHello proxy = new ProxyHello(new Hello());
		proxy.sayHello("执行");
*/
		
		/*IHello proxy = (IHello) new ProxyTest().bind(new Hello());
		
		proxy.sayHello("执行");*/
		
		IHello hello = (IHello) new ProxyOK().bind(new Logger(), new Hello());
		hello.sayHello("明天");
	}
}
