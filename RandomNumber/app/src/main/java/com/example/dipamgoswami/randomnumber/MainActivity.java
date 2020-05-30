package com.example.dipamgoswami.randomnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int r;

    public void generateRandomNumber(){
        Random rand = new Random();
        r= rand.nextInt(25) +1;
    }

    public void guess(View view){
        EditText editText=(EditText) findViewById(R.id.editText);
        int k= Integer.parseInt(editText.getText().toString());
        String msg;
        if(r==k){
            msg="You guessed right!   Try again!";
            generateRandomNumber();
        }
        else if(r<k){
         msg= "Look for a smaller number!";
        }
        else {
            msg="Look for a bigger number!";
        }
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateRandomNumber();
    }
}
