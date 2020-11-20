package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int myCountValue = 0;
    int myc = myCountValue ;


    TextView tiT,countId;
    Button BtPlus,BtMinus,txId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtMinus = findViewById(R.id.BtMinus);
        BtPlus = findViewById(R.id.BtPlus);
        tiT = findViewById(R.id.tiT);
        txId = findViewById(R.id.txId);
        countId = findViewById(R.id.countId);



        BtPlus.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){

                myCountValue = myCountValue + 1;
                countId.setText(myCountValue + "");
                myc =myCountValue ;


            }
        });

        BtMinus.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                if (myCountValue != 0) {
                    myCountValue = myCountValue - 1;
                    countId.setText(myCountValue + "");
                    myc =myCountValue ;

                }
            }
        });
        myc =myCountValue ;



        txId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myCountValue = 0;
                countId.setText(myCountValue + "");
                Toast.makeText(MainActivity.this, "lastcount  "+ myc, Toast.LENGTH_SHORT).show();



            }

        });



    }
}