package com.expertwebtech.PeopleMatrimonial;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mindorks.placeholderview.SwipeDecor;
import com.mindorks.placeholderview.SwipePlaceHolderView;

public class ProfileLayoutFragment extends Fragment {
    private SwipePlaceHolderView mSwipeView;
    private Context mContext;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_profile_layout, container, false);
        mSwipeView=(SwipePlaceHolderView) view.findViewById(R.id.swipeView);
        mContext=getContext();
        mSwipeView.getBuilder().setDisplayViewCount(3)
                .setSwipeDecor(new SwipeDecor().setPaddingTop(20)
                .setRelativeScale(0.01f)
                .setSwipeInMsgLayoutId(R.layout.swipe_in_msg_view)
                .setSwipeOutMsgLayoutId(R.layout.swipe_out_msg_view));
        for(Profile profile : Utils.loadProfiles(this.getContext())){
            mSwipeView.addView(new Card(mContext, profile, mSwipeView));
        }

        view.findViewById(R.id.rejectBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSwipeView.doSwipe(false);
            }
        });

        view.findViewById(R.id.acceptBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSwipeView.doSwipe(true);
            }
        });

        return view;
    }
}