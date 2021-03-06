package com.angus.calculator;

/** 
 * @author GuangSIR 
 * @date 2018年3月17日 上午11:16:10 
 * @version 1.0 
 */
// 抽象命令类
public abstract class AbstractCommand {
	public abstract int execute(int value); // 声明命令执行方法execute()
	public abstract int undo(); // 声明撤销方法undo
	public abstract int redo(); // 声明恢复反方redo
}
