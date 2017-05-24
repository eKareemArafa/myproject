package com.example.hp.opencvdemo_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import org.opencv.android.OpenCVLoader;
public class MainActivity extends AppCompatActivity {
private static final String Tag ="main activity";
    static {
        if (!OpenCVLoader.initDebug()){
            Log.d(Tag, "failed to open");
        }
        else
            Log.d(Tag, "sucessful opening !! ");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
