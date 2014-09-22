package ca.cognitus.ws.app.services;

import ca.cognitus.ws.app.api.AppBarService;
import ca.cognitus.ws.app.api.BarDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by emv on 14/09/14.
 */
@Service
public final class AppBarServiceImpl implements AppBarService {
    private static final Logger LOG = LoggerFactory.getLogger(AppBarServiceImpl.class);
    private BarDao barDao;

    @Autowired
    public AppBarServiceImpl(BarDao barDao) {
        this.barDao = barDao;
    }

    // TODO implementation Bar business logic
}
