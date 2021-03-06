package com.angus.project;

import java.io.IOException;

/** 
 * @author GuangSIR 
 * @date 2018年3月15日 上午8:59:09 
 * @version 1.0 
 */
public class Client {
	public static void main(String[] args) {
		WeeklyLog log_previous = new WeeklyLog(); // 创建原型对象

		Attachment attachment = new Attachment(); // 创建附件对象

		log_previous.setName("读书笔记");
		log_previous.setDate("2018-3-15");
		log_previous.setContent("读乔布斯传有感");
		log_previous.setAttachment(attachment);

		System.out.println("****周报****");
		System.out.println("时间：" + log_previous.getDate());
		System.out.println("名字：" + log_previous.getName());
		System.out.println("内容：" + log_previous.getContent());
		System.out.println("--------------------------------");

		WeeklyLog log_new = null;
		try {
			log_new = log_previous.deepClone();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log_new.setDate("2018-4-1");
		System.out.println("****周报****");
		System.out.println("时间：" + log_new.getDate());
		System.out.println("名字：" + log_new.getName());
		System.out.println("内容：" + log_new.getContent());
		System.out.println("--------------------------------");

		// System.out.println(log_previous == log_new);
		// System.out.println(log_previous.getDate() == log_new.getDate());
		// System.out.println(log_previous.getName() == log_new.getName());
		// System.out.println(log_previous.getContent() ==
		// log_new.getContent());

		System.out.println("周报是否相同:" + (log_previous == log_new));
		System.out.println("附件是否相同:" + (log_previous.getAttachment() == log_new.getAttachment()));
	}
}
