package com.dimensiondata.cloud.client.http;

public class Param
{
    private final String name;
    private final String value;

    public Param(String name, String value)
    {
        this.name = name;
        this.value = value;
    }

    public Param(String name, int value)
    {
        this(name, Integer.toString(value));
    }

    public String getName()
    {
        return name;
    }

    public String getValue()
    {
        return value;
    }
}