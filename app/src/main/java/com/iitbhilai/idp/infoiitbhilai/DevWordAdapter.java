package com.iitbhilai.idp.infoiitbhilai;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Naman M Samarth on 24-01-2017.
 */
public class DevWordAdapter extends ArrayAdapter<DevWord> {

    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;

    /**
     * Create a new {@link DevWordAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param word is the list of {@link DevWord}s to be displayed.

     */
    public DevWordAdapter(Context context, ArrayList<DevWord> word) {
        super(context, 0, word);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_dev, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        DevWord currentWord = getItem(position);

        // Find the TextView in the list_item_dev.xml.xml layout with the ID miwok_text_view.
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        miwokTextView.setText(currentWord.getName());

        // Find the TextView in the list_item_dev_dev.xml layout with the ID default_text_view.
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.roll_text_view);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        defaultTextView.setText(currentWord.getRollNo());

        // Find the ImageView in the list_item_dev_dev.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.photo);
        // Check if an image is provided for this word or not

        imageView.setImageResource(currentWord.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}