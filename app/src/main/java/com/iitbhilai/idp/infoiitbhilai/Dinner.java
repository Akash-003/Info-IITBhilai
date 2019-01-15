package com.iitbhilai.idp.infoiitbhilai;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class Dinner extends Fragment {

    int count = 0;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_breakfast, container, false);

        CardView mondaySelected = (CardView) rootView.findViewById(R.id.MondaySelected);
        CardView tuesdaySelected = (CardView) rootView.findViewById(R.id.TuesdaySelected);
        CardView wednesdaySelected = (CardView) rootView.findViewById(R.id.WednesdaySelected);
        CardView thursdaySelected = (CardView) rootView.findViewById(R.id.ThursdaySelected);
        CardView fridaySelected = (CardView) rootView.findViewById(R.id.FridaySelected);
        CardView saturdaySelected = (CardView) rootView.findViewById(R.id.SaturdaySelected);
        CardView sundaySelected = (CardView) rootView.findViewById(R.id.SundaySelected);


        mondaySelected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView mondayItem = (TextView) rootView.findViewById(R.id.Monday_item);
                ImageView iconUp = (ImageView) rootView.findViewById(R.id.Mondayup);

                if (count % 2 == 0) {

                    mondayItem.setText("Soya Masala\n" +
                            "Apple Gourd\n" +
                            "Sambar\n" +
                            "Jeera Rice\n" +
                            "Cucumber tomato raitha\n" +
                            "Chapathi\n" +
                            "Fryums\n" +
                            "Tossed Salad\n" +
                            "Kheer");
                    iconUp.setImageResource(R.drawable.ic_arrow_drop_up_black_18dp);
                } else {
                    mondayItem.setText("");
                    iconUp.setImageResource(R.drawable.ic_arrow_drop_down_black_18dp);
                }

                count = count + 1;


            }
        });


        tuesdaySelected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tuesdayItem = (TextView) rootView.findViewById(R.id.Tuesday_item);
                ImageView iconUp = (ImageView) rootView.findViewById(R.id.Tuesdayup);

                if (count % 2 == 0) {
                    tuesdayItem.setText("Veg Kofta\n" +
                            "Lauki Chana\n" +
                            "Moong Dal Tadka\n" +
                            "Leon Rice\n" +
                            "Plain Curd\n" +
                            "Chapathi\n" +
                            "Fryums\n" +
                            "Onion Salad\n" +
                            "Fruit Custard");


                    iconUp.setImageResource(R.drawable.ic_arrow_drop_up_black_18dp);
                } else {
                    tuesdayItem.setText("");
                    iconUp.setImageResource(R.drawable.ic_arrow_drop_down_black_18dp);
                }
                count = count + 1;
            }
        });

        wednesdaySelected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView wednesdayItem = (TextView) rootView.findViewById(R.id.Wednesday_item);
                ImageView iconUp = (ImageView) rootView.findViewById(R.id.Wednesdayup);
                if (count % 2 == 0) {
                    wednesdayItem.setText("Butter Chicken/Kadai Paneer\n" +
                            "Dal Tadka\n" +
                            "Steam Rice\n" +
                            "Boondi raitha\n" +
                            "Chapathi\n" +
                            "Fryums\n" +
                            "Aloo Chaat\n" +
                            "Gulab Jamun");


                    iconUp.setImageResource(R.drawable.ic_arrow_drop_up_black_18dp);
                } else {
                    wednesdayItem.setText("");
                    iconUp.setImageResource(R.drawable.ic_arrow_drop_down_black_18dp);
                }
                count = count + 1;
            }
        });

        thursdaySelected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView thursdayItem = (TextView) rootView.findViewById(R.id.Thursday_item);
                ImageView iconUp = (ImageView) rootView.findViewById(R.id.Thursdayup);
                if (count % 2 == 0) {
                    thursdayItem.setText("Veg Manchurian\n" +
                            "Jeera-Aloo-Mutter Dry\n" +
                            "Dal Fry\n" +
                            "Fried Rice\n" +
                            "Lauki Raitha\n" +
                            "Chapathi\n" +
                            "Fryums\n" +
                            "Jalebi");


                    iconUp.setImageResource(R.drawable.ic_arrow_drop_up_black_18dp);
                } else {
                    thursdayItem.setText("");
                    iconUp.setImageResource(R.drawable.ic_arrow_drop_down_black_18dp);
                }
                count = count + 1;
            }
        });

        fridaySelected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView fridayItem = (TextView) rootView.findViewById(R.id.Friday_item);
                ImageView iconUp = (ImageView) rootView.findViewById(R.id.Fridayup);
                if (count % 2 == 0) {
                    fridayItem.setText("Fish Fry (or) Egg Curry/Paneer Mutter Masala\n" +
                            "Chana Dal\n" +
                            "Jeera Rice\n" +
                            "Onion sev raitha\n" +
                            "Chapathi\n" +
                            "Fryums\n" +
                            "Sprouted Beans salad\n" +
                            "Laddu");
                    iconUp.setImageResource(R.drawable.ic_arrow_drop_up_black_18dp);
                } else {
                    fridayItem.setText("");
                    iconUp.setImageResource(R.drawable.ic_arrow_drop_down_black_18dp);
                }
                count = count+1;
            }
        });

        saturdaySelected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView saturdayItem = (TextView) rootView.findViewById(R.id.Saturday_item);
                ImageView iconUp = (ImageView) rootView.findViewById(R.id.Saturdayup);
                if (count % 2 == 0) {
                    saturdayItem.setText("Black Chana Masala\n" +
                            "Mix Veg\n" +
                            "Dal Makhani\n" +
                            "Steam Rice\n" +
                            "Plain Curd\n" +
                            "Chapathi\n" +
                            "Fryums\n" +
                            "Green Salad\n" +
                            "Shahi Tukda");


                    iconUp.setImageResource(R.drawable.ic_arrow_drop_up_black_18dp);
                } else {
                    saturdayItem.setText("");
                    iconUp.setImageResource(R.drawable.ic_arrow_drop_down_black_18dp);
                }
                count = count + 1;
            }
        });

        sundaySelected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView sundayItem = (TextView) rootView.findViewById(R.id.Sunday_item);
                ImageView iconUp = (ImageView) rootView.findViewById(R.id.Sundayup);
                if (count % 2 == 0) {
                    sundayItem.setText("Chicken Biryani/Palak Paneer\n" +
                            "Sambar\n" +
                            "Veg Biryani\n" +
                            "Veg Raitha\n" +
                            "Chapathi\n" +
                            "Fryums\n" +
                            "Onion Salad\n" +
                            "Ice Cream");


                    iconUp.setImageResource(R.drawable.ic_arrow_drop_up_black_18dp);
                } else {
                    sundayItem.setText("");
                    iconUp.setImageResource(R.drawable.ic_arrow_drop_down_black_18dp);
                }
                count = count + 1;
            }
        });
        return rootView;
    }
}
