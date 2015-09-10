package com.example.ayoutubeplayer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class StandaloneActivity extends Activity implements View.OnClickListener {

	public static final String GOOGLE_API_KEY = "AIzaSyB4xh2zIJ5nUfytHeCb6huCQk-S_jvAHyo";

	public static final String YOUTUBE_VIDEO_ID = "rQqwG_rQx7A";
	public static final String YOUTUBE_PLAYLIST_ID = "PLXtTjtWmQhg3Mw13aL6ilXJEw6uX53ug1";

	private Button btnPlay;
	private Button btnPlayPlaylist;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.standalone);
		
		btnPlay = (Button) findViewById(R.id.btnStart);
		btnPlayPlaylist = (Button) findViewById(R.id.btnPlaylist);
		
		btnPlay.setOnClickListener(this);
		btnPlayPlaylist.setOnClickListener(this);
		
	}
	
	public void onClick(View v) {
		Intent intent = null;
		if(v == btnPlay) {
			// Play a single video
			intent = YouTubeStandalonePlayer.createVideoIntent(this, GOOGLE_API_KEY, YOUTUBE_VIDEO_ID);
		} else if(v == btnPlayPlaylist) {
			// Play the play list
			intent = YouTubeStandalonePlayer.createPlaylistIntent(this, GOOGLE_API_KEY, YOUTUBE_PLAYLIST_ID);
		}
		
		if(intent != null) {
			startActivity(intent);
		}
		
	}

}
