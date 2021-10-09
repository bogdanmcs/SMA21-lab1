package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // button is clicked
    public void clicked(View view) {
        switch(view.getId())
        {
            case R.id.button:
                TextView textView = findViewById(R.id.textView);
                EditText editText = findViewById(R.id.editTextTextPersonName);

                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;

                String inputText = editText.getText().toString();

                // if no name -> do nothing
                if(inputText.isEmpty())
                {
                    CharSequence text = "Enter name";
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    textView.setText("");
                }
                else // pop-up
                {
                    String message = "Hello, " + editText.getText();

                    //
                    textView.setText(message);

                    //
                    new AlertDialog.Builder(MainActivity.this)
                            .setMessage(message)
                            .setPositiveButton("Hi", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    CharSequence text = "Hi!";
                                    Toast toast = Toast.makeText(context, text, duration);
                                    toast.show();
                                }
                            })
                            .setNegativeButton("Bye", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    CharSequence text = "Rude";
                                    Toast toast = Toast.makeText(context, text, duration);
                                    toast.show();
                                }
                            })
                            .show();

                }

                break;
        }
    }
}