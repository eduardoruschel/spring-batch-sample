package br.com.exemplo;


import java.io.File;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FlatFileJobLauncher {

   public static void main(String[] args) 
   {
       try {
    	   
    	   String diretorio = System.getProperty("user.dir");
//    	   
//           String[] springConfig  =
//               {
//            		   diretorio + "\\src\\main\\resources\\batch_config.xml"
//               };
//
//           
//           File asdas = new File(diretorio + "\\src\\main\\resources\\batch_config.xml");
//           System.out.println(   asdas.exists());
           
           FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("batch_config.xml");
            
           
//           ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);
//           ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(springConfig);
            

           JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
           Job job = (Job) context.getBean("mfJob");
            
    
           JobExecution execution = jobLauncher.run(job, new JobParameters());
           System.out.println("Exit Status : " + execution.getStatus());
    
//           context.close();
           } catch (Exception e) {
               e.printStackTrace();
           }

           System.out.println("Done");
   }

}
