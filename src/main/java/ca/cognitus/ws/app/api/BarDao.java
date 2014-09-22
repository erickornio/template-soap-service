package ca.cognitus.ws.app.api;

import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import java.util.List;

/**
 * Created by emv on 14/09/14.
 */
public interface BarDao {

    public Bar getBarById(Object Id);
    public List<Bar> getBarSearch(SqlParameterSource param);
}