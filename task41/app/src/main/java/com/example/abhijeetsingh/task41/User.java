package com.example.abhijeetsingh.task41;

/**
 * Created by Abhijeet Singh on 12-07-2017.
 */

public class User {
    private String mname;
    private String memailaddress;

    public User(String name,String emailaddress)
    {
        mname=name;
        memailaddress=emailaddress;

    }

    public String getName()
    {
        return mname;
    }
    public String getemailaddress()
    {
        return memailaddress;
    }
}
