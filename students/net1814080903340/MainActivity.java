package edu.hzuapps.net1814080903340activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(new EasySudu(this));
        setContentView(new MiddleSudu(this));
        setContentView(new HighSudu(this));

    }
}

