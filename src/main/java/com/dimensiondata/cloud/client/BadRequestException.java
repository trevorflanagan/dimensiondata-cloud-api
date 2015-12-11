package com.dimensiondata.cloud.client;

import com.dimensiondata.cloud.client.model.ResponseType;

public class BadRequestException extends RuntimeException
{
    private final ResponseType responseType;

    public BadRequestException(ResponseType responseType)
    {
        super(responseType.getMessage());
        this.responseType = responseType;
    }

    public ResponseType getResponseType()
    {
        return responseType;
    }
}