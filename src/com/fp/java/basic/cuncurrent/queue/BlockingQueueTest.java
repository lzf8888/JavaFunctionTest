package com.fp.java.basic.cuncurrent.queue;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueTest {

	private static LinkedBlockingQueue<Integer> queue=new LinkedBlockingQueue<>(200000);

	// this method prov
	public static void main(String[] args) throws InterruptedException {
		CountDownLatch latch=new CountDownLatch(2);
		
		Thread t1=new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i=0;i<100000;i++){
					try {
						queue.put(1);
					}
					catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				latch.countDown();
			}
		});	
		
		Thread t2=new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i=0;i<100000;i++){
					try {
						queue.put(1);
					}
					catch (InterruptedException e) {
						e.printStackTrace();
					}
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
