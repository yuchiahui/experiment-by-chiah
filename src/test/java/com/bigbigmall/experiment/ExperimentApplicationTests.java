package com.bigbigmall.experiment;

import javax.sql.DataSource;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExperimentApplicationTests {

	@Autowired
	private DataSource dataSource;

	@Test
	public void contextLoads() {
	}

	/**
	 * 參考自 https://www.baeldung.com/spring-boot-tomcat-connection-pool
	 */
	@Test
	public void givenTomcatConnectionPoolInstanceWhenCheckedPoolClassNameThenCorrect() {
		assertThat(dataSource.getClass().getName()).isEqualTo("org.apache.tomcat.jdbc.pool.DataSource");
	}
}
