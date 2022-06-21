package com.example.raihanazharrafi.pkl;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int[] Images;
    LayoutInflater inflater;

    public CustomAdapter(Context applicationContext, int[] Images) {
        this.context = applicationContext;
        this.Images = Images;
        inflater = (LayoutInflater.from(applicationContext));
    }


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view = inflater.inflate(R.layout.flipper_items, null);
        ImageView Image = (ImageView) view.findViewById(R.id.ImageView);
        Image.setImageResource(Images[position]);
        return view;
    }
}
