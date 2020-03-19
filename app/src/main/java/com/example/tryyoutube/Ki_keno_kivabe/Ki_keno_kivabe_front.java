package com.example.tryyoutube.Ki_keno_kivabe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.tryyoutube.R;

public class Ki_keno_kivabe_front extends AppCompatActivity {

    ImageView saraBisso , ojanaTottho;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ki_keno_kivabe_front);

        saraBisso = findViewById(R.id.play_sara_bisso);
        ojanaTottho = findViewById(R.id.play_ojana_tottho);

        saraBisso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Sara_Bisso_Activity.class));
            }
        });

        ojanaTottho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Ojana_Tottho.class));
            }
        });
    }
}
