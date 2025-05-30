/**
 * 
 */
package com.huawei.classroom.student.h03;

/**
 * @author Administrator
 * 作业  完成本类的方法
 */
public class Home03 {

	/**
	 * 判断一个数是否是水仙花数，
	 * 所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
	 * 难度系数2星
	 * @param i
	 * @return
	 */
	public static boolean isNarcissisticNum(int i) {
		// 完成本函数里面的代码
		int temp=i;
		int a=temp%10;//a为i的个位
		temp/=10;
		int b=temp%10;//b为i的十位
		temp/=10;
		int c=temp%10;//c为i的百位
		if(i==a*a*a+b*b*b+c*c*c)
			return true;
		return false;
	}
	
	/**
	 * 判断一个数是否是完全数，如果不清楚完全数，可以百度
	 * 一个数如果恰好等于它的因子之和，这个数就称为 "完全数 "。
	 * 难度系数2星
	 * @param i
	 * @return
	 */
	public static boolean Perfectnumber(int i) {
		// 完成本函数里面的代码
		int sum=0;
		for(int j=1;j<i;j++) {
			if(i%j==0)
				sum+=j;
		}
		if(i==sum) {
			return true;
		}
		return false;
	}
	
	/**
	 * 计算n的阶乘(n>=0，且结果不会超出整数范围)
	 * @param n
	 * @return
	 */
	public static int  factorial(int n) {
		int result=1;
		if(n!=0) {
			for(int i=1;i<=n;i++) {
				result*=i;
			}
		}
		return result;
	}
	
	/**
	 * 将一个二进制的数变成10进制的数字 
	 * 例如将 1000 转换为 8，将10000 转换为16
	 * @return
	 */
	public static String binToDec(String bin) {
		//如何把一个字符串转换为整数，供参考
		int i=Integer.valueOf("1");
		//如何把一个整数转换为字符串，供参考
		String s=String.valueOf(i);
		// 完成本函数里面的代码
		int origin=Integer.valueOf(bin);
		int result=0;
		int factor=1;
		for(int j=0;j<bin.length();j++) {
			int temp=origin%10;
			result+=temp*factor;
			factor*=2;
			origin/=10;
		}
		String ending=String.valueOf(result);
		return ending;
	}
	
	/**
	 * 设二元一次方程 a*x*x+bx+c=0;
	 * 的系数分别为a,b,c
	 * 请将这个方程的两个实数根放在数组中返回,如果没有实数解则返回null
	 * 例如 getRoot(1,-2,1)返回 {1,1}
	 * 例如 getRoot(1,-2,2)返回 null
	 * 难度系数1星
	 * @return
	 */
	public static double[] getRoot(double a,double b,double c) {
		if(b*b-4*a*c<0) {
			return null;
		}
		else {
			double[]result;
			result=new double[2];
			double x1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
			double x2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
			result[0]=x1;
			result[1]=x2;
			return result;
		}
	}

	/**
	 * 返回杨辉三角( Pascal  triangle,请百度 杨辉三角 或者 Pascal  triangle )第i行的系数，杨辉三角第一行定义为1
	 * 提示：从顶部的单个1开始，下面一行中的每个数字都是上面两个数字的和
	 * 例如getPascalTriangle(1)返回{1}，
	 * getPascalTriangle(2)返回{1,1}
	 * 测试的时候，系数肯定不会超过int的范围 
	 * 难度系数3星
	 * @param line
	 * @return
	 */

	public static int[] getPascalTriangle(int i) {
		int [][]result=new int[i][i];
		for(int l=0;l<i;l++) {
			result[l][0]=1;
			result[l][l]=1;
		}
		for(int j=1;j<i;j++) {
				for(int k=1;k<j;k++) 
						result[j][k]=result[j-1][k-1]+result[j-1][k];
		}
		return result[i-1];
}
	
	/**
	 * 去掉一个字符串中所有的空格
	 * 难度系数1星
	 * 例如：zipSpace(" a b  c ")返回 "abc"
	 * @return
	 */
	public static String zipSpace(String str) {
		// 完成本函数里面的代码
		return str.replaceAll(" ", "");
	}
}
