package com.example.android.cloudboost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import io.cloudboost.*;

public class MainActivity extends AppCompatActivity {

    private TextView boost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String appId = "krnwyugosdiv";
        final String clientId = "8a600c88-dddd-48f8-b70c-7f43db03ce31";

        CloudApp.init(appId,clientId);


    }
}
