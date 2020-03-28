package com.edunomics.multithread;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class OuterRecyclerAdapter extends RecyclerView.Adapter<OuterRecyclerAdapter.MyViewHolder> {

    private LayoutInflater inflater;
    private List<OuterRecyclerItem> data;

    public OuterRecyclerAdapter(Context context, List<OuterRecyclerItem> data) {
        inflater = LayoutInflater.from(context);
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.content_row_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        OuterRecyclerItem current = data.get(position);
        holder.Name.setText(current.getName());
        holder.Desc.setText(current.getDescription());
        if (current.getPostType().equals("Image")) {
            //TODO: Open image from url
        } else if (current.getPostType().equals("Video")) {
            //TODO: Open video from url
        } else {
            holder.Post.setVisibility(View.INVISIBLE);
        }
        holder.Card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: Set to open post
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        CardView Card;
        TextView Name, Desc;
        ImageView Post;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            Card = itemView.findViewById(R.id.item_card);
            Name = itemView.findViewById(R.id.profile_name);
            Desc = itemView.findViewById(R.id.post_description);
            Post = itemView.findViewById(R.id.post_preview_pic);
        }
    }
}
