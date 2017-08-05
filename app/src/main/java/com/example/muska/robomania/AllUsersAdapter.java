package com.example.muska.robomania;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AllUsersAdapter extends RecyclerView.Adapter<AllUsersAdapter.UserViewHolder> {
    public List<ContactUs.User> userList;
    private Context mcontext;

    public AllUsersAdapter(List<ContactUs.User> userList, Context context) {
        this.userList = userList;
        this.mcontext = context;
    }


    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mcontext).inflate(R.layout.content_contact_us, null);
        UserViewHolder userViewHolder = new UserViewHolder(view);
        return userViewHolder;
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        ContactUs.User user = userList.get(position);

        holder.ivProfilePic.setImageResource(user.getImageResourceId());
        holder.tvProfileName.setText(user.getProfileName());
        holder.tvPhoneNumber.setText(user.getPhoneNumber());
        holder.tvEmailId.setText(user.getEmailId());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private final Context mcontext;
        ImageView ivProfilePic;
        TextView tvProfileName;
        TextView tvPhoneNumber;
        TextView tvEmailId;


        public UserViewHolder(View itemView) {
            super(itemView);
            mcontext=itemView.getContext();
            itemView.setOnClickListener(this);
            ivProfilePic = (ImageView) itemView.findViewById(R.id.ivProfilePic);
            tvProfileName = (TextView) itemView.findViewById(R.id.tvProfileName);
            tvPhoneNumber = (TextView) itemView.findViewById(R.id.tvPhoneNumber);
            tvEmailId = (TextView) itemView.findViewById(R.id.tvEmailId);
        }

        public void onClick(View v) {

            final Intent intent = new Intent(Intent.ACTION_DIAL);
            if (getAdapterPosition() == 0) {
                intent.setData(Uri.parse("tel:8181805480"));
            } else if (getAdapterPosition() == 1) {
                intent.setData(Uri.parse("tel:123456789"));
            } else if (getAdapterPosition() == 2) {
                intent.setData(Uri.parse("tel:123456789"));
            } else if (getAdapterPosition() == 3) {
                intent.setData(Uri.parse("tel:123456789"));
            } else if (getAdapterPosition() == 4) {
                intent.setData(Uri.parse("tel:123456789"));
            } else if (getAdapterPosition() == 9) {
                intent.setData(Uri.parse("tel:123456789"));
            } else {
                intent.setData(Uri.parse("tel:123456789"));
            }
            mcontext.startActivity(intent);
        }
    }
}
