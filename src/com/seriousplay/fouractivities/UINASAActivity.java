package com.seriousplay.fouractivities;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class UINASAActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_uinasa);
		
		WebView myWebView = (WebView) findViewById(R.id.uinasaView);
		myWebView.loadUrl("file:///android_asset/uofi-at-nasa.html");
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.uinasa, menu);
		return true;
	}

}
