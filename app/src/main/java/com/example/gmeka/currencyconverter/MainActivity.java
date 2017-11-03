package com.example.gmeka.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   public void convertButton(View view){

       TextView convert = (TextView) findViewById(R.id.convert);
       String number = convert.getText().toString();


       double conv = 0.834;
       double value =  Double.parseDouble(number);

      // double newNum = conv * value;

       double total = value * conv;


       Toast.makeText(MainActivity.this, "€"+ String.format("%.2f",total), Toast.LENGTH_SHORT).show();







       Log.i("pressed",number);

   }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
