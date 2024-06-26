package com.example.client.response;


import com.example.client.constant.ApiStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.io.Serializable;

@JsonRootName(value = "response")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_EMPTY)
public class ApiResponse implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 7962800603027595156L;

    @JsonProperty(value="apiStatus")
    private ApiStatus apiStatus;

    @JsonProperty(value="data")
    private Object data;

    @JsonProperty(value="message")
    private String message;

    @JsonProperty(value="exception")
    private String exception;


    /**
     * @param status
     * @param message
     */
    public ApiResponse(ApiStatus apiStatus, String message) {
        this.apiStatus = apiStatus;
        this.message = message;
    }

    /**
     * @param status
     * @param message
     * @param data
     */
    public ApiResponse(ApiStatus apiStatus, String message, Object data) {
        this.apiStatus = apiStatus;
        this.message = message;
        this.data = data;
    }

    /**
     * @param status
     * @param message
     * @param exception
     */
    public ApiResponse(ApiStatus apiStatus, String message, String exception) {
        super();
        this.apiStatus = apiStatus;
        this.message = message;
        this.exception = exception;
    }

    /**
     * @param status
     * @param message
     * @param exception
     * @param data
     */
    public ApiResponse(ApiStatus apiStatus, String message, String exception, Object data) {
        super();
        this.apiStatus = apiStatus;
        this.message = message;
        this.exception = exception;
        this.data = data;
    }

    public ApiStatus getApiStatus() {
        return apiStatus;
    }

    public Object getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    public String getException() {
        return exception;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }



}
