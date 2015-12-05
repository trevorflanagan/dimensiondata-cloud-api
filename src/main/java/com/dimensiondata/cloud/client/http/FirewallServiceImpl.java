package com.dimensiondata.cloud.client.http;

import com.dimensiondata.cloud.client.Filter;
import com.dimensiondata.cloud.client.FirewallService;
import com.dimensiondata.cloud.client.OrderBy;
import com.dimensiondata.cloud.client.model.*;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FirewallServiceImpl implements FirewallService
{
    public static final String PARAMETER_ID = "id";

    private final HttpClient httpClient;

    public FirewallServiceImpl(String baseUrl)
    {
        httpClient = new HttpClient(baseUrl);
    }

    @Override
    public FirewallRules listFirewallRules(int pageSize, int pageNumber, OrderBy orderBy, Filter filter)
    {
        return null;  //TODO Implement this method
    }

    @Override
    public ResponseType createFirewallRule(CreateFirewallRuleType createFirewallRule)
    {
        return httpClient.post("network/createFirewallRule",
                new JAXBElement<>(new QName(HttpClient.DEFAULT_NAMESPACE, "createFirewallRule"), CreateFirewallRuleType.class, createFirewallRule),
                ResponseType.class);
    }

    @Override
    public FirewallRuleType getFirewallRule(String id)
    {
        return null;  //TODO Implement this method
    }

    @Override
    public ResponseType editFirewallRule(EditFirewallRuleType editFirewallRule)
    {
        return null;  //TODO Implement this method
    }

    @Override
    public ResponseType deleteFirewallRule(String id)
    {
        return null;  //TODO Implement this method
    }
}