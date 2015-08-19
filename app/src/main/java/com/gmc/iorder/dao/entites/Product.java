package com.gmc.iorder.dao.entites;

import java.util.List;
import java.util.UUID;

/**
 * Created by Trung on 8/19/2015.
 */
public class Product extends Base
{
    private String name;
    private List<UUID> photoIds;
    private String barCode;
    private UUID manufactureId;
    private String detailProduct;
    private String ingredient;
    private String suggestion;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<UUID> getPhotoIds()
    {
        return photoIds;
    }

    public void setPhotoIds(List<UUID> photoIds)
    {
        this.photoIds = photoIds;
    }

    public String getBarCode()
    {
        return barCode;
    }

    public void setBarCode(String barCode)
    {
        this.barCode = barCode;
    }

    public UUID getManufactureId()
    {
        return manufactureId;
    }

    public void setManufactureId(UUID manufactureId)
    {
        this.manufactureId = manufactureId;
    }

    public String getDetailProduct()
    {
        return detailProduct;
    }

    public void setDetailProduct(String detailProduct)
    {
        this.detailProduct = detailProduct;
    }

    public String getIngredient()
    {
        return ingredient;
    }

    public void setIngredient(String ingredient)
    {
        this.ingredient = ingredient;
    }

    public String getSuggestion()
    {
        return suggestion;
    }

    public void setSuggestion(String suggestion)
    {
        this.suggestion = suggestion;
    }
}
