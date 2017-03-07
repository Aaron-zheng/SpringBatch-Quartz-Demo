package com.sightcorner.springbatchquartz.task;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

/** 
 * @ClassName: WritterTask
 * @Description: 征信批量处理的写出口
 * @author zhengfucheng 
 * @date 2017-3-7 下午1:12:20 
 * @version V1.0 
 */
public class WriterTask implements ItemWriter<Object> {

	public void write(List<? extends Object> list) throws Exception {
		System.out.println("WriterTask");
		System.out.println("WriterTask write..." + list.get(0));
	}

}
