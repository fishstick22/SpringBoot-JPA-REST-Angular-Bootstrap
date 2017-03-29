package com.caremark.cmp.prototype.config;  
  
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
  
@Configuration 
@ComponentScan("com.caremark.cmp.prototype") 
//@Import(DBConfig.class)
@EnableWebMvc   
public class AppConfig extends WebMvcConfigurerAdapter  {
	// how much of this do you really need, Spring Boot probably defaults things here
    @Bean  
    public InternalResourceViewResolver viewResolver() {  
	    InternalResourceViewResolver resolver = new InternalResourceViewResolver();  
        resolver.setPrefix("/WEB-INF/view/");  
        resolver.setSuffix(".html");
        return resolver;  
    }
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//    	registry.addResourceHandler("/app-resources/**").addResourceLocations("/resources/");
//    }
    //http://stackoverflow.com/questions/18683847/no-mapping-found-for-http-request-with-uri-in-dispatcherservlet-with-name
    //If you are using Java code based on Spring MVC configuration then enable the DefaultServletHandlerConfigurer in the WebMvcConfigurerAdapter object.
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) { 
        configurer.enable();
    }
    //http://docs.spring.io/spring/docs/current/spring-framework-reference/html/cors.html
    @Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**");
	}
}  
