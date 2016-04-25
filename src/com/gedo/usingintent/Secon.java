package com.gedo.usingintent;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Secon extends Activity {

	Button startSite;
	EditText siteUrl;
	
	
	public void start_Site(View view) {
		
		
		Intent site = new Intent(Intent.ACTION_VIEW);
		site.setData(Uri.parse("http://www.google.com"));
		startActivity(site);
		
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_secon);

		startSite = (Button) findViewById(R.id.btnstartsite);
		siteUrl = (EditText) findViewById(R.id.etUrl);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.secon, menu);
		return true;
	}

}
