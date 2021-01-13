package com.example.ass3_g;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private  String[] caption;
    private  String[] dec;
    private  int[] imageIds;
    private Context context;

    public Adapter(String[] caption, int[] imageIds,String [] dec,Context context) {
        this.dec=dec;
        this.caption = caption;
        this.imageIds = imageIds;
        this.context=context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView v= (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card,parent,false);
        return new ViewHolder(v);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        holder.txt_name.setText(caption[position]);
//        holder.des_txt.setText(dec[position]);
//        holder.imageView.setImageResource(imageIds[position]);

        CardView cardView=holder.cardView;
        ImageView imageView=cardView.findViewById(R.id.image);
        Drawable dr = ContextCompat.getDrawable(cardView.getContext(),imageIds[position]);
        imageView.setImageDrawable(dr);
        TextView txt = cardView.findViewById(R.id.text);
        txt.setText(caption[position]);


        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(context,MarioDesc.class);
                intent.putExtra("name1",caption[position]);
                intent.putExtra("name2",dec[position]);
                intent.putExtra("images",imageIds[position]);
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return  caption.length;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final CardView cardView;
        LinearLayout mainLayout;
        public ViewHolder(@NonNull CardView cardView) {
            super(cardView);
            this.cardView= cardView;
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }
}
