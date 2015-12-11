package com.dimensiondata.cloud.client;

import com.dimensiondata.cloud.client.http.FirewallServiceImpl;
import com.dimensiondata.cloud.client.http.NetworkDomainServiceImpl;
import com.dimensiondata.cloud.client.model.FirewallRuleType;
import com.dimensiondata.cloud.client.model.FirewallRules;
import com.dimensiondata.cloud.client.model.NetworkDomainType;
import com.dimensiondata.cloud.client.model.NetworkDomains;

public class FirewallServiceDemo
{
    public static void main(String[] args)
    {
        UserSession.set(new User("seeded-org-id-1", "seeded-test-user-1", "Password1!"));

        NetworkDomainService networkDomainService = new NetworkDomainServiceImpl("http://localhost:8081/oec");
        NetworkDomains networkDomains = networkDomainService.listNetworkDomains(100, 1, new OrderBy(), new Filter());
        for (NetworkDomainType networkDomain : networkDomains.getNetworkDomain())
        {
            System.out.println(networkDomain.getId());
        }

        FirewallService firewallService = new FirewallServiceImpl("http://localhost:8081/oec");

        FirewallRules firewallRules = firewallService.listFirewallRules(100, 1, new OrderBy(), new Filter(
                new Param(FirewallServiceImpl.PARAMETER_NETWORKDOMAIN_ID, "1c813510-216a-434d-bd07-226ee5424ca3")
        ));
        for (FirewallRuleType firewallRule : firewallRules.getFirewallRule())
        {
            System.out.println(firewallRule.getId() + " " + firewallRule.getName());
        }
    }
}
