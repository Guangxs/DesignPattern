package com.angus.project;

import java.util.Stack;

/** 
 * @author GuangSIR 
 * @date 2018年3月17日 下午4:11:03 
 * @version 1.0 
 */
// 指令处理类：工具类
public class InstructionHandler {
	private AbstractNode node;

	public void handle(String instruction) {
		AbstractNode left = null;
		AbstractNode right = null;

		AbstractNode direction = null;
		AbstractNode action = null;
		AbstractNode distance = null;

		// 声明一个栈对象用于存储抽象语法树
		Stack<AbstractNode> stack = new Stack<>();

		// 以空格作为指令分割符
		String[] words = instruction.split(" ");

		// System.out.println(Arrays.asList(words));

		// 本实例采用栈的方式来处理指令，如果遇到“and”，
		// 则将其后的三个单词作为三个终结符表达式连成一
		// 个简单句子SentenceNode作为“and”的右表达式，
		// 而将从栈顶弹出的表达式作为“and”的左表达式，
		// 最后将新的“and”表达式压入栈中。
		for (int i = 0; i < words.length; i++) {
			if (words[i].equalsIgnoreCase("and")) {
				left = stack.pop(); // 弹出栈顶表达式作为左表达式
				// 获取右表达式元素
				String word1 = words[++i];
				direction = new DirectionNode(word1);
				String word2 = words[++i];
				action = new ActionNode(word2);
				String word3 = words[++i];
				distance = new DistanceNode(word3);
				// 构建右表达式
				right = new SentenceNode(direction, action, distance);
				// 将新表示压入栈中
				stack.push(new AndNode(left, right));
			} else {
				// 如果是从头开始进行解释，则将前3个单词
				// 组成一个简单句子SentenceNode并将句子该句子压入栈中
				String word1 = words[i];
				direction = new DirectionNode(word1);
				String word2 = words[++i];
				action = new ActionNode(word2);
				String word3 = words[++i];
				distance = new DistanceNode(word3);
				left = new SentenceNode(direction, action, distance);
				// 将新表达式压入栈中
				stack.push(left);
			}
		}
		this.node = stack.pop();
	}

	public String output() {
		// 解释表达式
		String result = node.interpret();
		return result;
	}
}
