package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��15�� ����4:38:41 
 * @version 1.0 
 */
// JPG��ʽͼ�����������
public class JPGImage extends Image {

	@Override
	public void parseFile(String fileName) {
		// ģ�����JPG�ļ������һ�����ؾ������
		Matrix m = new Matrix();
		imp.doPaint(m);
		System.out.println(fileName + ",��ʽΪJPG��");
	}

}