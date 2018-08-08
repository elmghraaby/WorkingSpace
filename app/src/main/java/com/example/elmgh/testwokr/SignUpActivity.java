package com.example.elmgh.testwokr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void SignUp1(View view) {

        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void Login1(View view) {

        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

}
