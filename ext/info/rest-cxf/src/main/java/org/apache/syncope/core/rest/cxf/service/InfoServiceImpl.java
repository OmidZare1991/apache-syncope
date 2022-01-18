package org.apache.syncope.core.rest.cxf.service;

import org.apache.syncope.common.lib.to.InfoRouteTO;
import org.apache.syncope.common.rest.api.service.InfoService;
import org.apache.syncope.core.logic.InfoLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.Response;

/**
 * sample service implementation for InfoService
 */
@Service
public class InfoServiceImpl extends AbstractServiceImpl implements InfoService {
    @Autowired
    private InfoLogic infoLogic;
    /**
     *
     * @return returns a sample text
     */
    @Override
    public InfoRouteTO getInfo() {
        return infoLogic.getInfo();
//        return Response.ok()
//                .entity("hello test")
//                .build();
    }
}
