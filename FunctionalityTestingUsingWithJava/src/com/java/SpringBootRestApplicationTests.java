package com.journaldev.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootRestApplicationTests {

	@Test
	public void contextLoads() {
	}

}
spring.datasource.username=HIBERNATE_TEST
spring.datasource.password=HIBERNATE_TEST
spring.datasource.driver.class=oracle.jdbc.driver.OracleDriver
# logging
logging.pattern.console=%d{yyyy-MM-dd HH:mm:ss} %-5level %logger{36} - %msg%n
logging.level.org.hibernate.SQL=debug
