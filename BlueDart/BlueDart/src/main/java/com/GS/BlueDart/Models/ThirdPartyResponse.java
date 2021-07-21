/**
 *
 */
package com.GS.BlueDart.Models;

/**
 * @author gp
 *
 */
public class ThirdPartyResponse<T> {

    private T result;

    private Boolean isSuccess;

    private String message;

    public ThirdPartyResponse() {
    }

    public ThirdPartyResponse(T result) {
        this.result = result;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
