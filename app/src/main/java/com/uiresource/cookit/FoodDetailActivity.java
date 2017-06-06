package com.uiresource.cookit;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.uiresource.cookit.recycler.FoodsAdpater;

public class FoodDetailActivity extends AppCompatActivity {

    private TextView foodTitle,foodComponent,foodHow;
    private ImageView foodImage;
    private String title,component,how,image;

    Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);

        initView();
        getDataFromIntent();
    }
    private void initView(){

        foodTitle = (TextView)findViewById(R.id.foodTitle);
        foodComponent = (TextView)findViewById(R.id.foodComponent);
        foodHow = (TextView)findViewById(R.id.foodHow);
        foodImage = (ImageView)findViewById(R.id.imgfood);

    }
    private void getDataFromIntent(){

        title = getIntent().getStringExtra(FoodsAdpater.EXTRA_KEY_FOOD_TITLE);
        component = getIntent().getStringExtra(FoodsAdpater.EXTRA_KEY_FOOD_COMPONENT);
        how = getIntent().getStringExtra(FoodsAdpater.EXTRA_KEY_FOOD_HOW);
        image = getIntent().getStringExtra(FoodsAdpater.EXTRA_KEY_FOOD_IMAGE);

        Glide.with(this).load(image).into(foodImage);
        foodTitle.setText(title);
        foodComponent.setText(component);
        foodHow.setText(how);


    }
}
