package com.dimensiondata.cloud.client.http;

import com.dimensiondata.cloud.client.Filter;
import com.dimensiondata.cloud.client.NetworkDomainService;
import com.dimensiondata.cloud.client.OrderBy;
import com.dimensiondata.cloud.client.Param;
import com.dimensiondata.cloud.client.model.DeployNetworkDomainType;
import com.dimensiondata.cloud.client.model.EditNetworkDomainType;
import com.dimensiondata.cloud.client.model.NetworkDomainType;
import com.dimensiondata.cloud.client.model.NetworkDomains;

import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NetworkDomainServiceImpl implements NetworkDomainService
{
    public static final String PARAMETER_ID = "id";
    public static final String PARAMETER_DATACENTER_ID = "datacenterId";
    public static final String PARAMETER_NAME = "name";
    public static final String PARAMETER_TYPE = "type";
    public static final String PARAMETER_STATE = "state";
    public static final String PARAMETER_CREATE_TIME = "createTime";

    public static final List<String> ORDER_BY_PARAMETERS = Collections.unmodifiableList(Arrays.asList(
            PARAMETER_ID,
            PARAMETER_DATACENTER_ID,
            PARAMETER_NAME,
            PARAMETER_TYPE,
            PARAMETER_STATE,
            PARAMETER_CREATE_TIME));

    public static final List<String> FILTER_PARAMETERS = Collections.unmodifiableList(Arrays.asList(
            PARAMETER_ID,
            PARAMETER_DATACENTER_ID,
            PARAMETER_NAME,
            PARAMETER_TYPE,
            PARAMETER_STATE,
            PARAMETER_CREATE_TIME));

    private final HttpClient httpClient;

    public NetworkDomainServiceImpl(String baseUrl)
    {
        httpClient = new HttpClient(baseUrl);
    }

    @Override
    public NetworkDomains listNetworkDomains(int pageSize, int pageNumber, OrderBy orderBy, Filter filter)
    {
        orderBy.validate(ORDER_BY_PARAMETERS);
        filter.validate(FILTER_PARAMETERS);

        return httpClient.get("network/networkDomain", NetworkDomains.class,
                filter.concatenateParameters(
                        new Param(Param.PAGE_SIZE, pageSize),
                        new Param(Param.PAGE_NUMBER, pageNumber),
                        new Param(Param.ORDER_BY, orderBy.concatenateParameters())));
    }

    @Override
    public NetworkDomainType getNetworkDomain(String id)
    {
        NetworkDomains networkDomains = httpClient.get("network/networkDomain", NetworkDomains.class, new Param(PARAMETER_ID, id));
        return networkDomains.getNetworkDomain().size() > 0 ? networkDomains.getNetworkDomain().get(0) : null;
    }

    @Override
    public Response deployNetworkDomain(DeployNetworkDomainType deployNetworkDomain)
    {
        return httpClient.post("network/deployNetworkDomain",
                new JAXBElement<>(new QName("urn:didata.com:api:cloud:types", "deployNetworkDomain"), DeployNetworkDomainType.class, deployNetworkDomain));
    }

    @Override
    public Response editNetworkDomain(EditNetworkDomainType editNetworkDomain)
    {
        return null;  //TODO Implement this method
    }

    @Override
    public Response deleteNetworkDomain(String id)
    {
        return null;  //TODO Implement this method
    }
}