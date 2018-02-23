package com.fp.java.basic.cuncurrent.queue;

import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueTest2 {

	public static void main(String[] args) {
		LinkedBlockingQueue<Integer> queue=new LinkedBlockingQueue<>(10);
		
		queue.add(1);
		queue.add(2);
		synchronized(queue){
			queue.clear();
		}
		System.out.println(queue.isEmpty());
	}

}
