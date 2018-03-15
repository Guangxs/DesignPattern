package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月14日 下午8:26:03 
 * @version 1.0 
 */
// 文件日志记录器工厂类：具体工厂
public class FileLoggerFactory implements LoggerFactory {
	public Logger createLogger() {
		// 创建文件日志记录器对象
		Logger logger = new FileLogger();
		// 创建文件，代码省略
		return logger;
	}
}