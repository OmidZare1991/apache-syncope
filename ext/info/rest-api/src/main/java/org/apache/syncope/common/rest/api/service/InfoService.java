package org.apache.syncope.common.rest.api.service;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.syncope.common.lib.to.InfoRouteTO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * REST operations for Info.
 */
@Tag(name = "Info")
@Path("info/response")
public interface InfoService extends JAXRSService {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    InfoRouteTO getInfo();
}
