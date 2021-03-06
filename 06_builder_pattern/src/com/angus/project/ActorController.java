package com.angus.project;

/** 
 * @author GuangSIR 
 * @date 2018年3月15日 上午11:27:13 
 * @version 1.0 
 */

// 游戏角色创建控制器：指挥者
public class ActorController {
	// 逐步构建复杂产品对象
	public Actor construct(ActorBuilder ab){
		Actor actor;
		ab.buildType();
		ab.buildSex();
		ab.buildFace();
		ab.buildCostume();
		ab.buildHairstyle();
		actor = ab.createActor();
		return actor;
	}
}
