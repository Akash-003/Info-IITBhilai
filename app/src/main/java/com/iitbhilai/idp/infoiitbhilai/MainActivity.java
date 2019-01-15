package com.iitbhilai.idp.infoiitbhilai;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    protected DrawerLayout drawer;
    GridView grid;
    String[] web = {
            "DEPARTMENTS",
            "STAFF AND FACULTY",
            "CALENDAR",
            "TIMETABLE",
            "FOOD",
            "CONTACTS",
            "NOTIFICATIONS",
            "DEVELOPED BY",



    };
    int[] imageId = {
            R.drawable.departments,
            R.drawable.staff,
            R.drawable.calendar,
            R.drawable.timetable,
            R.drawable.food,
            R.drawable.contacts,
            R.drawable.notifications,
            R.drawable.developer,



    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomGrid adapter = new CustomGrid(MainActivity.this, web, imageId);
        grid = (GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Log.v("MainActivity.java" , " " + position);

                if (position == 0) {
                    Intent i = new Intent(MainActivity.this, Dept.class);
                    startActivity(i);
                }

                if (position == 1) {
                    Intent i = new Intent(MainActivity.this, Staff.class);
                    startActivity(i);
                }

                if (position == 2) {
                    Intent i = new Intent(MainActivity.this, Calender.class);
                    startActivity(i);
                }

                if (position == 3) {
                    Intent i = new Intent(MainActivity.this, Timetable.class);
                    startActivity(i);
                }

                if (position == 4) {
                    Intent i = new Intent(MainActivity.this, Food.class);
                    startActivity(i);
                }

                if (position == 5) {
                    Intent i = new Intent(MainActivity.this, Contacts.class);
                    startActivity(i);
                }

                if (position == 6) {
                    Intent i = new Intent(MainActivity.this, Notification.class);
                    startActivity(i);
                }

                if (position == 7) {
                    Intent i = new Intent(MainActivity.this, Dev.class);
                    startActivity(i);
                }

            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","ee16b1001@iitbhilai.ac.in", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Feedback");
                startActivity(Intent.createChooser(emailIntent, "Send email..."));
            }
        });

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            // super.onBackPressed();
            moveTaskToBack(true);
            }
        }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_timetable) {
            Intent i= new Intent(MainActivity.this, Timetable.class);
            startActivity(i);

        }
        else if (id == R.id.nav_dept) {
            Intent i= new Intent(MainActivity.this, Dept.class);
            startActivity(i);

        }
        else if (id == R.id.nav_staff) {
            Intent i= new Intent(MainActivity.this, Staff.class);
            startActivity(i);

        }
        else if (id == R.id.nav_calender) {
            Intent i= new Intent(MainActivity.this, Calender.class);
            startActivity(i);

        }
        else if (id == R.id.nav_food) {
            Intent i= new Intent(MainActivity.this, Food.class);
            startActivity(i);

        }

        else if (id == R.id.nav_contacts) {
            Intent i= new Intent(MainActivity.this, Contacts.class);
            startActivity(i);

        }

        else if (id == R.id.nav_dev){
            Intent i= new Intent(MainActivity.this, Dev.class);
            startActivity(i);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
