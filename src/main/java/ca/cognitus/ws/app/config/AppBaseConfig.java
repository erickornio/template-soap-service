package ca.cognitus.ws.app.config;

import ca.cognitus.ws.app.api.*;
import ca.cognitus.ws.app.db.BarDaoImpl;
import ca.cognitus.ws.app.db.FooDaoImpl;
import ca.cognitus.ws.app.endpoints.AppBarEndpointImpl;
import ca.cognitus.ws.app.endpoints.AppFooEndpointImpl;
import ca.cognitus.ws.app.services.AppBarServiceImpl;
import ca.cognitus.ws.app.services.AppFooServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Created by emv on 14/09/14.
 */
@Configuration
@EnableSpringConfigured
//@ImportResource("classpath:/config/resource-name.xml")
public abstract class AppBaseConfig {

    @Bean
    public abstract DataSource dataSource() throws Exception;

    @Bean
    public DataSourceTransactionManager transactionManager() throws Exception {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public AppFooEndpoint appFooEndpoint() throws Exception {
        return new AppFooEndpointImpl(appFooService());
    }

    @Bean
    public AppBarEndpoint appBarEndpoint() throws Exception {
        return new AppBarEndpointImpl(appBarService());
    }

    @Bean
    public AppFooService appFooService() throws Exception {
        return new AppFooServiceImpl(fooDao());
    }

    @Bean
    public AppBarService appBarService() throws Exception {
        return new AppBarServiceImpl(barDao());
    }

    @Bean
    public FooDao fooDao() throws Exception {
        return new FooDaoImpl(dataSource());
    }

    @Bean
    public BarDao barDao() throws Exception {
        return new BarDaoImpl(dataSource());
    }
}
