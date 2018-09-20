package br.com.exemplo.app;

import org.apache.log4j.Logger;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainParallel {

	
	final static Logger logger = Logger.getLogger(MainParallel.class);
	
	public static void main(String[] args) {

		MainParallel obj = new MainParallel();
		obj.run();

	}

	private void run() {

		String[] springConfig = { "spring/batch/jobs/job-partitioner.xml" };

		ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);

		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("partitionJob");

		try {

			JobExecution execution = jobLauncher.run(job, new JobParameters());
			logger.info("Exit Status : " + execution.getStatus());
			logger.info("Exit Status : " + execution.getAllFailureExceptions());

			
		} catch (Exception e) {
			e.printStackTrace();
		}

		logger.info("Done");

	}

}
