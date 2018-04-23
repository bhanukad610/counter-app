package com.example.bhanukadissanayake.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int count = 0;
    Button b1;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 =  (Button)findViewById(R.id.buttonAdd);
        b2 =  (Button)findViewById(R.id.buttonMin);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }


    @Override
    public void onClick(View v){
        TextView t1 = (TextView)findViewById(R.id.display);
        if (v == b1) {
            if (count == 30) {
                count = 0;
            } else {
                count++;
            }
            t1.setText(Integer.toString(count));
        }

        if (v == b2) {
            if(count == 0){
                count = 0;
            }
            else {
                count--;
            }
            t1.setText(Integer.toString(count));
        }


    }

}
