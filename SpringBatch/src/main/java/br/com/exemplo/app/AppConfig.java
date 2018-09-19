package br.com.exemplo.app;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan
public class AppConfig {
	
	@Bean
	  public DataSource dataSource() {
	      DriverManagerDataSource ds = new DriverManagerDataSource();
	      ds.setDriverClassName(oracle.jdbc.driver.OracleDriver.class.getName());
	      ds.setUrl("jdbc:oracle:thin:@petra-devdb01.intra.grupopetra.com.br:1521:fundosdev");
	      ds.setUsername("CEDENTE");
	      ds.setPassword("CEDENTE");
	      return ds;
	  }
	
}
