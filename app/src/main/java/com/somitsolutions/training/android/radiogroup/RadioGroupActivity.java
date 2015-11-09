package com.somitsolutions.training.android.radiogroup;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import android.widget.TextView;

public class RadioGroupActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		final TextView tv = (TextView) findViewById(R.id.textView);
		final RadioButton choice1Red = (RadioButton) findViewById(R.id.choice1);
		final RadioButton choice2Green = (RadioButton) findViewById(R.id.choice2);
		final RadioButton choice3Blue = (RadioButton) findViewById(R.id.choice3);
		// Define a generic listener for all three RadioButtons in the RadioGroup
		final OnClickListener radioListener = new OnClickListener() {
			@Override
			public void onClick(View v) {
				RadioButton rb = (RadioButton) v;
				tv.setText(rb.getText() + " chosen");

				if(v.equals(choice1Red)){
					v.getRootView().setBackgroundColor(Color.RED);
				}
				if(v.equals(choice2Green)){
					v.getRootView().setBackgroundColor(Color.GREEN);
				}
				if(v.equals(choice3Blue)){
					v.getRootView().setBackgroundColor(Color.BLUE);
				}
			}
		};

		// Called when RadioButton choice1 is clicked
		choice1Red.setOnClickListener(radioListener);

		// Called when RadioButton choice2 is clicked
		choice2Green.setOnClickListener(radioListener);

		// Called when RadioButton choice3 is clicked
		choice3Blue.setOnClickListener(radioListener);

	}
}