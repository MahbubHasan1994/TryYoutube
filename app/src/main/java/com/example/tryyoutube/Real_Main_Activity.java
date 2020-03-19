package com.example.tryyoutube;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tryyoutube.Ki_keno_kivabe.Ki_keno_kivabe_front;

public class Real_Main_Activity extends AppCompatActivity {

    CardView liziqi,ki_keno_kivabe , kara_nate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real__main_);

        liziqi = findViewById(R.id.liziqi);
        ki_keno_kivabe = findViewById(R.id.ke_keno_kivabe);
        kara_nate = findViewById(R.id.kara_nate);

        liziqi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

        ki_keno_kivabe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Ki_keno_kivabe_front.class));
            }
        });
    }
}
