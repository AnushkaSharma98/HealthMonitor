package com.example.pksharma.minor2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class MainActivity extends AppCompatActivity {


    Button detectBtn,enterBtn,graphBtn;
    String Disease;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Disease="Diabeties";

        graphBtn=findViewById(R.id.graphBtn);

        graphBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //To-do= paass disease in intent
                Intent intent=new Intent(getApplicationContext(),showGraph.class);
                intent.putExtra("Disease",Disease);
                //intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);



            }
        });




    }
}
