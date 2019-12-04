package com.example.user.snowtam;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.r0adkll.slidr.Slidr;

public class Activity2 extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        //setTitle("Activity 2");

        Intent intent = getIntent();
        String aireport = intent.getStringExtra("airport");
        int dateAndTime = intent.getIntExtra("dateAndTime", 0);
        int runway = intent.getIntExtra("runway", 0);

        TextView Ai= findViewById(R.id.text_view1);
        TextView DT= findViewById(R.id.text_view2);
        TextView RN= findViewById(R.id.text_view3);

        Ai.setText(" "+aireport);
        DT.setText(" "+dateAndTime);
        RN.setText(" "+runway);

        Slidr.attach(this);

        button = (Button) findViewById(R.id.button_maps);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentmaps = new Intent(Activity2.this, Activity3.class);
                startActivity(intentmaps);
            }
        });
    }
}
