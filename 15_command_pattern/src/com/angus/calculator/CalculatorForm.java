package com.angus.calculator;

/** 
 * @author GuangSIR 
 * @date 2018年3月17日 上午11:22:17 
 * @version 1.0 
 */

// 计算机界面类：请求发送者
public class CalculatorForm {
	private AbstractCommand cmd;
	
	
	public void setCommand(AbstractCommand cmd){
		this.cmd = cmd;
	}
	
	// 调用命令对象的execute()方法执行运算
	public void compute(int value){
		int result = cmd.execute(value);
		System.out.println("执行运算，结果为：" + result);
	}
	
	// 调用命令对象undo()方法进行撤销
	public void undo(){
		int result = cmd.undo();
		System.out.println("执行撤销，结果为：" + result);
	}
	
	// 调用命令对象undo()方法进行撤销
		public void redo(){
			int result = cmd.redo();
			System.out.println("恢复撤销，结果为：" + result);
		}
}
