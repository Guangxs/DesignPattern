package com.angus.calculator;

/** 
 * @author GuangSIR 
 * @date 2018年3月17日 上午11:31:10 
 * @version 1.0 
 */
public class Client {
	public static void main(String[] args) {
		CalculatorForm form = new CalculatorForm();
		AbstractCommand cmd;
		cmd = new ConcreteCommand();
		form.setCommand(cmd); // 向发送者注入命令对象
		
		form.compute(10);
		form.compute(15);
		form.compute(3);
		form.undo();
		form.redo();
		form.undo();
		form.undo();
		form.undo();
		form.undo();
		form.redo();
		form.redo();
		form.redo();
		form.redo();
		form.redo();
		form.compute(3);
		form.undo();
		form.redo();
		form.redo();
		form.compute(10);
		form.compute(15);
		form.compute(3);
		form.redo();
	}
}
