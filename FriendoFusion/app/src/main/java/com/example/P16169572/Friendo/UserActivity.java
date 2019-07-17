package com.example.P16169572.Friendo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * {@link UserActivity} shows a list of Android platform releases.
 * For each release, display the name, version number, and image.
 */
public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        // Create an ArrayList of AndroidInterest objects
        final ArrayList<AndroidInterest> androidInterests = new ArrayList<AndroidInterest>();
        androidInterests.add(new AndroidInterest("Gym", "<10 Users Available>", R.drawable.gym));
        androidInterests.add(new AndroidInterest("Martial Arts", "<No users available>", R.drawable.martialarts));
        androidInterests.add(new AndroidInterest("Football", "<4 Users Available>", R.drawable.soccer));
        androidInterests.add(new AndroidInterest("Basketball", "<No users available>", R.drawable.basketball));
        androidInterests.add(new AndroidInterest("Yoga", "<No users available>", R.drawable.yoga));
        androidInterests.add(new AndroidInterest("Watching Sports", "<No users available>", R.drawable.watchingsports));
        androidInterests.add(new AndroidInterest("Movies", "<No users available>", R.drawable.movies));
        androidInterests.add(new AndroidInterest("Music", "<No users available>", R.drawable.music));
        androidInterests.add(new AndroidInterest("Photography", "<No users available>", R.drawable.photography));
        androidInterests.add(new AndroidInterest("Drawing and Painting", "<No users available>", R.drawable.art));
        androidInterests.add(new AndroidInterest("Cooking", "<No users available>", R.drawable.cooking));
        androidInterests.add(new AndroidInterest("Travelling", "<No users available>", R.drawable.travelling));
        androidInterests.add(new AndroidInterest("Gaming", "<No users available>", R.drawable.gaming));
        androidInterests.add(new AndroidInterest("Reading", "<No users available>", R.drawable.reading));
        androidInterests.add(new AndroidInterest("Writing", "<No users available>", R.drawable.writing));




        // Create an {@link AndroidInterestsAdapter}, whose data source is a list of
        // {@link AndroidInterest}s. The adapter knows how to create list item views for each item
        // in the list.
        AndroidInterestsAdapter flavorAdapter = new AndroidInterestsAdapter(this, androidInterests);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_interests);
        listView.setAdapter(flavorAdapter);


        // Click Listener for Array List
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position==0){
                    Intent appInfo = new Intent(UserActivity.this, AvailableUsersActivity.class);
                    startActivity(appInfo);
                }

                if (position==2){
                    Intent appInfo = new Intent(UserActivity.this, AvailableUsersActivity2.class);
                    startActivity(appInfo);
                }
            }


               // Toast.makeText(UserActivity.this, "you clicked" + fruitname, Toast.LENGTH_SHORT).show();
        });
    }

    boolean twice;
    @Override
    public void onBackPressed() {
        if (twice == true){
            Intent intent = new Intent(UserActivity.this, MainActivity.class);
            startActivity(intent);
        }
        //super.onBackPressed();
        Toast.makeText(UserActivity.this, "Please press BACK again to log-out", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                twice = false;
            }
        }, 2000);
        twice = true;
    }
}