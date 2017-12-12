package com.example.javier.examen_javierposselopez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvProductos;
    ArrayList<Producto> productos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvProductos=(ListView)findViewById(R.id.lvProductos);
        productos=new ArrayList<Producto>();
        ArrayList<Integer>galeriaImagenesTV=new ArrayList<Integer>();
        ArrayList<Integer>galeriaImagenesCadena=new ArrayList<Integer>();
        ArrayList<Integer>galeriaImagenesPlancha=new ArrayList<Integer>();
        ArrayList<Integer>galeriaImagenesPortatil=new ArrayList<Integer>();


        galeriaImagenesTV.add(R.drawable.galeria_tv1);
        galeriaImagenesTV.add(R.drawable.galeria_tv2);
        galeriaImagenesTV.add(R.drawable.galeria_tv3);
        productos.add( new Producto(1, "Televisor LG F21-40",R.drawable.televisor_lg , 399.0,  "Televisor imagen 4K de 40 pulgadas 400Mhz",galeriaImagenesTV));

        galeriaImagenesCadena.add(R.drawable.galeria_microcadena1);
        galeriaImagenesCadena.add(R.drawable.galeria_microcadena2);
        galeriaImagenesCadena.add(R.drawable.galeria_microcadena3);
        productos.add( new Producto(2, "Microcadena Sony HT-100sd",R.drawable.minicadena_sony , 199.0,  "Cadena musical conexión USB y iPod 40W",galeriaImagenesCadena));

        galeriaImagenesPlancha.add(R.drawable.galeria_plancha1);
        galeriaImagenesPlancha.add(R.drawable.galeria_plancha2);
        galeriaImagenesPlancha.add(R.drawable.galeria_plancha3);
        productos.add( new Producto(3, "Plancha Rowenta Soft FX-1",R.drawable.plancha_rowenta , 90.0,  "Plancha profesional 7 funciones de planchado 1800W",galeriaImagenesPlancha));

        galeriaImagenesPortatil.add(R.drawable.galeria_portatil1);
        galeriaImagenesPortatil.add(R.drawable.galeria_portatil2);
        galeriaImagenesPortatil.add(R.drawable.galeria_portatil3);
        productos.add(new Producto(4 , "Ordenador Portatil Acer R235", R.drawable.portatil_acer, 589.90, "Ordenador Portatil Acer I5, 8GB, SSD240GB",galeriaImagenesPortatil));

        Adaptador adapter = new Adaptador(getApplicationContext(), productos);
        lvProductos.setAdapter(adapter);
        lvProductos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Producto obj = (Producto) adapterView.getItemAtPosition(i);

                Intent paso = new Intent(getApplicationContext(), DetalleActivity.class);
                paso.putExtra("objeto", (Serializable)obj);
                startActivity(paso);
            }
        });
    }
}
