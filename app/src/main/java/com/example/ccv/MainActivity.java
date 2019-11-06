package com.example.ccv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void home(View view) {
      setContentView(R.layout.activity_home);

    }


    public void ev(View view) {
        setContentView(R.layout.activity_eventos);

    }
    public void sports(View view) {
        setContentView(R.layout.activity_esportes);

    }
    public void dance(View view) {
        setContentView(R.layout.activity_dancas);


    }

    public void publica(View view) {
        setContentView(R.layout.activity_publicacoes);


    }
    public void tnvolun(View view) {
        setContentView(R.layout.activity_cadastravolun);


    }
}