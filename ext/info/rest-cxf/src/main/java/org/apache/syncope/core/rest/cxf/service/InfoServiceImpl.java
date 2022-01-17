package org.apache.syncope.core.rest.cxf.service;

import org.apache.syncope.common.rest.api.service.InfoService;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.Response;

/**
 * sample service implementation for InfoService
 */
@Service
public class InfoServiceImpl extends AbstractServiceImpl implements InfoService {
    /**
     *
     * @return returns a sample text
     */
    @Override
    public Response getInfo() {
        return Response.ok()
                .entity("hello test")
                .build();
    }
}
