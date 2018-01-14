package com.shiyanlou.demo.helloworld;

public class HelloWorld {
	
	private String name;

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 创建打印hello方法
	 */
	public void printHello() {
		System.out.println("Hello,"+name);
	}
}
