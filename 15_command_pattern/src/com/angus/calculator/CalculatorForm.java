package com.angus.calculator;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����11:22:17 
 * @version 1.0 
 */

// ����������ࣺ��������
public class CalculatorForm {
	private AbstractCommand cmd;
	
	
	public void setCommand(AbstractCommand cmd){
		this.cmd = cmd;
	}
	
	// ������������execute()����ִ������
	public void compute(int value){
		int result = cmd.execute(value);
		System.out.println("ִ�����㣬���Ϊ��" + result);
	}
	
	// �����������undo()�������г���
	public void undo(){
		int result = cmd.undo();
		System.out.println("ִ�г��������Ϊ��" + result);
	}
	
	// �����������undo()�������г���
		public void redo(){
			int result = cmd.redo();
			System.out.println("�ָ����������Ϊ��" + result);
		}
}