package com.iitbhilai.idp.infoiitbhilai;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class Dept extends MainActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(Dept.this, MainActivity.class));
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_dept, null, false);
        drawer.addView(contentView, 0);

        View view = (View) findViewById(R.id.homePage);
        view.setVisibility(View.GONE);

        final ArrayList<Image> images = new ArrayList<>();

        images.add(new Image(R.drawable.calendar_1));
        images.add(new Image(R.drawable.calendar_2));
        images.add(new Image(R.drawable.calendar_3));
        images.add(new Image(R.drawable.calendar_4));
        images.add(new Image(R.drawable.calendar_5));
        images.add(new Image(R.drawable.calendar_6));
        images.add(new Image(R.drawable.calendar_7));
        images.add(new Image(R.drawable.calendar_8));

        ImageAdapter adapter = new ImageAdapter(this, images);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
