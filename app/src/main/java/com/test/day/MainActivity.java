package com.test.day;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        new Thread(new Runnable() {
            @Override
            public void run() {
                TextView tv = findViewById(R.id.tv);
                tv.setText("aaaa");
                System.out.println("线程name: "+Thread.currentThread().getName());
            }
        }).start();
    }
}
