package com.dimensiondata.cloud.client.http;

import com.dimensiondata.cloud.client.*;

public class CloudImpl implements Cloud
{
    private final DatacenterService datacenter;
    private final NetworkDomainService networkDomain;
    private final VlanService vlan;
    private final IpAddressService ipAddress;
    private final FirewallService firewall;
    private final NatService nat;
    private final ServerService server;
    private final MonitoringService monitoring;
    private final NodeService node;
    private final PoolService pool;
    private final SupportService support;
    private final VirtualListenerService virtualListener;

    public CloudImpl(String baseUrl)
    {
        datacenter = new DatacenterServiceImpl(baseUrl);
        networkDomain = new NetworkDomainServiceImpl(baseUrl);
        vlan = new VlanServiceImpl(baseUrl);
        ipAddress = new IpAddressServiceImpl(baseUrl);
        firewall = new FirewallServiceImpl(baseUrl);
        nat = new NatServiceImpl(baseUrl);
        server = new ServerServiceImpl(baseUrl);
        monitoring = new MonitoringServiceImpl(baseUrl);
        node = new NodeServiceImpl(baseUrl);
        pool = new PoolServiceImpl(baseUrl);
        support = new SupportServiceImpl(baseUrl);
        virtualListener = new VirtualListenerServiceImpl(baseUrl);
    }

    @Override
    public DatacenterService datacenter()
    {
        return datacenter;
    }

    @Override
    public NetworkDomainService networkDomain()
    {
        return networkDomain;
    }

    @Override
    public VlanService vlan()
    {
        return vlan;
    }

    @Override
    public IpAddressService ipAddress()
    {
        return ipAddress;
    }

    @Override
    public FirewallService firewall()
    {
        return firewall;
    }

    @Override
    public NatService nat()
    {
        return nat;
    }

    @Override
    public ServerService server()
    {
        return server;
    }

    @Override
    public MonitoringService monitoring()
    {
        return monitoring;
    }

    @Override
    public NodeService node()
    {
        return node;
    }

    @Override
    public PoolService pool()
    {
        return pool;
    }

    @Override
    public SupportService support()
    {
        return support;
    }

    @Override
    public VirtualListenerService virtualListener()
    {
        return virtualListener;
    }
}