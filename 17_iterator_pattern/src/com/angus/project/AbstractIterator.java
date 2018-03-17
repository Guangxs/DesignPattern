package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��17�� ����5:40:05 
 * @version 1.0 
 */
//
interface AbstractIterator {
	public void next(); // ������һ��Ԫ��

	public boolean isLast(); // �ж��Ƿ�Ϊ���һ��Ԫ��

	public void previous(); // ������һ��Ԫ��

	public boolean isFirst(); // �ж��Ƿ�Ϊ��һ��Ԫ��

	public Object getNextItem(); // ��ȡ��һ��Ԫ��

	public Object getPreviousItem(); // ��ȡ��һ��Ԫ��
}