 package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomnumber;

    public void makeToast(String string){

        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }

    public void clickFunction(View view){

        EditText a =(EditText)findViewById(R.id.editTextTextPersonName);



        int guessint=Integer.parseInt(a.getText().toString());

        if(guessint<randomnumber){

            makeToast ("Higher");
        }else if(guessint>randomnumber){
            makeToast("Lower");
        }else {

            makeToast("Right value!!");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        randomnumber= rand.nextInt(20);
    }
}