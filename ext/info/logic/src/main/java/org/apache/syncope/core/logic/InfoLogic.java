package org.apache.syncope.core.logic;

import org.apache.syncope.common.lib.to.InfoRouteTO;
import org.apache.syncope.common.lib.types.StandardEntitlement;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class InfoLogic extends AbstractTransactionalLogic<InfoRouteTO> {
    @PreAuthorize("isAnonymous() or hasRole('" + StandardEntitlement.ANONYMOUS + "')")
    public InfoRouteTO getInfo() {
        InfoRouteTO infoRouteTO = new InfoRouteTO();
        infoRouteTO.setKey("hello test");
        return infoRouteTO;
    }

    @Override
    protected InfoRouteTO resolveReference(Method method, Object... objects) {
        return null;
    }
}
