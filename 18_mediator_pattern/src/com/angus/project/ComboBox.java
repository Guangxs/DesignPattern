package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月17日 下午7:33:02 
 * @version 1.0 
 */

// 组合框类：具体同事类
public class ComboBox extends Component {

	@Override
	public void update() {
		System.out.println("组合框增加一项：张无忌。");
	}

	public void select() {
		System.out.println("组合框选中项：小龙女。");
	}

}
