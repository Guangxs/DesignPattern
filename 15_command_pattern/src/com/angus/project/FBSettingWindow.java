package com.angus.project;

import java.util.ArrayList;
import java.util.List;

/** 
 * @author GuangSIR 
 * @date 2018年3月17日 上午9:18:27 
 * @version 1.0 
 */
// 功能设置窗口类
public class FBSettingWindow {
	private String title; // 窗口标题
	// 定义一个ArrayList来存储所有功能键
	private List<FunctionButton> functionButtons = new ArrayList<>();

	public FBSettingWindow(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<FunctionButton> getFunctionButtons() {
		return functionButtons;
	}

	public void setFunctionButtons(List<FunctionButton> functionButtons) {
		this.functionButtons = functionButtons;
	}

	public void addFunctionButton(FunctionButton fb) {
		functionButtons.add(fb);
	}

	public void removeFunctionButtion(FunctionButton fb) {
		functionButtons.remove(fb);
	}

	// 显示窗口及功能键
	public void display() {
		System.out.println("显示窗口：" + this.title);
		System.out.println("显示功能键：");
		for (FunctionButton fb : functionButtons) {
			System.out.println(fb.getName());
		}
		System.out.println("-------------------------------");
	}

}
