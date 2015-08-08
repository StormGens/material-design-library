package com.blunderer.materialdesignlibrary.models;

import android.content.Intent;

/**
 * Created by zlq on 15-8-8.
 */
public class DSNavigationDrawerListHeader extends ListHeader{
    private Intent mIntent;

    public Intent getIntent() {
        return mIntent;
    }

    public void setIntent(Intent intent) {
        this.mIntent = intent;
    }
}
