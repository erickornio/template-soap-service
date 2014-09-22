package ca.cognitus.ws.app.endpoints;

import ca.cognitus.ws.app.api.AppBarEndpoint;
import ca.cognitus.ws.app.api.AppBarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;

/**
 * Created by emv on 14/09/14.
 */
@Endpoint
public class AppBarEndpointImpl implements AppBarEndpoint {
    private static final Logger LOG = LoggerFactory.getLogger(AppBarEndpointImpl.class);
    private AppBarService appBarService;

    @Autowired
    public AppBarEndpointImpl(AppBarService appBarService) {
        this.appBarService = appBarService;
    }

    // TODO implementation
}
