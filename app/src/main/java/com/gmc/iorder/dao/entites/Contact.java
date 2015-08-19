package com.gmc.iorder.dao.entites;

import java.util.UUID;

/**
 * Created by Trung on 8/19/2015.
 */
public class Contact
{
    private String name;
    private String address;
    private UUID communicationId;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public UUID getCommunicationId()
    {
        return communicationId;
    }

    public void setCommunicationId(UUID communicationId)
    {
        this.communicationId = communicationId;
    }
}
