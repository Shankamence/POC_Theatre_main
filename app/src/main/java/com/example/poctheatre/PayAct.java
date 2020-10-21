package com.example.poctheatre;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class PayAct extends AppCompatActivity {

    private TextView mTextViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       Button btn1 = (Button) findViewById(R.id.button1);
        Button btn2 = (Button) findViewById(R.id.button2);

       btn1.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            mTextViewResult = findViewById(R.id.text_view_result);

            OkHttpClient client = new OkHttpClient();

            String url = "https://reqres.in/api/users?page=2";

            Request request = new Request.Builder()
                    .url(url)
                    .build();
            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {
                    e.printStackTrace();
                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    if(response.isSuccessful()){
                        final String myresponse = response.body().string();

                        PayAct.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                mTextViewResult.setText(myresponse);
                            }
                        });
                    }
                }
            });

        }

       });

        btn2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(PayAct.this, MainActivity.class);
                startActivity(intent);
            }


        });




    }
}