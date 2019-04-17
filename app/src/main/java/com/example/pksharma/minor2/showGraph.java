package com.example.pksharma.minor2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class showGraph extends AppCompatActivity {
    TextView textView4;
    String Disease;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.graph);


        Intent i=getIntent();

        Disease=i.getStringExtra("Disease");


        textView4=findViewById(R.id.textView4);

        if(Disease =="Diabeties")
            textView4.setText("Insulin Level");
        else if(Disease =="Heart")
            textView4.setText("Blood Pressure");

        GraphView graph1 = (GraphView) findViewById(R.id.graph1);

       // graph1.setVisibility(graph1.VISIBLE);
        LineGraphSeries<DataPoint> series1= new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 3)
        });
        graph1.addSeries(series1);


        GraphView graph2 = (GraphView) findViewById(R.id.graph2);

        //graph2.setVisibility(graph2.VISIBLE);
        LineGraphSeries<DataPoint> series2 = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 3)
        });
        graph2.addSeries(series2);


    }
}
