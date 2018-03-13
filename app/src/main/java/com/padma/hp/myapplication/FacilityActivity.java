package com.padma.hp.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class FacilityActivity extends AppCompatActivity {
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facility);

        b=(Button) findViewById(R.id.button1);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), DiabeticActivity.class);
                //intent.putExtra()
                startActivity(intent);
            }

        });



        b=(Button) findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), RadiologyActivity.class);
                //intent.putExtra()
                startActivity(intent);
            }

        });



        b=(Button) findViewById(R.id.button3);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), LaboratoryActivity.class);
                //intent.putExtra()
                startActivity(intent);
            }

        });



        b=(Button) findViewById(R.id.button4);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(),Op_theatreActivity.class);
                //intent.putExtra()
                startActivity(intent);
            }

        });



        b=(Button) findViewById(R.id.button5);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(),Blood_bankActivity.class);
                //intent.putExtra()
                startActivity(intent);
            }

        });
    }
}
