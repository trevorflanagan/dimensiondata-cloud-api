package com.dimensiondata.cloud.client;

import com.dimensiondata.cloud.client.model.DatacenterType;
import com.dimensiondata.cloud.client.model.Datacenters;

public interface DatacenterService
{
    Datacenters listDatacenters(int pageSize, int pageNumber);

    DatacenterType getDatacenter(String id);
}