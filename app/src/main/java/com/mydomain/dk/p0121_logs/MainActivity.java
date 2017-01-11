package com.mydomain.dk.p0121_logs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {

    TextView myTextView;
    Button Btn1;
    Button Btn2;
    Button Btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextView = (TextView) findViewById(R.id.myTextView);
        Btn1 = (Button) findViewById(R.id.btn1);
        Btn2 = (Button) findViewById(R.id.btn2);
        Btn3 = (Button) findViewById(R.id.btn3);


        View.OnClickListener myOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                case R.id.btn1: myTextView.setText(R.string.text1);
                    break;
                case R.id.btn2: myTextView.setText(R.string.text2);
                    break;
                case R.id.btn3: myTextView.setText(R.string.text3);
                break;
                }
            }
        };

        Btn1.setOnClickListener(myOnClickListener);
        Btn2.setOnClickListener(myOnClickListener);
        Btn3.setOnClickListener(myOnClickListener);
    }

}
