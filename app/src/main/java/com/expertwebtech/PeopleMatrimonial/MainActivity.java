package com.expertwebtech.PeopleMatrimonial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    private RadioButton newJoin;
    private RadioButton yourProposal;
    private RadioButton recentlyViewed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newJoin =findViewById(R.id.newPerson);
        yourProposal=findViewById(R.id.yourProposal);
        recentlyViewed=findViewById(R.id.RecentlyViewed);
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.homeFragment,new ProfileLayoutFragment());
        fragmentTransaction.commit();
        newJoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.homeFragment,new ProfileLayoutFragment());
                fragmentTransaction.commit();
            }
        });
        yourProposal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.homeFragment,new YourProposalFragment());
                fragmentTransaction.commit();
            }
        });
        recentlyViewed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.homeFragment,new RecentlyViewedFragment());
                fragmentTransaction.commit();
            }
        });

    }

    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }
}