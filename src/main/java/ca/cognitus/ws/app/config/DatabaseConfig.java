package ca.cognitus.ws.app.config;

import javax.sql.DataSource;

/**
 * Created by emv on 14/09/14.
 */
public interface DatabaseConfig {

    public DataSource dataSource() throws Exception;
}
