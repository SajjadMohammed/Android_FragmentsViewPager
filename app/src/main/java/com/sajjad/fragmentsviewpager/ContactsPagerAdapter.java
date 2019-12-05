package com.sajjad.fragmentsviewpager;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.sajjad.fragmentsviewpager.Contacts.ContactsFragment;
import com.sajjad.fragmentsviewpager.Contacts.FavouritesFragment;
import com.sajjad.fragmentsviewpager.Contacts.MissedCallsFragment;

public class ContactsPagerAdapter extends FragmentPagerAdapter {

    private Fragment []fragments;
    private String [] titles;

    ContactsPagerAdapter(FragmentManager fm) {
        super(fm);

        fragments = new Fragment[]{
                new ContactsFragment(),
                new FavouritesFragment(),
                new MissedCallsFragment()
        };

        titles = new String[]{
                "ContactsFragment",
                "FavouritesFragment",
                "MissedCallsFragment"
        };
    }

    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}