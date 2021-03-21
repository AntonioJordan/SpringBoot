package com.bolsadeideas.springboot.form.app;


import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;



@Configuration
@PropertySources({
	@PropertySource("classpath:messages.properties")
})
public class ConfigPropertiesSources{
	@Bean
	public MessageSource messageSource() {
	    ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
	    messageSource.setBasename("classpath:messages");
	    return messageSource;
	}
    @Bean
    public LocalValidatorFactoryBean validator(MessageSource messageSource) {
    	LocalValidatorFactoryBean bean= new LocalValidatorFactoryBean();
    	bean.setValidationMessageSource(messageSource);
    	return bean;
    }
}


