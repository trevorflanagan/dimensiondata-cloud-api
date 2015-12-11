package com.dimensiondata.cloud.client;

import com.dimensiondata.cloud.client.model.ResponseType;

public class BadRequestException extends RuntimeException
{
    private final ResponseType response;

    public BadRequestException(ResponseType response)
    {
        super(response.getMessage());
        this.response = response;
    }

    public ResponseType getResponse()
    {
        return response;
    }
}