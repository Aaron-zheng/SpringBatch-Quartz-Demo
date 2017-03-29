package com.sightcorner.batch.impl.hello;

import com.sightcorner.batch.base.BatchJob;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;


public class HelloJob extends BatchJob {


    @Override
    protected Job getJob() {

        return jobBuilderFactory
                .get(this.getJobName())
                .flow(step())
                .end()
                .build();
    }

    @Override
    protected JobParameters getJobParameters() {
        Map<String, JobParameter> map = new HashMap<>();
        map.put("timestamp", new JobParameter(System.currentTimeMillis()));
        map.put("thread", new JobParameter(Thread.currentThread().getName()));
        return new JobParameters(map);
    }

    public Step step() {
        return stepBuilderFactory
                .get("step")
                .chunk(5)
                .reader(new HelloReader())
                .processor(new HelloProcessor())
                .writer(new HelloWriter())
                .build();
    }

}
