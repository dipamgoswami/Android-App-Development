package com.example.dipamgoswami.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        EditText editText= (EditText) findViewById(R.id.editText);
        String amt1 =editText.getText().toString();
        double amt1d = Double.parseDouble(amt1);
        double amt2d = amt1d * 1.3;
        String amt2 = String.format("%.2f",amt2d);
        Toast.makeText(this, amt1+" pounds is "+amt2+" dollars!", Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
