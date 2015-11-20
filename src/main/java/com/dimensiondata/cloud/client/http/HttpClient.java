package com.dimensiondata.cloud.client.http;

import com.dimensiondata.cloud.client.UserSession;

import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Map;

import static org.glassfish.jersey.client.authentication.HttpAuthenticationFeature.HTTP_AUTHENTICATION_BASIC_PASSWORD;
import static org.glassfish.jersey.client.authentication.HttpAuthenticationFeature.HTTP_AUTHENTICATION_BASIC_USERNAME;

public class HttpClient
{
    public static final String API_VERSION = "2.0";
    private static final MediaType MEDIA_TYPE = MediaType.APPLICATION_XML_TYPE;

    public static <T> T get(WebTarget baseTarget, String path, Map<String,List<String>> parameters, Class<T> responseType)
    {
        return get(baseTarget, path, parameters).readEntity(responseType);
    }

    public static Response get(WebTarget baseTarget, String path, Map<String,List<String>> parameters)
    {
        WebTarget target = baseTarget.path(API_VERSION)
                .path(UserSession.get().getOrgId())
                .path(path);

        if (parameters != null)
        {
            for (String name : parameters.keySet())
            {
                List<String> values = parameters.get(name);
                target = target.queryParam(name, values.toArray(new String[values.size()]));
            }
        }

        Invocation.Builder request = target.request(MEDIA_TYPE);
        request.property(HTTP_AUTHENTICATION_BASIC_USERNAME, UserSession.get().getUser())
                .property(HTTP_AUTHENTICATION_BASIC_PASSWORD, UserSession.get().getPassword());
        return request.get();
    }
}