package com.sightcorner.batch;

import org.springframework.batch.item.ItemProcessor;

/** 
 * @ClassName: ProcessorTask
 * @Description: 征信批量处理的处理中心
 * @author zhengfucheng 
 * @date 2017-3-7 下午2:25:45 
 * @version V1.0 
 */
public class ProcessorTask implements ItemProcessor<Object, Object> {


	public Object process(Object input) throws Exception {
        System.out.println("ProcessorTask");
		return "ProcessorTask process..." + input.toString();
	}

}
