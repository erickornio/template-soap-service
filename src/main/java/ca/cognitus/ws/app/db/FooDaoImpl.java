package ca.cognitus.ws.app.db;

import ca.cognitus.ws.app.api.Foo;
import ca.cognitus.ws.app.api.FooDao;
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
public class FooDaoImpl extends NamedParameterJdbcDaoSupport implements FooDao {
    private static final Logger LOG = LoggerFactory.getLogger(FooDaoImpl.class);

    @Autowired
    public FooDaoImpl(DataSource dataSource) {
        setDataSource(dataSource);
    }

    public Foo getFooById(Object Id) {
        // TODO implementation
        return null;
    }

    public List<Foo> getFooSearch(SqlParameterSource param) {
        // TODO implementation
        return null;
    }
}
