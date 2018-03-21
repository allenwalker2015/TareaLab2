package allen.com.tarealab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int puntosA,puntosB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sumar(View v){
        if(v.getId() == R.id.button1){
            puntosA+=1;
        }
        if(v.getId() == R.id.button2){
            puntosA+=2;
        }
        if(v.getId() == R.id.button3){
            puntosA+=3;
        }
        if(v.getId() == R.id.button1B){
            puntosB+=1;
        }
        if(v.getId() == R.id.button2B){
            puntosB+=2;
        }
        if(v.getId() == R.id.button3B){
            puntosB+=3;
        }
        TextView textView = (TextView) findViewById(R.id.contadorA);
        textView.setText(""+puntosA);
        TextView textView2 = (TextView) findViewById(R.id.contadorB);
        textView2.setText(""+puntosB);
    }

    public void resetCount(View v){
        puntosA = 0;
        puntosB= 0;
        TextView textView = (TextView) findViewById(R.id.contadorA);
        textView.setText(""+puntosA);
        TextView textView2 = (TextView) findViewById(R.id.contadorB);
        textView2.setText(""+puntosB);
    }

}
