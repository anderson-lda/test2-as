package com.example.gittest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button botaoUm;
    private Button botaoDois;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoUm = findViewById(R.id.buttonOne);
        botaoDois = findViewById(R.id.buttonTwo);

        botaoUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Este é o botão 1",Toast.LENGTH_SHORT).show();
            }
        });

        botaoDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Este é o botão 2",Toast.LENGTH_SHORT).show();
            }
        });
    }

}