package com.mydomain.dk.p0121_logs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView myTextView;
    Button Button1;
    Button Button2;
    Button Button3;

    private static final String TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "Найдем View-переменные");

        myTextView = (TextView) findViewById(R.id.myTextView);
        Button1 = (Button) findViewById(R.id.btn1);
        Button2 = (Button) findViewById(R.id.btn2);
        Button3 = (Button) findViewById(R.id.btn3);




        View.OnClickListener myOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                case R.id.btn1: myTextView.setText(R.string.text1);
                    Log.d(TAG, "Обработаем нажатие кнопки 1");
                    break;
                case R.id.btn2: myTextView.setText(R.string.text2);
                    Log.d(TAG, "Обработаем нажатие кнопки 2");
                    break;
                }
            }
        };

        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int i = 6/0;
                    myTextView.setText("Результат деления - " + i);
                } catch (Exception e) {
                    Log.d(TAG, "Делить на ноль нельзя!", e);
                }

            }
        });

        Button1.setOnClickListener(myOnClickListener);
        Button2.setOnClickListener(myOnClickListener);

    }

}
