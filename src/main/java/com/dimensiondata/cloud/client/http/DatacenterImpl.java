package com.dimensiondata.cloud.client.http;

import com.dimensiondata.cloud.client.Datacenter;
import com.dimensiondata.cloud.client.model.DatacenterType;
import com.dimensiondata.cloud.client.model.Datacenters;

public class DatacenterImpl implements Datacenter
{
    private final HttpClient httpClient;


    public DatacenterImpl(String baseUrl)
    {
        httpClient = new HttpClient(baseUrl);
    }


    @Override
    public Datacenters listDatacenters(int pageSize, int pageNumber)
    {
        return httpClient.get("infrastructure/datacenter", Datacenters.class,
                new Param("pageSize", pageSize),
                new Param("pageNumber", pageNumber));
    }

    @Override
    public DatacenterType getDatacenter(String id)
    {
        Datacenters datacenters = httpClient.get("infrastructure/datacenter", Datacenters.class, new Param("id", id));
        return datacenters.getDatacenter().size() > 0 ? datacenters.getDatacenter().get(0) : null;
    }
}