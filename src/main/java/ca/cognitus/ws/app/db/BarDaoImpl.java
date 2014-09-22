package ca.cognitus.ws.app.db;

import ca.cognitus.ws.app.api.Bar;
import ca.cognitus.ws.app.api.BarDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by emv on 14/09/14.
 */
@Repository
public class BarDaoImpl extends NamedParameterJdbcDaoSupport implements BarDao {
    private static final Logger LOG = LoggerFactory.getLogger(BarDaoImpl.class);

    @Autowired
    public BarDaoImpl(DataSource dataSource) {
        setDataSource(dataSource);
    }

    public Bar getBarById(Object Id) {
        // TODO implementation
        return null;
    }

    public List<Bar> getBarSearch(SqlParameterSource param) {
        // TODO implementation
        return null;
    }
}
