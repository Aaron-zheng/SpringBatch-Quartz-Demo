package com.sightcorner.springbatchquartz;

import java.util.HashMap;
import java.util.Map;

import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.configuration.JobLocator;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.NoSuchJobException;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;


/**
 * @author zhengfucheng
 * @version V1.0
 * @ClassName: JobScheduler
 * @Description:
 * @date 2017-3-6 下午5:54:46
 */
public class JobScheduler extends QuartzJobBean {

    private final String JOB_CONFIG_PARAM_KEY = "JOB_NAMING_CONFIG";

    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    private JobLocator jobLocator;

    public void setJobLauncher(JobLauncher jobLauncher) {
        this.jobLauncher = jobLauncher;
    }

    public void setJobLocator(JobLocator jobLocator) {
        this.jobLocator = jobLocator;
    }

    /**
     * 用来控制特定的 job 进行运行，所有特定的 job 名称 都在 数据库 RDP_CONFIG 中的  JOB_NAMING_CONFIG 进行配置
     */
    @Override
    protected void executeInternal(JobExecutionContext contenxt) throws JobExecutionException {
        //
        String jobName = "batchJob";


        try {
            System.out.println("13123123123");
            System.out.println("jobLocator: " + jobLocator);
            Job job = jobLocator.getJob(jobName);
            System.out.println("job: " + job);
            jobLauncher.run(job, new JobParameters());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
