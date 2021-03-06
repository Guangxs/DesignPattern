package com.angus.prototypemanager;

/** 
 * @author GuangSIR 
 * @date 2018年3月15日 上午9:55:08 
 * @version 1.0 
 */
// 软件需求规格说明书（Software Requirements Specification）
public class SRS implements OfficialDocument {

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
		System.out.println("《软件规格说明书》");
	}

}
