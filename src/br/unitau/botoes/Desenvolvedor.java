package br.unitau.botoes;

import br.unitau.botoes.R;
import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class Desenvolvedor extends Activity {

	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.desenvolvedor);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); 
    }
    
}
    
