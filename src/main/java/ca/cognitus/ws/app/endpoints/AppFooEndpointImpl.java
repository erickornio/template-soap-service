package ca.cognitus.ws.app.endpoints;

import ca.cognitus.ws.app.api.AppFooEndpoint;
import ca.cognitus.ws.app.api.AppFooService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;

/**
 * Created by emv on 14/09/14.
 */
@Endpoint
public class AppFooEndpointImpl implements AppFooEndpoint {
    private static final Logger LOG = LoggerFactory.getLogger(AppFooEndpointImpl.class);
    private AppFooService appFooService;

    @Autowired
    public AppFooEndpointImpl(AppFooService appFooService) {
        this.appFooService = appFooService;
    }
}
