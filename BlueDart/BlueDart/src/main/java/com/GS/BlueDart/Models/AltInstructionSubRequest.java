package com.GS.BlueDart.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class AltInstructionSubRequest {
    private String awb;
    private String preferDate;
    private String altInstructionType;
    private String timeSlot;
    private String mobileNo;
    private String preferTime;

    @JsonProperty("AWBNo")
    public String getAwb() {
        return awb;
    }

    @JsonProperty("AWBNo")
    public void setAwb(String awb) {
        this.awb = awb;
    }

    @JsonProperty("PreferDate")
    public String getPreferDate() {
        return preferDate;
    }

    @JsonProperty("PreferDate")
    public void setPreferDate(String preferDate) {
        this.preferDate = preferDate;
    }

    @JsonProperty("AltInstRequestType")
    public String getAltInstructionType() {
        return altInstructionType;
    }

    @JsonProperty("AltInstRequestType")
    public void setAltInstructionType(String altInstructionType) {
        this.altInstructionType = altInstructionType;
    }

    @JsonProperty("TimeSlot")
    public String getTimeSlot() {
        return timeSlot;
    }

    @JsonProperty("TimeSlot")
    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    @JsonProperty("MobileNo")
    public String getMobileNo() {
        return mobileNo;
    }

    @JsonProperty("MobileNo")
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @JsonProperty("PreferTime")
    public String getPreferTime() {
        return preferTime;
    }

    @JsonProperty("PreferTime")
    public void setPreferTime(String preferTime) {
        this.preferTime = preferTime;
    }
}
