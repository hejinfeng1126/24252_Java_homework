/**
 *
 */
package com.huawei.classroom.student.h11;

/**
 * @author Administrator
 *
 */
public class Test {

	/**
	 *
	 */
	public Test() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Home11 util = new Home11();
		String content = "炸鸡,可乐,啤酒;薯片,啤酒,炸鸡;啤酒,雪碧,炸鸡;可乐,牙膏;可乐,面包;啤酒,面包;可乐,榨菜;啤酒,雪碧";
		String content2 = "炸鸡,可乐,啤酒,方便面,面包;薯片,啤酒,炸鸡,方便面,面包;啤酒,雪碧,炸鸡,方便面,面包;可乐,牙膏,方便面,面包;可乐,面包,方便面;啤酒,面包,方便面;可乐,榨菜,方便面,面包;啤酒,雪碧,方便面,面包";
		String fq = util.getFrequentItem(content);
		System.out.println(fq);
		System.out.println(util.getFrequentItem(content2));
		if ("啤酒,炸鸡".equals(fq) || "炸鸡,啤酒".equals(fq)) {
			System.out.println("ok");
		}
	}

}