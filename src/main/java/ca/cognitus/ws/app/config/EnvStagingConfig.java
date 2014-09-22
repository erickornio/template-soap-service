package ca.cognitus.ws.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

/**
 * Created by emv on 14/09/14.
 */
@Profile("env-staging")
@Configuration
public class EnvStagingConfig extends AppBaseConfig {
    @Autowired
    private DatabaseConfig databaseConfig;

    @Override
    public DataSource dataSource() throws Exception {
        return databaseConfig.dataSource();
    }

    // TODO custom staging environment configuration
}
