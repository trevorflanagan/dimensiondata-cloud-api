package com.dimensiondata.cloud.client;

public class User
{
    private final String orgId;
    private final String user;
    private final String password;

    public User(String orgId, String user, String password)
    {
        this.orgId = orgId;
        this.user = user;
        this.password = password;
    }

    public String getOrgId()
    {
        return orgId;
    }

    public String getUser()
    {
        return user;
    }

    public String getPassword()
    {
        return password;
    }
}