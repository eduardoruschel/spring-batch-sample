package br.com.exemplo.app;

import org.apache.log4j.Logger;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProject {
	
	final static Logger logger = Logger.getLogger(MainProject.class);
	
	public static void main(String[] args) {

		String[] springConfig = { "spring/batch/jobs/jobClientes.xml" };

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(springConfig);

		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("ClientesProcessJob");

		try {

			JobExecution execution = jobLauncher.run(job, new JobParameters());
			logger.info("Exit Status : " + execution.getStatus());

		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		} finally {
			context.close();
		}

		logger.info("Processo Batch finalizado");

	}
}
