package com.agileopenlima.test;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.result);
		Bundle extras = getIntent().getExtras();
		TextView txtResult = (TextView)findViewById(R.id.txtResult);
		txtResult.setText("El usuario es: " + extras.getString(LoginTestActivity.username));
	}
	
}
