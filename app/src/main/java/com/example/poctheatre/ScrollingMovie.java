package com.example.poctheatre;

import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ScrollingMovie extends AppCompatActivity {
    private TextView txt;
    private String celsius;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling_movie);

        final EditText edt = (EditText)findViewById(R.id.value_to_convert);
        Button btn = (Button)findViewById(R.id.convert);
        txt = (TextView)findViewById(R.id.answer);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(edt.length()>0) {
                    getCelsius(edt.getText().toString());
                }
                else{
                    txt.setText("Fahrenheit value cannot be empty");
                }
            }

        });

    }
}