package com.GS.BlueDart.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AltInstructionStatus {

    private String statusCode;

    private String statusInfo;

    @JsonProperty("StatusCode")
    public String getStatusCode() {
        return statusCode;
    }

    @JsonProperty("StatusCode")
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @JsonProperty("StatusInformation")
    public String getStatusInfo() {
        return statusInfo;
    }

    @JsonProperty("StatusInformation")
    public void setStatusInfo(String statusInfo) {
        this.statusInfo = statusInfo;
    }
}
