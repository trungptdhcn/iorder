package com.gmc.iorder.dao.entites;

import java.util.UUID;

/**
 * Created by Trung on 8/19/2015.
 */
public class WhereOrder
{
    private Long price;
    private int star;
    private UUID contactId;

    public Long getPrice()
    {
        return price;
    }

    public void setPrice(Long price)
    {
        this.price = price;
    }

    public int getStar()
    {
        return star;
    }

    public void setStar(int star)
    {
        this.star = star;
    }

    public UUID getContactId()
    {
        return contactId;
    }

    public void setContactId(UUID contactId)
    {
        this.contactId = contactId;
    }
}
