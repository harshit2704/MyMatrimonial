package com.expertwebtech.PeopleMatrimonial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;


public class ProposalAdapter extends RecyclerView.Adapter {
    private Context context;
    ProposalAdapter(Context context2) {
        this.context = context2;
    }

    @Override
    public MyView onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyView(LayoutInflater.from(this.context).inflate(R.layout.your_proposal_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return 3;
    }
    public class MyView extends RecyclerView.ViewHolder {
        private ConstraintLayout recycle_constraint;

        public MyView(View itemView) {
            super(itemView);
        }
    }
}
