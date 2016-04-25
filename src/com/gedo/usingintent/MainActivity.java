package com.gedo.usingintent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	Button startSecondActivity;

	
	
	// Method that start the activity 
	public void open_Activity(View view) {

		// New Intent 
		Intent start = new Intent(MainActivity.this, Secon.class);
		startActivity(start);

	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		startSecondActivity = (Button) findViewById(R.id.btnopen);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
