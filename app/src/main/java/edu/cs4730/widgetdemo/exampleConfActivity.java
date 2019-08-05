package edu.cs4730.widgetdemo;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

/*
 * This is the activity that sets up the configurations for the homescreen widget.
 */


public class exampleConfActivity extends AppCompatActivity {

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Intent resultValue = new Intent();
		setResult(RESULT_OK, resultValue);
		finish();
	}

}
