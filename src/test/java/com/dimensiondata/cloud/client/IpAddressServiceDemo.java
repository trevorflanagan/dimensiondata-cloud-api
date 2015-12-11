package com.dimensiondata.cloud.client;

import com.dimensiondata.cloud.client.http.IpAddressServiceImpl;
import com.dimensiondata.cloud.client.model.PublicIpBlockType;
import com.dimensiondata.cloud.client.model.PublicIpBlocks;
import com.dimensiondata.cloud.client.model.ResponseType;

public class IpAddressServiceDemo
{
    public static void main(String[] args)
    {
        UserSession.set(new User("seeded-org-id-1", "seeded-test-user-1", "Password1!"));

        try
        {
            IpAddressService ipAddressService = new IpAddressServiceImpl("http://localhost:8081/oec");
            PublicIpBlocks publicIpBlocks = ipAddressService.listPublicIpBlocks(100, 1, OrderBy.EMPTY, Filter.EMPTY);
            for (PublicIpBlockType publicIpBlock : publicIpBlocks.getPublicIpBlock())
            {
                System.out.println(publicIpBlock.getId());
            }
        }
        catch (BadRequestException e)
        {
            ResponseType responseType = e.getResponseType();
            System.out.println(responseType.getMessage());
        }
    }
}