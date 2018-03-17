package com.angus.calculator;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����11:16:10 
 * @version 1.0 
 */
// ����������
public abstract class AbstractCommand {
	public abstract int execute(int value); // ��������ִ�з���execute()
	public abstract int undo(); // ������������undo
	public abstract int redo(); // �����ָ�����redo
}