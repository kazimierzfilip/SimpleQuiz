package com.example.student.myquiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ZgadnijKtoTo extends AppCompatActivity {

    private RadioGroup radioGroup1;
    private RadioGroup radioGroup2;
    private RadioGroup radioGroup3;
    private RadioGroup radioGroup4;
    private RadioGroup radioGroup5;
    private Button checkButton;
    private int points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zgadnij_kto_to);
        radioGroup1 = findViewById(R.id.radio_group1);
        radioGroup2 = findViewById(R.id.radio_group2);
        radioGroup3 = findViewById(R.id.radio_group3);
        radioGroup4 = findViewById(R.id.radio_group4);
        radioGroup5 = findViewById(R.id.radio_group5);
        checkButton = findViewById(R.id.check_button);
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                points = 0;
                if(radioGroup1.getCheckedRadioButtonId() == R.id.radio1_1)
                    points+=1;
                if(radioGroup2.getCheckedRadioButtonId() == R.id.radio2_1)
                    points+=1;
                if(radioGroup3.getCheckedRadioButtonId() == R.id.radio3_1)
                    points+=1;
                if(radioGroup4.getCheckedRadioButtonId() == R.id.radio4_2)
                    points+=1;
                if(radioGroup5.getCheckedRadioButtonId() == R.id.radio5_1)
                    points+=1;
                Context context = ZgadnijKtoTo.this;
                Toast.makeText(context,"Punkty: "+points,Toast.LENGTH_SHORT).show();
            }
        });

    }
}
