package com.sightcorner.batch.impl.hello;

import org.springframework.batch.item.ItemReader;

import java.util.Random;


public class HelloReader implements ItemReader<Object> {

    private Random random = new Random();

	public Object read() throws Exception {

        int num = random.nextInt(10);
        if(num > 8) {
            return null;
        }
        return num;
	}

}
