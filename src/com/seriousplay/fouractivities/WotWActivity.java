package com.seriousplay.fouractivities;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebView;

public class WotWActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wotw);
		
		WebView myWebView = (WebView) findViewById(R.id.waroftheworldsView);
		myWebView.loadUrl("file:///android_asset/waroftheworlds.html");
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.wot_w, menu);
		return true;
	}

}
