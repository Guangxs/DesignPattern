package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��14�� ����8:26:03 
 * @version 1.0 
 */
// �ļ���־��¼�������ࣺ���幤��
public class FileLoggerFactory implements LoggerFactory {
	public Logger createLogger() {
		// �����ļ���־��¼������
		Logger logger = new FileLogger();
		// �����ļ�������ʡ��
		return logger;
	}
}