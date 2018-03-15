package com.angus.pattern;

/** 
 * @author GuangSIR 
 * @date 2018��3��15�� ����9:29:44 
 * @version 1.0 
 */
// ������װ���ࣺ����װ����
public class ScrollBarDecorator extends ComponentDecorator {

	public ScrollBarDecorator(Component component) {
		super(component);
	}

	@Override
	public void display() {
		setScrollBar();
		super.display();
	}

	public void setScrollBar() {
		System.out.println("Ϊ�������ӹ�������");
	}

}