package org.apache.syncope.core.logic;

import org.apache.syncope.common.lib.to.InfoRouteTO;
import org.springframework.stereotype.Component;

@Component
public class InfoLogic {
    public InfoRouteTO getInfo() {
        return new InfoRouteTO(
                0
                , "operation successful");
    }
}
