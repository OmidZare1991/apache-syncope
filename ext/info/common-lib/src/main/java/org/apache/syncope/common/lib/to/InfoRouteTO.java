package org.apache.syncope.common.lib.to;

import org.apache.syncope.common.lib.types.AnyTypeKind;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "InfoRoute")
@XmlType
public class InfoRouteTO implements EntityTO {
    private static final long serialVersionUID = -4579384870805323467L;
    private String key;
    private AnyTypeKind anyTypeKind;

    private String content;

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public void setKey(final String key) {
        this.key = key;
    }

    public String getContent() {
        return content;
    }

    public void setContent(final String content) {
        this.content = content;
    }

    public AnyTypeKind getAnyTypeKind() {
        return anyTypeKind;
    }

    public void setAnyTypeKind(final AnyTypeKind anyTypeKind) {
        this.anyTypeKind = anyTypeKind;
    }
}
