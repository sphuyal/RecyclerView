package com.hello.recyclerview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class contactAdapter extends RecyclerView.Adapter<contactAdapter.ContectsViewHolder> {
    Context mContext;
    List<Contacts>contactsList;

    public contactAdapter(Context mContext, List<Contacts> contactsList) {
        this.mContext = mContext;
        this.contactsList = contactsList;
    }

    @NonNull
    @Override
    public ContectsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ContectsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ContectsViewHolder extends RecyclerView.ViewHolder{
        ImageView imgProfile;
        TextView tvname,tvcontact;
        public ContectsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProfile=itemView.findViewById(R.id.ronaldo);
            tvname=itemView.findViewById(R.id.tvname);
            tvcontact=itemView.findViewById(R.id.tvcontact);
        }
    }
}
