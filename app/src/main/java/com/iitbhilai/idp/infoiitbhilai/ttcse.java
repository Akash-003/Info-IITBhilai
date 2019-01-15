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

public class ttcse extends Fragment {

    int curdate, curmonth, curyear;
    String dow;

    String daySelected = "";
    String segmentSelected = "";
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

        View v = inflater.inflate(R.layout.fragment_ttcse, container, false);

        final TextView firstClasscse = (TextView) v.findViewById(R.id.first_class);
        final TextView secondclasscse = (TextView) v.findViewById(R.id.second_class);
        final TextView thirdClasscse = (TextView) v.findViewById(R.id.third_class);
        final TextView fourthClasscse = (TextView) v.findViewById(R.id.fourth_class);
        final TextView fifthClasscse = (TextView) v.findViewById(R.id.fifth_class);
        final TextView courseName = (TextView) v.findViewById(R.id.course_name);


        Spinner day = (Spinner) v.findViewById(R.id.day_list);
        // Create an ArrayAdapter using the string array and a default spinner layout

        day.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                daySelected = parent.getItemAtPosition(position).toString();
                Log.v("ttcse.java", " " + daySelected);
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
                Log.v("ttcse.java", " " + segmentSelected);
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

        Log.v("ttcse.java", " " + curmonth);
        Log.v("ttcse.java", " " + dow);


