package com.GS.BlueDart.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AltInstructionResponse {
    private CustAltInstructionUpdate custAltInstructionUpdate;

    @JsonProperty("CustALTInstructionUpdateResult")
    public CustAltInstructionUpdate getCustAltInstructionUpdate() {
        return custAltInstructionUpdate;
    }

    @JsonProperty("CustALTInstructionUpdateResult")
    public void setCustAltInstructionUpdate(CustAltInstructionUpdate custAltInstructionUpdate) {
        this.custAltInstructionUpdate = custAltInstructionUpdate;
    }
}
