package org.apache.syncope.common.rest.api.service;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityRequirements;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.syncope.common.rest.api.RESTHeaders;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST operations for Info.
 */
@Tag(name = "Users")
@SecurityRequirements({
        @SecurityRequirement(name = "BasicAuthentication"),
        @SecurityRequirement(name = "Bearer")})
@Path("users/test")

public interface InfoService extends JAXRSService {
    @GET
    @Produces({MediaType.APPLICATION_JSON, RESTHeaders.APPLICATION_YAML, MediaType.APPLICATION_XML})
    Response getInfo();
}
