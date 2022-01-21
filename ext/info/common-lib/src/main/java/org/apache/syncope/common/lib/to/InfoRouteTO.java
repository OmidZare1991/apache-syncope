package org.apache.syncope.common.lib.to;

public class InfoRouteTO {
    private Integer responseType;
    private String responseDesc;

    public InfoRouteTO() {
    }

    public InfoRouteTO(Integer responseType, String responseDesc) {
        this.responseType = responseType;
        this.responseDesc = responseDesc;
    }

    public String getResponseDesc() {
        return responseDesc;
    }

    public void setResponseDesc(String responseDesc) {
        this.responseDesc = responseDesc;
    }

    public Integer getResponseType() {
        return responseType;
    }

    public void setResponseType(Integer responseType) {
        this.responseType = responseType;
    }
}
