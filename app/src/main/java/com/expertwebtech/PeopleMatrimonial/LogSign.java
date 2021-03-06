package com.expertwebtech.PeopleMatrimonial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

import java.util.ArrayList;

public class LogSign extends AppCompatActivity {
    private Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_sign);
        AuthenticationPagerAdapter pagerAdapter = new AuthenticationPagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragment(new LogIn());
        pagerAdapter.addFragment(new Register());
        ((ViewPager) findViewById(R.id.viewPager)).setAdapter(pagerAdapter);
    }
    class AuthenticationPagerAdapter extends FragmentPagerAdapter {
        private ArrayList<Fragment> fragmentList = new ArrayList<>();

        public AuthenticationPagerAdapter(FragmentManager supportFragmentManager) {
            super(supportFragmentManager);
        }

        public Fragment getItem(int position) {

            return this.fragmentList.get(position);
        }

        public int getCount() {

            return this.fragmentList.size();
        }

        public void addFragment(Fragment fragment) {

            this.fragmentList.add(fragment);
        }
    }




}