package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018��3��15�� ����11:16:17 
 * @version 1.0 
 */

// Ӣ�۽�ɫ�����������彨����
public class HeroBuilder extends ActorBuilder {

	@Override
	public void buildType() {
		actor.setType("Hero");
	}

	@Override
	public void buildSex() {
		actor.setSex("Man");
	}

	@Override
	public void buildFace() {
		actor.setFace("Brilliant");
	}

	@Override
	public void buildCostume() {
		actor.setCostume("Helmet and armour ");
	}

	@Override
	public void buildHairstyle() {
		actor.setHairstyle("graceful");
	}

}