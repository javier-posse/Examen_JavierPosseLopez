package com.example.javier.examen_javierposselopez;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;

/**
 * Created by Javier on 31/10/2017.
 */

public class SplashScreen extends AppCompatActivity {
    ProgressBar pb;
    int progreso;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        pb=(ProgressBar)findViewById(R.id.pb);

        new Thread(Hilillo).start();
    }

    private Runnable Hilillo=new Runnable() {
        @Override
        public void run() {
            while (progreso<100){
                avanzar.sendMessage(avanzar.obtainMessage());
                try {
                    Thread.sleep(20);
                } catch (Throwable e) { }
            }
            Intent i= new Intent(SplashScreen.this, MainActivity.class);
            startActivity(i);
            finish();
        }
        Handler avanzar=new Handler(){
            public void handleMessage(Message msg){
                progreso++;
                pb.setProgress(progreso);
            }
        };
    };
}
