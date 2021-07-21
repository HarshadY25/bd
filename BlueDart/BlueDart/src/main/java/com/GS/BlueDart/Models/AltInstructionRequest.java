package com.GS.BlueDart.Models;

public class AltInstructionRequest {

    private AltInstructionSubRequest altreq;
    private Profile profile;

    public AltInstructionSubRequest getAltreq() {

        return altreq;
    }

    public void setAltreq(AltInstructionSubRequest altreq) {
        this.altreq = altreq;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
