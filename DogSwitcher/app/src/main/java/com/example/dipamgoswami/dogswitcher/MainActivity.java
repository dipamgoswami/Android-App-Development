package com.example.dipamgoswami.dogswitcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public static String tag="";
    public static String msg="";
    public void SwitchDog(View view)
    {
        Log.i(tag="info", msg="Button Pressed!");
        ImageView image=(ImageView) findViewById(R.id.imageView);
        image.setImageResource(R.drawable.dog2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
