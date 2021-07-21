package com.GS.BlueDart.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class CustAltInstructionUpdate {
    private String awb;
    private String isError;
    private ArrayList<AltInstructionStatus> status;

    @JsonProperty("AWBNo")
    public String getAwb() {
        return awb;
    }

    @JsonProperty("AWBNo")
    public void setAwb(String awb) {
        this.awb = awb;
    }

    @JsonProperty("IsError")
    public String getIsError() {
        return isError;
    }

    @JsonProperty("IsError")
    public void setIsError(String isError) {
        this.isError = isError;
    }

    public ArrayList<AltInstructionStatus> getStatus() {
        return status;
    }

    public void setStatus(ArrayList<AltInstructionStatus> status) {
        this.status = status;
    }
}
