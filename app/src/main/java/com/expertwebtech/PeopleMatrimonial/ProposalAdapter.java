package com.expertwebtech.PeopleMatrimonial;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;


public class ProposalAdapter extends RecyclerView.Adapter {
    private Context context;
    private final View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            v.getContext().startActivity(new Intent(context.getApplicationContext(), ChatActivity.class));

        }
    };
    ProposalAdapter(Context context2) {
        this.context = context2;
    }

    @Override
    public MyView onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(this.context).inflate(R.layout.your_proposal_layout,parent,false);
        view.setOnClickListener(mOnClickListener);
        return new MyView(view);
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
