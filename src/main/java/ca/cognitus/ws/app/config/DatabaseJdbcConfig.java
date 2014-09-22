package ca.cognitus.ws.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created by emv on 14/09/14.
 */
@Profile("env-development")
@Configuration
@EnableTransactionManagement
public class DatabaseJdbcConfig implements DatabaseConfig {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        // TODO replace driver, custom url, credentials
        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataSource.setUrl("jdbc:oracle:thin:@....");
        dataSource.setUsername("user");
        dataSource.setPassword("password");
        return dataSource;
    }

}
