package com.example.lifecycle.intents;

import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.lifecycle.R;

public class IntentFilterActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_filter);

        TextView textView = findViewById(R.id.textView);
        Uri url = getIntent().getData();
        textView.setText(url.toString());
    }
}
