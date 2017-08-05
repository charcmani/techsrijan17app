package com.example.muska.robomania;

        import android.content.Context;
        import android.content.Intent;
        import android.support.v7.widget.RecyclerView;
        import android.text.Layout;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;

        import java.util.List;

public class AllUser2Adapter extends RecyclerView.Adapter<AllUser2Adapter.UserViewHolder>{
    public List<Competition.User> userList;
    private Context context;
    public AllUser2Adapter(List<Competition.User> userList, Context context) {
        this.userList = userList;
        this.context = context;
    }


    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, final int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.content_competition, null);
        UserViewHolder userViewHolder = new UserViewHolder(view);
        return userViewHolder;
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        Competition.User user = userList.get(position);

        holder.ivEventPic.setImageResource(user.getImageResourceId());
        holder.tvEventName.setText(user.getEventName());
    }

    @Override
    public int getItemCount() {

        return userList.size();
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private final Context context;
        ImageView ivEventPic;
        TextView tvEventName;
        public UserViewHolder(View itemView) {
            super(itemView);
            context = itemView.getContext();
            itemView.setOnClickListener(this);
            ivEventPic = (ImageView) itemView.findViewById(R.id.ivEventPic);
            tvEventName = (TextView) itemView.findViewById(R.id.tvEventName);
        }
        public void onClick(View v) {

            final Intent intent;
            if (getAdapterPosition() == 0){
                intent =  new Intent(context, Robowar.class);
            } else if (getAdapterPosition() == 1){
                intent =  new Intent(context, Tekken.class);
            } else if (getAdapterPosition() == 2){
                intent =  new Intent(context, NFS.class);
            }else if (getAdapterPosition() == 3){
                intent =  new Intent(context, BombDiffusion.class);
            }else if (getAdapterPosition() == 4){
                intent =  new Intent(context, Laserstrike.class);
            } else if (getAdapterPosition() == 5){
                intent =  new Intent(context, ElectronicChess.class);
            }else if (getAdapterPosition() == 6){
                intent =  new Intent(context, Sherlocked.class);
            } else if (getAdapterPosition() == 7){
                intent =  new Intent(context, Turing.class);
            }else if (getAdapterPosition() == 8){
                intent =  new Intent(context, CircuitWizard.class);
            } else if (getAdapterPosition() == 9){
                intent =  new Intent(context, Reflex.class);
            }else {
                intent =  new Intent(context, ElectronicArts.class);
            }
            context.startActivity(intent);
        }
    }
}

