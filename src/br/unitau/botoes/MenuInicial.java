package br.unitau.botoes;

import br.unitau.botoes.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MenuInicial extends Activity {
	
	ImageView IM;
	ImageView IM2;
	ImageView IM3;
	ImageView IM4;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_inicial);
        
        
        
        
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); 
        
	addListenerOnButtonBotoes();
	addListenerOnButtonDesenvolvedor();
	addListenerOnButtonSobre();
	addListenerOnButtonSair();
    }
    
    // �nicio da tela Bot�es
	public void addListenerOnButtonBotoes() {
		final Context context = this;
 		IM = (ImageView) findViewById(R.id.IMbotoes);
 		IM.setOnClickListener(new android.view.View.OnClickListener() {
 
 			//qual classe ser� aberta ap�s o clique
			public void onClick(View v) {
 			    Intent intent = new Intent(context, Botoes.class);
                startActivity(intent);   
 			}//fim da chamada
 		});
 	}// fim tela bot�es
    
	//bot�o Desenvolvedor
    public void addListenerOnButtonDesenvolvedor() {
		final Context context = this;
 		IM2 = (ImageView) findViewById(R.id.IMdesenvolvedor);
 		IM2.setOnClickListener(new android.view.View.OnClickListener() {
 
 			// tela que o bot�o abrir� ap�s ser clicado
			public void onClick(View v) {
 			    Intent intent = new Intent(context, Desenvolvedor.class);
                startActivity(intent);   
 			}//fim da chamada
 		});
 	}//fim da tela desenvolvedor
    
    
    // tela sobre
    public void addListenerOnButtonSobre() {
		final Context context = this;
 		IM3 = (ImageView) findViewById(R.id.IMsobre);
 		IM3.setOnClickListener(new android.view.View.OnClickListener() {
 
 			//tela que ser� chamada ap�s o bot�o ser clicado
			public void onClick(View v) {
 			    Intent intent = new Intent(context, Sobre.class);
                startActivity(intent);   
 			}// fim da chamada
 		});
 	}// fim do Sobre
    
    // �nicio do Bot�o sair
    public void addListenerOnButtonSair() {
		IM4 = (ImageView) findViewById(R.id.IMsair);
 		IM4.setOnClickListener(new android.view.View.OnClickListener() {
 
 			@SuppressWarnings("deprecation")
			@Override
			public void onClick(View v) {
				// A��o que o bot�o executa ao ser clicado
				AlertDialog alertDialog = new AlertDialog.Builder(
						MenuInicial.this).create();
				alertDialog.setTitle("Alerta");
				alertDialog.setIcon(R.drawable.iconesaida);
				alertDialog.setButton("SIM",
						new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface dialog,
									int which) {
								finish();
								return;
							}
						});
				alertDialog.setButton2("N�O",
						new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface dialog,
									int which) {
								return;
							}
						});
				alertDialog.show();
			}
 		});
 	}// fim do bot�o sair
    
}// fim do Main
