package com.dimensiondata.cloud.client;

import com.dimensiondata.cloud.client.model.DeployNetworkDomainType;
import com.dimensiondata.cloud.client.model.EditNetworkDomainType;
import com.dimensiondata.cloud.client.model.NetworkDomainType;
import com.dimensiondata.cloud.client.model.NetworkDomains;

import javax.ws.rs.core.Response;

public interface NetworkDomainService
{
    NetworkDomains listNetworkDomains(int pageSize, int pageNumber, OrderBy orderBy, Filter filter);

    NetworkDomainType getNetworkDomain(String id);

    Response deployNetworkDomain(DeployNetworkDomainType deployNetworkDomain);

    Response editNetworkDomain(EditNetworkDomainType editNetworkDomain);

    Response deleteNetworkDomain(String id);
}