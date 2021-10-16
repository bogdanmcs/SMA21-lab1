package com.example.lifecycle.intents;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import com.example.lifecycle.R;

public class MainIntentActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicked(View view){
        switch(view.getId()){
            case R.id.buttonA:
                startActivity(
                        new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("http://www.google.com")
                        )
                );
                break;

            case R.id.buttonB:
                startActivity(
                        new Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("tel:00401213456")
                        )
                );
                break;

            case R.id.buttonC:
                startActivity(
                        new Intent(
                                "MSA.LAUNCH",
                                Uri.parse("http://www.google.com")
                        )
                );
                break;

            case R.id.buttonD:
                startActivity(
                        new Intent(
                                "MSA.LAUNCH",
                                Uri.parse("tel:00401213456")
                        )
                );
                break;
        }
    }
}
