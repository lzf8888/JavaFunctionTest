package com.fp.java.basic.cuncurrent.queue;

import java.util.ArrayDeque;
import java.util.concurrent.CountDownLatch;

public class DequeTest {
	
	private static ArrayDeque<Integer> queue=new ArrayDeque<>(200000);

	// this method prov
	public static void main(String[] args) throws InterruptedException {
		CountDownLatch latch=new CountDownLatch(2);
		
		Thread t1=new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i=0;i<100000;i++){
					queue.push(1);
				}
				latch.countDown();
			}
		});
		
		Thread t2=new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i=0;i<100000;i++){
					queue.push(1);
				}
				latch.countDown();
			}
		});
		
		t1.start();
		t2.start();
		latch.await();
		
		System.out.println("final num is "+queue.size());
	}

}
