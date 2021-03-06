package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月15日 上午11:22:21 
 * @version 1.0 
 */

// 恶魔角色建造器：具体建造者
public class DevilBuilder extends ActorBuilder {

	@Override
	public void buildType() {
		actor.setType("Devil");
	}

	@Override
	public void buildSex() {
		actor.setSex("Lady-boy");
	}

	@Override
	public void buildFace() {
		actor.setFace("Ugly");
	}

	@Override
	public void buildCostume() {
		actor.setCostume("Black clothes");
	}

	@Override
	public void buildHairstyle() {
		actor.setHairstyle("Bald");
	}

}
