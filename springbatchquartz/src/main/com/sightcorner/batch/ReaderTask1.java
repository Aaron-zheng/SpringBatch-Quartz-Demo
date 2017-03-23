package com.sightcorner.batch;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

/** 
 * @ClassName: ReaderTask
 * @Description: 征信批量处理的读入口
 * @author zhengfucheng 
 * @date 2017-3-7 下午1:12:08 
 * @version V1.0 
 */
public class ReaderTask1 implements ItemReader<Object> {
	
	static boolean flag = false;

	public Object read() throws Exception {
		System.out.println("ReaderTask");
		if(!flag) {
			flag = true;
			return "ReaderTask read...";
		}

		System.out.println("1243");

		
		return null;
	}

}
