package com.example.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityC extends AppCompatActivity {
    private static final String TAG = "ActivityC";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        setTitle("C");
        Log.d(TAG, "onCreate C");
    }

    protected void onResume(){
        super.onResume();
        Log.d(ActivityC.TAG, "onResume C");
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
