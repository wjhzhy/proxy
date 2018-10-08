package com.wjh.inte.impl;

import com.wjh.inte.IHello;

public class Hello implements IHello{

	@Override
	public void sayHello(String str) {
		System.out.println("Hello World!" + str);
	}

}
