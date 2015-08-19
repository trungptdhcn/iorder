package com.gmc.iorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.gmc.iorder.base.BaseActivity;
import com.gmc.iorder.base.BaseFragment;
import com.gmc.iorder.ui.HomeFragment;


public class MainActivity extends BaseActivity
{
    @Override
    public BaseFragment getDefaultFragment()
    {
        return new HomeFragment();
    }
}
