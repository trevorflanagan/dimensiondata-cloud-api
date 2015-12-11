package com.dimensiondata.cloud.client.http;

import com.dimensiondata.cloud.client.Filter;
import com.dimensiondata.cloud.client.OrderBy;
import com.dimensiondata.cloud.client.PoolService;
import com.dimensiondata.cloud.client.model.*;

public class PoolServiceImpl implements PoolService
{
    @Override
    public ResponseType createPool(CreatePool createPool)
    {
        return null;  //TODO Implement this method
    }

    @Override
    public Pools listPools(int pageSize, int pageNumber, OrderBy orderBy, Filter filter)
    {
        return null;  //TODO Implement this method
    }

    @Override
    public PoolType getPool(String id)
    {
        return null;  //TODO Implement this method
    }

    @Override
    public ResponseType editPool(EditPool editPool)
    {
        return null;  //TODO Implement this method
    }

    @Override
    public ResponseType deletePool(String id)
    {
        return null;  //TODO Implement this method
    }

    @Override
    public ResponseType addPoolMember(AddPoolMember addPoolMember)
    {
        return null;  //TODO Implement this method
    }

    @Override
    public PoolMembers listPoolMembers(int pageSize, int pageNumber, OrderBy orderBy, Filter filter)
    {
        return null;  //TODO Implement this method
    }

    @Override
    public PoolMemberType getPoolMember(String id)
    {
        return null;  //TODO Implement this method
    }

    @Override
    public ResponseType editPoolMember(EditPoolMember editPoolMember)
    {
        return null;  //TODO Implement this method
    }

    @Override
    public ResponseType removePoolMember(String id)
    {
        return null;  //TODO Implement this method
    }
}
