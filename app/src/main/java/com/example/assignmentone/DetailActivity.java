package com.example.assignmentone;

import android.app.Activity;
import android.os.Bundle;


import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends Activity {
    static final String EXTRA_TOPIC = "com.example.assignmentone.TOPIC";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Resources resources = getResources();
        String[] titles = resources.getStringArray(R.array.string_array_titles);
        String[] content = resources.getStringArray(R.array.string_array_content);
        String[] images = resources.getStringArray(R.array.string_array_images);
        String[] sections = resources.getStringArray(R.array.section_names);
        int topic = getIntent().getIntExtra(EXTRA_TOPIC, 0);

        ((TextView) findViewById(R.id.detail_section)).setText(sections[topic]);
        ((TextView) findViewById(R.id.detail_title)).setText(titles[topic].trim());
        ((TextView) findViewById(R.id.detail_content)).setText(content[topic].trim());
        ImageView icon = findViewById(R.id.detail_icon);
        int iconId = resources.getIdentifier(images[topic].trim(), "drawable", getPackageName());
        icon.setImageResource(iconId);
    }
}
