package br.unitau.botoes;

import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Botoes extends MenuInicial  {

	MediaPlayer mediaPlayer;
	MediaPlayer mediaPlayer2;
	MediaPlayer mediaPlayer3;
	MediaPlayer mediaPlayer4;
	MediaPlayer mediaPlayer5;
	MediaPlayer mediaPlayer6;
	MediaPlayer mediaPlayer7;
	MediaPlayer mediaPlayer8;
	MediaPlayer mediaPlayer9;
	MediaPlayer mediaPlayer10;
	MediaPlayer mediaPlayer11;
	MediaPlayer mediaPlayer12;
	ImageView buttonPlayPause;
	ImageView buttonPlayPause2;
	ImageView buttonPlayPause3;
	ImageView buttonPlayPause4;
	ImageView buttonPlayPause5;
	ImageView buttonPlayPause6;
	ImageView buttonPlayPause7;
	ImageView buttonPlayPause8;
	ImageView buttonPlayPause9;
	ImageView buttonPlayPause10;
	ImageView buttonPlayPause11;
	ImageView buttonPlayPause12;
	
	
		
	private int stateMediaPlayer;
	private final int stateMP_NotStarter = 0;
	
	private int stateMediaPlayer2;
	private final int stateMP_NotStarter2 = 1;

	private int stateMediaPlayer3;
	private final int stateMP_NotStarter3 = 2;
	
	private int stateMediaPlayer4;
	private final int stateMP_NotStarter4 = 3;
	
	private int stateMediaPlayer5;
	private final int stateMP_NotStarter5 = 4;
	
	private int stateMediaPlayer6;
	private final int stateMP_NotStarter6 = 5;
	
	private int stateMediaPlayer7;
	private final int stateMP_NotStarter7 = 6;
	
	private int stateMediaPlayer8;
	private final int stateMP_NotStarter8 = 7;
	
	private int stateMediaPlayer9;
	private final int stateMP_NotStarter9 = 8;
	
	private int stateMediaPlayer10;
	private final int stateMP_NotStarter10 = 9;
	
	private int stateMediaPlayer11;
	private final int stateMP_NotStarter11 = 10;
	
	private int stateMediaPlayer12;
	private final int stateMP_NotStarter12 = 11;
	
		
	public void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);
	      setContentView(R.layout.botoes);
	      
	      setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); 

	      buttonPlayPause = (ImageView)findViewById(R.id.iB1);
	      buttonPlayPause.setOnClickListener(buttonPlayPauseOnClickListener);
	      initMediaPlayer();
	      
	      buttonPlayPause2 = (ImageView)findViewById(R.id.iB2);
	      buttonPlayPause2.setOnClickListener(buttonPlayPause2OnClickListener);
	      initMediaPlayer2();
	      
	      buttonPlayPause3 = (ImageView)findViewById(R.id.iB3);
	      buttonPlayPause3.setOnClickListener(buttonPlayPause3OnClickListener);
	      initMediaPlayer3();
	      
	      buttonPlayPause4 = (ImageView)findViewById(R.id.iB4);
	      buttonPlayPause4.setOnClickListener(buttonPlayPause4OnClickListener);
	      initMediaPlayer4();
	      
	      buttonPlayPause5 = (ImageView)findViewById(R.id.iB5);
	      buttonPlayPause5.setOnClickListener(buttonPlayPause5OnClickListener);
	      initMediaPlayer5();
	     
	      buttonPlayPause6 = (ImageView)findViewById(R.id.iB6);
	      buttonPlayPause6.setOnClickListener(buttonPlayPause6OnClickListener);
	      initMediaPlayer6();
	
	      buttonPlayPause7 = (ImageView)findViewById(R.id.iB7);
	      buttonPlayPause7.setOnClickListener(buttonPlayPause7OnClickListener);
	      initMediaPlayer7();
	      

	      buttonPlayPause8 = (ImageView)findViewById(R.id.iB8);
	      buttonPlayPause8.setOnClickListener(buttonPlayPause8OnClickListener);
	      initMediaPlayer8();
	      
	      buttonPlayPause9 = (ImageView)findViewById(R.id.iB9);
	      buttonPlayPause9.setOnClickListener(buttonPlayPause9OnClickListener);
	      initMediaPlayer9();
	      
	      buttonPlayPause10 = (ImageView)findViewById(R.id.iB10);
	      buttonPlayPause10.setOnClickListener(buttonPlayPause10OnClickListener);
	      initMediaPlayer10();
	      
	      buttonPlayPause11 = (ImageView)findViewById(R.id.iB11);
	      buttonPlayPause11.setOnClickListener(buttonPlayPause11OnClickListener);
	      initMediaPlayer11();
	      
	      buttonPlayPause12 = (ImageView)findViewById(R.id.iB12);
	      buttonPlayPause12.setOnClickListener(buttonPlayPause12OnClickListener);
	      initMediaPlayer12();
	}
	
	
	
	private void initMediaPlayer()
	{
	  mediaPlayer = new  MediaPlayer();
      mediaPlayer = MediaPlayer.create(Botoes.this, R.raw.hino);
      stateMediaPlayer = stateMP_NotStarter;
	}
	private void initMediaPlayer2()
	{
 	  mediaPlayer2 = new  MediaPlayer();
      mediaPlayer2 = MediaPlayer.create(Botoes.this, R.raw.vaisccp);
      stateMediaPlayer2 = stateMP_NotStarter2;
	}	
	private void initMediaPlayer3()
	{
 	  mediaPlayer3 = new  MediaPlayer();
      mediaPlayer3 = MediaPlayer.create(Botoes.this, R.raw.bando);
      stateMediaPlayer3 = stateMP_NotStarter3;
	}	
	private void initMediaPlayer4()
	{
		mediaPlayer4 = new MediaPlayer();
		mediaPlayer4 = MediaPlayer.create(Botoes.this, R.raw.samba95);
		stateMediaPlayer4 = stateMP_NotStarter4;
	}
	private void initMediaPlayer5()
	{
		mediaPlayer5 = new MediaPlayer();
		mediaPlayer5 = MediaPlayer.create(Botoes.this, R.raw.falamuito);
		stateMediaPlayer5 = stateMP_NotStarter5;
	}
	private void initMediaPlayer6()
	{
		mediaPlayer6 = new MediaPlayer();
		mediaPlayer6 = MediaPlayer.create(Botoes.this, R.raw.festafavela);
		stateMediaPlayer6 = stateMP_NotStarter6;
	}
	private void initMediaPlayer7()
	{
		mediaPlayer7 = new MediaPlayer();
		mediaPlayer7 = MediaPlayer.create(Botoes.this, R.raw.oleole);
		stateMediaPlayer7 = stateMP_NotStarter7;
	}
	private void initMediaPlayer8()
	{
		mediaPlayer8 = new MediaPlayer();
		mediaPlayer8 = MediaPlayer.create(Botoes.this, R.raw.romarinho);
		stateMediaPlayer8 = stateMP_NotStarter8;
	}
	private void initMediaPlayer9()
	{
		mediaPlayer9 = new MediaPlayer();
		mediaPlayer9 = MediaPlayer.create(Botoes.this, R.raw.vinheta);
		stateMediaPlayer9 = stateMP_NotStarter9;
	}
	private void initMediaPlayer10()
	{
		mediaPlayer10 = new MediaPlayer();
		mediaPlayer10 = MediaPlayer.create(Botoes.this, R.raw.poderoso);
		stateMediaPlayer10 = stateMP_NotStarter10;
	}
	private void initMediaPlayer11()
	{
		mediaPlayer11 = new MediaPlayer();
		mediaPlayer11 = MediaPlayer.create(Botoes.this, R.raw.radio);
		stateMediaPlayer11 = stateMP_NotStarter11;
	}
	private void initMediaPlayer12()
	{
		mediaPlayer12 = new MediaPlayer();
		mediaPlayer12 = MediaPlayer.create(Botoes.this, R.raw.cassio);
		stateMediaPlayer12 = stateMP_NotStarter12;
	}
	
	Button.OnClickListener buttonPlayPauseOnClickListener = new Button.OnClickListener(){

		@Override
		public void onClick(View v) {
if(stateMediaPlayer2 > 0){
	mediaPlayer2.stop();
	  mediaPlayer2.release();
	  stateMediaPlayer2 = 0;
}else if(stateMediaPlayer3 > 0){
	mediaPlayer3.stop();
	  mediaPlayer3.release();
	  stateMediaPlayer3 = 0;
}else if(stateMediaPlayer4 > 0){
	mediaPlayer4.stop();
	  mediaPlayer4.release();
	  stateMediaPlayer4 = 0;
}else if(stateMediaPlayer5 > 0){
		mediaPlayer5.stop();
		  mediaPlayer5.release();
		  stateMediaPlayer5 = 0;
	}else if(stateMediaPlayer6 > 0){
			mediaPlayer6.stop();
			  mediaPlayer6.release();
			  stateMediaPlayer6 = 0;
		}else if(stateMediaPlayer7 > 0){
				mediaPlayer7.stop();
				  mediaPlayer7.release();
				  stateMediaPlayer7 = 0;
			}else if(stateMediaPlayer8 > 0){
					mediaPlayer8.stop();
				  mediaPlayer8.release();
				  stateMediaPlayer8 = 0;
			}else if(stateMediaPlayer9 > 0){
					mediaPlayer9.stop();
					  mediaPlayer9.release();
					  stateMediaPlayer9 = 0;
				}else if(stateMediaPlayer10 > 0){
					mediaPlayer10.stop();
					  mediaPlayer10.release();
					  stateMediaPlayer10 = 0;
				}else if(stateMediaPlayer11 > 0){
					mediaPlayer11.stop();
					  mediaPlayer11.release();
					  stateMediaPlayer11 = 0;
				}else if(stateMediaPlayer12 > 0){
					mediaPlayer12.stop();
					  mediaPlayer12.release();
					  stateMediaPlayer12 = 0;
				}
if (stateMediaPlayer == 0) {
				Log.v("Inside if", "Success" + "");
				mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.hino);
				mediaPlayer.start();
				stateMediaPlayer++;
				
			} else {
				Log.v("Inside else", "Success" + "");
				mediaPlayer.stop();
				mediaPlayer.release();
				stateMediaPlayer = 0;
			}
		}
	};
	
	Button.OnClickListener buttonPlayPause2OnClickListener = new Button.OnClickListener(){

		@Override
		public void onClick(View v) {
			
			if(stateMediaPlayer > 0){
				mediaPlayer.stop();
				  mediaPlayer.release();
				  stateMediaPlayer = 0;
			}else if(stateMediaPlayer3 > 0){
				mediaPlayer3.stop();
				  mediaPlayer3.release();
				  stateMediaPlayer3 = 0;
			}else if(stateMediaPlayer4 > 0){
				mediaPlayer4.stop();
				  mediaPlayer4.release();
				  stateMediaPlayer4 = 0;
			}else if(stateMediaPlayer5 > 0){
					mediaPlayer5.stop();
					  mediaPlayer5.release();
					  stateMediaPlayer5 = 0;
				}else if(stateMediaPlayer6 > 0){
 					mediaPlayer6.stop();
					  mediaPlayer6.release();
					  stateMediaPlayer6 = 0;
				}else if(stateMediaPlayer7 > 0){
 					mediaPlayer7.stop();
					  mediaPlayer7.release();
					  stateMediaPlayer7 = 0;
				}else if(stateMediaPlayer8 > 0){
	 					mediaPlayer8.stop();
					  mediaPlayer8.release();
					  stateMediaPlayer8 = 0;
				}else if(stateMediaPlayer9 > 0){
 					mediaPlayer9.stop();
					  mediaPlayer9.release();
					  stateMediaPlayer9 = 0;
				}else if(stateMediaPlayer10 > 0){
					mediaPlayer10.stop();
					  mediaPlayer10.release();
					  stateMediaPlayer10 = 0;
				}else if(stateMediaPlayer11 > 0){
					mediaPlayer11.stop();
					  mediaPlayer11.release();
					  stateMediaPlayer11 = 0;
				}else if(stateMediaPlayer12 > 0){
					mediaPlayer12.stop();
					  mediaPlayer12.release();
					  stateMediaPlayer12 = 0;
				}
			if (stateMediaPlayer2 == 0) {
				Log.v("Inside if", "Success" + "");
				mediaPlayer2 = MediaPlayer.create(getApplicationContext(),R.raw.vaisccp);
				mediaPlayer2.start();
				stateMediaPlayer2++;
			} else {
				Log.v("Inside else", "Success" + "");
				mediaPlayer2.stop();
				mediaPlayer2.release();
				stateMediaPlayer2 = 0;
				}
 			}
 		};
	
 		Button.OnClickListener buttonPlayPause3OnClickListener = new Button.OnClickListener(){

 			@Override
 			public void onClick(View v) {
 				if(stateMediaPlayer > 0){
 					mediaPlayer.stop();
 					  mediaPlayer.release();
 					  stateMediaPlayer = 0;
 				}else if(stateMediaPlayer2 > 0){
 					mediaPlayer2.stop();
 					  mediaPlayer2.release();
 					  stateMediaPlayer2 = 0;
 				}else if(stateMediaPlayer4 > 0){
 					mediaPlayer4.stop();
 					  mediaPlayer4.release();
 					  stateMediaPlayer4 = 0;
 				}else if(stateMediaPlayer5 > 0){
 					mediaPlayer5.stop();
					  mediaPlayer5.release();
					  stateMediaPlayer5 = 0;
				}else if(stateMediaPlayer6 > 0){
 					mediaPlayer6.stop();
					  mediaPlayer6.release();
					  stateMediaPlayer6 = 0;
				}else if(stateMediaPlayer7 > 0){
 					mediaPlayer7.stop();
					  mediaPlayer7.release();
					  stateMediaPlayer7 = 0;
				}else if(stateMediaPlayer8 > 0){
	 					mediaPlayer8.stop();
					  mediaPlayer8.release();
					  stateMediaPlayer8 = 0;
				}else if(stateMediaPlayer9 > 0){
	 					mediaPlayer9.stop();
	 					  mediaPlayer9.release();
	 					  stateMediaPlayer9 = 0;
	 				}else if(stateMediaPlayer10 > 0){
						mediaPlayer10.stop();
						  mediaPlayer10.release();
						  stateMediaPlayer10 = 0;
					}else if(stateMediaPlayer11 > 0){
						mediaPlayer11.stop();
						  mediaPlayer11.release();
						  stateMediaPlayer11 = 0;
					}else if(stateMediaPlayer12 > 0){
						mediaPlayer12.stop();
						  mediaPlayer12.release();
						  stateMediaPlayer12 = 0;
					}
 				if (stateMediaPlayer3 == 0) {
 					Log.v("Inside if", "Success" + "");
 					mediaPlayer3 = MediaPlayer.create(getApplicationContext(),R.raw.bando);
 					mediaPlayer3.start();
 					stateMediaPlayer3++;
 				} else {
 					Log.v("Inside else", "Success" + "");
 					mediaPlayer3.stop();
 					mediaPlayer3.release();
 					stateMediaPlayer3 = 0;
 				}
 			}
 		};
 		Button.OnClickListener buttonPlayPause4OnClickListener = new Button.OnClickListener(){

 			@Override
 			public void onClick(View v) {
 				if(stateMediaPlayer > 0){
 					mediaPlayer.stop();
 					  mediaPlayer.release();
 					  stateMediaPlayer = 0;
 				}else if(stateMediaPlayer2 > 0){
 					mediaPlayer2.stop();
 					  mediaPlayer2.release();
 					  stateMediaPlayer2 = 0;
 				}else if(stateMediaPlayer3 > 0){
 					mediaPlayer3.stop();
 					  mediaPlayer3.release();
 					  stateMediaPlayer3 = 0;
 				}else if(stateMediaPlayer5 > 0){
 					mediaPlayer5.stop();
					  mediaPlayer5.release();
					  stateMediaPlayer5 = 0;
				}else if(stateMediaPlayer6 > 0){
 					mediaPlayer6.stop();
					  mediaPlayer6.release();
					  stateMediaPlayer6 = 0;
				}else if(stateMediaPlayer7 > 0){
 					mediaPlayer7.stop();
					  mediaPlayer7.release();
					  stateMediaPlayer7 = 0;
				}else if(stateMediaPlayer8 > 0){
	 					mediaPlayer8.stop();
					  mediaPlayer8.release();
					  stateMediaPlayer8 = 0;
				}else if(stateMediaPlayer9 > 0){
	 					mediaPlayer9.stop();
	 					  mediaPlayer9.release();
	 					  stateMediaPlayer9 = 0;
	 				}else if(stateMediaPlayer10 > 0){
						mediaPlayer10.stop();
						  mediaPlayer10.release();
						  stateMediaPlayer10 = 0;
					}else if(stateMediaPlayer11 > 0){
						mediaPlayer11.stop();
						  mediaPlayer11.release();
						  stateMediaPlayer11 = 0;
					}else if(stateMediaPlayer12 > 0){
						mediaPlayer12.stop();
						  mediaPlayer12.release();
						  stateMediaPlayer12 = 0;
					}
 				if (stateMediaPlayer4 == 0) {
 					Log.v("Inside if", "Success" + "");
 					mediaPlayer4 = MediaPlayer.create(getApplicationContext(),R.raw.samba95);
 					mediaPlayer4.start();
 					stateMediaPlayer4++;
 				} else {
 					Log.v("Inside else", "Success" + "");
 					mediaPlayer4.stop();
 					mediaPlayer4.release();
 					stateMediaPlayer4 = 0;
 				}
 			}
 		};
 		
 		Button.OnClickListener buttonPlayPause5OnClickListener = new Button.OnClickListener(){

 			@Override
 			public void onClick(View v) {
 				if(stateMediaPlayer > 0){
 					mediaPlayer.stop();
 					  mediaPlayer.release();
 					  stateMediaPlayer = 0;
 				}else if(stateMediaPlayer2 > 0){
 					mediaPlayer2.stop();
 					  mediaPlayer2.release();
 					  stateMediaPlayer2 = 0;
 				}else if(stateMediaPlayer3 > 0){
 					mediaPlayer3.stop();
 					  mediaPlayer3.release();
 					  stateMediaPlayer3 = 0;
 				}else if(stateMediaPlayer4 > 0){
 					mediaPlayer4.stop();
					  mediaPlayer4.release();
					  stateMediaPlayer4 = 0;
				}else if(stateMediaPlayer6 > 0){
 					mediaPlayer6.stop();
					  mediaPlayer6.release();
					  stateMediaPlayer6 = 0;
				}else if(stateMediaPlayer7 > 0){
 					mediaPlayer7.stop();
					  mediaPlayer7.release();
					  stateMediaPlayer7 = 0;
				}else if(stateMediaPlayer8 > 0){
	 					mediaPlayer8.stop();
					  mediaPlayer8.release();
					  stateMediaPlayer8 = 0;
				}else if(stateMediaPlayer9 > 0){
	 					mediaPlayer9.stop();
	 					  mediaPlayer9.release();
	 					  stateMediaPlayer9 = 0;
	 				}else if(stateMediaPlayer10 > 0){
						mediaPlayer10.stop();
						  mediaPlayer10.release();
						  stateMediaPlayer10 = 0;
					}else if(stateMediaPlayer11 > 0){
						mediaPlayer11.stop();
						  mediaPlayer11.release();
						  stateMediaPlayer11 = 0;
					}else if(stateMediaPlayer12 > 0){
						mediaPlayer12.stop();
						  mediaPlayer12.release();
						  stateMediaPlayer12 = 0;
					}
 				if (stateMediaPlayer5 == 0) {
 					Log.v("Inside if", "Success" + "");
 					mediaPlayer5 = MediaPlayer.create(getApplicationContext(),R.raw.falamuito);
 					mediaPlayer5.start();
 					stateMediaPlayer5++;
 				} else {
 					Log.v("Inside else", "Success" + "");
 					mediaPlayer5.stop();
 					mediaPlayer5.release();
 					stateMediaPlayer5 = 0;
 				}
 			}
 		};
 		Button.OnClickListener buttonPlayPause6OnClickListener = new Button.OnClickListener(){

 			@Override
 			public void onClick(View v) {
 				if(stateMediaPlayer > 0){
 					mediaPlayer.stop();
 					  mediaPlayer.release();
 					  stateMediaPlayer = 0;
 				}else if(stateMediaPlayer2 > 0){
 					mediaPlayer2.stop();
 					  mediaPlayer2.release();
 					  stateMediaPlayer2 = 0;
 				}else if(stateMediaPlayer3 > 0){
 					mediaPlayer3.stop();
 					  mediaPlayer3.release();
 					  stateMediaPlayer3 = 0;
 				}else if(stateMediaPlayer4 > 0){
 					mediaPlayer4.stop();
					  mediaPlayer4.release();
					  stateMediaPlayer4 = 0;
				}else if(stateMediaPlayer5 > 0){
 					mediaPlayer5.stop();
					  mediaPlayer5.release();
					  stateMediaPlayer5 = 0;
				}else if(stateMediaPlayer7 > 0){
 					mediaPlayer7.stop();
					  mediaPlayer7.release();
					  stateMediaPlayer7 = 0;
				}else if(stateMediaPlayer8 > 0){
	 					mediaPlayer8.stop();
					  mediaPlayer8.release();
					  stateMediaPlayer8 = 0;
				}else if(stateMediaPlayer9 > 0){
	 					mediaPlayer9.stop();
	 					  mediaPlayer9.release();
	 					  stateMediaPlayer9 = 0;
	 				}else if(stateMediaPlayer10 > 0){
						mediaPlayer10.stop();
						  mediaPlayer10.release();
						  stateMediaPlayer10 = 0;
					}else if(stateMediaPlayer11 > 0){
						mediaPlayer11.stop();
						  mediaPlayer11.release();
						  stateMediaPlayer11 = 0;
					}else if(stateMediaPlayer12 > 0){
						mediaPlayer12.stop();
						  mediaPlayer12.release();
						  stateMediaPlayer12 = 0;
					}
 				if (stateMediaPlayer6 == 0) {
 					Log.v("Inside if", "Success" + "");
 					mediaPlayer6 = MediaPlayer.create(getApplicationContext(),R.raw.festafavela);
 					mediaPlayer6.start();
 					stateMediaPlayer6++;
 				} else {
 					Log.v("Inside else", "Success" + "");
 					mediaPlayer6.stop();
 					mediaPlayer6.release();
 					stateMediaPlayer6 = 0;
 				}
 			}
 		};
 		
 		Button.OnClickListener buttonPlayPause7OnClickListener = new Button.OnClickListener(){

 			@Override
 			public void onClick(View v) {
 				
 				if(stateMediaPlayer > 0){
 					mediaPlayer.stop();
 					  mediaPlayer.release();
 					  stateMediaPlayer = 0;
 				}else if(stateMediaPlayer2 > 0){
 					mediaPlayer2.stop();
					  mediaPlayer2.release();
					  stateMediaPlayer2 = 0;
				}else if(stateMediaPlayer3 > 0){
 					mediaPlayer3.stop();
 					  mediaPlayer3.release();
 					  stateMediaPlayer3 = 0;
 				}else if(stateMediaPlayer4 > 0){
 					mediaPlayer4.stop();
 					  mediaPlayer4.release();
 					  stateMediaPlayer4 = 0;
 				}else if(stateMediaPlayer5 > 0){
 						mediaPlayer5.stop();
 						  mediaPlayer5.release();
 						  stateMediaPlayer5 = 0;
 					}else if(stateMediaPlayer6 > 0){
 	 					mediaPlayer6.stop();
 						  mediaPlayer6.release();
 						  stateMediaPlayer6 = 0;
 					}else if(stateMediaPlayer8 > 0){
 	 					mediaPlayer8.stop();
						  mediaPlayer8.release();
						  stateMediaPlayer8 = 0;
					}else if(stateMediaPlayer9 > 0){
 	 					mediaPlayer9.stop();
	 					  mediaPlayer9.release();
	 					  stateMediaPlayer9 = 0;
	 				}else if(stateMediaPlayer10 > 0){
						mediaPlayer10.stop();
						  mediaPlayer10.release();
						  stateMediaPlayer10 = 0;
					}else if(stateMediaPlayer11 > 0){
						mediaPlayer11.stop();
						  mediaPlayer11.release();
						  stateMediaPlayer11 = 0;
					}else if(stateMediaPlayer12 > 0){
						mediaPlayer12.stop();
						  mediaPlayer12.release();
						  stateMediaPlayer12 = 0;
					}
 				if (stateMediaPlayer7 == 0) {
 					Log.v("Inside if", "Success" + "");
 					mediaPlayer7 = MediaPlayer.create(getApplicationContext(),R.raw.oleole);
 					mediaPlayer7.start();
 					stateMediaPlayer7++;
 				} else {
 					Log.v("Inside else", "Success" + "");
 					mediaPlayer7.stop();
 					mediaPlayer7.release();
 					stateMediaPlayer7 = 0;
 					}
 	 			}
 	 		};
 	 		Button.OnClickListener buttonPlayPause8OnClickListener = new Button.OnClickListener(){

 	 			@Override
 	 			public void onClick(View v) {
 	 				if(stateMediaPlayer > 0){
 	 					mediaPlayer.stop();
 	 					  mediaPlayer.release();
 	 					  stateMediaPlayer = 0;
 	 				}else if(stateMediaPlayer2 > 0){
 	 					mediaPlayer2.stop();
 	 					  mediaPlayer2.release();
 	 					  stateMediaPlayer2 = 0;
 	 				}else if(stateMediaPlayer3 > 0){
 	 					mediaPlayer3.stop();
 	 					  mediaPlayer3.release();
 	 					  stateMediaPlayer3 = 0;
 	 				}else if(stateMediaPlayer4 > 0){
 	 					mediaPlayer4.stop();
 	 					  mediaPlayer4.release();
 	 					  stateMediaPlayer4 = 0;
 	 				}else if(stateMediaPlayer5 > 0){
 	 					mediaPlayer5.stop();
 						  mediaPlayer5.release();
 						  stateMediaPlayer5 = 0;
 					}else if(stateMediaPlayer6 > 0){
 	 					mediaPlayer6.stop();
 						  mediaPlayer6.release();
 						  stateMediaPlayer6 = 0;
 					}else if(stateMediaPlayer7 > 0){
 	 					mediaPlayer7.stop();
 						  mediaPlayer7.release();
 						  stateMediaPlayer7 = 0;
 					}else if(stateMediaPlayer9 > 0){
 	 					mediaPlayer9.stop();
 	 					  mediaPlayer9.release();
 	 					  stateMediaPlayer9 = 0;
 	 				}else if(stateMediaPlayer10 > 0){
 						mediaPlayer10.stop();
 						  mediaPlayer10.release();
 						  stateMediaPlayer10 = 0;
 					}else if(stateMediaPlayer11 > 0){
 						mediaPlayer11.stop();
 						  mediaPlayer11.release();
 						  stateMediaPlayer11 = 0;
 					}else if(stateMediaPlayer12 > 0){
 						mediaPlayer12.stop();
 						  mediaPlayer12.release();
 						  stateMediaPlayer12 = 0;
 					}
 	 				if (stateMediaPlayer8 == 0) {
 	 					Log.v("Inside if", "Success" + "");
 	 					mediaPlayer8 = MediaPlayer.create(getApplicationContext(),R.raw.romarinho);
 	 					mediaPlayer8.start();
 	 					stateMediaPlayer8++;
 	 				} else {
 	 					Log.v("Inside else", "Success" + "");
 	 					mediaPlayer8.stop();
 	 					mediaPlayer8.release();
 	 					stateMediaPlayer8 = 0;
 	 				}
 	 			}
 	 		}; 	 		
 	 		Button.OnClickListener buttonPlayPause9OnClickListener = new Button.OnClickListener(){

 	 			@Override
 	 			public void onClick(View v) {
 	 				
 	 				if(stateMediaPlayer > 0){
 	 					mediaPlayer.stop();
 	 					  mediaPlayer.release();
 	 					  stateMediaPlayer = 0;
 	 				}else if(stateMediaPlayer2 > 0){
 	 					mediaPlayer2.stop();
 	 					  mediaPlayer2.release();
 	 					  stateMediaPlayer2 = 0;
 	 				}else if(stateMediaPlayer3 > 0){
 	 					mediaPlayer3.stop();
 	 					  mediaPlayer3.release();
 	 					  stateMediaPlayer3 = 0;
 	 				}else if(stateMediaPlayer4 > 0){
 	 					mediaPlayer4.stop();
 	 					  mediaPlayer4.release();
 	 					  stateMediaPlayer4 = 0;
 	 				}else if(stateMediaPlayer5 > 0){
 	 						mediaPlayer5.stop();
 	 						  mediaPlayer5.release();
 	 						  stateMediaPlayer5 = 0;
 	 					}else if(stateMediaPlayer6 > 0){
 	 	 					mediaPlayer6.stop();
 	 						  mediaPlayer6.release();
 	 						  stateMediaPlayer6 = 0;
 	 					}else if(stateMediaPlayer7 > 0){
 	 	 					mediaPlayer7.stop();
 	 						  mediaPlayer7.release();
 	 						  stateMediaPlayer7 = 0;
 	 					}else if(stateMediaPlayer8 > 0){
 	 		 					mediaPlayer8.stop();
 	 						  mediaPlayer8.release();
 	 						  stateMediaPlayer8 = 0;
 	 					}else if(stateMediaPlayer10 > 0){
 	 						mediaPlayer10.stop();
 	 					  mediaPlayer10.release();
 	 					  stateMediaPlayer10 = 0;
 	 				}else if(stateMediaPlayer11 > 0){
 	 					mediaPlayer11.stop();
 	 					  mediaPlayer11.release();
 	 					  stateMediaPlayer11 = 0;
 	 				}else if(stateMediaPlayer12 > 0){
 	 					mediaPlayer12.stop();
 	 					  mediaPlayer12.release();
 	 					  stateMediaPlayer12 = 0;
 	 				}
 	 				if (stateMediaPlayer9 == 0) {
 	 					Log.v("Inside if", "Success" + "");
 	 					mediaPlayer9 = MediaPlayer.create(getApplicationContext(),R.raw.vinheta);
 	 					mediaPlayer9.start();
 	 					stateMediaPlayer9++;
 	 				} else {
 	 					Log.v("Inside else", "Success" + "");
 	 					mediaPlayer9.stop();
 	 					mediaPlayer9.release();
 	 					stateMediaPlayer9 = 0;
 	 					}
 	 	 			}
 	 	 		};
 	 	 		Button.OnClickListener buttonPlayPause10OnClickListener = new Button.OnClickListener(){

 	 	 			@Override
 	 	 			public void onClick(View v) {
 	 	 				
 	 	 				if(stateMediaPlayer > 0){
 	 	 					mediaPlayer.stop();
 	 	 					  mediaPlayer.release();
 	 	 					  stateMediaPlayer = 0;
 	 	 				}else if(stateMediaPlayer2 > 0){
 	 	 					mediaPlayer2.stop();
 	 	 					  mediaPlayer2.release();
 	 	 					  stateMediaPlayer2 = 0;
 	 	 				}else if(stateMediaPlayer3 > 0){
 	 	 					mediaPlayer3.stop();
 	 	 					  mediaPlayer3.release();
 	 	 					  stateMediaPlayer3 = 0;
 	 	 				}else if(stateMediaPlayer4 > 0){
 	 	 					mediaPlayer4.stop();
 	 	 					  mediaPlayer4.release();
 	 	 					  stateMediaPlayer4 = 0;
 	 	 				}else if(stateMediaPlayer5 > 0){
 	 	 						mediaPlayer5.stop();
 	 	 						  mediaPlayer5.release();
 	 	 						  stateMediaPlayer5 = 0;
 	 	 					}else if(stateMediaPlayer6 > 0){
 	 	 	 					mediaPlayer6.stop();
 	 	 						  mediaPlayer6.release();
 	 	 						  stateMediaPlayer6 = 0;
 	 	 					}else if(stateMediaPlayer7 > 0){
 	 	 	 					mediaPlayer7.stop();
 	 	 						  mediaPlayer7.release();
 	 	 						  stateMediaPlayer7 = 0;
 	 	 					}else if(stateMediaPlayer8 > 0){
 	 	 		 					mediaPlayer8.stop();
 	 	 						  mediaPlayer8.release();
 	 	 						  stateMediaPlayer8 = 0;
 	 	 					}else if(stateMediaPlayer9 > 0){
 	 	 						mediaPlayer9.stop();
 	 	 					  mediaPlayer9.release();
 	 	 					  stateMediaPlayer9 = 0;
 	 	 				}else if(stateMediaPlayer11 > 0){
 	 	 					mediaPlayer11.stop();
 	 	 					  mediaPlayer11.release();
 	 	 					  stateMediaPlayer11 = 0;
 	 	 				}else if(stateMediaPlayer12 > 0){
 	 	 					mediaPlayer12.stop();
 	 	 					  mediaPlayer12.release();
 	 	 					  stateMediaPlayer12 = 0;
 	 	 				}
 	 	 				if (stateMediaPlayer10 == 0) {
 	 	 					Log.v("Inside if", "Success" + "");
 	 	 					mediaPlayer10 = MediaPlayer.create(getApplicationContext(),R.raw.poderoso);
 	 	 					mediaPlayer10.start();
 	 	 					stateMediaPlayer10++;
 	 	 				} else {
 	 	 					Log.v("Inside else", "Success" + "");
 	 	 					mediaPlayer10.stop();
 	 	 					mediaPlayer10.release();
 	 	 					stateMediaPlayer10 = 0;
 	 	 					}
 	 	 	 			}
 	 	 	 		};
 	 	 	 	Button.OnClickListener buttonPlayPause11OnClickListener = new Button.OnClickListener(){

 	 	 			@Override
 	 	 			public void onClick(View v) {
 	 	 				
 	 	 				if(stateMediaPlayer > 0){
 	 	 					mediaPlayer.stop();
 	 	 					  mediaPlayer.release();
 	 	 					  stateMediaPlayer = 0;
 	 	 				}else if(stateMediaPlayer2 > 0){
 	 	 					mediaPlayer2.stop();
 	 	 					  mediaPlayer2.release();
 	 	 					  stateMediaPlayer2 = 0;
 	 	 				}else if(stateMediaPlayer3 > 0){
 	 	 					mediaPlayer3.stop();
 	 	 					  mediaPlayer3.release();
 	 	 					  stateMediaPlayer3 = 0;
 	 	 				}else if(stateMediaPlayer4 > 0){
 	 	 					mediaPlayer4.stop();
 	 	 					  mediaPlayer4.release();
 	 	 					  stateMediaPlayer4 = 0;
 	 	 				}else if(stateMediaPlayer5 > 0){
 	 	 						mediaPlayer5.stop();
 	 	 						  mediaPlayer5.release();
 	 	 						  stateMediaPlayer5 = 0;
 	 	 					}else if(stateMediaPlayer6 > 0){
 	 	 	 					mediaPlayer6.stop();
 	 	 						  mediaPlayer6.release();
 	 	 						  stateMediaPlayer6 = 0;
 	 	 					}else if(stateMediaPlayer7 > 0){
 	 	 	 					mediaPlayer7.stop();
 	 	 						  mediaPlayer7.release();
 	 	 						  stateMediaPlayer7 = 0;
 	 	 					}else if(stateMediaPlayer8 > 0){
 	 	 		 					mediaPlayer8.stop();
 	 	 						  mediaPlayer8.release();
 	 	 						  stateMediaPlayer8 = 0;
 	 	 					}else if(stateMediaPlayer9 > 0){
 	 	 	 					mediaPlayer9.stop();
 	 	 	 					  mediaPlayer.release();
 	 	 	 					  stateMediaPlayer9 = 0;
 	 	 	 				}else if(stateMediaPlayer10 > 0){
 	 	 						mediaPlayer10.stop();
 	 	 					  mediaPlayer10.release();
 	 	 					  stateMediaPlayer10 = 0;
 	 	 				}else if(stateMediaPlayer12 > 0){
 	 	 					mediaPlayer12.stop();
 	 	 					  mediaPlayer12.release();
 	 	 					  stateMediaPlayer12 = 0;
 	 	 				}
 	 	 				if (stateMediaPlayer11 == 0) {
 	 	 					Log.v("Inside if", "Success" + "");
 	 	 					mediaPlayer11 = MediaPlayer.create(getApplicationContext(),R.raw.radio);
 	 	 					mediaPlayer11.start();
 	 	 					stateMediaPlayer11++;
 	 	 				} else {
 	 	 					Log.v("Inside else", "Success" + "");
 	 	 					mediaPlayer11.stop();
 	 	 					mediaPlayer11.release();
 	 	 					stateMediaPlayer11 = 0;
 	 	 					}
 	 	 	 			}
 	 	 	 		};
 	 	 	 	Button.OnClickListener buttonPlayPause12OnClickListener = new Button.OnClickListener(){

 	 	 			@Override
 	 	 			public void onClick(View v) {
 	 	 				
 	 	 				if(stateMediaPlayer > 0){
 	 	 					mediaPlayer.stop();
 	 	 					  mediaPlayer.release();
 	 	 					  stateMediaPlayer = 0;
 	 	 				}else if(stateMediaPlayer2 > 0){
 	 	 					mediaPlayer2.stop();
 	 	 					  mediaPlayer2.release();
 	 	 					  stateMediaPlayer2 = 0;
 	 	 				}else if(stateMediaPlayer3 > 0){
 	 	 					mediaPlayer3.stop();
 	 	 					  mediaPlayer3.release();
 	 	 					  stateMediaPlayer3 = 0;
 	 	 				}else if(stateMediaPlayer4 > 0){
 	 	 					mediaPlayer4.stop();
 	 	 					  mediaPlayer4.release();
 	 	 					  stateMediaPlayer4 = 0;
 	 	 				}else if(stateMediaPlayer5 > 0){
 	 	 						mediaPlayer5.stop();
 	 	 						  mediaPlayer5.release();
 	 	 						  stateMediaPlayer5 = 0;
 	 	 					}else if(stateMediaPlayer6 > 0){
 	 	 	 					mediaPlayer6.stop();
 	 	 						  mediaPlayer6.release();
 	 	 						  stateMediaPlayer6 = 0;
 	 	 					}else if(stateMediaPlayer7 > 0){
 	 	 	 					mediaPlayer7.stop();
 	 	 						  mediaPlayer7.release();
 	 	 						  stateMediaPlayer7 = 0;
 	 	 					}else if(stateMediaPlayer8 > 0){
 	 	 		 					mediaPlayer8.stop();
 	 	 						  mediaPlayer8.release();
 	 	 						  stateMediaPlayer8 = 0;
 	 	 					}else if(stateMediaPlayer9 > 0){
 	 	 	 					mediaPlayer9.stop();
 	 	 	 					  mediaPlayer9.release();
 	 	 	 					  stateMediaPlayer9 = 0;
 	 	 	 				}else if(stateMediaPlayer10 > 0){
 	 	 						mediaPlayer10.stop();
 	 	 					  mediaPlayer10.release();
 	 	 					  stateMediaPlayer10 = 0;
 	 	 				}else if(stateMediaPlayer11 > 0){
 	 	 					mediaPlayer11.stop();
 	 	 					  mediaPlayer11.release();
 	 	 					  stateMediaPlayer11 = 0;
 	 	 				}
 	 	 				if (stateMediaPlayer12 == 0) {
 	 	 					Log.v("Inside if", "Success" + "");
 	 	 					mediaPlayer12 = MediaPlayer.create(getApplicationContext(),R.raw.cassio);
 	 	 					mediaPlayer12.start();
 	 	 					stateMediaPlayer12++;
 	 	 				} else {
 	 	 					Log.v("Inside else", "Success" + "");
 	 	 					mediaPlayer12.stop();
 	 	 					mediaPlayer12.release();
 	 	 					stateMediaPlayer12 = 0;
 	 	 					}
 	 	 	 			}
 	 	 	 		};
 	 	 	 		
 	 	 		
	 public void onClick(View v) {
		  // TODO Auto-generated method stub
		  mediaPlayer.stop();
		  mediaPlayer.release();
		  mediaPlayer2.stop();
		  mediaPlayer2.release();
		  mediaPlayer3.stop();
		  mediaPlayer3.release();
		  mediaPlayer4.stop();
		  mediaPlayer4.release();
		  mediaPlayer5.stop();
		  mediaPlayer5.release();
		  mediaPlayer6.stop();
		  mediaPlayer6.release();
		  mediaPlayer7.stop();
		  mediaPlayer7.release();
		  mediaPlayer8.stop();
		  mediaPlayer8.release();
		  mediaPlayer9.stop();
		  mediaPlayer9.release();
		  mediaPlayer10.stop();
		  mediaPlayer10.release();
		  mediaPlayer11.stop();
		  mediaPlayer11.release();
		  mediaPlayer12.stop();
		  mediaPlayer12.release();
		  
		
		  finish();
		  		  
		  } 
	  
	
}
