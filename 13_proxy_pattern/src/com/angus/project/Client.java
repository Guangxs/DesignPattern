package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月16日 下午9:41:11 
 * @version 1.0 
 */
public class Client {
	// 后期代理类可以通过文件反射得到
	// 针对抽象编程，客户端无须分别真实主题类和代理者
	public static void main(String[] args) {
		Searcher searcher = new ProxySearcher();
		String result = searcher.doSearch("Angus", "苹果");
		System.out.println(result);
	}
}
