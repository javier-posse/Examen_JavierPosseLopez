package com.example.javier.examen_javierposselopez;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Javier on 12/12/2017.
 */

public class Adaptador extends BaseAdapter {
    Context contexto;
    List<Producto> listaProductos;

    public Adaptador(Context contexto, List<Producto> listaProductos) {
        this.contexto = contexto;
        this.listaProductos = listaProductos;
    }

    @Override
    public int getCount() {
        return listaProductos.size();
    }

    @Override
    public Object getItem(int i) {
        return listaProductos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return listaProductos.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View vista;
        TextView tvNombre, tvDescripcion, tvPrecio;
        ImageView ivList;
        LayoutInflater inflate = LayoutInflater.from(contexto);
        vista=inflate.inflate(R.layout.item_layout, null);

        tvNombre= (TextView)vista.findViewById(R.id.tvNombre);
        tvDescripcion=(TextView)vista.findViewById(R.id.tvDescripcion);
        tvPrecio=(TextView)vista.findViewById(R.id.tvPrecio);
        ivList=(ImageView)vista.findViewById(R.id.ivList);

        tvNombre.setText(listaProductos.get(i).getNombreProducto().toString());
        tvDescripcion.setText(listaProductos.get(i).getDescripcion().toString());
        tvPrecio.setText(Double.toString(listaProductos.get(i).getPrecio()));
        ivList.setImageResource(listaProductos.get(i).getImagen());
        return  vista;
    }
}
