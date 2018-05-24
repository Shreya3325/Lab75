package com.jlcs.springmvc;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

public class JLCConfig {
	@Bean
	public InternalResourceViewResolver viewResolver(){
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
@Bean
public MessageSource messageSource(){
	ReloadableResourceBundleMessageSource messageSource=new ReloadableResourceBundleMessageSource();
	messageSource.setBasename("messages");
	messageSource.setDefaultEncoding("UTF-8");
	return messageSource;
}
}
