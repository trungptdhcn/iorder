package com.gmc.iorder.base.event;


import com.gmc.iorder.base.BaseFragment;

/**
 * Created by Trung on 5/17/2015.
 */
public class ChangedFragmentEvent
{
    private BaseFragment baseFragment;

    public ChangedFragmentEvent(BaseFragment baseFragment)
    {
        this.baseFragment = baseFragment;
    }

    public BaseFragment getBaseFragment()
    {
        return baseFragment;
    }

    public void setBaseFragment(BaseFragment baseFragment)
    {
        this.baseFragment = baseFragment;
    }
}
