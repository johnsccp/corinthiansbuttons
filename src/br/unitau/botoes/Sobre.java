package br.unitau.botoes;

import br.unitau.botoes.R;
import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class Sobre extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sobre);
        
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); 
    }
    
}
