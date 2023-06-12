package com.example.passcoder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText f = (EditText) findViewById(R.id.editTextText);
                TextView res = (TextView) findViewById(R.id.displayResult);

                int range = Integer.parseInt(f.getText().toString());
                Random r = new Random();
                int rand_num = r.nextInt(range - 0) + 0;
                res.setText(rand_num + " ");

            }
        });



    }
}