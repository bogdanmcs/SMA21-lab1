package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ActivityA extends AppCompatActivity {
    private static final String TAG = "ActivityA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        setTitle("A");
        Log.d(TAG, "onCreate A");
    }

    protected void onResume(){
        super.onResume();
        Log.d(ActivityA.TAG, "onResume A");
    }

    public void clicked(View view){
        switch(view.getId()){
            case R.id.buttonA:
                startActivity(new Intent(this, ActivityA.class));
                break;
            case R.id.buttonB:
                startActivity(new Intent(this, ActivityB.class));
                break;
            case R.id.buttonC:
                startActivity(new Intent(this, ActivityC.class));
                break;
        }
    }
}