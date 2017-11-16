package com.udacity.gradle.libandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowMessageActivity extends AppCompatActivity {

    public static final String TEXT_JOKE = "text.joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_message);

        if (getIntent() != null) {
            String joke = getIntent().getStringExtra(TEXT_JOKE);
            TextView jokeTextView = (TextView) findViewById(R.id.text_joke);
            jokeTextView.setText(joke);
        }
    }
}
