package org.apache.syncope.common.lib.to;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "InfoRoute")
@XmlType
public class InfoRouteTO implements EntityTO {
    private static final long serialVersionUID = -4579384870805323467L;
    private String value;

    @Override
    public String getKey() {
        return value;
    }

    @Override
    public void setKey(final String value) {
        this.value = value;
    }
}
