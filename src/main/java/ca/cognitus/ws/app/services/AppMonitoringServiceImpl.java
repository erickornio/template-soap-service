package ca.cognitus.ws.app.services;

import ca.cognitus.ws.app.api.AppMonitoringService;
import ca.cognitus.ws.app.api.AppServiceStatus;
import ca.cognitus.ws.app.api.BarDao;
import ca.cognitus.ws.app.api.FooDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by emv on 14/09/14.
 */
@Service
public final class AppMonitoringServiceImpl implements AppMonitoringService {
    private static final Logger LOG = LoggerFactory.getLogger(AppMonitoringServiceImpl.class);
    private FooDao fooDao;
    private BarDao barDao;

    @Autowired
    public AppMonitoringServiceImpl(FooDao fooDao, BarDao barDao) {
        this.fooDao = fooDao;
        this.barDao = barDao;
    }

    public AppServiceStatus getAppServiceStatus() {
        // TODO implementation monitoring logic
        return null;
    }
}
