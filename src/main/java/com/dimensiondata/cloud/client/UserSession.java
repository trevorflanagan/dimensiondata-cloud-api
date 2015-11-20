package com.dimensiondata.cloud.client;

public class UserSession
{
    private static final ThreadLocal<User> session = new ThreadLocal<>();

    public static void set(User user)
    {
        session.set(user);
    }

    public static User get()
    {
        if (session.get() == null)
        {
            throw new RuntimeException("UserSession not set");
        }

        return session.get();
    }
}