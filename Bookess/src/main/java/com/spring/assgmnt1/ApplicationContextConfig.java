package com.spring.assgmnt1;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
@ComponentScan
@PropertySource("classpath:db.properties")
public class ApplicationContextConfig {
	
	@Value("${mysqldriver}")
	private String driver;
	@Value("${mysqlurl}")
	private String url;
	@Value("${mysqluser}")
	private String uname;
	@Value("${mysqlpwd}")
	private String pwd;
	
	@Bean(name = "viewResolver")
	public InternalResourceViewResolver getViewResolver() {
		System.out.println("view resolver");
	    InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	    viewResolver.setPrefix("/WEB-INF/views/");
	    viewResolver.setSuffix(".jsp");
	    return viewResolver;
	}
	
	
	@Bean
	public DataSource dataSource() {
		System.out.println("driver");
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName(driver);
		ds.setUrl(url);
		ds.setUsername(uname);
		ds.setPassword(pwd);
		return ds;
	}
	
	
	@Bean
	public LocalSessionFactoryBean getSessionFactory()
	{
		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
		sessionFactoryBean.setDataSource(dataSource());
		sessionFactoryBean.setPackagesToScan("com.spring.assgmnt1.entity");
		sessionFactoryBean.setHibernateProperties(hibernateProperties());
		System.out.println("session factory created");
		return sessionFactoryBean;
	}

 
    private final Properties hibernateProperties() {
        Properties hibernateProperties = new Properties();
        hibernateProperties.setProperty(
          "hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        hibernateProperties.setProperty("hibernate.show_sql", "true");
        return hibernateProperties;
    }
}
