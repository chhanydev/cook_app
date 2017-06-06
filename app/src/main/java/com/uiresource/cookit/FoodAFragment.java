package com.uiresource.cookit;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.uiresource.cookit.model.Food;
import com.uiresource.cookit.recycler.FoodsAdpater;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class FoodAFragment extends Fragment {

    private View view;
    private RecyclerView recyclerView;
    private final String URL = "http://10.0.2.2:8080/android/fooda.php";
    List<Food> foodList;
    RecyclerView.Adapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         view = inflater.inflate(R.layout.fragment_food_a, container, false);


        initView();
        processLoadDataFromServer();
        return view;
    }

    private void initView() {

        recyclerView = (RecyclerView) view.findViewById(R.id.fooda);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        foodList = new ArrayList<>();


    }

    private void processLoadDataFromServer() {


        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {


                try {
                    JSONObject object = new JSONObject(response);
                    JSONArray array = object.getJSONArray("foods");
                    for (int i = 0; i < array.length(); i++) {
                        JSONObject s = array.getJSONObject(i);
                        Food f = new Food(
                                s.getString("name"),
                                s.getString("avatar"),
                                s.getString("component"),
                                s.getString("how"));
                        foodList.add(f);
                    }
                    Log.d("cook",foodList.toString());
                    adapter = new FoodsAdpater(foodList, getContext());
                    recyclerView.setAdapter(adapter);

                } catch (JSONException e) {
                    e.printStackTrace();
                }


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getContext(), "Something when wrong with process data", Toast.LENGTH_SHORT).show();
            }
        });
        RequestQueue requestQueue = Volley.newRequestQueue(getContext());
        requestQueue.add(stringRequest);

    }


}
