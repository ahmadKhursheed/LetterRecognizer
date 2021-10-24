package com.example.letterrecognizer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    EditText edit;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.btn);
        textView=(TextView) findViewById(R.id.result);
        edit=(EditText) findViewById(R.id.input);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text=edit.getText().toString();

                if(text.length()>1)
                {
                    textView.setText("Error: Please enter just single letter");
                }
                else
                {
                    if(text.equals("g") || text.equals("j")|| text.equals("p")||text.equals("q")||text.equals("y"))
                    {
                        textView.setText("Root Letter");
                    }
                    else if(text.equals("b")||text.equals("d")||text.equals("f")||text.equals("h")||text.equals("k")||text.equals("l")||text.equals("t"))
                    {
                        textView.setText("Sky Letter");
                    }
                    else
                    {
                        textView.setText("Grass letter");
                    }
                }
                edit.setText("");
            }
        });
    }
}