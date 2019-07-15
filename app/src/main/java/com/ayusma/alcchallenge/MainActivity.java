package com.ayusma.alcchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
  private Button btn_about_alc,btn_my_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_about_alc = findViewById(R.id.btn_about_alc);
        btn_my_profile = findViewById(R.id.btn_profile);

        btn_my_profile.setOnClickListener(this);
        btn_about_alc.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if(view == btn_my_profile){
            startActivity(new Intent(this, ProfileActivity.class));
        }if(view == btn_about_alc){
            startActivity(new Intent(this, AboutAlcActivity.class));
        }
    }
}
