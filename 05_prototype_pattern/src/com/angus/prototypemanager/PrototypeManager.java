package com.angus.prototypemanager;

import java.util.Hashtable;

/** 
 * @author GuangSIR 
 * @date 2018年3月15日 上午9:57:19 
 * @version 1.0 
 */
public class PrototypeManager {
	// 定义一个Hashtable，用于存储原型对象
	private Hashtable<String, OfficialDocument> hashtable = new Hashtable<>();
	private static PrototypeManager pm = new PrototypeManager();

	// 采用饿汉式单例模式创建PrototypeManager对象
	private PrototypeManager() {
		hashtable.put("far", new FAR());
		hashtable.put("srs", new SRS());
		hashtable.put("prp", new PRP());
	}

	public static PrototypeManager getPrototypeManager() {
		return pm;
	}

	// 增加新的公文对象
	public void addOfficialDocument(String key, OfficialDocument od) {
		hashtable.put(key, od);
	}

	// 通过浅克隆获取新的公文对象
	public OfficialDocument getOfficialDocument(String key) {
		return hashtable.get(key).clone();
	}
}
