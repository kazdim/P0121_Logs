package com.mydomain.dk.p0121_logs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

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

        myTextView = (TextView) findViewById(R.id.myTextView);
        Button1 = (Button) findViewById(R.id.btn1);
        Button2 = (Button) findViewById(R.id.btn2);
        Button3 = (Button) findViewById(R.id.btn3);


        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    myTextView.setText("Нажата кнопка 3");

                Toast toast = Toast.makeText(MainActivity.this, "Нажата кнопка 3", Toast.LENGTH_SHORT);
                toast.show();
                LinearLayout toastImage = (LinearLayout) toast.getView();
                ImageView ImageView = new ImageView(MainActivity.this);
                ImageView.setImageResource(R.drawable.ic_error_outline_black_36dp);
                toastImage.addView(ImageView, 0);
                toast.setGravity(Gravity.CENTER, 0, 0);
                }
        });


      //  Button1.setOnClickListener(myOnClickListener);
      //  Button2.setOnClickListener(myOnClickListener);

    }

}
