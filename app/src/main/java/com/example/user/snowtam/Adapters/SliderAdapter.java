package com.example.user.snowtam.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.user.snowtam.R;
import com.example.user.snowtam.snowtam;

import java.util.List;

public class SliderAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;
    private List<snowtam> listsnowtam;
    public SliderAdapter(List listsnowtam,Context context){
        this.context=context;
        this.listsnowtam=listsnowtam;
    }


//Arrays
    public int[] slide_images={
     R.drawable.eee,
        R.drawable.dd,
        R.drawable.ee,

        R.drawable.dd,
};


    @Override
    public int getCount() {
return 3;    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
return view==(RelativeLayout) o;    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);
        ImageView avion = (ImageView) view.findViewById(R.id.avionImageView);
        TextView a = (TextView) view.findViewById(R.id.text);
        a.setMovementMethod(new ScrollingMovementMethod());
       // avion.setImageResource(slide_images[position]);
        snowtam snowtamm = listsnowtam.get(position);
        a.setText(snowtamm.getName());
        container.addView(view);
        return view;
    }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);

    }
}

