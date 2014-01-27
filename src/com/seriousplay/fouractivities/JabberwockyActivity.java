package com.seriousplay.fouractivities;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;

public class JabberwockyActivity extends Activity {

	WebView myWebView;
	MediaPlayer jabbermusic;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jabberwocky);

		myWebView = (WebView) findViewById(R.id.jabberwockyView);
		myWebView.loadUrl("file:///android_asset/jabberwocky.html");

		myWebView.getSettings().setBuiltInZoomControls(true);
		myWebView.canGoBack();
	}

	public void getWikipediaInfo(View v) {
		// Open external browser with wikipedia page for Jabberwocky
		String jabberUrl = "http://en.wikipedia.org/wiki/Jabberwocky"; 
		Intent jabberwiki = new Intent(Intent.ACTION_VIEW, Uri.parse(jabberUrl));

		startActivity(jabberwiki);
	}

	@Override
	protected void onResume() {
		// Reference the jabber music - jabbermusic = MediaPlayer.create(this, R.id.)
		jabbermusic = MediaPlayer.create(this, R.raw.jabberhorror);
		jabbermusic.start();
		super.onResume();
	}
	
	@Override
	protected void onPause() {
		jabbermusic.stop();
		jabbermusic.release();
		super.onPause();
	}
	
	public void showJabberwocky(View v) {
		myWebView.loadUrl("file:///android_asset/Jabberwocky.png");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.jabberwocky, menu);
		return true;
	}
}
