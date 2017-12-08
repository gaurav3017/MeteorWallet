package com.singh.grv.meteorwallet;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by grv on 08-12-2017.
 */

class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0:
                AppsFragment appsFragment = new AppsFragment();
                return appsFragment;

            case 1:
                TransactionFragment transactionFragment = new TransactionFragment();
                return transactionFragment;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    public CharSequence getPageTitle(int position){

        switch (position){
            case 0:
                return "All Apps";

            case 1:
                return "Transactions";

            default:
                return null;

        }

    }
}
