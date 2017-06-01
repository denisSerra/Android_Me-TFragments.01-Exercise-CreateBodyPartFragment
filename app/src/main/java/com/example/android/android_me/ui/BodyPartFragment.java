package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;
// TODO (2) Create a new class called BodyPartFragment to display an image of an Android-Me body part
// In this class, you'll need to implement an empty constructor and the onCreateView method
/**
 * Created by Romolo on 01/06/2017.
 */

public class BodyPartFragment extends Fragment {
    //Costruttore obbligatorio per istantaneare il frammento
    public BodyPartFragment(){}
    //Gonfia il layout del frammento e imposta le risorse di un'immagine
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
       /* View rootView=inflater.inflate(R.layout.fragment_body_part,container,false);
        ImageView imageView=(ImageView)rootView.findViewById(R.id.body_part_image_view);
        imageView.setImageResource(AndroidImageAssets.getHeads().get(0));
        return rootView;*/
       View rootView=inflater.inflate(R.layout.fragment_body_part,container,false);
        ImageView imageView=(ImageView) rootView.findViewById(R.id.body_part_image_view);
        imageView.setImageResource(AndroidImageAssets.getHeads().get(0));
        return rootView;
    }
}
