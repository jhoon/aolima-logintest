package com.agileopenlima.test;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.result);
		Bundle extras = getIntent().getExtras();
		TextView txtResult = (TextView)findViewById(R.id.txtResult);
		txtResult.setText("El usuario es: " + extras.getString(LoginTestActivity.username));
		TextView txtResult2 = (TextView)findViewById(R.id.txtResult);
		txtResult2.setText("El password es: " + extras.getString(LoginTestActivity.password));
	}
}
