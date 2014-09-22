package ca.cognitus.ws.app.api;

import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import java.util.List;

/**
 * Created by emv on 14/09/14.
 */
public interface FooDao {

    public Foo getFooById(Object Id);
    public List<Foo> getFooSearch(SqlParameterSource param);

}
