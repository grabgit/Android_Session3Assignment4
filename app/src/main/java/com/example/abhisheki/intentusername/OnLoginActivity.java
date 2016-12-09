package com.example.abhisheki.intentusername;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OnLoginActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_login);
        Intent intent = getIntent();
        Bundle data = intent.getExtras();
        String value;
        if (data != null) {
            value = data.getString("BundleUserName");
            TextView txt = (TextView)findViewById(R.id.txtWelcome);
            txt.setText("Welcome " + value);

        }
    }


}
