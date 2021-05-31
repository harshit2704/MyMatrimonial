package com.expertwebtech.PeopleMatrimonial;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Register extends Fragment {
    Button button;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_register, container, false);
        button= view.findViewById(R.id.btn_register);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
                container.removeAllViews();
//                fragmentTransaction.replace(((ViewGroup)(getView().getParent())).getId(), new RegisterPage2());
                fragmentTransaction.replace(R.id.registerFragment,new RegisterPage2(),null);
                fragmentTransaction.setReorderingAllowed(true).addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        return view;
    }
}