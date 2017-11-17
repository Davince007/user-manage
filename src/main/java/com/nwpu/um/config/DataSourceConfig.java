package com.nwpu.um.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 数据库数据源配置
 * @author GWD
 *
 */
@Component
@EnableTransactionManagement
public class DataSourceConfig implements EnvironmentAware{

	private RelaxedPropertyResolver propertyResolver;
	
	@Override
	public void setEnvironment(Environment environment) {
		this.propertyResolver = new RelaxedPropertyResolver(environment, "spring.datasource.");
		
	}
	
	@Bean  
    public BasicDataSource dataSource() {  
		BasicDataSource datasource =new BasicDataSource();
        datasource.setUrl(propertyResolver.getProperty("url"));
        datasource.setUsername(propertyResolver.getProperty("username")); 
        datasource.setPassword(propertyResolver.getProperty("password"));
        datasource.setDriverClassName(propertyResolver.getProperty("driver-class-name"));
        datasource.setMaxWaitMillis(Long.valueOf(propertyResolver.getProperty("dbcp2.max-wait-millis")));
        datasource.setMinIdle(Integer.valueOf(propertyResolver.getProperty("dbcp2.min-idle"))); 
        datasource.setInitialSize(Integer.valueOf(propertyResolver.getProperty("dbcp2.initial-size")));
        datasource.setValidationQuery(propertyResolver.getProperty("dbcp2.validation-query"));
        datasource.setConnectionProperties(propertyResolver.getProperty("dbcp2.connection-properties"));
        return datasource;  
    } 

}
