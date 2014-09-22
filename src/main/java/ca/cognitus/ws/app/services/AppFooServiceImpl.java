package ca.cognitus.ws.app.services;

import ca.cognitus.ws.app.api.AppFooService;
import ca.cognitus.ws.app.api.FooDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by emv on 14/09/14.
 */
@Service
public final class AppFooServiceImpl implements AppFooService {
    private static final Logger LOG = LoggerFactory.getLogger(AppFooServiceImpl.class);
    private FooDao fooDao;

    @Autowired
    public AppFooServiceImpl(FooDao fooDao) {
        this.fooDao = fooDao;
    }

    // TODO implementation Foo business logic
}
