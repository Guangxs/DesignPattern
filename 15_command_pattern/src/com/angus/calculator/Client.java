package com.angus.calculator;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����11:31:10 
 * @version 1.0 
 */
public class Client {
	public static void main(String[] args) {
		CalculatorForm form = new CalculatorForm();
		AbstractCommand cmd;
		cmd = new ConcreteCommand();
		form.setCommand(cmd); // ������ע���������
		
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