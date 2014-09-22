package ca.cognitus.ws.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 * Created by emv on 14/09/14.
 */
@Profile({"env-production", "env-stating"})
@Configuration
@EnableSpringConfigured
@EnableTransactionManagement
public class DatabaseJndiConfig implements DatabaseConfig {

    @Bean
    public DataSource dataSource() throws Exception {
        Context context = new InitialContext();
        // TODO replace with custom name
        return (DataSource) context.lookup("jdbc/name");
    }
}
