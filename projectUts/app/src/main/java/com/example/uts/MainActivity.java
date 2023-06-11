package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnBiodata;
    private Intent moveIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnBiodata =
                findViewById(R.id.btn_about_me);
        btnBiodata.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_about_me) {
            Intent moveIntent = new
                    Intent(MainActivity.this, MainActivity2.class);
            startActivity(moveIntent);

        }
    }
}