package com.hello.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

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
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_contacts,parent,false);
        return new ContectsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContectsViewHolder holder, int position) {
        Contacts contacts = contactsList.get(position);
        holder.imgProfile.setImageResource(contacts.getImageid());
        holder.tvname.setText(contacts.getName());
        holder.tvcontact.setText(contacts.getPhoneNO());

    }

    @Override
    public int getItemCount() {

        return contactsList.size();
    }

    public class ContectsViewHolder extends RecyclerView.ViewHolder{
        CircleImageView imgProfile;
        TextView tvname,tvcontact;
        public ContectsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProfile=itemView.findViewById(R.id.ronaldo);
            tvname=itemView.findViewById(R.id.tvname);
            tvcontact=itemView.findViewById(R.id.tvcontact);
        }
    }
}
