package com.sightcorner.batch.impl.hello;

import java.util.List;

import org.springframework.batch.item.ItemWriter;


public class HelloWriter implements ItemWriter<Object> {

	public void write(List<? extends Object> list) throws Exception {
		Thread current = Thread.currentThread();
		for(Object obj : list) {
			System.out.print(obj.toString());
		}
		System.out.println(" current: " + current.getName() + " " + current.getId());
	}

}
