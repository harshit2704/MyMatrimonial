package com.expertwebtech.PeopleMatrimonial;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterPage3 extends Fragment {
    EditText otp_textbox_one, otp_textbox_two, otp_textbox_three, otp_textbox_four;
    Button verify_otp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        container.removeAllViews();
        View view=inflater.inflate(R.layout.fragment_register_page3, container, false);
        otp_textbox_one = view.findViewById(R.id.otp_edit_box1);
        otp_textbox_two = view.findViewById(R.id.otp_edit_box2);
        otp_textbox_three = view.findViewById(R.id.otp_edit_box3);
        otp_textbox_four = view.findViewById(R.id.otp_edit_box4);
        verify_otp = view.findViewById(R.id.verify_otp_btn);
        EditText[] edit = {otp_textbox_one, otp_textbox_two, otp_textbox_three, otp_textbox_four};

        otp_textbox_one.addTextChangedListener(new OTPTextWatcher(otp_textbox_one, edit));
        otp_textbox_two.addTextChangedListener(new OTPTextWatcher(otp_textbox_two, edit));
        otp_textbox_three.addTextChangedListener(new OTPTextWatcher(otp_textbox_three, edit));
        otp_textbox_four.addTextChangedListener(new OTPTextWatcher(otp_textbox_four, edit));
        verify_otp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "OTP verified", Toast.LENGTH_SHORT).show();

            }
        });



        return view;
    }
}