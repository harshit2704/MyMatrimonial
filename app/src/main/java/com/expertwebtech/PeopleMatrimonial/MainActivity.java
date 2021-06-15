package com.expertwebtech.PeopleMatrimonial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    private RadioButton newJoin;
    public RadioButton yourProposal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newJoin =findViewById(R.id.newPerson);
        yourProposal=findViewById(R.id.yourProposal);
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

    }

    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }
}