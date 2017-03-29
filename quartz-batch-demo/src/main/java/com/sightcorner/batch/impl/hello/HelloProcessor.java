package com.sightcorner.batch.impl.hello;

import org.springframework.batch.item.ItemProcessor;


public class HelloProcessor implements ItemProcessor<Object, Object> {


	public Object process(Object input) throws Exception {
		return input;
	}

}
