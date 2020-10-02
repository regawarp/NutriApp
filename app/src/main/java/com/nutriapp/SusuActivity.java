package com.nutriapp;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.nutriapp.adapter.BahanPagerAdapter;

import java.util.ArrayList;
import java.util.Objects;

public class SusuActivity extends AppCompatActivity {
    ViewPager viewPager;
    ArrayList<Fragment> fragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_susu);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        fragments.add(new SusuTanpaLemakFragment());
        fragments.add(new SusuRendahLemakFragment());
        fragments.add(new SusuTinggiLemakFragment());

        BahanPagerAdapter bahanPagerAdapter = new BahanPagerAdapter(getSupportFragmentManager(),
                FragmentPagerAdapter.POSITION_NONE, fragments);
        viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(bahanPagerAdapter);

        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return true;
    }

}
