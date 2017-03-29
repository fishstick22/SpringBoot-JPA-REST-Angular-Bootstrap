package com.caremark.cmp.prototype.config;

//import javax.sql.DataSource;
//
//import org.apache.commons.dbcp.BasicDataSource;
//import org.hibernate.SessionFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.orm.hibernate5.HibernateTemplate;
//import org.springframework.orm.hibernate5.HibernateTransactionManager;
//import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import com.caremark.cmp.prototype.entity.Person;
//@Configuration 
//@EnableTransactionManagement
public class DBConfig {
	/* http://stackoverflow.com/questions/37704414/spring-boot-hibernate-5-integration-error
	 Use JPA instead of plain Hibernate
	 However instead of doing this I suggest removing everything and add the following to your 
	 configuration (the application.properties).
	 
	 spring.jpa.show-sql=true
	 spring.jpa.hibernate.ddl-auto=create
     spring.jpa.database-platform=org.hibernate.dialect.MySQL57InnoDBDialect
     
     Now in your SpringHibernateDemoApplication you can remove everything but your 
     CustomerDao (unless that is annotated with @Repository you could remove that as well). 
     Spring Boot already detects and enables transactions so you can also remove the 
     @EnableTransactionManagement. 
     
     Use Spring Data JPA

     However if you want to really reduce your code I suggest adding the spring-boot-starter-data-jpa.
      
	 */
	
//	@Bean
//	public HibernateTemplate hibernateTemplate() {
//		return new HibernateTemplate(sessionFactory());
//	}
//	@Bean
//	public SessionFactory sessionFactory() {
//		return new LocalSessionFactoryBuilder(getDataSource())
//		   .addAnnotatedClasses(Person.class)
//		   .buildSessionFactory();
//	}
//	@Bean
//	public DataSource getDataSource() {
//	    BasicDataSource dataSource = new BasicDataSource();
//	    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//	    dataSource.setUrl("jdbc:mysql://localhost:3306/test01");
//	    dataSource.setUsername("root");
//	    dataSource.setPassword("Caremark1");
//	    return dataSource;
//	}
//	@Bean
//	public HibernateTransactionManager hibTransMan(){
//		return new HibernateTransactionManager(sessionFactory());
//	}
	//https://github.com/brettwooldridge/HikariCP/wiki/Spring-Hibernate-with-Annotations
//	final Properties hibernateProperties() {
//	    final Properties hibernateProperties = new Properties();
//
//	    hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
//	    hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
//	    hibernateProperties.setProperty("hibernate.show_sql", "true");
//
//	  	return hibernateProperties;
//	}
}
