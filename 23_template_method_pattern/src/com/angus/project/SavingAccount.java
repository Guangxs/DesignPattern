package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月18日 下午1:23:52 
 * @version 1.0 
 */
// 定期账户类：具体子类
public class SavingAccount extends Account {

	// 覆盖父类的抽象基本方法
	@Override
	public void calculateInterest() {
		System.out.println("按定期利率计算利息！");
	}

}
