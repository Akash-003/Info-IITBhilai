package com.iitbhilai.idp.infoiitbhilai;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by Naman M Samarth on 19-01-2017.
 */

public class ImageAdapter extends ArrayAdapter<Image> {

   public ImageAdapter(Context context, ArrayList<Image> images) {
       super(context,0,images);
   }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listView = convertView;

        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.image_list, parent, false);
        }

        Image currentImage = getItem(position);

        ImageView imageView = (ImageView) listView.findViewById(R.id.image_view);

        imageView.setImageResource(currentImage.getImageResourceId());

        return listView;
    }
}
