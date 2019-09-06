package com.yq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;


import com.yq.contorller.SecondServlet;
import com.yq.contorller.TestFilter;

@SpringBootApplication
//@ServletComponentScan   //扫描servlet
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	//注册SecondServlet
	//以java方式配置
	@Bean
	public ServletRegistrationBean servletRegistrationBean() {
		ServletRegistrationBean bean=new ServletRegistrationBean(new SecondServlet());
        System.out.println("ServletRegistrationBean创建");
		bean.addUrlMappings("/secondServlet");
		return bean;
		
	}
	/*@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean bean=new FilterRegistrationBean(new TestFilter());
		bean.addUrlPatterns("/*");
		return bean;
	}*/
	
}
