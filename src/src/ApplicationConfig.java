package src;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "mx.com.miproyecto")
// @PropertySource(value = { "classpath:application.properties" })
public class ApplicationConfig {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://192.168.1.30:3306/test");
		dataSource.setUsername("root");
		dataSource.setPassword("1234");
		return dataSource;
	}

	// @Bean
	// public JdbcTemplate jdbcTemplate(DataSource dataSource) {
	// JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
	// jdbcTemplate.setResultsMapCaseInsensitive(true);
	// return jdbcTemplate;
	// }

}