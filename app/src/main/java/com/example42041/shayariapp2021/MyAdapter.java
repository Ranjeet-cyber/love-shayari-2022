package com.example42041.shayariapp2021;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example42041.shayariapp2021.categories.Attitude;
import com.example42041.shayariapp2021.categories.BestWishesh;
import com.example42041.shayariapp2021.categories.BirthDay;
import com.example42041.shayariapp2021.categories.Couple;
import com.example42041.shayariapp2021.categories.FriendShipDay;
import com.example42041.shayariapp2021.categories.Funny;
import com.example42041.shayariapp2021.categories.God;
import com.example42041.shayariapp2021.categories.GoodMorning;
import com.example42041.shayariapp2021.categories.GoodNight;
import com.example42041.shayariapp2021.categories.Love;
import com.example42041.shayariapp2021.categories.Romantics;
import com.example42041.shayariapp2021.categories.ValentineDay;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    private Context c;
    private ArrayList<Model> models;

    public MyAdapter(Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // convert XML to OBJ
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_item, null);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        // create bind view/data
        holder.img.setImageResource(models.get(position).getImage());
        holder.modelTitle.setText(models.get(position).getTitle());

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int pos) {

                switch (models.get(pos).getTitle()){
                    case "Good Morning": {
                        Intent intent = new Intent(c, GoodMorning.class);
                        c.startActivity(intent);
                        break;
                    }
                    case "Good Night": {
                        Intent intent = new Intent(c, GoodNight.class);
                        c.startActivity(intent);
                        break;
                    }
                    case "Love": {
                        Intent intent = new Intent(c, Love.class);
                        c.startActivity(intent);
                        break;
                    }
                    case "Romantics": {
                        Intent intent = new Intent(c, Romantics.class);
                        c.startActivity(intent);
                        break;
                    }
                    case "Couple": {
                        Intent intent = new Intent(c, Couple.class);
                        c.startActivity(intent);
                        break;
                    }
                    case "Valentine Day": {
                        Intent intent = new Intent(c, ValentineDay.class);
                        c.startActivity(intent);
                        break;
                    }
                    case "Friendship": {
                        Intent intent = new Intent(c, FriendShipDay.class);
                        c.startActivity(intent);
                        break;
                    }
                    case "Birthday": {
                        Intent intent = new Intent(c, BirthDay.class);
                        c.startActivity(intent);
                        break;
                    }

                    case "Funny": {
                        Intent intent = new Intent(c, Funny.class);
                        c.startActivity(intent);
                        break;
                    }

                    case "Best Wishes": {
                        Intent intent = new Intent(c, BestWishesh.class);
                        c.startActivity(intent);
                        break;
                    }
                    case "G O D": {
                        Intent intent = new Intent(c, God.class);
                        c.startActivity(intent);
                        break;
                    }
                    case "Attitude": {
                        Intent intent = new Intent(c, Attitude.class);
                        c.startActivity(intent);
                        break;
                    }


                }


            }
        });

    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
