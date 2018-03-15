package com.angus.prototypemanager;

import java.util.Hashtable;

/** 
 * @author GuangSIR 
 * @date 2018��3��15�� ����9:57:19 
 * @version 1.0 
 */
public class PrototypeManager {
	// ����һ��Hashtable�����ڴ洢ԭ�Ͷ���
	private Hashtable<String, OfficialDocument> hashtable = new Hashtable<>();
	private static PrototypeManager pm = new PrototypeManager();

	// ���ö���ʽ����ģʽ����PrototypeManager����
	private PrototypeManager() {
		hashtable.put("far", new FAR());
		hashtable.put("srs", new SRS());
		hashtable.put("prp", new PRP());
	}

	public static PrototypeManager getPrototypeManager() {
		return pm;
	}

	// �����µĹ��Ķ���
	public void addOfficialDocument(String key, OfficialDocument od) {
		hashtable.put(key, od);
	}

	// ͨ��ǳ��¡��ȡ�µĹ��Ķ���
	public OfficialDocument getOfficialDocument(String key) {
		return hashtable.get(key).clone();
	}
}