        Button getTimeTable = (Button) v.findViewById(R.id.get_timetable);
        getTimeTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (daySelected.equals("Today")) {

                    if (curmonth == 0 || curmonth == 1) {
                        if (curmonth == 0 && curdate >= 2 && curdate <= 31) {
                            if (dow.equals("Monday")) {
                                firstClasscse.setText("------");
                                secondclasscse.setText("------");
                                thirdClasscse.setText("------");
                                fourthClasscse.setText("------");
                                fifthClasscse.setText("------");
                                courseName.setText("");
                            } else if (dow.equals("Tuesday")) {
                                firstClasscse.setText("------");
                                secondclasscse.setText(CS1353);
                                thirdClasscse.setText("------");
                                fourthClasscse.setText("------");
                                fifthClasscse.setText("------");
                                courseName.setText("");
                            } else if (dow.equals("Wednesday")) {
                                firstClasscse.setText(CS1353);
                                secondclasscse.setText(MA1130);
                                thirdClasscse.setText("CY1020");
                                fourthClasscse.setText("------");
                                fifthClasscse.setText("------");
                                courseName.setText("");
                                courseName.setText("CY1020 - " + CY1020);
                            } else if (dow.equals("Thursday")) {
                                firstClasscse.setText(MA1130);
                                secondclasscse.setText("CY1020");
                                thirdClasscse.setText("LA1260");
                                fourthClasscse.setText("------");
                                fifthClasscse.setText("------");
                                courseName.setText("");
                                courseName.setText("CY1020 - " + CY1020 + "\nLA1260 - " + LA1260);
                            } else if (dow.equals("Friday")) {
                                firstClasscse.setText("LA1260");
                                secondclasscse.setText("------");
                                thirdClasscse.setText("------");
                                fourthClasscse.setText("------");
                                fifthClasscse.setText("------");
                                courseName.setText("");
                                courseName.setText("LA1260 - " + LA1260);
                            } else if (dow.equals("Saturday")) {
                                firstClasscse.setText("------");
                                secondclasscse.setText("------");
                                thirdClasscse.setText("------");
                                fourthClasscse.setText("------");
                                fifthClasscse.setText("------");
                                courseName.setText("");
                                courseName.setText("It's Saturday Enjoy !!!!!");
                            } else if (dow.equals("Sunday")) {
                                firstClasscse.setText("------");
                                secondclasscse.setText("------");
                                thirdClasscse.setText("------");
                                fourthClasscse.setText("------");
                                fifthClasscse.setText("------");
                                courseName.setText("");
                                courseName.setText("It's Sunday Enjoy !!!!!");
                            }
                        }
                    }
                    if (curmonth == 1 && curdate <= 3) {
                        if (dow.equals("Monday")) {
                            firstClasscse.setText("------");
                            secondclasscse.setText("------");
                            thirdClasscse.setText("------");
                            fourthClasscse.setText("------");
                            fifthClasscse.setText("------");
                            courseName.setText("");
                        } else if (dow.equals("Tuesday")) {
                            firstClasscse.setText("------");
                            secondclasscse.setText(CS1353);
                            thirdClasscse.setText("------");
                            fourthClasscse.setText("------");
                            fifthClasscse.setText("------");
                            courseName.setText("");
                        } else if (dow.equals("Wednesday")) {
                            firstClasscse.setText(CS1353);
                            secondclasscse.setText(MA1130);
                            thirdClasscse.setText("CY1020");
                            fourthClasscse.setText("------");
                            fifthClasscse.setText("------");
                            courseName.setText("");
                            courseName.setText("CY1020 - " + CY1020);
                        } else if (dow.equals("Thursday")) {
                            firstClasscse.setText(MA1130);
                            secondclasscse.setText("CY1020");
                            thirdClasscse.setText("LA1260");
                            fourthClasscse.setText("------");
                            fifthClasscse.setText("------");
                            courseName.setText("");
                            courseName.setText("CY1020 - " + CY1020 + "\nLA1260 - " + LA1260);
                        } else if (dow.equals("Friday")) {
                            firstClasscse.setText("LA1260");
                            secondclasscse.setText("------");
                            thirdClasscse.setText("------");
                            fourthClasscse.setText("------");
                            fifthClasscse.setText("------");
                            courseName.setText("");
                            courseName.setText("LA1260 - " + LA1260);
                        } else if (dow.equals("Saturday")) {
                            firstClasscse.setText("------");
                            secondclasscse.setText("------");
                            thirdClasscse.setText("------");
                            fourthClasscse.setText("------");
                            fifthClasscse.setText("------");
                            courseName.setText("");
                            courseName.setText("It's Saturday Enjoy !!!!!");
                        } else if (dow.equals("Sunday")) {
                            firstClasscse.setText("------");
                            secondclasscse.setText("------");
                            thirdClasscse.setText("------");
                            fourthClasscse.setText("------");
                            fifthClasscse.setText("------");
                            courseName.setText("");
                            courseName.setText("It's Sunday Enjoy !!!!!");
                        }
                    }

                    if (curmonth == 1 || curmonth == 2) {
                        if (curmonth == 1 && curdate >= 4 && curdate <= 29) {
                            if (dow.equals("Monday")) {


                                firstClasscse.setText(LA1110);
                                secondclasscse.setText(PH1027);
                                thirdClasscse.setText(BM1030);
                                fourthClasscse.setText(CS1340);
                                fifthClasscse.setText("------");
                                courseName.setText("");

                            }
                            if (dow.equals("Tuesday")) {

                                firstClasscse.setText(BM1030);
                                secondclasscse.setText(CS1353);
                                thirdClasscse.setText(PH1027);
                                fourthClasscse.setText("------");
                                fifthClasscse.setText("------");
                                courseName.setText("");
                            }

                            if (dow.equals("Wednesday")) {

                                firstClasscse.setText(CS1353);
                                secondclasscse.setText(MA1140);
                                thirdClasscse.setText("------");
                                fourthClasscse.setText("------");
                                fifthClasscse.setText("------");
                                courseName.setText("");
                            }

                            if (dow.equals("Thursday")) {

                                firstClasscse.setText(MA1140);
                                secondclasscse.setText("------");
                                thirdClasscse.setText(LA1050);
                                fourthClasscse.setText("EE1330");
                                fifthClasscse.setText("------");
                                courseName.setText("");
                                courseName.setText("EE1330 - " + EE1330);
                            }

                            if (dow.equals("Friday")) {

                                firstClasscse.setText(LA1050);
                                secondclasscse.setText(LA1110);
                                thirdClasscse.setText("EE1330");
                                fourthClasscse.setText(CS1340);
                                fifthClasscse.setText("------");
                                courseName.setText("");
                                courseName.setText("EE1330 - " + EE1330);
                            }
                            if (dow.equals("Saturday")) {

                                firstClasscse.setText("------");
                                secondclasscse.setText("------");
                                thirdClasscse.setText("------");
                                fourthClasscse.setText("------");
                                fifthClasscse.setText("------");
                                courseName.setText("");
                                courseName.setText("It's Saturday Enjoy !!!!!");
                            }
                            if (dow.equals("Sunday")) {

                                firstClasscse.setText("------");
                                secondclasscse.setText("------");
                                thirdClasscse.setText("------");
                                fourthClasscse.setText("------");
                                fifthClasscse.setText("------");
                                courseName.setText("");
                                courseName.setText("It's Sunday Enjoy !!!!!");
                            }
                        }
                        if (curmonth == 2 && curdate <= 22) {
                            if (dow.equals("Monday")) {


                                firstClasscse.setText(LA1110);
                                secondclasscse.setText(PH1027);
                                thirdClasscse.setText(BM1030);
                                fourthClasscse.setText(CS1340);
                                fifthClasscse.setText("------");
                                courseName.setText("");

                            }
                            if (dow.equals("Tuesday")) {

                                firstClasscse.setText(BM1030);
                                secondclasscse.setText(CS1353);
                                thirdClasscse.setText(PH1027);
                                fourthClasscse.setText("------");
                                fifthClasscse.setText("------");
                                courseName.setText("");
                            }

                            if (dow.equals("Wednesday")) {

                                firstClasscse.setText(CS1353);
                                secondclasscse.setText(MA1140);
                                thirdClasscse.setText("------");
                                fourthClasscse.setText("------");
                                fifthClasscse.setText("------");
                                courseName.setText("");
                            }

                            if (dow.equals("Thursday")) {

                                firstClasscse.setText(MA1140);
                                secondclasscse.setText("------");
                                thirdClasscse.setText(LA1050);
                                fourthClasscse.setText("EE1330");
                                fifthClasscse.setText("------");
                                courseName.setText("");
                                courseName.setText("EE1330 - " + EE1330);
                            }

                            if (dow.equals("Friday")) {

                                firstClasscse.setText(LA1050);
                                secondclasscse.setText(LA1110);
                                thirdClasscse.setText("EE1330");
                                fourthClasscse.setText(CS1340);
                                fifthClasscse.setText("------");
                                courseName.setText("");
                                courseName.setText("EE1330 - " + EE1330);
                            }
                            if (dow.equals("Saturday")) {

                                firstClasscse.setText("------");
                                secondclasscse.setText("------");
                                thirdClasscse.setText("------");
                                fourthClasscse.setText("------");
                                fifthClasscse.setText("------");
                                courseName.setText("");
                                courseName.setText("It's Saturday Enjoy !!!!!");
                            }
                            if (dow.equals("Sunday")) {

                                firstClasscse.setText("------");
                                secondclasscse.setText("------");
                                thirdClasscse.setText("------");
                                fourthClasscse.setText("------");
                                fifthClasscse.setText("------");
                                courseName.setText("");
                                courseName.setText("It's Sunday Enjoy !!!!!");
                            }
                        }

                    }

                    if (curmonth == 2 || curmonth == 3) {
                        if (curmonth == 2 && curdate >= 23 && curdate <= 31) {
                            if (dow.equals("Monday")) {

                                firstClasscse.setText("------");
                                secondclasscse.setText("------");
                                thirdClasscse.setText(BO1010);
                                fourthClasscse.setText(CS1340);
                                fifthClasscse.setText("------");
                                courseName.setText("");
                            }

                            if (dow.equals("Tuesday")) {

                                firstClasscse.setText(BO1010);
                                secondclasscse.setText(CS1353);
                                thirdClasscse.setText("------");
                                fourthClasscse.setText("------");
                                fifthClasscse.setText("------");
                                courseName.setText("");
                            }

                            if (dow.equals("Wednesday")) {

                                firstClasscse.setText(CS1353);
                                secondclasscse.setText("------");
                                thirdClasscse.setText("------");
                                fourthClasscse.setText("------");
                                fifthClasscse.setText("------");
                                courseName.setText("");
                            }

                            if (dow.equals("Thursday")) {

                                firstClasscse.setText("------");
                                secondclasscse.setText("------");
                                thirdClasscse.setText("------");
                                fourthClasscse.setText("------");
                                fifthClasscse.setText("------");
                                courseName.setText("");
                            }

                            if (dow.equals("Friday")) {

                                firstClasscse.setText("------");
                                secondclasscse.setText("------");
                                thirdClasscse.setText("------");
                                fourthClasscse.setText(CS1340);
                                fifthClasscse.setText("------");
                                courseName.setText("");
                            }

                            if (dow.equals("Saturday")) {

                                firstClasscse.setText("------");
                                secondclasscse.setText("------");
                                thirdClasscse.setText("------");
                                fourthClasscse.setText("------");
                                fifthClasscse.setText("------");
                                courseName.setText("");
                                courseName.setText("It's Saturday Enjoy !!!!!");
                            }

                            if (dow.equals("Sunday")) {

                                firstClasscse.setText("------");
                                secondclasscse.setText("------");
                                thirdClasscse.setText("------");
                                fourthClasscse.setText("------");
                                fifthClasscse.setText("------");
                                courseName.setText("");
                                courseName.setText("It's Sunday Enjoy !!!!!");
                            }
                        }
                        if (curmonth == 3 && curdate <= 28) {
                            if (dow.equals("Monday")) {

                                firstClasscse.setText("------");
                                secondclasscse.setText("------");
                                thirdClasscse.setText(BO1010);
                                fourthClasscse.setText(CS1340);
                                fifthClasscse.setText("------");
                                courseName.setText("");
                            }

                            if (dow.equals("Tuesday")) {

                                firstClasscse.setText(BO1010);
                                secondclasscse.setText(CS1353);
                                thirdClasscse.setText("------");
                                fourthClasscse.setText("------");
                                fifthClasscse.setText("------");
                                courseName.setText("");
                            }

                            if (dow.equals("Wednesday")) {

                                firstClasscse.setText(CS1353);
                                secondclasscse.setText("------");
                                thirdClasscse.setText("------");
                                fourthClasscse.setText("------");
                                fifthClasscse.setText("------");
                                courseName.setText("");
                            }

                            if (dow.equals("Thursday")) {

                                firstClasscse.setText("------");
                                secondclasscse.setText("------");
                                thirdClasscse.setText("------");
                                fourthClasscse.setText("------");
                                fifthClasscse.setText("------");
                                courseName.setText("");
                            }

                            if (dow.equals("Friday")) {

                                firstClasscse.setText("------");
                                secondclasscse.setText("------");
                                thirdClasscse.setText("------");
                                fourthClasscse.setText(CS1340);
                                fifthClasscse.setText("------");
                                courseName.setText("");
                            }

                            if (dow.equals("Saturday")) {

                                firstClasscse.setText("------");
                                secondclasscse.setText("------");
                                thirdClasscse.setText("------");
                                fourthClasscse.setText("------");
                                fifthClasscse.setText("------");
                                courseName.setText("");
                                courseName.setText("It's Saturday Enjoy !!!!!");
                            }

                            if (dow.equals("Sunday")) {

                                firstClasscse.setText("------");
                                secondclasscse.setText("------");
                                thirdClasscse.setText("------");
                                fourthClasscse.setText("------");
                                fifthClasscse.setText("------");
                                courseName.setText("");
                                courseName.setText("It's Sunday Enjoy !!!!!");
                            }
                        }
                    }
                } else {

                    if (segmentSelected.equals("1-2")) {

                        if (daySelected.equals("Monday")) {

                            firstClasscse.setText("------");
                            secondclasscse.setText("------");
                            thirdClasscse.setText("------");
                            fourthClasscse.setText("------");
                            fifthClasscse.setText("------");
                            courseName.setText("");
                        } else if (daySelected.equals("Tuesday")) {

                            firstClasscse.setText("------");
                            secondclasscse.setText(CS1353);
                            thirdClasscse.setText("------");
                            fourthClasscse.setText("------");
                            fifthClasscse.setText("------");
                            courseName.setText("");

                        } else if (daySelected.equals("Wednesday")) {

                            firstClasscse.setText(CS1353);
                            secondclasscse.setText(MA1130);
                            thirdClasscse.setText("CY1020");
                            fourthClasscse.setText("------");
                            fifthClasscse.setText("------");
                            courseName.setText("");
                            courseName.setText("CY1020 - " + CY1020);
                        } else if (daySelected.equals("Thursday"))

                        {

                            firstClasscse.setText(MA1130);
                            secondclasscse.setText("CY1020");
                            thirdClasscse.setText("LA1260");
                            fourthClasscse.setText("------");
                            fifthClasscse.setText("------");
                            courseName.setText("");
                            courseName.setText("CY1020 - " + CY1020 + "\nLA1260 - " + LA1260);
                        }


                        if (daySelected.equals("Friday")) {

                            firstClasscse.setText("LA1260");
                            secondclasscse.setText("------");
                            thirdClasscse.setText("------");
                            fourthClasscse.setText("------");
                            fifthClasscse.setText("------");
                            courseName.setText("");
                            courseName.setText("LA1260 - " + LA1260);
                        }
                    }


                    if (segmentSelected.equals("3-4"))

                    {

                        if (daySelected.equals("Monday")) {

                            firstClasscse.setText(LA1110);
                            secondclasscse.setText(PH1027);
                            thirdClasscse.setText(BM1030);
                            fourthClasscse.setText(CS1340);
                            fifthClasscse.setText("------");
                            courseName.setText("");
                        }

                        if (daySelected.equals("Tuesday")) {

                            firstClasscse.setText(BM1030);
                            secondclasscse.setText(CS1353);
                            thirdClasscse.setText(PH1027);
                            fourthClasscse.setText("------");
                            fifthClasscse.setText("------");
                            courseName.setText("");
                        }

                        if (daySelected.equals("Wednesday")) {

                            firstClasscse.setText(CS1353);
                            secondclasscse.setText(MA1140);
                            thirdClasscse.setText("------");
                            fourthClasscse.setText("------");
                            fifthClasscse.setText("------");
                            courseName.setText("");
                        }

                        if (daySelected.equals("Thursday")) {

                            firstClasscse.setText(MA1140);
                            secondclasscse.setText("------");
                            thirdClasscse.setText(LA1050);
                            fourthClasscse.setText("EE1330");
                            fifthClasscse.setText("------");
                            courseName.setText("");
                            courseName.setText("EE1330 - " + EE1330);
                        }

                        if (daySelected.equals("Friday")) {

                            firstClasscse.setText(LA1050);
                            secondclasscse.setText(LA1110);
                            thirdClasscse.setText("EE1330");
                            fourthClasscse.setText(CS1340);
                            fifthClasscse.setText("------");
                            courseName.setText("");
                            courseName.setText("EE1330 - " + EE1330);
                        }
                    }

                    if (segmentSelected.equals("5-6"))

                    {

                        if (daySelected.equals("Monday")) {

                            firstClasscse.setText("------");
                            secondclasscse.setText("------");
                            thirdClasscse.setText(BO1010);
                            fourthClasscse.setText(CS1340);
                            fifthClasscse.setText("------");
                            courseName.setText("");
                        }

                        if (daySelected.equals("Tuesday")) {

                            firstClasscse.setText(BO1010);
                            secondclasscse.setText(CS1353);
                            thirdClasscse.setText("------");
                            fourthClasscse.setText("------");
                            fifthClasscse.setText("------");
                            courseName.setText("");
                        }

                        if (daySelected.equals("Wednesday")) {

                            firstClasscse.setText(CS1353);
                            secondclasscse.setText("------");
                            thirdClasscse.setText("------");
                            fourthClasscse.setText("------");
                            fifthClasscse.setText("------");
                            courseName.setText("");
                        }

                        if (daySelected.equals("Thursday")) {

                            firstClasscse.setText("------");
                            secondclasscse.setText("------");
                            thirdClasscse.setText("------");
                            fourthClasscse.setText("------");
                            fifthClasscse.setText("------");
                            courseName.setText("");
                        }

                        if (daySelected.equals("Friday")) {

                            firstClasscse.setText("------");
                            secondclasscse.setText("------");
                            thirdClasscse.setText("------");
                            fourthClasscse.setText(CS1340);
                            fifthClasscse.setText("------");
                            courseName.setText("");
                        }
                    }

                }
            }

        });


        return v;
    }


}
