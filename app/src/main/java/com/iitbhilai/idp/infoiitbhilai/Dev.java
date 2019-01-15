package com.iitbhilai.idp.infoiitbhilai;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class Dev extends MainActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(Dev.this, MainActivity.class));
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_dev, null, false);
        drawer.addView(contentView, 0);

        View view = (View) findViewById(R.id.homePage);
        view.setVisibility(View.GONE);

        ArrayList<DevWord> words = new ArrayList<>();

        words.add(new DevWord(R.drawable.aikata, "Aikata", "cs16b1005@iitbhilai.ac.in"));
        words.add(new DevWord(R.drawable.akash, "Akash Singh", "ee16b1001@iitbhilai.ac.in"));
        words.add(new DevWord(R.drawable.naman, "Naman M Samarth", "cs16b1018@iitbhilai.ac.in"));
        words.add(new DevWord(R.drawable.ritika, "Ritika Singh", "ee16b1028@iitbhilai.ac.in"));
        words.add(new DevWord(R.drawable.utkarsh, "Utkarsh Srivastav", "me16b1036@iitbhilai.ac.in"));

        DevWordAdapter adapter = new DevWordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
