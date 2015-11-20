package com.dimensiondata.cloud.client.http;

import com.dimensiondata.cloud.client.Datacenter;
import com.dimensiondata.cloud.client.model.DatacenterType;
import com.dimensiondata.cloud.client.model.Datacenters;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.dimensiondata.cloud.client.http.HttpClient.get;

public class DatacenterImpl implements Datacenter
{
    private final WebTarget baseTarget;

    public DatacenterImpl(String baseUrl)
    {
        Client client = ClientBuilder.newClient();
        client = client.register(HttpAuthenticationFeature.basicBuilder().build());
        baseTarget = client.target(baseUrl);
    }

    @Override
    public Datacenters listDatacenters(int pageSize, int pageNumber)
    {
        return null;  // TODO Implement this method
    }

    @Override
    public DatacenterType getDatacenter(String id)
    {
        Datacenters datacenters = get(baseTarget, "infrastructure/datacenter", getParameters("id", id), Datacenters.class);
        return datacenters.getDatacenter().size() > 0 ? datacenters.getDatacenter().get(0) : null;
    }

    private Map<String,List<String>> getParameters(String name, String value)
    {
        Map<String,List<String>> parameters = new HashMap<>();
        parameters.put(name, Collections.singletonList(value));
        return parameters;
    }
}