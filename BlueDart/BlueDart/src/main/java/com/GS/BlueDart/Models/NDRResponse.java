/**
 *
 */
package com.GS.BlueDart.Models;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Objects;


/**
 * @author gp
 * /// 
 * ////
 *	//Error code mapped
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */


//Response -> 


@Component
public class NDRResponse {
    public NDRResponse() {
        this.NDRResponse = new ArrayList<>();
    }

    public static class NdrResponse {

        private String awbNumber;
        private String shopOrderNumber;
        private Integer shipmentId;
        private Integer shipperId;
        private String ndrStatus;
        private String message;
        private Boolean isSuccess;
        private String code;
        private String remarks;
        private String response;
        private Integer ndrCount;



        public Integer getShipperId() {
            return shipperId;
        }

        public void setShipperId(Integer shipperId) {
            this.shipperId = shipperId;
        }

        public String getNdrStatus() {
            return ndrStatus;
        }

        public void setNdrStatus(String ndrStatus) {
            this.ndrStatus = ndrStatus;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getRemarks() {
            return remarks;
        }

        public void setRemarks(String remarks) {
            this.remarks = remarks;
        }

        public Integer getNdrCount() {
            return ndrCount;
        }

        public void setNdrCount(Integer ndrCount) {
            this.ndrCount = ndrCount;
        }

        public String getAwbNumber() {
            return awbNumber;
        }

        public void setAwbNumber(String awbNumber) {
            this.awbNumber = awbNumber;
        }

        public String getResponse() {
            return response;
        }

        public void setResponse(String response) {
            this.response = response;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public Boolean getSuccess() {
            return isSuccess;
        }

        public void setSuccess(Boolean success) {
            isSuccess = success;
        }

        public String getShopOrderNumber() {
            return shopOrderNumber;
        }

        public void setShopOrderNumber(String shopOrderNumber) {
            this.shopOrderNumber = shopOrderNumber;
        }

        public Integer getShipmentId() {
            return shipmentId;
        }

        public void setShipmentId(Integer shipmentId) {
            this.shipmentId = shipmentId;
        }
    }

    private ArrayList<NdrResponse> NDRResponse;

    public ArrayList<NdrResponse> getNDRResponse() {
        return NDRResponse;
    }

    public void setNDRResponse(ArrayList<NdrResponse> nDRResponse) {
        NDRResponse = nDRResponse;
    }

    @Override
    public String toString() {
        return "NDRResponse [NDRResponse=" + NDRResponse + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NDRResponse that = (NDRResponse) o;

        if (that.getNDRResponse().size()!=this.getNDRResponse().size()) return false;

        for (NdrResponse thatResponse : that.getNDRResponse()){
            String awb = thatResponse.getAwbNumber();
            boolean b = false;
            for (NdrResponse thisResponse : this.getNDRResponse()){
                if (thisResponse.getAwbNumber().equals(awb)){
                    b = true;
                    if (!thatResponse.getSuccess().equals(thisResponse.getSuccess())) return false;
                    if (!thatResponse.getShipperId().equals(thisResponse.getShipperId())) return false;
                    if (!thatResponse.getNdrStatus().equals(thisResponse.getNdrStatus())) return false;
                    if (!thatResponse.getNdrCount().equals(thisResponse.getNdrCount())) return false;
                    if (!thatResponse.getMessage().equals(thisResponse.getMessage())) return false;
                    if (!thatResponse.getRemarks().equals(thisResponse.getRemarks())) return false;
                    if (!thatResponse.getResponse().equals(thisResponse.getResponse())) return false;
                }
            }
            if (!b) return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(NDRResponse);
    }
}
