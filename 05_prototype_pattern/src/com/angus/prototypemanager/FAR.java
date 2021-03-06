package com.angus.prototypemanager;

/** 
 * @author GuangSIR 
 * @date 2018年3月15日 上午9:50:30 
 * @version 1.0 
 */
// 可行性分析报告（Feasibility Analysis Report）
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
		System.out.println("《可行性分析报告》");
	}

}
