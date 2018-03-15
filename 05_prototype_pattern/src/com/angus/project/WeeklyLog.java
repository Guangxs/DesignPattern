package com.angus.project;

import java.awt.event.MouseWheelEvent;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/** 
 * @author GuangSIR 
 * @date 2018��3��15�� ����8:54:21 
 * @version 1.0 
 */
// �����ܱ�WeeklyLog������ԭ����
public class WeeklyLog implements Serializable {
	private String name;
	private String date;
	private String content;
	private Attachment attachment;

	public Attachment getAttachment() {
		return attachment;
	}

	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	// @Override
	// protected WeeklyLog clone() {
	// WeeklyLog log = null;
	// try {
	// log = (WeeklyLog) super.clone();
	// } catch (CloneNotSupportedException e) {
	// System.out.println("��֧�ֿ�¡");
	// }
	// return log;
	// }

	// ʹ�����л�����ʵ�����¡
	public WeeklyLog deepClone() throws IOException, ClassNotFoundException {
		// ������д������
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bao);
		oos.writeObject(this);

		// �����������ȡ��
		ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return (WeeklyLog) ois.readObject();
	}
}