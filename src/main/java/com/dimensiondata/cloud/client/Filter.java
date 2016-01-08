package com.dimensiondata.cloud.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Filter
{
    public static final String LIKE_SUFFIX = ".LIKE";
    public static final String GE_SUFFIX = ".GE";
    public static final String LE_SUFFIX = ".LE";
    public static final String GT_SUFFIX = ".GT";
    public static final String LT_SUFFIX = ".LT";
    public static final Filter EMPTY = new Filter();

    private final Param[] parameters;

    public Filter(Param ... parameters)
    {
        this.parameters = parameters;
    }

    public Param[] concatenateParameters(Param... otherParameters)
    {
        List<Param> allParameters = new ArrayList<>(Arrays.asList(otherParameters));
        allParameters.addAll(Arrays.asList(parameters));
        return allParameters.toArray(new Param[allParameters.size()]);
    }

    public void validate(List<String> validNames)
    {
        for (Param parameter : parameters)
        {
            String name = parameter.getName();
            if (name.contains("."))
            {
                name = name.substring(0, name.lastIndexOf("."));
            }

            if (!validNames.contains(name))
            {
                throw new IllegalArgumentException("Unknown Filter parameter: " + name);
            }
        }
    }
}
