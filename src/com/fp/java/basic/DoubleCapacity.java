package com.fp.java.basic;
// 用来测试位移快速翻倍的特性
public class DoubleCapacity {

	public static void main(String[] args) {
		int i=5;
		int j=i<<1;
		System.out.println(j);
		int k=Integer.MAX_VALUE;
		j=k<<1;
		//capacity is too big to store in int, so it becomes negative,so we have to check this value when double
		System.out.println(j);
	}

}
