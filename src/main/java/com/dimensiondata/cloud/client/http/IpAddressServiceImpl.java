package com.dimensiondata.cloud.client.http;

import com.dimensiondata.cloud.client.Filter;
import com.dimensiondata.cloud.client.IpAddressService;
import com.dimensiondata.cloud.client.OrderBy;
import com.dimensiondata.cloud.client.Param;
import com.dimensiondata.cloud.client.model.*;

import javax.ws.rs.client.Entity;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class IpAddressServiceImpl implements IpAddressService
{
    public static final String PARAMETER_ID = "id";

    private final HttpClient httpClient;

    public IpAddressServiceImpl(String baseUrl)
    {
        httpClient = new HttpClient(baseUrl);
    }

    @Override
    public ResponseType addPublicIpBlock(AddPublicIpBlockType addPublicIpBlock)
    {
        return httpClient.post("network/addPublicIpBlock",
                new JAXBElement<>(new QName(HttpClient.DEFAULT_NAMESPACE, "addPublicIpBlock"), AddPublicIpBlockType.class, addPublicIpBlock),
                ResponseType.class);
    }

    @Override
    public PublicIpBlocks listPublicIpBlocks(int pageSize, int pageNumber, OrderBy orderBy, Filter filter)
    {
        return null;  //TODO Implement this method
    }

    @Override
    public PublicIpBlockType getPublicIpBlock(String id)
    {
        return httpClient.get("network/publicIpBlock/" + id, PublicIpBlockType.class, new Param[] {});
    }

    @Override
    public ResponseType removePublicIpBlock(String id)
    {
        return httpClient.post("network/removePublicIpBlock",
                Entity.xml("<<removePublicIpBlock xmlns=\"" + HttpClient.DEFAULT_NAMESPACE + "\" id=\"" + id + "\"/>"),
                ResponseType.class);
    }

    @Override
    public ReservedPublicIpv4Addresses listReservedPublicIpv4Addresses(int pageSize, int pageNumber, OrderBy orderBy, Filter filter)
    {
        return null;  //TODO Implement this method
    }

    @Override
    public ReservedPrivateIpv4Addresses listReservedPrivateIpv4Addresses(int pageSize, int pageNumber, OrderBy orderBy, Filter filter)
    {
        return null;  //TODO Implement this method
    }
}