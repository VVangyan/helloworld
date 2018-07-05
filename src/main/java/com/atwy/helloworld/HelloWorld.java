package com.atwy.helloworld;

/**
 * @author:yan
 * @date :2017年10月25日
 * @desc :HelloWorld
 */
public class HelloWorld {
	public static void main(String[] args) {
		PrintHelloWorld.helloWorld("Hello world!");
		
	}
}

class PrintHelloWorld {
	public static void helloWorld(String str) {
		System.out.println(str);
	}
}