package com.iitbhilai.idp.infoiitbhilai;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class Contacts extends MainActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(Contacts.this, MainActivity.class));
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_contacts, null, false);
        drawer.addView(contentView, 0);

        View view = (View) findViewById(R.id.homePage);
        view.setVisibility(View.GONE);


        //setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Project Associate\n" +
                "Administration Section\n" +
                "Email:pawankataria@iitbhilai.ac.in\n" +
                "Ph.No : 07694042262,07771890000", "Mr. Pawan Kataria"));
        words.add(new Word("Project Associate\n" +
                "Stores and Purchase\n" + "" +
                "Email:sdavid@iitbhilai.ac.in\n" +
                "Ph.No : 09424283705, 09826916680", "Mr. Sachin David"));
        words.add(new Word("Project Associate\n" +
                "Academic Section\n" + "" +
                "Email:msangeeta@iitbhilai.ac.in\n" +
                "Ph.No : 09424283697, 09769105995", "Mrs. M.Sangeeta Shrivastava"));
        words.add(new Word("Project Assistant\n" +
                "Transportation and Accomodation\n" +
                "Email:yogisinha@iitbhilai.ac.in\n" +
                "Ph.No : 09407766167, 09425564091", "Mr. Yogesh Sinha"));
        words.add(new Word("Project Assistant\n" +
                "Girls Hostel\n" +
                "Email:annu@iitbhilai.ac.in\n" +
                "Ph.No : 09424283693, 09589558878", "Mrs. Annu Sharma"));
        words.add(new Word("Project Associate\n" +
                "Boys Hostel\n" +
                "Email:ap@iitbhilai.ac.in\n" +
                "Ph.No : 09424283691, 08878881430", "Mr. Alpesh Pinjani"));
        words.add(new Word("Project Associate\n" +
                "Digital Fabrication Lab\n" +
                "Email:nishchal@iitbhilai.ac.in\n" +
                "Ph.No : 09993366282", "Mr. Nishchal Tamrakar"));
        words.add(new Word("Project Associate\n" +
                "Networking\n" +
                "Email:shiva@iitbhilai.ac.in\n" +
                "Ph.No : 09424283681, 07382748291", "Mr. A.Shiva"));
        words.add(new Word("Project Associate\n" +
                "Networking\n" +
                "Email:shivani@iitbhilai.ac.in\n" +
                "Ph.No : 07583802030", "Ms. Shivani Goyal"));
        words.add(new Word("Project Assistant\n" +
                "Civil\n" +
                "Email:sumitkapoor07@iitbhilai.ac.in\n" +
                "Ph.No : 09424283717, 09907439650", "Mr. Sumit Kapoor"));
        words.add(new Word("Project Assistant\n" +
                "Electrical\n" +
                "Email:ashwanisoni@iitbhilai.ac.in\n" +
                "Ph.No : 09424283715, 09302508463", "Mr. Ashwani Soni"));
        words.add(new Word("Staff Nurse\n" +
                "Health Center\n" +
                "Email:ashok.kasani@iitbhilai.ac.in\n" +
                "Ph.No : 09424283684, 09491672576", "Mr. Ashok Kasani"));



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
