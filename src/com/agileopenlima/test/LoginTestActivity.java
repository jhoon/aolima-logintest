package com.agileopenlima.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class LoginTestActivity extends Activity {
	public static final String username = "username";
	public static final String password = "password";
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button btnLogin = (Button)findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent myIntent =new Intent(getApplicationContext(), ResultActivity.class);
				EditText txtUsername = (EditText)findViewById(R.id.txtUsername);
				EditText txtPassword = (EditText)findViewById(R.id.txtPassword);
				myIntent.putExtra(username, txtUsername.getText());
				myIntent.putExtra(password, txtPassword.getText());
				startActivity(myIntent);
			}
		});
    }
}