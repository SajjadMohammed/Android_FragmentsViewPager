package com.sajjad.fragmentsviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {


    Toolbar mainToolbar;

    ViewPager contactsViewPager;
    TabLayout contactsTab;
    ContactsPagerAdapter contactsPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainToolbar = findViewById(R.id.mainToolbar);
        setSupportActionBar(mainToolbar);

        contactsViewPager = findViewById(R.id.contactsViewPager);
        contactsTab = findViewById(R.id.contactsTab);

        contactsPagerAdapter = new ContactsPagerAdapter(getSupportFragmentManager());
        contactsViewPager.setAdapter(contactsPagerAdapter);

        contactsTab.setupWithViewPager(contactsViewPager);

        setUpIcons();

    }

    private void setUpIcons() {
        contactsTab.getTabAt(0).setIcon(R.drawable.contacts_icon);
        contactsTab.getTabAt(1).setIcon(R.drawable.favorite_icon);
        contactsTab.getTabAt(2).setIcon(R.drawable.missed_calls_icon);
    }
}