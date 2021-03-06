package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月17日 下午7:43:12 
 * @version 1.0 
 */
class Client {
	public static void main(String args[]) {

		// 定义同事对象
		Button addBT = new Button();
		List list = new List();
		ComboBox cb = new ComboBox();
		TextBox userNameTB = new TextBox();

		// 定义中介者对象
		ConcreteMediator mediator;
		mediator = new ConcreteMediator();

		addBT.setMediator(mediator);
		list.setMediator(mediator);
		cb.setMediator(mediator);
		userNameTB.setMediator(mediator);

		mediator.addButton = addBT;
		mediator.list = list;
		mediator.cb = cb;
		mediator.userNameTextBox = userNameTB;

		addBT.changed();
		System.out.println("-----------------------------");
		list.changed();
	}
}
