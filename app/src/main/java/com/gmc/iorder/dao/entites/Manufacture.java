package com.gmc.iorder.dao.entites;

import java.util.UUID;

/**
 * Created by Trung on 8/19/2015.
 */
public class Manufacture extends Base
{
    private UUID contactId;

    public UUID getContactId()
    {
        return contactId;
    }

    public void setContactId(UUID contactId)
    {
        this.contactId = contactId;
    }
}
