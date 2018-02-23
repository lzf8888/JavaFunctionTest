package com.fp.java.basic;
/*
 * This test shows that, if isAssignableFrom is true, that left side is base class;
 * A.isAssignableFrom(B) means A obj1=new B() can pass compile;
 */
public class AssignableTest {
	
	public static void main(String[] args) {
		Object o1=new A();
		Object o2=new B();
		
		System.out.println(o1.getClass().isAssignableFrom(B.class));
		System.out.println(o2.getClass().isAssignableFrom(A.class));
	}
	
	public static class A{
		
	}

	public static class B extends A{
		
	}
}


