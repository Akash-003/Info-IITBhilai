package com.iitbhilai.idp.infoiitbhilai;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class Staff extends MainActivity {

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(Staff.this, MainActivity.class));
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_staff, null, false);
        drawer.addView(contentView, 0);

        View view = (View) findViewById(R.id.homePage);
        view.setVisibility(View.GONE);

        ArrayList<Worddept> words = new ArrayList<Worddept>();
        words.add(new Worddept("DEPARTMENT OF BIOMEDICAL ENGINEERING", ""));
        words.add(new Worddept("BM1030\nBioEngineering", "Dr. Renu John", R.drawable.renu_john));
        //words.add(new Worddept("DEPARTMENT OF BIOTECHNOLOGY",""));
        //words.add(new Worddept("BO1010\nIntroduction to Life Sciences","Dr. Rajakumara",R.drawable.color_black));
        words.add(new Worddept("DEPARTMENT OF CHEMISTRY", ""));
        words.add(new Worddept("CY1020 / CY1021\nDynamics of Chemical Systems-I / II", "Dr. Surendra K. Martha", R.drawable.surendra_martha));
        words.add(new Worddept("CY1020 / CY1021\nDynamics of Chemical Systems-I / II", "Dr. Bhabani S. Mallik", R.drawable.sample));
        words.add(new Worddept("DEPARTMENT OF COMPUTER SCIENCE AND ENGINEERING", ""));
        words.add(new Worddept("CS1340\nDiscrete Structures-II", "Dr. Srijith P.K", R.drawable.srijith));
        words.add(new Worddept("CS1353\nIntroduction to Data Structures", "Dr. Maunendra Desarkar", R.drawable.maunendra_desarkar));
        words.add(new Worddept("DEPARTMENT OF ELECTRICAL ENGINEERING", ""));
        words.add(new Worddept("EE1025\nIndependent Project", "Dr. GVV Sharma", R.drawable.gvv));
        words.add(new Worddept("EE1130\nAnalog Electronics", "Dr. Siva Rama Krishna Vanjari", R.drawable.siva_rama));
        words.add(new Worddept("EE1140\nSemiconductor Fundamentals", "Dr. Sushmee Badhulika", R.drawable.sushmee));
        words.add(new Worddept("EE1150/EE1410\nEmbedded Programming/Data Structures", "Dr. GVV Sharma", R.drawable.gvv));
        words.add(new Worddept("EE1210\nBasic Control Theory", "Dr. Ketan P. Detroja", R.drawable.ketan));
        words.add(new Worddept("EE1330\nDigital Signal Processing", "Dr. Sumohana Channappayya", R.drawable.sumohana));
        words.add(new Worddept("EE1510\nMatrix Analysis", "Dr. P.RajaLakshmi", R.drawable.rajalakshmi));
        words.add(new Worddept("EE1520\nData Analysis", "Prof. Md.Zafar Ali Khan", R.drawable.zafar));
        words.add(new Worddept("DEPARTMENT OF LIBERAL ARTS", ""));
        words.add(new Worddept("LA1050\nIntroduction to Western Art", "Dr. Nandini Ramesh Sankar", R.drawable.nandini));
        words.add(new Worddept("LA1110\nFinancial Markets", "Dr. K.P.Prabheesh", R.drawable.prabheesh));
        words.add(new Worddept("LA1260\nFundamentals Of Organizational Structure", "Dr. M.P. Ganesh ", R.drawable.ganesh));
        words.add(new Worddept("DEPARTMENT OF MATHEMATICS", ""));
        words.add(new Worddept("MA1130\nVector Calculus", "Dr. Sukumar", R.drawable.sukumar));
        words.add(new Worddept("MA1140\nLinear Algebra", "Dr. V.G. Narasimha Kumar", R.drawable.narasimha));
        words.add(new Worddept("MA1150\nDifferential Equations", "Dr. P.A. Lakshmi Narayana", R.drawable.lakshmi_narayana));
        words.add(new Worddept("DEPARTMENT OF MECHANICAL ENGINEERING", ""));
        words.add(new Worddept("ME1030\nDynamics", "Dr. M.S.Mahesh ", R.drawable.mahesh));
        words.add(new Worddept("ID1140\nThermodynamics-I", "Dr. Nishanth Dongari", R.drawable.nishanth));
        words.add(new Worddept("ID1160\nSolid Mechanics-I", "Dr. Viswanath Chinthapenta", R.drawable.viswanath));
        words.add(new Worddept("ID1921\nDIY Training Lab", "Dr. S.Surya ", R.drawable.surya));
        words.add(new Worddept("ID1931\nAutomation Systems Lab", "Dr. R.Prasanth Kumar", R.drawable.prasanth));
        words.add(new Worddept("DEPARTMENT OF PHYSICS", ""));
        words.add(new Worddept("PH1027\nEM and Maxwell's Equation", "Dr. J.Suryanarayana", R.drawable.suryanarayana));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Worddept}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapterdept adapter = new WordAdapterdept(this, words, R.color.bg);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Worddept} in the list.
        listView.setAdapter(adapter);
    }
}
