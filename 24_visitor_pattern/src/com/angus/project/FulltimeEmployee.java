package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��18�� ����2:07:57 
 * @version 1.0 
 */
// ȫְԱ���ࣺ����Ԫ����
public class FulltimeEmployee implements Employee {

	private String name;
	private double weeklyWage;
	private int workTime;

	public FulltimeEmployee(String name, double weeklyWage, int workTime) {
		this.name = name;
		this.weeklyWage = weeklyWage;
		this.workTime = workTime;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeeklyWage(double weeklyWage) {
		this.weeklyWage = weeklyWage;
	}

	public void setWorkTime(int workTime) {
		this.workTime = workTime;
	}

	public String getName() {
		return (this.name);
	}

	public double getWeeklyWage() {
		return (this.weeklyWage);
	}

	public int getWorkTime() {
		return (this.workTime);
	}

	@Override
	public void accept(Department handler) {
		handler.visit(this); // ���÷����ߵķ��ʷ���
	}

}