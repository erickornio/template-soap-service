package ca.cognitus.ws.app.monitoring;

import ca.cognitus.ws.app.api.AppMonitoringService;
import ca.cognitus.ws.app.api.AppServiceStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by emv on 14/09/14.
 */
@Configurable(dependencyCheck = true)
public class AppStatusServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final Logger LOG = LoggerFactory.getLogger(AppStatusServlet.class);
    @Autowired
    private AppMonitoringService appMonitoringService;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        AppServiceStatus status = appMonitoringService.getAppServiceStatus();

        // TODO implementation status checking/response
    }

}
