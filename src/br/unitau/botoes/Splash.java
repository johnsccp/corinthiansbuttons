package br.unitau.botoes;

import br.unitau.botoes.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.media.MediaPlayer;


public class Splash extends Activity implements Runnable {
MediaPlayer song;

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);

		Handler handler = new Handler();
		handler.postDelayed(this, 4000);
		
		   song = MediaPlayer.create(Splash.this, R.raw.vinheta);
	        song.start();
	}

	  @Override
	    protected void onPause() {
	        // TODO Auto-generated method stub
	        super.onPause();
	        song.release();
	        finish();
	    }
	
	public void run(){
		startActivity(new Intent(this, MenuInicial.class));
		finish();
	}
}