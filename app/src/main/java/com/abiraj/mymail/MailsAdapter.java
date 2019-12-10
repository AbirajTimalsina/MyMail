package com.abiraj.mymail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class MailsAdapter extends RecyclerView.Adapter<MailsAdapter.MailsViewHolder> {

    Context mContext;
    List<Mails> mailsList;
    public MailsAdapter(Context mContext, List<Mails>mailsList){
        this.mContext = mContext;
        this.mailsList = mailsList;
    }

    @NonNull
    @Override
    public MailsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mailview,parent,false);
        return new MailsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MailsViewHolder holder, int position) {

        Mails mails = mailsList.get(position);
        holder.crcimg.setImageResource(mails.getImageID());
        holder.tvname.setText(mails.getName());
        holder.tvtitle.setText(mails.getTitle());
        holder.tvtime.setText(mails.getTime());

    }

    @Override
    public int getItemCount() {
        return mailsList.size();
    }

    public class MailsViewHolder extends RecyclerView.ViewHolder{
        CircleImageView crcimg;
        TextView tvname,tvtitle,tvdesc,tvtime;
        public MailsViewHolder(@NonNull View itemView) {
            super(itemView);

            crcimg = itemView.findViewById(R.id.IVs);
            tvname = itemView.findViewById(R.id.tvName);
            tvtitle = itemView.findViewById(R.id.tvTitle);
            tvdesc = itemView.findViewById(R.id.tvDes);
            tvtime = itemView.findViewById(R.id.tvTime);
        }
    }
}
