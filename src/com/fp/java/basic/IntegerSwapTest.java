package com.fp.java.basic;

import java.lang.reflect.Field;

public class IntegerSwapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i=1;
		Integer j=2;
		
		
		
		
		swap(i,j);
		System.out.println("i is :"+i+" j is:"+j);
		
		i=new Integer(129);
		j=new Integer(130);
		swap2(i,j);
		System.out.println("i is :"+i+" j is:"+j);
		
		i=1;
		j=2;
		
		swap2(i,j);
		System.out.println("i is :"+i+" j is:"+j);
		
		//we can see that the integer cache is permanently changed, k is 2
		Integer k=Integer.valueOf(1);
		System.out.println("k is:"+k);
		
		
	}

	public static void swap(Integer i, Integer j) {
		Integer temp=i;
		i=j;
		j=temp;
	}
	
	//change the IntegerCahce value in heap, don't do this in real scenario
	//http://www.jianshu.com/p/48b011688edc
	public static void swap2(Integer i, Integer j) {
		try {
			Integer temp=new Integer(i);
			Field field=Integer.class.getDeclaredField("value");
			field.setAccessible(true);
			field.set(i, j.intValue());
			field.set(j, temp);
		}
		catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
