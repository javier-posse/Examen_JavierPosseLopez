package com.example.javier.examen_javierposselopez;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {

    ImageView foto;
    ImageView btnIzq;
    ImageView btnDer;
    TextView titulo;
    TextView detalle;
    TextView id;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        foto = (ImageView) findViewById(R.id.imgvFoto);
        titulo = (TextView) findViewById(R.id.Titulo);
        detalle = (TextView) findViewById(R.id.Descripcion);
        id = (TextView) findViewById(R.id.CodigoProducto);
        btnIzq = (ImageView) findViewById(R.id.flechaAtras);
        btnDer = (ImageView) findViewById(R.id.flechaAlante);

        Producto obj = (Producto) getIntent().getExtras().getSerializable("objeto");
        titulo.setText(obj.getNombreProducto());
        id.setText(Integer.toString(obj.getId()));
        detalle.setText(obj.getDescripcion());
        foto.setImageResource(obj.getGaleriaImagenes().get(0));
        btnDer.setImageResource(R.drawable.forward);
        btnIzq.setImageResource(R.drawable.back);
    }

    public void siguiente(View vista){
        if (i==2){
            i=-1;
        }
        i++;
        Producto obj = (Producto) getIntent().getExtras().getSerializable("objeto");
        foto.setImageResource(obj.getGaleriaImagenes().get(i));

    }
    public void anterior(View vista){
        if (i==0){
            i=3;
        }
        i--;
        Producto obj = (Producto) getIntent().getExtras().getSerializable("objeto");
        foto.setImageResource(obj.getGaleriaImagenes().get(i));
    }
}