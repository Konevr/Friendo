package com.example.P16169572.Friendo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class AvailableUsersActivity extends AppCompatActivity {

    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_availableusers);
        ListView ListV = (ListView) findViewById(R.id.listViewUsers);
        ArrayList<String> arrayJobs = new ArrayList<>();
        arrayJobs.addAll(Arrays.asList(getResources().getStringArray(R.array.array_users)));

        adapter = new ArrayAdapter<>(AvailableUsersActivity.this, android.R.layout.simple_list_item_1, arrayJobs);
        ListV.setAdapter(adapter);
        ListV.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    String[] recipients = {"wanda.lawrence@uni.ac.uk"};
                    intent.putExtra(Intent.EXTRA_EMAIL, recipients);
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Gym Hangout");
                    intent.setType("text/html");
                    intent.setPackage("com.google.android.gm");
                    startActivity(Intent.createChooser(intent, "Send mail"));

                }
                if (position == 1) {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    String[] recipients = {"joan.baker@uni.ac.uk"};
                    intent.putExtra(Intent.EXTRA_EMAIL, recipients);
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Gym Hangout");
                    intent.setType("text/html");
                    intent.setPackage("com.google.android.gm");
                    startActivity(Intent.createChooser(intent, "Send mail"));
                }
                if (position == 2) {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    String[] recipients = {"stewart.watson@uni.ac.uk"};
                    intent.putExtra(Intent.EXTRA_EMAIL, recipients);
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Gym Hangout");
                    intent.setType("text/html");
                    intent.setPackage("com.google.android.gm");
                    startActivity(Intent.createChooser(intent, "Send mail"));
                }
                if (position == 3) {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    String[] recipients = {"alexander.hamilton@uni.ac.uk"};
                    intent.putExtra(Intent.EXTRA_EMAIL, recipients);
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Gym Hangout");
                    intent.setType("text/html");
                    intent.setPackage("com.google.android.gm");
                    startActivity(Intent.createChooser(intent, "Send mail"));
                }
                if (position == 4) {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    String[] recipients = {"amy.glover@uni.ac.uk"};
                    intent.putExtra(Intent.EXTRA_EMAIL, recipients);
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Gym Hangout");
                    intent.setType("text/html");
                    intent.setPackage("com.google.android.gm");
                    startActivity(Intent.createChooser(intent, "Send mail"));
                }
                if (position == 5) {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    String[] recipients = {"austin.mackay@uni.ac.uk"};
                    intent.putExtra(Intent.EXTRA_EMAIL, recipients);
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Gym Hangout");
                    intent.setType("text/html");
                    intent.setPackage("com.google.android.gm");
                    startActivity(Intent.createChooser(intent, "Send mail"));
                }
                if (position == 6) {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    String[] recipients = {"sam.lewis@uni.ac.uk"};
                    intent.putExtra(Intent.EXTRA_EMAIL, recipients);
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Gym Hangout");
                    intent.setType("text/html");
                    intent.setPackage("com.google.android.gm");
                    startActivity(Intent.createChooser(intent, "Send mail"));
                }
                if (position == 7) {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    String[] recipients = {"elizabeth.grant@uni.ac.uk"};
                    intent.putExtra(Intent.EXTRA_EMAIL, recipients);
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Gym Hangout");
                    intent.setType("text/html");
                    intent.setPackage("com.google.android.gm");
                    startActivity(Intent.createChooser(intent, "Send mail"));
                }
                if (position == 8) {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    String[] recipients = {"john.ince@uni.ac.uk"};
                    intent.putExtra(Intent.EXTRA_EMAIL, recipients);
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Gym Hangout");
                    intent.setType("text/html");
                    intent.setPackage("com.google.android.gm");
                    startActivity(Intent.createChooser(intent, "Send mail"));
                }
                if (position == 9) {
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    String[] recipients = {"jacob.manning@uni.ac.uk"};
                    intent.putExtra(Intent.EXTRA_EMAIL, recipients);
                    intent.putExtra(Intent.EXTRA_SUBJECT, "Gym Hangout");
                    intent.setType("text/html");
                    intent.setPackage("com.google.android.gm");
                    startActivity(Intent.createChooser(intent, "Send mail"));
                }
            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_search, menu);
        MenuItem item = menu.findItem(R.id.userSearch);
        SearchView searchView = (SearchView) item.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);

                return false;
            }
        });


        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.userLogout:
                finish();
                Intent intent = new Intent(AvailableUsersActivity.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(AvailableUsersActivity.this, "You have been Logged-out", Toast.LENGTH_LONG).show();
                break;
        }
        return true;
    }

}