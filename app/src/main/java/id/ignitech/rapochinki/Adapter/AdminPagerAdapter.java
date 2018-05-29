package id.ignitech.rapochinki.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import id.ignitech.rapochinki.Fragment.ChatFragment;
import id.ignitech.rapochinki.Fragment.HomeAdminFragment;
import id.ignitech.rapochinki.Fragment.LayananFragment;
import id.ignitech.rapochinki.Fragment.OrderFragment;
import id.ignitech.rapochinki.Fragment.RappociniFragment;

/**
 * Created by Asus on 08/01/2018.
 */

public class AdminPagerAdapter extends FragmentStatePagerAdapter {

    //integer to count number of tabs
    int tabCount;

    //Constructor to the class
    public AdminPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        //Initializing tab count
        this.tabCount= tabCount;
    }

    //Overriding method getItem
    @Override
    public Fragment getItem(int position) {
        //Returning the current tabs
        switch (position) {
            case 0:
                HomeAdminFragment tab1 = new HomeAdminFragment ();
                return tab1;
            case 1:
                OrderFragment tab2 = new OrderFragment();
                return tab2;
            default:
                return null;
        }
    }

    //Overriden method getCount to get the number of tabs
    @Override
    public int getCount() {
        return tabCount;
    }
}
