package com.wjh.log;

public class Logger {

	public static void loggerBefore(String str) {
		System.out.println("Logger Before!" + str);
	}
	
	public static void loggerAfter(String str) {
		System.out.println("Logger After" + str);
	}
}
