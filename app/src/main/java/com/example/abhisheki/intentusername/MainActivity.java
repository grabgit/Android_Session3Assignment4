package com.example.abhisheki.intentusername;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final int SELECT_PHOTO = 100;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = (Button) findViewById(R.id.Login);
        btnLogin.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View v) {
        StartSecondActivityIfOK();
    }

    private void StartSecondActivityIfOK() {

        EditText txt = (EditText)findViewById(R.id.username);
        Intent  openNewActivity =  new Intent(getApplicationContext(), OnLoginActivity.class);
        Bundle dataBundle = new Bundle();
        dataBundle.putString( "BundleUserName", txt.getText().toString());
        Toast.makeText(this, txt.getText().toString(), Toast.LENGTH_SHORT).show();
        openNewActivity.putExtras(dataBundle);
        startActivity(openNewActivity);
    }
}
