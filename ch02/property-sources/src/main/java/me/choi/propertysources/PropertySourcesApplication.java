package me.choi.propertysources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PropertySourcesApplication {

	private static final Logger log =
			LoggerFactory.getLogger(SpringBootApplication.class);

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext =
				SpringApplication.run(PropertySourcesApplication.class, args);

		DbConfiguration dbConfiguration = applicationContext.getBean(DbConfiguration.class);

		log.info(dbConfiguration.toString());
	}

}
