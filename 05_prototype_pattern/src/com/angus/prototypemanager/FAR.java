package com.angus.prototypemanager;

/** 
 * @author GuangSIR 
 * @date 2018��3��15�� ����9:50:30 
 * @version 1.0 
 */
// �����Է������棨Feasibility Analysis Report��
public class FAR implements OfficialDocument {

	@Override
	public OfficialDocument clone() {
		OfficialDocument od = null;
		try {
			od = (OfficialDocument) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return od;
	}

	@Override
	public void display() {
		System.out.println("�������Է������桷");
	}

}