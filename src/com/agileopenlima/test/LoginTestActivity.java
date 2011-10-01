package com.agileopenlima.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginTestActivity extends Activity {
    /** Called when the activity is first created. */
	public static final String username = "username";
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button btnLogin = (Button)findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent myIntent =new Intent(getApplicationContext(), ResultActivity.class);
				EditText txtUsername = (EditText)findViewById(R.id.txtUsername);
				myIntent.putExtra(username, txtUsername.getText());
				startActivity(myIntent);
			}
		});
    }
}