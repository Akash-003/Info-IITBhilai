package com.iitbhilai.idp.infoiitbhilai;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class Calender extends MainActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(Calender.this, MainActivity.class));
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_calender, null, false);
        drawer.addView(contentView, 0);

        View view = (View) findViewById(R.id.homePage);
        view.setVisibility(View.GONE);


        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Supplementary Examination\n", "29 Dec 2016 - 02 Jan 2017"));
        words.add(new Word("Registration\n", "29 Dec 2016"));
        words.add(new Word("Late Registration with Fine\n", "31 Dec 2016"));
        words.add(new Word("Submission of Supplementary Examination Grades\n", "06 Jan 2017"));
        words.add(new Word("Adding and Dropping of Non-Fractal Courses\n", "29 Dec 2016 - 07 Jan 2017"));
        words.add(new Word("Course Feedback through AIMS Portal\n", "10 Days before completion of course"));
        words.add(new Word("Classes Commence\n", "02 Jan 2017"));
        words.add(new Word("Fractal Segment-1\n", "02 Jan 2017 - 17 Jan 2017"));
        words.add(new Word("Fractal Segment-2\n", "18 Jan 2017 - 03 Feb 2017"));
        words.add(new Word("2 Days Break","06 Feb 2017 - 7 Feb 2017"));
        words.add(new Word("Fractal Segment-3\n", "08 Feb 2017 - 24 Feb 2017"));
        words.add(new Word("Fractal Segment-4\n", "27 Feb 2017 - 22 Mar 2017"));
        words.add(new Word("5 Days Break","13 Mar 2017 - 17 Mar 2017"));
        words.add(new Word("Fractal Segment-5\n", "23 Mar 2017 - 11 Apr 2017"));
        words.add(new Word("Fractal Segment-6\n", "12 Apr 2017 - 28 Apr 2017"));
        words.add(new Word("Examinations","To be announced by instructor"));
        words.add(new Word("Academic Pre-Registration","03 Apr 2017 - 07 Apr 2017"));
        words.add(new Word("Vacation starts","01 May 2017"));
        words.add(new Word("Submission of Grades","05 May 2017"));
        words.add(new Word("Declaration of Grades","11 May 2017"));
        words.add(new Word("Vacation ends","23 July 2017"));
        words.add(new Word("Old UG Registration for Next Semester (July - December 2017)","24 July 2017"));
        words.add(new Word("New UG Registration for Next Semester (July - December 2017)","25 July 2017"));
        words.add(new Word("Orientation Program","26 July 2017"));
        words.add(new Word("Supplementary Examination","24 July 2017 - 02 Aug 2017"));
        words.add(new Word("Classes Commence (July - December 2017)","31 July 2017"));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.bg);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
