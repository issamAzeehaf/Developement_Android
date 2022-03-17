package com.azehaf.tp3_restapi;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.azehaf.tp3_restapi.Model.Articles;
import com.azehaf.tp3_restapi.Model.Source;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{

    Context context;
    List<Articles> listArticles ;

    public Adapter(Context context, List<Articles> listArticles) {
        this.context = context;
        this.listArticles = listArticles;
    }
    public Context getContext() {
        return context;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        Articles a = listArticles.get(position);
        holder.titleText.setText((CharSequence) a.getTitle());
        holder.sourceText.setText((CharSequence) a.getSource().getName());
        holder.dateText.setText((CharSequence) a.getPublishedAt());
        String imageURL = a.getUrlToImage();
        Picasso.with(context).load(imageURL).into(holder.imageView);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Details.class);
                intent.putExtra("title",a.getTitle());
                intent.putExtra("source",a.getSource().getName());
                intent.putExtra("date", a.getPublishedAt());
                intent.putExtra("description",a.getDescription());
                intent.putExtra("url",a.getUrl());
                intent.putExtra("imageURL",a.getUrl());


                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return listArticles.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView titleText,sourceText,dateText;
        ImageView imageView;
        CardView cardView;
        public ViewHolder(@NonNull View itemView){
            super(itemView);

            titleText = itemView.findViewById(R.id.titleText);
            sourceText = itemView.findViewById(R.id.sourceText);
            dateText = itemView.findViewById(R.id.dateText);
            imageView = itemView.findViewById(R.id.imageView);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
