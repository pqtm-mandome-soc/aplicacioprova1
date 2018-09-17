package com.soc.uoc.pqtm.aplicacioprova1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;
    ImageView imageView;

    Integer comptador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView_activity_main);
        button = findViewById(R.id.button_activity_main);
        imageView = findViewById(R.id.imageView_activity_main);

        textView.setText(String.valueOf(comptador));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comptador += 1;
                textView.setText(String.valueOf(comptador));
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comptador -= 1;
                textView.setText(String.valueOf(comptador));
            }
        });

    }
}
