package com.expertwebtech.PeopleMatrimonial;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class RegisterPage2 extends Fragment {

    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_register_page2, container, false);
        button=view.findViewById(R.id.btn_submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
//                container.removeAllViews();
//                fragmentTransaction.replace(((ViewGroup)(getView().getParent())).getId(), new RegisterPage2());
                fragmentTransaction.replace(R.id.registerFragment,new RegisterPage3(),Register.registerStack);
                fragmentTransaction.setReorderingAllowed(true).addToBackStack(Register.registerStack);
                fragmentTransaction.commit();

            }
        });



        return view;
    }
}