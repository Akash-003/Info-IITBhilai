package com.iitbhilai.idp.infoiitbhilai;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ttee extends Fragment {
    String dow;
    int curdate, curmonth, curyear;

    String daySelected;
    String segmentSelected;
    String BM1030 = "BIOENGINEERING";
    String BO1010 = "INTRO TO LIFE SCIENCES";
    String CS1340 = "DISCRETE STRUCTURES-II";
    String CS1353 = "INTRO TO DATA STRUCTURES";
    String CY1020 = "DYNAMICS OF CHEMICAL SYSTEMS-I";
    String CY1021 = "DYNAMICS OF CHEMICAL SYSTEMS-II";
    String EE1025 = "IDP";
    String EE1130 = "ANALOG ELECTRONICS";
    String EE1140 = "SEMICONDUCTOR FUNDAMENTALS";
    String EE1150 = "EMBEDDED PROGRAMMING";
    String EE1210 = "BASIC CONTROL THEORY";
    String EE1330 = "DSP";
    String EE1410 = "DATA STRUCTURES";
    String EE1510 = "MATRIX ANALYSIS";
    String EE1520 = "DATA ANALYTICS";
    String ID1140 = "THERMODYNAMICS-I";
    String ID1160 = "SOLID MECHANICS-I";
    String ID1921 = "DIY TRAINING LAB";
    String ID1931 = "AUTOMATION SYSTEMS LAB";
    String LA1050 = "INTRO TO WESTERN ARTS";
    String LA1110 = "FINANCIAL MARKETS";
    String LA1260 = "FUNDAMENTALS OF ORG. STRUCTURES";
    String MA1130 = "VECTOR CALCULUS";
    String MA1140 = "LINEAR ALGEBRA";
    String MA1150 = "DIFFERENTIAL EQUATIONS";
    String ME1030 = "DYNAMICS";
    String PH1027 = "EM AND MAXWELL EQUATION";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_ttee, container, false);

        final TextView firstClassee = (TextView) v.findViewById(R.id.first_class);
        final TextView secondClassee = (TextView) v.findViewById(R.id.second_class);
        final TextView thirdClassee = (TextView) v.findViewById(R.id.third_class);
        final TextView fourthClassee = (TextView) v.findViewById(R.id.fourth_class);
        final TextView fifthClassee = (TextView) v.findViewById(R.id.fifth_class);
        final TextView courseName = (TextView) v.findViewById(R.id.course_name);


        Spinner day = (Spinner) v.findViewById(R.id.day_list);
        // Create an ArrayAdapter using the string array and a default spinner layout

        day.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                daySelected = parent.getItemAtPosition(position).toString();
                Log.v("ttee.java", " " + daySelected);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this.getContext(),
                R.array.days_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        day.setAdapter(adapter);


        Spinner segment = (Spinner) v.findViewById(R.id.segment_list);

        segment.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                segmentSelected = parent.getItemAtPosition(position).toString();
                Log.v("ttee.java", " " + segmentSelected);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this.getContext(),
                R.array.segments_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        segment.setAdapter(adapter2);

        Calendar c = Calendar.getInstance();
        curdate = c.get(Calendar.DAY_OF_MONTH);
        curmonth = c.get(Calendar.MONTH);
        curyear = c.get(Calendar.YEAR);

        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        Date d = new Date();
        dow = sdf.format(d);

        Log.v("ttee.java", " " + curmonth);
        Log.v("ttee.java", " " + dow);

        Button getTimeTable = (Button) v.findViewById(R.id.get_timetable);
        getTimeTable.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {

                                                if (daySelected.equals("Today")) {

                                                    if (curmonth == 0 || curmonth == 1) {
                                                        if (curmonth == 0 && curdate >= 2 && curdate <= 31) {
                                                            if (dow.equals("Monday")) {
                                                                firstClassee.setText("------");
                                                                secondClassee.setText("EE1140");
                                                                thirdClassee.setText(EE1520);
                                                                fourthClassee.setText(EE1025);
                                                                fifthClassee.setText(EE1025);
                                                                courseName.setText("");
                                                                courseName.setText("EE1140 - " + EE1140);
                                                            }
                                                            else if (dow.equals("Tuesday")) {
                                                                firstClassee.setText(EE1520);
                                                                secondClassee.setText(EE1410);
                                                                thirdClassee.setText("EE1140");
                                                                fourthClassee.setText("------");
                                                                fifthClassee.setText(EE1410);
                                                                courseName.setText("");
                                                                courseName.setText("EE1140 - " + EE1140);

                                                            }
                                                            else if (dow.equals("Wednesday")) {

                                                                firstClassee.setText(EE1410);
                                                                secondClassee.setText(MA1130);
                                                                thirdClassee.setText(EE1130);
                                                                fourthClassee.setText(EE1210);
                                                                fifthClassee.setText(EE1410);
                                                                courseName.setText("");
                                                            }
                                                            else if (dow.equals("Thursday"))

                                                            {
                                                                firstClassee.setText(MA1130);
                                                                secondClassee.setText(EE1130);
                                                                thirdClassee.setText("LA1260");
                                                                fourthClassee.setText(EE1210);
                                                                fifthClassee.setText("------");
                                                                courseName.setText("");
                                                                courseName.setText("LA1260 - " + LA1260);
                                                            }
                                                            else if (dow.equals("Friday")) {

                                                                firstClassee.setText("LA1260");
                                                                secondClassee.setText("------");
                                                                thirdClassee.setText("------");
                                                                fourthClassee.setText("------");
                                                                fifthClassee.setText("------");
                                                                courseName.setText("");
                                                                courseName.setText("LA1260 - " + LA1260);
                                                            }
                                                            else if (dow.equals("Saturday")) {
                                                                firstClassee.setText("------");
                                                                secondClassee.setText("------");
                                                                thirdClassee.setText("------");
                                                                fourthClassee.setText("------");
                                                                fifthClassee.setText("------");
                                                                courseName.setText("");
                                                                courseName.setText("It's Saturday !!!");
                                                            }
                                                            else if (dow.equals("Sunday")) {
                                                                firstClassee.setText("------");
                                                                secondClassee.setText("------");
                                                                thirdClassee.setText("------");
                                                                fourthClassee.setText("------");
                                                                fifthClassee.setText("------");
                                                                courseName.setText("");
                                                                courseName.setText("It's Sunday !!!");
                                                            }
                                                        }
                                                    }
                                                    if (curmonth == 1 && curdate <= 3) {
                                                        if (dow.equals("Monday")) {
                                                            firstClassee.setText("------");
                                                            secondClassee.setText("EE1140");
                                                            thirdClassee.setText(EE1520);
                                                            fourthClassee.setText(EE1025);
                                                            fifthClassee.setText(EE1025);
                                                            courseName.setText("");
                                                            courseName.setText("EE1140 - " + EE1140);
                                                        }
                                                        else if (dow.equals("Tuesday")) {
                                                            firstClassee.setText(EE1520);
                                                            secondClassee.setText(EE1410);
                                                            thirdClassee.setText("EE1140");
                                                            fourthClassee.setText("------");
                                                            fifthClassee.setText(EE1410);
                                                            courseName.setText("");
                                                            courseName.setText("EE1140 - " + EE1140);

                                                        }
                                                        else if (dow.equals("Wednesday")) {

                                                            firstClassee.setText(EE1410);
                                                            secondClassee.setText(MA1130);
                                                            thirdClassee.setText(EE1130);
                                                            fourthClassee.setText(EE1210);
                                                            fifthClassee.setText(EE1410);
                                                            courseName.setText("");
                                                        }
                                                        else if (dow.equals("Thursday"))

                                                        {
                                                            firstClassee.setText(MA1130);
                                                            secondClassee.setText(EE1130);
                                                            thirdClassee.setText("LA1260");
                                                            fourthClassee.setText(EE1210);
                                                            fifthClassee.setText("------");
                                                            courseName.setText("");
                                                            courseName.setText("LA1260 - " + LA1260);
                                                        }
                                                        else if (dow.equals("Friday")) {

                                                            firstClassee.setText("LA1260");
                                                            secondClassee.setText("------");
                                                            thirdClassee.setText("------");
                                                            fourthClassee.setText("------");
                                                            fifthClassee.setText("------");
                                                            courseName.setText("");
                                                            courseName.setText("LA1260 - " + LA1260);
                                                        }
                                                        else if (dow.equals("Saturday")) {
                                                            firstClassee.setText("------");
                                                            secondClassee.setText("------");
                                                            thirdClassee.setText("------");
                                                            fourthClassee.setText("------");
                                                            fifthClassee.setText("------");
                                                            courseName.setText("");
                                                            courseName.setText("It's Saturday !!!");
                                                        }
                                                        else if (dow.equals("Sunday")) {
                                                            firstClassee.setText("------");
                                                            secondClassee.setText("------");
                                                            thirdClassee.setText("------");
                                                            fourthClassee.setText("------");
                                                            fifthClassee.setText("------");
                                                            courseName.setText("");
                                                            courseName.setText("It's Sunday !!!");
                                                        }
                                                    }

                                                    if (curmonth == 1 || curmonth == 2) {
                                                        if (curmonth == 1 && curdate >= 4 && curdate <= 29) {
                                                            if (dow.equals("Monday")) {

                                                                firstClassee.setText(LA1110);
                                                                secondClassee.setText("------");
                                                                thirdClassee.setText(EE1520);
                                                                fourthClassee.setText(EE1025);
                                                                fifthClassee.setText(EE1025);
                                                                courseName.setText("");
                                                            }

                                                            if (dow.equals("Tuesday")) {

                                                                firstClassee.setText(EE1520);
                                                                secondClassee.setText(EE1410);
                                                                thirdClassee.setText("------");
                                                                fourthClassee.setText("------");
                                                                fifthClassee.setText(EE1410);
                                                                courseName.setText("");
                                                            }

                                                            if (dow.equals("Wednesday")) {

                                                                firstClassee.setText(EE1410);
                                                                secondClassee.setText("------");
                                                                thirdClassee.setText("------");
                                                                fourthClassee.setText("------");
                                                                fifthClassee.setText(EE1410);
                                                                courseName.setText("");
                                                            }

                                                            if (dow.equals("Thursday")) {

                                                                firstClassee.setText("------");
                                                                secondClassee.setText("------");
                                                                thirdClassee.setText(LA1050);
                                                                fourthClassee.setText(EE1330);
                                                                fifthClassee.setText("------");
                                                                courseName.setText("");
                                                            }

                                                            if (dow.equals("Friday")) {
                                                                firstClassee.setText(LA1050);
                                                                secondClassee.setText(LA1110);
                                                                thirdClassee.setText(EE1330);
                                                                fourthClassee.setText("------");
                                                                fifthClassee.setText("------");
                                                                courseName.setText("");
                                                            }
                                                            if (dow.equals("Saturday")) {

                                                                firstClassee.setText("------");
                                                                secondClassee.setText("------");
                                                                thirdClassee.setText("------");
                                                                fourthClassee.setText("------");
                                                                fifthClassee.setText("------");
                                                                courseName.setText("");
                                                                courseName.setText("It's Saturday !!!");
                                                            }
                                                            if (dow.equals("Sunday")) {

                                                                firstClassee.setText("------");
                                                                secondClassee.setText("------");
                                                                thirdClassee.setText("------");
                                                                fourthClassee.setText("------");
                                                                fifthClassee.setText("------");
                                                                courseName.setText("");
                                                                courseName.setText("It's Sunday !!!");
                                                            }
                                                        }
                                                        if (curmonth == 2 && curdate <= 22) {
                                                            if (dow.equals("Monday")) {

                                                                firstClassee.setText(LA1110);
                                                                secondClassee.setText("------");
                                                                thirdClassee.setText(EE1520);
                                                                fourthClassee.setText(EE1025);
                                                                fifthClassee.setText(EE1025);
                                                                courseName.setText("");
                                                            }

                                                            if (dow.equals("Tuesday")) {

                                                                firstClassee.setText(EE1520);
                                                                secondClassee.setText(EE1410);
                                                                thirdClassee.setText("------");
                                                                fourthClassee.setText("------");
                                                                fifthClassee.setText(EE1410);
                                                                courseName.setText("");
                                                            }

                                                            if (dow.equals("Wednesday")) {

                                                                firstClassee.setText(EE1410);
                                                                secondClassee.setText("------");
                                                                thirdClassee.setText("------");
                                                                fourthClassee.setText("------");
                                                                fifthClassee.setText(EE1410);
                                                                courseName.setText("");
                                                            }

                                                            if (dow.equals("Thursday")) {

                                                                firstClassee.setText("------");
                                                                secondClassee.setText("------");
                                                                thirdClassee.setText(LA1050);
                                                                fourthClassee.setText(EE1330);
                                                                fifthClassee.setText("------");
                                                                courseName.setText("");
                                                            }

                                                            if (dow.equals("Friday")) {
                                                                firstClassee.setText(LA1050);
                                                                secondClassee.setText(LA1110);
                                                                thirdClassee.setText(EE1330);
                                                                fourthClassee.setText("------");
                                                                fifthClassee.setText("------");
                                                                courseName.setText("");
                                                            }
                                                            if (dow.equals("Saturday")) {

                                                                firstClassee.setText("------");
                                                                secondClassee.setText("------");
                                                                thirdClassee.setText("------");
                                                                fourthClassee.setText("------");
                                                                fifthClassee.setText("------");
                                                                courseName.setText("");
                                                                courseName.setText("It's Saturday !!!");
                                                            }
                                                            if (dow.equals("Sunday")) {

                                                                firstClassee.setText("------");
                                                                secondClassee.setText("------");
                                                                thirdClassee.setText("------");
                                                                fourthClassee.setText("------");
                                                                fifthClassee.setText("------");
                                                                courseName.setText("");
                                                                courseName.setText("It's Sunday !!!");
                                                            }
                                                        }

                                                    }

                                                    if (curmonth == 2 || curmonth == 3) {
                                                        if (curmonth == 2 && curdate >= 23 && curdate <= 31) {
                                                            if (dow.equals("Monday")) {

                                                                firstClassee.setText("------");
                                                                secondClassee.setText(EE1510);
                                                                thirdClassee.setText("------");
                                                                fourthClassee.setText(EE1025);
                                                                fifthClassee.setText(EE1025);
                                                                courseName.setText("");
                                                            }

                                                            if (dow.equals("Tuesday")) {

                                                                firstClassee.setText("------");
                                                                secondClassee.setText(EE1150);
                                                                thirdClassee.setText(EE1510);
                                                                fourthClassee.setText("------");
                                                                fifthClassee.setText(EE1150);
                                                                courseName.setText("");
                                                            }

                                                            if (dow.equals("Wednesday")) {

                                                                firstClassee.setText(EE1150);
                                                                secondClassee.setText(MA1150);
                                                                thirdClassee.setText("------");
                                                                fourthClassee.setText("------");
                                                                fifthClassee.setText(EE1150);
                                                                courseName.setText("");
                                                            }
                                                            if (dow.equals("Thursday")) {

                                                                firstClassee.setText(MA1150);
                                                                secondClassee.setText("------");
                                                                thirdClassee.setText("------");
                                                                fourthClassee.setText("------");
                                                                fifthClassee.setText("------");
                                                                courseName.setText("");
                                                            }

                                                            if (dow.equals("Friday")) {

                                                                firstClassee.setText("------");
                                                                secondClassee.setText("------");
                                                                thirdClassee.setText("------");
                                                                fourthClassee.setText("------");
                                                                fifthClassee.setText("------");
                                                                courseName.setText("");
                                                            }

                                                            if (dow.equals("Saturday")) {

                                                                firstClassee.setText("------");
                                                                secondClassee.setText("------");
                                                                thirdClassee.setText("------");
                                                                fourthClassee.setText("------");
                                                                fifthClassee.setText("------");
                                                                courseName.setText("");
                                                                courseName.setText("It's Saturday !!!");
                                                            }

                                                            if (dow.equals("Sunday")) {

                                                                firstClassee.setText("------");
                                                                secondClassee.setText("------");
                                                                thirdClassee.setText("------");
                                                                fourthClassee.setText("------");
                                                                fifthClassee.setText("------");
                                                                courseName.setText("");
                                                                courseName.setText("It's Sunday !!!");
                                                            }
                                                        }
                                                        if (curmonth == 3 && curdate <= 28) {
                                                            if (dow.equals("Monday")) {

                                                                firstClassee.setText("------");
                                                                secondClassee.setText(EE1510);
                                                                thirdClassee.setText("------");
                                                                fourthClassee.setText(EE1025);
                                                                fifthClassee.setText(EE1025);
                                                                courseName.setText("");
                                                            }

                                                            if (dow.equals("Tuesday")) {

                                                                firstClassee.setText("------");
                                                                secondClassee.setText(EE1150);
                                                                thirdClassee.setText(EE1510);
                                                                fourthClassee.setText("------");
                                                                fifthClassee.setText(EE1150);
                                                                courseName.setText("");
                                                            }

                                                            if (dow.equals("Wednesday")) {

                                                                firstClassee.setText(EE1150);
                                                                secondClassee.setText(MA1150);
                                                                thirdClassee.setText("------");
                                                                fourthClassee.setText("------");
                                                                fifthClassee.setText(EE1150);
                                                                courseName.setText("");
                                                            }
                                                            if (dow.equals("Thursday")) {

                                                                firstClassee.setText(MA1150);
                                                                secondClassee.setText("------");
                                                                thirdClassee.setText("------");
                                                                fourthClassee.setText("------");
                                                                fifthClassee.setText("------");
                                                                courseName.setText("");
                                                            }

                                                            if (dow.equals("Friday")) {

                                                                firstClassee.setText("------");
                                                                secondClassee.setText("------");
                                                                thirdClassee.setText("------");
                                                                fourthClassee.setText("------");
                                                                fifthClassee.setText("------");
                                                                courseName.setText("");
                                                            }

                                                            if (dow.equals("Saturday")) {

                                                                firstClassee.setText("------");
                                                                secondClassee.setText("------");
                                                                thirdClassee.setText("------");
                                                                fourthClassee.setText("------");
                                                                fifthClassee.setText("------");
                                                                courseName.setText("");
                                                                courseName.setText("It's Saturday !!!");
                                                            }

                                                            if (dow.equals("Sunday")) {

                                                                firstClassee.setText("------");
                                                                secondClassee.setText("------");
                                                                thirdClassee.setText("------");
                                                                fourthClassee.setText("------");
                                                                fifthClassee.setText("------");
                                                                courseName.setText("");
                                                                courseName.setText("It's Sunday !!!");
                                                            }
                                                        }
                                                    }
                                                }

                                                else {
                                                    if (segmentSelected.equals("1-2")) {

                                                        if (daySelected.equals("Monday")) {
                                                            firstClassee.setText("------");
                                                            secondClassee.setText("EE1140");
                                                            thirdClassee.setText(EE1520);
                                                            fourthClassee.setText(EE1025);
                                                            fifthClassee.setText(EE1025);
                                                            courseName.setText("");
                                                            courseName.setText("EE1140 - " + EE1140);
                                                        } else if (daySelected.equals("Tuesday")) {
                                                            firstClassee.setText(EE1520);
                                                            secondClassee.setText(EE1410);
                                                            thirdClassee.setText("EE1140");
                                                            fourthClassee.setText("------");
                                                            fifthClassee.setText(EE1410);
                                                            courseName.setText("");
                                                            courseName.setText("EE1140 - " + EE1140);

                                                        } else if (daySelected.equals("Wednesday")) {

                                                            firstClassee.setText(EE1410);
                                                            secondClassee.setText(MA1130);
                                                            thirdClassee.setText(EE1130);
                                                            fourthClassee.setText(EE1210);
                                                            fifthClassee.setText(EE1410);
                                                            courseName.setText("");
                                                        } else if (daySelected.equals("Thursday"))

                                                        {

                                                            firstClassee.setText(MA1130);
                                                            secondClassee.setText(EE1130);
                                                            thirdClassee.setText("LA1260");
                                                            fourthClassee.setText(EE1210);
                                                            fifthClassee.setText("------");
                                                            courseName.setText("");
                                                            courseName.setText("LA1260 - " + LA1260);
                                                        }

                                                        if (daySelected.equals("Friday")) {

                                                            firstClassee.setText("LA1260");
                                                            secondClassee.setText("------");
                                                            thirdClassee.setText("------");
                                                            fourthClassee.setText("------");
                                                            fifthClassee.setText("------");
                                                            courseName.setText("");
                                                            courseName.setText("LA1260 - " + LA1260);
                                                        }
                                                    }

                                                    if (segmentSelected.equals("3-4"))

                                                    {

                                                        if (daySelected.equals("Monday")) {

                                                            firstClassee.setText(LA1110);
                                                            secondClassee.setText("------");
                                                            thirdClassee.setText(EE1520);
                                                            fourthClassee.setText(EE1025);
                                                            fifthClassee.setText(EE1025);
                                                            courseName.setText("");
                                                        }

                                                        if (daySelected.equals("Tuesday")) {

                                                            firstClassee.setText(EE1520);
                                                            secondClassee.setText(EE1410);
                                                            thirdClassee.setText("------");
                                                            fourthClassee.setText("------");
                                                            fifthClassee.setText(EE1410);
                                                            courseName.setText("");
                                                        }

                                                        if (daySelected.equals("Wednesday")) {

                                                            firstClassee.setText(EE1410);
                                                            secondClassee.setText("------");
                                                            thirdClassee.setText("------");
                                                            fourthClassee.setText("------");
                                                            fifthClassee.setText(EE1410);
                                                            courseName.setText("");
                                                        }

                                                        if (daySelected.equals("Thursday")) {

                                                            firstClassee.setText("------");
                                                            secondClassee.setText("------");
                                                            thirdClassee.setText(LA1050);
                                                            fourthClassee.setText(EE1330);
                                                            fifthClassee.setText("------");
                                                            courseName.setText("");
                                                        }

                                                        if (daySelected.equals("Friday")) {
                                                            firstClassee.setText(LA1050);
                                                            secondClassee.setText(LA1110);
                                                            thirdClassee.setText(EE1330);
                                                            fourthClassee.setText("------");
                                                            fifthClassee.setText("------");
                                                            courseName.setText("");
                                                        }
                                                    }

                                                    if (segmentSelected.equals("5-6"))

                                                    {
                                                        if (daySelected.equals("Monday")) {

                                                            firstClassee.setText("------");
                                                            secondClassee.setText(EE1510);
                                                            thirdClassee.setText("------");
                                                            fourthClassee.setText(EE1025);
                                                            fifthClassee.setText(EE1025);
                                                            courseName.setText("");
                                                        }

                                                        if (daySelected.equals("Tuesday")) {

                                                            firstClassee.setText("------");
                                                            secondClassee.setText(EE1150);
                                                            thirdClassee.setText(EE1510);
                                                            fourthClassee.setText("------");
                                                            fifthClassee.setText(EE1150);
                                                            courseName.setText("");
                                                        }

                                                        if (daySelected.equals("Wednesday")) {

                                                            firstClassee.setText(EE1150);
                                                            secondClassee.setText(MA1150);
                                                            thirdClassee.setText("------");
                                                            fourthClassee.setText("------");
                                                            fifthClassee.setText(EE1150);
                                                            courseName.setText("");
                                                        }
                                                        if (daySelected.equals("Thursday")) {

                                                            firstClassee.setText(MA1150);
                                                            secondClassee.setText("------");
                                                            thirdClassee.setText("------");
                                                            fourthClassee.setText("------");
                                                            fifthClassee.setText("------");
                                                            courseName.setText("");
                                                        }

                                                        if (daySelected.equals("Friday")) {

                                                            firstClassee.setText("------");
                                                            secondClassee.setText("------");
                                                            thirdClassee.setText("------");
                                                            fourthClassee.setText("------");
                                                            fifthClassee.setText("------");
                                                            courseName.setText("");
                                                        }
                                                    }

                                                }
                                            }
                                        }

        );


        return v;
    }


}
