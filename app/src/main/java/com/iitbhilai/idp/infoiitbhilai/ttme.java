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

public class ttme extends Fragment {

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

        View v = inflater.inflate(R.layout.fragment_ttme, container, false);

        final TextView firstClassme = (TextView) v.findViewById(R.id.first_class);
        final TextView secondClassme = (TextView) v.findViewById(R.id.second_class);
        final TextView thirdClassme = (TextView) v.findViewById(R.id.third_class);
        final TextView fourthClassme = (TextView) v.findViewById(R.id.fourth_class);
        final TextView fifthClassme = (TextView) v.findViewById(R.id.fifth_class);
        final TextView courseName = (TextView) v.findViewById(R.id.course_name);


        Spinner day = (Spinner) v.findViewById(R.id.day_list);
        // Create an ArrayAdapter using the string array and a default spinner layout

        day.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                daySelected = parent.getItemAtPosition(position).toString();
                Log.v("ttme.java", " " + daySelected);
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
                Log.v("ttme.java", " " + segmentSelected);
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

        Log.v("ttme.java", " " + curmonth);
        Log.v("ttme.java", " " + dow);


        Button getTimeTable = (Button) v.findViewById(R.id.get_timetable);
        getTimeTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (daySelected.equals("Today")) {

                    if (curmonth == 0 || curmonth == 1) {
                        if (curmonth == 0 && curdate >= 2 && curdate <= 31) {
                            if (dow.equals("Monday")) {
                                firstClassme.setText("------");
                                secondClassme.setText("------");
                                thirdClassme.setText("------");
                                fourthClassme.setText(ID1921);
                                fifthClassme.setText(ID1921);
                                courseName.setText("");
                            } else if (dow.equals("Tuesday")) {
                                firstClassme.setText("------");
                                secondClassme.setText("------");
                                thirdClassme.setText("------");
                                fourthClassme.setText(ID1921);
                                fifthClassme.setText(ID1921);
                                courseName.setText("");
                            } else if (dow.equals("Wednesday")) {
                                firstClassme.setText("------");
                                secondClassme.setText(MA1130);
                                thirdClassme.setText("CY1020");
                                fourthClassme.setText(ID1160);
                                fifthClassme.setText("------");
                                courseName.setText("");
                                courseName.setText("CY1020 - " + CY1020);
                            } else if (dow.equals("Thursday")) {
                                firstClassme.setText(MA1130);
                                secondClassme.setText("CY1020");
                                thirdClassme.setText("LA1260");
                                fourthClassme.setText(ID1160);
                                fifthClassme.setText("------");
                                courseName.setText("");
                                courseName.setText("CY1020 - " + CY1020 + "LA1260 - " + LA1260);

                            } else if (dow.equals("Friday")) {
                                firstClassme.setText("LA1260");
                                secondClassme.setText("------");
                                thirdClassme.setText("------");
                                fourthClassme.setText("------");
                                fifthClassme.setText("------");
                                courseName.setText("");
                                courseName.setText("LA1260 - " + LA1260);
                            } else if (dow.equals("Saturday")) {
                                firstClassme.setText("------");
                                secondClassme.setText("------");
                                thirdClassme.setText("------");
                                fourthClassme.setText("------");
                                fifthClassme.setText("------");
                                courseName.setText("");
                                courseName.setText("It's Saturday !!!");
                            } else if (dow.equals("Sunday")) {
                                firstClassme.setText("------");
                                secondClassme.setText("------");
                                thirdClassme.setText("------");
                                fourthClassme.setText("------");
                                fifthClassme.setText("------");
                                courseName.setText("");
                                courseName.setText("It's Sunday Enjoy !!!");
                            }
                        }
                    }
                    if (curmonth == 1 && curdate <= 3) {
                        if (dow.equals("Monday")) {
                            firstClassme.setText("------");
                            secondClassme.setText("------");
                            thirdClassme.setText("------");
                            fourthClassme.setText(ID1921);
                            fifthClassme.setText(ID1921);
                            courseName.setText("");
                        } else if (dow.equals("Tuesday")) {
                            firstClassme.setText("------");
                            secondClassme.setText("------");
                            thirdClassme.setText("------");
                            fourthClassme.setText(ID1921);
                            fifthClassme.setText(ID1921);
                            courseName.setText("");
                        } else if (dow.equals("Wednesday")) {
                            firstClassme.setText("------");
                            secondClassme.setText(MA1130);
                            thirdClassme.setText("CY1020");
                            fourthClassme.setText(ID1160);
                            fifthClassme.setText("------");
                            courseName.setText("CY1020 - " + CY1020);
                        } else if (dow.equals("Thursday")) {
                            firstClassme.setText(MA1130);
                            secondClassme.setText("CY1020");
                            thirdClassme.setText("LA1260");
                            fourthClassme.setText(ID1160);
                            fifthClassme.setText("------");
                            courseName.setText("CY1020 - " + CY1020 + "LA1260 - " + LA1260);
                        } else if (dow.equals("Friday")) {
                            firstClassme.setText("LA1260");
                            secondClassme.setText("------");
                            thirdClassme.setText("------");
                            fourthClassme.setText("------");
                            fifthClassme.setText("------");
                            courseName.setText("LA1260 - " + LA1260);
                        } else if (dow.equals("Saturday")) {
                            firstClassme.setText("------");
                            secondClassme.setText("------");
                            thirdClassme.setText("------");
                            fourthClassme.setText("------");
                            fifthClassme.setText("------");
                            courseName.setText("");
                            courseName.setText("It's Saturday !!!");
                        } else if (dow.equals("Sunday")) {
                            firstClassme.setText("------");
                            secondClassme.setText("------");
                            thirdClassme.setText("------");
                            fourthClassme.setText("------");
                            fifthClassme.setText("------");
                            courseName.setText("");
                            courseName.setText("It's Sunday !!!");
                        }
                    }

                    if (curmonth == 1 || curmonth == 2) {
                        if (curmonth == 1 && curdate >= 4 && curdate <= 29) {
                            if (dow.equals("Monday")) {

                                firstClassme.setText(LA1110);
                                secondClassme.setText(PH1027);
                                thirdClassme.setText("------");
                                fourthClassme.setText(ID1921);
                                fifthClassme.setText(ID1921);
                                courseName.setText("");
                            }

                            if (dow.equals("Tuesday")) {

                                firstClassme.setText("------");
                                secondClassme.setText("------");
                                thirdClassme.setText(PH1027);
                                fourthClassme.setText(ID1921);
                                fifthClassme.setText(ID1921);

                                courseName.setText("");
                            }

                            if (dow.equals("Wednesday")) {

                                firstClassme.setText("------");
                                secondClassme.setText(MA1140);
                                thirdClassme.setText("CY1021");
                                fourthClassme.setText(ID1160);
                                fifthClassme.setText("------");
                                courseName.setText("CY1020 - " + CY1020);
                            }

                            if (dow.equals("Thursday")) {

                                firstClassme.setText(MA1140);
                                secondClassme.setText("CY1021");
                                thirdClassme.setText(LA1050);
                                fourthClassme.setText(ID1160);
                                fifthClassme.setText("------");
                                courseName.setText("CY1021 - "+CY1021);
                            }

                            if (dow.equals("Friday")) {

                                firstClassme.setText(LA1050);
                                secondClassme.setText(LA1110);
                                thirdClassme.setText("------");
                                fourthClassme.setText("------");
                                fifthClassme.setText("------");
                                courseName.setText("");
                            }
                            if (dow.equals("Saturday")) {

                                firstClassme.setText("------");
                                secondClassme.setText("------");
                                thirdClassme.setText("------");
                                fourthClassme.setText("------");
                                fifthClassme.setText("------");
                                courseName.setText("");
                                courseName.setText("It's Saturday !!!");
                            }
                            if (dow.equals("Sunday")) {

                                firstClassme.setText("------");
                                secondClassme.setText("------");
                                thirdClassme.setText("------");
                                fourthClassme.setText("------");
                                fifthClassme.setText("------");
                                courseName.setText("");
                                courseName.setText("It's Sunday !!!");
                            }
                        }
                        if (curmonth == 2 && curdate <= 22) {
                            if (dow.equals("Monday")) {

                                firstClassme.setText(LA1110);
                                secondClassme.setText(PH1027);
                                thirdClassme.setText("------");
                                fourthClassme.setText(ID1931);
                                fifthClassme.setText(ID1931);
                                courseName.setText("");
                            }

                            if (dow.equals("Tuesday")) {

                                firstClassme.setText("------");
                                secondClassme.setText("------");
                                thirdClassme.setText(PH1027);
                                fourthClassme.setText(ID1931);
                                fifthClassme.setText(ID1931);

                                courseName.setText("");
                            }

                            if (dow.equals("Wednesday")) {

                                firstClassme.setText("------");
                                secondClassme.setText(MA1140);
                                thirdClassme.setText("CY1021");
                                fourthClassme.setText(ME1030);
                                fifthClassme.setText("------");
                                courseName.setText("CY1021 - "+CY1021);
                            }

                            if (dow.equals("Thursday")) {

                                firstClassme.setText(MA1140);
                                secondClassme.setText("CY1021");
                                thirdClassme.setText(LA1050);
                                fourthClassme.setText(ME1030);
                                fifthClassme.setText("------");
                                courseName.setText("CY1021 - " + CY1021);
                            }

                            if (dow.equals("Friday")) {

                                firstClassme.setText(LA1050);
                                secondClassme.setText(LA1110);
                                thirdClassme.setText("------");
                                fourthClassme.setText("------");
                                fifthClassme.setText("------");
                                courseName.setText("");
                            }
                            if (dow.equals("Saturday")) {

                                firstClassme.setText("------");
                                secondClassme.setText("------");
                                thirdClassme.setText("------");
                                fourthClassme.setText("------");
                                fifthClassme.setText("------");
                                courseName.setText("");
                                courseName.setText("It's Saturday !!!");
                            }
                            if (dow.equals("Sunday")) {

                                firstClassme.setText("------");
                                secondClassme.setText("------");
                                thirdClassme.setText("------");
                                fourthClassme.setText("------");
                                fifthClassme.setText("------");
                                courseName.setText("");
                                courseName.setText("It's Sunday !!!");
                            }
                        }

                    }

                    if (curmonth == 2 || curmonth == 3) {
                        if (curmonth == 2 && curdate >= 23 && curdate <= 31) {
                            if (dow.equals("Monday")) {

                                firstClassme.setText("------");
                                secondClassme.setText("------");
                                thirdClassme.setText(BO1010);
                                fourthClassme.setText(ID1931);
                                fifthClassme.setText(ID1931);

                                courseName.setText("");
                            }

                            if (dow.equals("Tuesday")) {

                                firstClassme.setText(BO1010);
                                secondClassme.setText(ID1140);
                                thirdClassme.setText("------");
                                fourthClassme.setText(ID1931);
                                fifthClassme.setText(ID1931);

                                courseName.setText("");
                            }

                            if (dow.equals("Wednesday")) {

                                firstClassme.setText(ID1140);
                                secondClassme.setText(MA1150);
                                thirdClassme.setText("CY1021");
                                fourthClassme.setText(ME1030);
                                fifthClassme.setText("------");
                                courseName.setText("CY1021 - " + CY1021);
                            }

                            if (dow.equals("Thursday")) {

                                firstClassme.setText(MA1150);
                                secondClassme.setText("CY1021");
                                thirdClassme.setText("------");
                                fourthClassme.setText(ME1030);
                                fifthClassme.setText("------");
                                courseName.setText("CY1021 - " + CY1021);
                            }

                            if (dow.equals("Friday")) {

                                firstClassme.setText("------");
                                secondClassme.setText("------");
                                thirdClassme.setText("------");
                                fourthClassme.setText("------");
                                fifthClassme.setText("------");
                                courseName.setText("");
                            }

                            if (dow.equals("Saturday")) {

                                firstClassme.setText("------");
                                secondClassme.setText("------");
                                thirdClassme.setText("------");
                                fourthClassme.setText("------");
                                fifthClassme.setText("------");
                                courseName.setText("");
                                courseName.setText("It's Saturday !!!");
                            }

                            if (dow.equals("Sunday")) {

                                firstClassme.setText("------");
                                secondClassme.setText("------");
                                thirdClassme.setText("------");
                                fourthClassme.setText("------");
                                fifthClassme.setText("------");
                                courseName.setText("");
                                courseName.setText("It's Sunday !!!");
                            }
                        }
                        if (curmonth == 3 && curdate <= 28) {
                            if (dow.equals("Monday")) {

                                firstClassme.setText("------");
                                secondClassme.setText("------");
                                thirdClassme.setText(BO1010);
                                fourthClassme.setText(ID1931);
                                fifthClassme.setText(ID1931);

                                courseName.setText("");
                            }

                            if (dow.equals("Tuesday")) {

                                firstClassme.setText(BO1010);
                                secondClassme.setText(ID1140);
                                thirdClassme.setText("------");
                                fourthClassme.setText(ID1931);
                                fifthClassme.setText(ID1931);

                                courseName.setText("");
                            }

                            if (dow.equals("Wednesday")) {

                                firstClassme.setText(ID1140);
                                secondClassme.setText(MA1150);
                                thirdClassme.setText("CY1021");
                                fourthClassme.setText(ME1030);
                                fifthClassme.setText("------");
                                courseName.setText("CY1021 - " + CY1021);
                            }

                            if (dow.equals("Thursday")) {

                                firstClassme.setText(MA1150);
                                secondClassme.setText("CY1021");
                                thirdClassme.setText("------");
                                fourthClassme.setText(ME1030);
                                fifthClassme.setText("------");
                                courseName.setText("CY1021 - " + CY1021);
                            }

                            if (dow.equals("Friday")) {

                                firstClassme.setText("------");
                                secondClassme.setText("------");
                                thirdClassme.setText("------");
                                fourthClassme.setText("------");
                                fifthClassme.setText("------");
                                courseName.setText("");
                            }

                            if (dow.equals("Saturday")) {

                                firstClassme.setText("------");
                                secondClassme.setText("------");
                                thirdClassme.setText("------");
                                fourthClassme.setText("------");
                                fifthClassme.setText("------");
                                courseName.setText("");
                                courseName.setText("It's Saturday !!!");
                            }

                            if (dow.equals("Sunday")) {

                                firstClassme.setText("------");
                                secondClassme.setText("------");
                                thirdClassme.setText("------");
                                fourthClassme.setText("------");
                                fifthClassme.setText("------");
                                courseName.setText("");
                                courseName.setText("It's Sunday !!!");
                            }
                        }
                    }
                } else {
                    if (segmentSelected.equals("1-2")) {

                        if (daySelected.equals("Monday")) {

                            firstClassme.setText("------");
                            secondClassme.setText("------");
                            thirdClassme.setText("------");
                            fourthClassme.setText(ID1921);
                            fifthClassme.setText(ID1921);

                            courseName.setText("");
                        } else if (daySelected.equals("Tuesday")) {

                            firstClassme.setText("------");
                            secondClassme.setText("------");
                            thirdClassme.setText("------");
                            fourthClassme.setText(ID1921);
                            fifthClassme.setText(ID1921);


                            courseName.setText("");
                        } else if (daySelected.equals("Wednesday")) {

                            firstClassme.setText("------");
                            secondClassme.setText(MA1130);
                            thirdClassme.setText("CY1020");
                            fourthClassme.setText(ID1160);
                            fifthClassme.setText("------");
                            courseName.setText("");
                            courseName.setText("CY1020 - " + CY1020);
                        } else if (daySelected.equals("Thursday"))

                        {

                            firstClassme.setText(MA1130);
                            secondClassme.setText("CY1020");
                            thirdClassme.setText("LA1260");
                            fourthClassme.setText(ID1160);
                            fifthClassme.setText("------");
                            courseName.setText("");
                            courseName.setText("CY1020 - " + CY1020 + "\nLA1260 - " + LA1260);
                        }


                        if (daySelected.equals("Friday")) {

                            firstClassme.setText("LA1260");
                            secondClassme.setText("------");
                            thirdClassme.setText("------");
                            fourthClassme.setText("------");
                            fifthClassme.setText("------");
                            courseName.setText("");
                            courseName.setText("LA1260 - " + LA1260);
                        }
                    }


                    if (segmentSelected.equals("3-4"))

                    {

                        if (daySelected.equals("Monday")) {

                            firstClassme.setText(LA1110);
                            secondClassme.setText(PH1027);
                            thirdClassme.setText("------");
                            fourthClassme.setText("ID1921" + "/" + "ID1931");
                            fifthClassme.setText("ID1921" + "/" + "ID1931");
                            courseName.setText("");
                            courseName.setText("ID1921 - " + ID1921 + "\nID1931 - " + ID1931);
                        }

                        if (daySelected.equals("Tuesday")) {

                            firstClassme.setText("------");
                            secondClassme.setText("------");
                            thirdClassme.setText(PH1027);
                            fourthClassme.setText("ID1921" + "/" + "ID1931");
                            fifthClassme.setText("ID1921" + "/" + "ID1931");

                            courseName.setText("");
                            courseName.setText("ID1921 - " + ID1921 + "\nID1931 - " + ID1931);
                        }

                        if (daySelected.equals("Wednesday")) {

                            firstClassme.setText("------");
                            secondClassme.setText(MA1140);
                            thirdClassme.setText("CY1021");
                            fourthClassme.setText("ID1160" + "/" + "ME1030");
                            fifthClassme.setText("------");
                            courseName.setText("");
                            courseName.setText("CY1021 - " + CY1021 + "\nID1160 - " + ID1160 + "\nME1030 - " + ME1030);
                        }

                        if (daySelected.equals("Thursday")) {

                            firstClassme.setText(MA1140);
                            secondClassme.setText("CY1021");
                            thirdClassme.setText(LA1050);
                            fourthClassme.setText("ID1160" + "/" + "ME1030");
                            fifthClassme.setText("------");
                            courseName.setText("");
                            courseName.setText("CY1021 - " + CY1021 + "\nID1160 - " + ID1160 + "\nME1030 - " + ME1030);
                        }

                        if (daySelected.equals("Friday")) {

                            firstClassme.setText(LA1050);
                            secondClassme.setText(LA1110);
                            thirdClassme.setText("------");
                            fourthClassme.setText("------");
                            fifthClassme.setText("------");
                            courseName.setText("");
                        }
                    }

                    if (segmentSelected.equals("5-6"))

                    {

                        if (daySelected.equals("Monday")) {

                            firstClassme.setText("------");
                            secondClassme.setText("------");
                            thirdClassme.setText(BO1010);
                            fourthClassme.setText(ID1931);
                            fifthClassme.setText(ID1931);

                            courseName.setText("");
                        }

                        if (daySelected.equals("Tuesday")) {

                            firstClassme.setText(BO1010);
                            secondClassme.setText(ID1140);
                            thirdClassme.setText("------");
                            fourthClassme.setText(ID1931);
                            fifthClassme.setText(ID1931);

                            courseName.setText("");
                        }

                        if (daySelected.equals("Wednesday")) {

                            firstClassme.setText(ID1140);
                            secondClassme.setText(MA1150);
                            thirdClassme.setText("CY1021");
                            fourthClassme.setText(ME1030);
                            fifthClassme.setText("------");
                            courseName.setText("");
                            courseName.setText("CY1021 - " + CY1021);
                        }

                        if (daySelected.equals("Thursday")) {

                            firstClassme.setText(MA1150);
                            secondClassme.setText("CY1021");
                            thirdClassme.setText("------");
                            fourthClassme.setText(ME1030);
                            fifthClassme.setText("------");
                            courseName.setText("");
                            courseName.setText("CY1021 - " + CY1021);
                        }

                        if (daySelected.equals("Friday")) {

                            firstClassme.setText("------");
                            secondClassme.setText("------");
                            thirdClassme.setText("------");
                            fourthClassme.setText("------");
                            fifthClassme.setText("------");
                            courseName.setText("");
                        }
                    }


                }
            }
        });


        return v;
    }


}
