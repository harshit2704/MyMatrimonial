package com.expertwebtech.PeopleMatrimonial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    private RadioButton newPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newPerson=findViewById(R.id.newPerson);
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.homeFragment,new ProfileLayoutFragment());
        fragmentTransaction.commit();

    }

    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }
}