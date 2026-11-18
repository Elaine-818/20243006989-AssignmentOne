package com.example.assignmentone;

import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openFacilities(View view) {
        Toast.makeText(this, "Facilities clicked", Toast.LENGTH_SHORT).show();
        openDetail(0);
    }

    public void openEvents(View view) {
        Toast.makeText(this, "Events clicked", Toast.LENGTH_SHORT).show();
        openDetail(1);
    }

    public void openClubs(View view) {
        Toast.makeText(this, "Clubs clicked", Toast.LENGTH_SHORT).show();
        openDetail(2);
    }

    public void openSupport(View view) {
        Toast.makeText(this, "Support clicked", Toast.LENGTH_SHORT).show();
        openDetail(3);
    }

    private void openDetail(int topicIndex) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_TOPIC, topicIndex);
        startActivity(intent);
    }

}
