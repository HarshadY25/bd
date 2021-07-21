package com.GS.BlueDart.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Profile {
    private String loginID;
    private String licenceKey;
    private String api_type;
    private String version;

    @JsonProperty("LoginID")
    public String getLoginID() {
        return loginID;
    }

    @JsonProperty("LoginID")
    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    @JsonProperty("LicenceKey")
    public String getLicenceKey() {
        return licenceKey;
    }

    @JsonProperty("LicenceKey")
    public void setLicenceKey(String licenseKey) {
        this.licenceKey = licenseKey;
    }

    @JsonProperty("Api_type")
    public String getApi_type() {
        return api_type;
    }

    @JsonProperty("LoginID")
    public void setApi_type(String api_type) {
        this.api_type = api_type;
    }

    @JsonProperty("Version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("LoginID")
    public void setVersion(String version) {
        this.version = version;
    }
}
