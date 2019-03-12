package com.alexandremartin.tests;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private int multiplyBy = 8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int multiplyBy(int term) {
        return term * multiplyBy;
    }

    public double average(int i1, int i2, int i3) {
        return (i1 + i2 + i3) / 3;
    }
}
