package com.example.letterrecognizer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView textView;
    EditText input;
    String textInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button)findViewById(R.id.btn);
        textView=(TextView) findViewById(R.id.result);
        input=(EditText) findViewById(R.id.input);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textInput=input.getText().toString();

                if(textInput.length()>1)
                {
                    textView.setText("Error: Please enter just single letter");
                }
                else
                {
                    if(textInput.equals("g") || textInput.equals("j")|| textInput.equals("p")||textInput.equals("q")||textInput.equals("y"))
                    {
                        textView.setText("it is Root Letter");
                    }
                    else if(textInput.equals("b")||textInput.equals("d")||textInput.equals("f")||textInput.equals("h")||textInput.equals("k")||textInput.equals("l")||textInput.equals("t"))
                    {
                        textView.setText(" It is Sky Letter");
                    }
                    else
                    {
                        textView.setText("It is Grass Letter");
                    }
                }
                input.setText("");
            }
        });
    }
}