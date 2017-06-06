package com.uiresource.cookit.recycler;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.textservice.TextInfo;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import com.uiresource.cookit.FoodDetailActivity;
import com.uiresource.cookit.R;
import com.uiresource.cookit.model.Food;

import java.util.List;

/**
 * Created by User on 5/30/2017.
 */

public class FoodsAdpater extends RecyclerView.Adapter<FoodsAdpater.FoodViewHolder> {

    private List<Food> listitem;
    private Context context;
    private Food food;
    public static final String EXTRA_KEY_FOOD_TITLE = "foodTitle";
    public static final String EXTRA_KEY_FOOD_COMPONENT = "foodComponent";
    public static final String EXTRA_KEY_FOOD_HOW = "foodHow";
    public static final String EXTRA_KEY_FOOD_IMAGE = "foodImage";

    public FoodsAdpater(List<Food> listitem, Context context) {
        this.listitem = listitem;
        this.context = context;
    }

    @Override
    public FoodsAdpater.FoodViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_recipe,parent,false);

        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FoodsAdpater.FoodViewHolder holder, final int position) {
        food =listitem.get(position);
        holder.title.setText(food.getTitle());
         Glide.with(context).load(food.getAvatar()).into(holder.avatar);

        holder.avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, FoodDetailActivity.class);

                intent.putExtra(EXTRA_KEY_FOOD_TITLE,listitem.get(position).getTitle());
                intent.putExtra(EXTRA_KEY_FOOD_COMPONENT,listitem.get(position).getComponent());
                intent.putExtra(EXTRA_KEY_FOOD_HOW,listitem.get(position).getHowtodo());
                intent.putExtra(EXTRA_KEY_FOOD_IMAGE,listitem.get(position).getAvatar());
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {
        return listitem.size();
    }
    public class FoodViewHolder extends RecyclerView.ViewHolder{

        private TextView title;
        private ImageView avatar;
        public FoodViewHolder(View itemView) {
            super(itemView);

            title = (TextView)itemView.findViewById(R.id._title);
            avatar = (ImageView)itemView.findViewById(R.id.avatar);

        }
    }
}
